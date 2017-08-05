package onyxinformatics.lol.stats.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Mortiferum on 05.08.2017.
 */
@Component
public class LoLStatsConfiguration {
    @Value("${lol.api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
