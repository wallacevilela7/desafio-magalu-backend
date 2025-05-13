package tech.wvs.magalums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MagaluMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagaluMsApplication.class, args);
    }

}
