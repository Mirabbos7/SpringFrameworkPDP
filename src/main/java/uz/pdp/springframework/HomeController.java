package uz.pdp.springframework;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Component
public class HomeController {
    private final Service service;

    public HomeController(@Qualifier("userService2") Service service) {
        this.service = service;
    }
}
