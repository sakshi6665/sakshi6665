package com.sakshi.airesume.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ResumeAnalysisService {

    private static final List<String> SKILLS_DB = Arrays.asList(
            "java", "spring", "sql", "python", "api", "rest", "git", "oop"
    );

    public Map<String, Object> analyze(String resumeText, String jobDescription) {

        resumeText = resumeText.toLowerCase();
        jobDescription = jobDescription.toLowerCase();

        List<String> matchedSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();

        for (String skill : SKILLS_DB) {
            boolean inResume = resumeText.contains(skill);
            boolean inJob = jobDescription.contains(skill);

            if (inResume && inJob) {
                matchedSkills.add(skill);
            } else if (!inResume && inJob) {
                missingSkills.add(skill);
            }
        }

        int matchPercentage = (int) (
                (matchedSkills.size() * 100.0) / Math.max(1, missingSkills.size() + matchedSkills.size())
        );

        Map<String, Object> result = new HashMap<>();
        result.put("matchPercentage", matchPercentage);
        result.put("matchedSkills", matchedSkills);
        result.put("missingSkills", missingSkills);
        result.put("analysis", "Basic AI-driven skill matching completed");

        return result;
    }
}
