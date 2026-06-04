/*

if (ageCell != null) {
                    if (ageCell.getCellType() == CellType.NUMERIC) {

if the cell is not empty and if the cell contains a NUMBER

age = (int) ageCell.getNumericCellValue();


getNumericCellValue() returns a double

Age is expected to be an integer → so it is cast to int

Example:

Excel value: 25

Returned value: 25.0

Casted to: 25


	 Else: if the cell contains TEXT
else {
    age = Integer.parseInt(ageCell.getStringCellValue());
}


This block executes when the cell is not numeric

Meaning: age is stored as text in Excel (e.g. "25")

Steps:

Read text from Excel   e.g.  "25"

Convert text to integer using Integer.parseInt()


	 Why is this if–else needed?

Because Excel does not enforce data types.

*/

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
                    students.add(new Student(name, age));
                }
            }
        }

        return students;
    }
}

