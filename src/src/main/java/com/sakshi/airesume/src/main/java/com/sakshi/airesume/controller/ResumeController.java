package com.sakshi.airesume.controller;

import com.sakshi.airesume.service.ResumeAnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    private final ResumeAnalysisService resumeAnalysisService;

    public ResumeController(ResumeAnalysisService resumeAnalysisService) {
        this.resumeAnalysisService = resumeAnalysisService;
    }

    @GetMapping("/analyze")
    public String analyzeResume(
            @RequestParam String resume,
            @RequestParam String jobDescription) {

        return resumeAnalysisService.analyze(resume, jobDescription);
    }
}

