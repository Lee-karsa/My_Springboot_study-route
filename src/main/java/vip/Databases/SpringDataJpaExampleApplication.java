package vip.Databases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author hc
 * @description: TODO
 * @date 2021/1/25 17:20
 */
@SpringBootApplication
@EnableCaching

public class SpringDataJpaExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExampleApplication.class, args);
    }
}
