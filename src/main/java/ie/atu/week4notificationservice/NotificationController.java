package ie.atu.week4notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/notify")
    public String confirmationMessage(@RequestBody UserDetails userDetails){
       String message = String.format("User %s (%s) has been successfully registered",
               userDetails.getName(),userDetails.getEmail());
       return message;
    }
}
