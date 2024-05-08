module spring.boot.hexagonal.bootstrap {
    exports nd.jar.springhexboot;
    requires spring.boot.hexagonal.application;
    requires spring.boot.hexagonal.in.http;
    requires spring.boot.hexagonal.out.persistence;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.boot.hexagonal.out.redis;
    requires spring.boot.hexagonal.out.kafka;

    opens nd.jar.springhexboot to spring.core;
}