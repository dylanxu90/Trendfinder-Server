package club.doanything.trendfinder.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//@EnableCircuitBreaker
@SpringBootApplication
public class TrendfinderAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrendfinderAdminApplication.class, args);
    }

}
