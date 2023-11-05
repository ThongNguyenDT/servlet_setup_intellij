package com.example.demo1.util;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import org.apache.commons.io.FilenameUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadUtils {
    public static String processUpload(String fieldName, HttpServletRequest req, String storeFolder, String storeFileName) throws IOException, ServletException{
        Part filePart = req.getPart(fieldName);
        if (filePart == null || filePart.getSize() == 0){
            return  "";
        }
        if (storeFolder == null) storeFolder = "C:\\uploads";
        if (storeFileName == null) storeFileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        else storeFileName = "." + FilenameUtils.getExtension(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
        Path uploadPath = Paths.get(storeFolder);
        if (!Files.exists(uploadPath)) Files.createDirectories((uploadPath));
        filePart.write(Paths.get(uploadPath.toString(), storeFileName).toString());
        return storeFileName;
    }
    public static String processUploadForderWeb(String fieldName, HttpServletRequest req, String storeFolder, String storeFileName) throws IOException, ServletException{
        Part filePart = req.getPart(fieldName);
        if (filePart == null || filePart.getSize() == 0){
            return  "";
        }
        if (storeFolder == null) storeFolder = "/uploads";
        if (storeFileName == null) storeFileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        else storeFileName = "." + FilenameUtils.getExtension(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());
        Path uploadPath = Paths.get(storeFolder);
        if (!Files.exists(uploadPath)) Files.createDirectories((uploadPath));
        filePart.write(Paths.get(uploadPath.toString(), storeFileName).toString());
        return storeFileName;
    }
}
