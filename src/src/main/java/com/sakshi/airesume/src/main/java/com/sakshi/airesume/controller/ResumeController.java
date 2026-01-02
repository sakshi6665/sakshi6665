package com.sakshi.airesume.controller;

import com.sakshi.airesume.service.ResumeAnalysisService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    private final ResumeAnalysisService resumeAnalysisService;

    public ResumeController(ResumeAnalysisService resumeAnalysisService) {
        this.resumeAnalysisService = resumeAnalysisService;
    }

    @PostMapping("/analyze")
    public Map<String, Object> analyzeResume(
            @RequestParam String resume,
            @RequestParam String jobDescription) {

        return resumeAnalysisService.analyze(resume, jobDescription);
    }
}
