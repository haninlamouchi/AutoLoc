package tn.esprit.tpautoloc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "tn.esprit.tpautoloc.repository")
public class TpAutolocApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpAutolocApplication.class, args);
    }

}
