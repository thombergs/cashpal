package nd.jar.springhexboot;

import nd.jar.springhexboot.application.App;
import org.springframework.boot.SpringApplication;

public class TestApp {
    public static void main(String[] args) {
        SpringApplication.from(App::main)
                .with(TestContainersConfiguration.class)
                .run();
    }
}
