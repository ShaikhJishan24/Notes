package com.example.demo;

import java.io.File;
import java.nio.file.Files;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photos")
public class PhotoController {

	private static final String PHOTO_DIR = "D:/student_photos/";

	@GetMapping("/{filename}")
	public ResponseEntity<?> getPhoto(@PathVariable String filename) {
		
		try {
			File file = new File(PHOTO_DIR + filename);
			if (!file.exists()) {
				return ResponseEntity.notFound().build();
			}

			byte[] image = Files.readAllBytes(file.toPath());
			return ResponseEntity.ok().header("Content-Type", "image/jpeg").body(image);

		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error: " + e.getMessage());
		}
	}
}
