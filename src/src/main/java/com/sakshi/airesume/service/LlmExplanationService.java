package com.sakshi.airesume.service;

import org.springframework.stereotype.Service;

@Service
public class LlmExplanationService {

    public String explain() {
        return "This project uses rule-based skill matching as a foundation. " +
               "In future, LLMs can be integrated to understand context, infer skills, " +
               "and generate resume improvement suggestions using prompt-based analysis.";
    }
}
