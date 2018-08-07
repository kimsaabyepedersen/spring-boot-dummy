package org.saabye_pedersen.samples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    class TimeController {

        @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        String getTime() {

            return "{" +
                    "\"time\": \"" + LocalDateTime.now().toString() + "\"" +
                    "," +
                    "\"somevalue\": \"some-randooom-value\"" +
                    "}";

        }

    }

}
