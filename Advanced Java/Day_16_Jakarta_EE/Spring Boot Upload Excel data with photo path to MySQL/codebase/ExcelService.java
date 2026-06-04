package com.example.demo;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ExcelService {

    public List<Student> parseExcel(MultipartFile file) throws Exception {
        List<Student> students = new ArrayList<>();

        try (InputStream is = file.getInputStream();
             Workbook workbook = new XSSFWorkbook(is)) {

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();

            if (rows.hasNext()) rows.next(); // skip header row

            while (rows.hasNext()) {
                Row row = rows.next();

                Cell nameCell = row.getCell(0);
                Cell ageCell = row.getCell(1);
                Cell photoCell = row.getCell(2);
                String photoFileName = photoCell != null ? photoCell.getStringCellValue() : null;
                String basePhotoFolder = "D:/student_photos/";

                String fullPhotoPath = null;
                if (photoFileName != null && !photoFileName.isBlank()) {
                    fullPhotoPath = basePhotoFolder + photoFileName;
                }
                String name = nameCell != null ? nameCell.getStringCellValue() : null;
                Integer age = null;

                if (ageCell != null) {
                    if (ageCell.getCellType() == CellType.NUMERIC) {
                        age = (int) ageCell.getNumericCellValue();
                    } else {
                        age = Integer.parseInt(ageCell.getStringCellValue());
                    }
                }

                if (name != null && !name.isBlank()) {
                	students.add(
                		    new Student(name, age, fullPhotoPath)
                		);
                }
            }
        }

        return students;
    }
}

