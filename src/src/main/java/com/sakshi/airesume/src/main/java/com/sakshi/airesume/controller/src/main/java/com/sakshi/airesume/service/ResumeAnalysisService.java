package com.sakshi.airesume.service;

import org.springframework.stereotype.Service;

@Service
public class ResumeAnalysisService {

    public String analyze(String resumeText, String jobDescription) {

        // Placeholder logic (will be replaced with AI/LLM logic)
        if (resumeText == null || jobDescription == null) {
            return "Invalid input";
        }

        return "Basic resume analysis completed";
    }
}
