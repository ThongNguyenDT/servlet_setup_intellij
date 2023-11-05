package com.example.demo1.Controller;

import com.example.demo1.Entities.CategoryEntity;
import com.example.demo1.Sevice.Category.CategoryServiceImp;
import com.example.demo1.util.UploadUtils;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/category/find", "/category/insert", "/category/update", "/category/delete"})
public class CategoryController extends HttpServlet {
    @Inject
    CategoryServiceImp categoryService;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // kiểm tra url rồi chuyển đến hãm tương ứng
        // lay url
        String url = request.getRequestURL().toString();
        CategoryEntity category = null;
        if (url.contains("create")) {
            request.getRequestDispatcher("/views/admin/cate/add.jsp").forward(request, response);
        } else if (url.contains("delete")) {
            delete(request, response);
            category = new CategoryEntity();
            request.setAttribute("category", category);
        } else if (url.contains("edit")) {
            edit(request, response);
        } else if (url.contains("reset")) {
            category = new CategoryEntity();
            request.setAttribute("category", category);
        }
        // goi hàm findAll để lấy thông tin từ entity

        findAll(request, response);
        request.setAttribute("tag", "cate");
        request.getRequestDispatcher("/views/admin/cate/list.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String url = request.getRequestURL().toString();
        // kiểm tra und rồi chuyển đến hàm tương ứng
        if (url.contains("create")) {
            insert(request, response);
        } else if (url.contains("update")) {
            update(request, response);
        } else if (url.contains("delete")) {
            delete(request, response);
        } else if (url.contains("reset")) {
            request.setAttribute("category", new CategoryEntity());
        }
        // gọi hàm findAll để lấy thông tin từ entity findAll(request, response);
        findAll(request, response);
        request.getRequestDispatcher("/views/admin/cate/list.jsp").forward(request, response);
    }

    protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            // khỏi tạo đối tượng Model
            CategoryEntity category = new CategoryEntity();
            // sử dụng BeanUtils để tự lấy các name Field trên form
            // tên field phải trùng với entity
            BeanUtils.populate(category, request.getParameterMap());
            // xử lý hình ảnh
            String fileName = category.getCategorycode() + System.currentTimeMillis();
            category.setImage(UploadUtils.processUpload("images", request,  "\\category\\", fileName));
            // goi hàm insert để thêm dữ liệu
            // category.setStatus(true);
            categoryService.insert(category);
            // thông bảo
            request.setAttribute("message", "Đã thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }
    }

    protected void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // khởi tạo DAO
            // UserDao dao = new UserDao();
            // khai báo danh sách và gọi hàm findAll() trong đạo
            List<CategoryEntity> list = categoryService.findAll();
            // thông báo
            request.setAttribute("categorys", list);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        try { // khai báo biến userId
            String categoryId = request.getParameter("categoryId");
            // khởi tạo DAO
            // UserDao dao = new UserDao();
            // goi hàm insert để thêm dữ liệu
            CategoryEntity category = categoryService.findById(Integer.parseInt(categoryId));
            // thông báo
            request.setAttribute("category", category);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // lấy dữ liệu trong jsp
            String categoryId = request.getParameter("categoryId");
            // khởi tạo DAO
            // UserDao dao = new UserDao();
            // khai báo danh sách và goi hàm findAll() trong dao
            categoryService.delete(Integer.parseInt(categoryId));
            // thông báo
            request.setAttribute("message", "Đã xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8"); // lấy dữ liệu từ jsp bằng Beanutils
            CategoryEntity category = new CategoryEntity();
            BeanUtils.populate(category, request.getParameterMap()); // khởi tạo DAO
            CategoryEntity oldcate = categoryService.findById(category.getCategoryId());
            if (request.getPart("images").getSize() == 0) {
                category.setImage(oldcate.getImage());
            } else {
                if (oldcate.getImage() != null) {
                    // XOA ANH CU DI
                    String fileName = oldcate.getImage();
                    File file = new File( "\\category\\" + fileName);
                    if (file.delete()) {
                        System.out.println("Đã xóa thành công");
                    } else {
                        System.out.println("\\category\\" + fileName);
                    }
                }
                String fileName = category.getCategorycode() + System.currentTimeMillis();
                category.setImage(UploadUtils.processUpload("images", request,  "\\category\\", fileName));
            }
            categoryService.update(category);
            // thông báo
            request.setAttribute("category", category);
            request.setAttribute("message", "Cập nhật thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Eror: " + e.getMessage());
        }
    }


}
