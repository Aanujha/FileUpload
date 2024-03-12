package com.example.FileUpload.repojetry;

import com.example.FileUpload.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileRepo extends JpaRepository<File,Long> {

    Optional<File> findByName(String fileName);
}
