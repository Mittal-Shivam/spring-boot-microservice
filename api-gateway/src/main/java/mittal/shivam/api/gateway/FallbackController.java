package mittal.shivam.api.gateway;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @RequestMapping(value = "/userServiceFallback", method = { RequestMethod.GET, RequestMethod.POST })
    @CircuitBreaker(name = "CircuitBreaker", fallbackMethod = "userServiceFallback")
    public String userServiceFallback() {
        return "USER-SERVICE is taking longer than expected, please try again later.";
    }

    @RequestMapping(value = "/departmentServiceFallback", method = { RequestMethod.GET, RequestMethod.POST })
    @CircuitBreaker(name = "CircuitBreaker", fallbackMethod = "departmentServiceFallback")
    public String departmentServiceFallback() {
        return "DEPARTMENT-SERVICE is taking longer than expected, please try again later.";
    }
}