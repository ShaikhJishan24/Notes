package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController 
{
	@Autowired
    private  ExcelService excelService;
	@Autowired
    private  StudentUploadService uploadService;

    @PostMapping("/upload")
    public ResponseEntity<?> uploadExcel(@RequestParam("file") MultipartFile file) {
        try {
            List<Student> students = excelService.parseExcel(file);

            uploadService.saveAll(students);

            return ResponseEntity.ok("Uploaded " + students.size() + " students successfully.");
        } catch (Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.status(500).body("Error: " + ex.getMessage());
        }
    }
}

