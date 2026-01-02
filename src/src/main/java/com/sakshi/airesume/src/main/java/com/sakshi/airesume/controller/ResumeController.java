package com.sakshi.airesume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    @GetMapping("/analyze")
    public String analyzeResume() {
        return "Resume analysis service is running";
    }
}
