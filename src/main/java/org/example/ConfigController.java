package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${business.threshold.value:default}")
    private String thresholdValue;

    @GetMapping("/config")
    public String getConfig() {
        return "Threshold Value: " + thresholdValue;
    }
}
