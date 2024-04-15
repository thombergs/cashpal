package nd.jar.springhexboot;

import com.redis.testcontainers.RedisContainer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;
import org.springframework.boot.devtools.restart.RestartScope;

@TestConfiguration
public class TestContainersConfiguration {
    @Bean
    @RestartScope
    @ServiceConnection
    MySQLContainer<?> mySQLContainer() {
        return new MySQLContainer<>("mysql:5.7.39");
    }
/*
    @Bean
    @RestartScope
    @ServiceConnection(name = "redis")
    RedisContainer redisContainer(){
        return new RedisContainer(DockerImageName.parse("redis:6.2.6"));
    }

    @Bean
    @RestartScope
    @ServiceConnection
    KafkaContainer kafka() {
        return new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:6.2.1"));
    }*/


}
