package com.example.service_a;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class InfoController {
    @Value("${service.name}")
    private String name;
    @Value("${service.description}")
    private String description;
    @Value("${service.custom-message}")
    private String customMessage;
    @Value("${app.message}")
    private String sharedMessage;
    @Value("${app.environment}")
    private String environment;
    @GetMapping("/")
    public Map<String, String> info() {
        Map<String, String> response = new LinkedHashMap<>();
        response.put("service", name);
        response.put("description", description);
        response.put("customMessage", customMessage);
        response.put("sharedMessage", sharedMessage);
        response.put("environment", environment);
        return response;
    }
}
