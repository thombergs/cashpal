module spring.boot.hexagonal.bootstrap {
    exports nd.jar.springhexboot;
    requires spring.boot.hexagonal.application;
    requires spring.boot.hexagonal.in.http;
    requires spring.boot.hexagonal.out.persistence;
    requires spring.boot.autoconfigure;
    requires spring.boot;
}