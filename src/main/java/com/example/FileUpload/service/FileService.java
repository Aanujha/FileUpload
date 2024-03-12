package com.example.FileUpload.service;

import com.example.FileUpload.repojetry.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {


    @Autowired
    private FileRepo fileRepo;


    public  String uploadFile(MultipartFile file){
        fileRepo.save(file.builder().name(file.getOriginalFilename()
                .type(file.getContentType().file(file.getBytes().build()))
        )
    }
}
