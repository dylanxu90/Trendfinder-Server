package club.doanything.trendfinder.api.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TrendfinderEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrendfinderEurekaApplication.class, args);
    }

}
