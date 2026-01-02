package com.sakshi.airesume.service;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class ResumeAnalysisService {

    public String analyze(String resumeText, String jobDescription) {

        List<String> skills = Arrays.asList("java", "spring", "sql", "python", "api");

        int matchCount = 0;
        for (String skill : skills) {
            if (resumeText.toLowerCase().contains(skill) &&
                jobDescription.toLowerCase().contains(skill)) {
                matchCount++;
            }
        }

        return "Matched skills count: " + matchCount;
    }
}

