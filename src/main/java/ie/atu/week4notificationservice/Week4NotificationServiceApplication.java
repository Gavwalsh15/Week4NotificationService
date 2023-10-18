package ie.atu.week4notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@SpringBootApplication
public class Week4NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week4NotificationServiceApplication.class, args);
    }

}
