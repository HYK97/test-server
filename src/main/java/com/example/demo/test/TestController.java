package com.example.demo.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test1")
	public ResponseEntity<String> test(@RequestParam("data") int data) throws InterruptedException {
		Thread.sleep(8000);
		if (data < 1047720015) {
			System.out.println("ok = " + data);
			return ResponseEntity.ok(data + " is");
		} else {
			System.out.println("error = " + data);
			return ResponseEntity.status(500).body("Error");
		}
	}
}

