package onyxinformatics.lol.stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Mortiferum on 05.08.2017.
 */
@SpringBootApplication
@EnableFeignClients
public class LoLStatsApplication {

    public static void main(final String [] args){
        SpringApplication.run(LoLStatsApplication.class,args);
    }
}
