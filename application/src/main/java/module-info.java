module spring.boot.hexagonal.application {
    exports nd.jar.springhexboot.application.port.in;
    exports nd.jar.springhexboot.application.domain.model;
    exports nd.jar.springhexboot.application.port.out;
    requires static lombok;
    requires spring.context;
}