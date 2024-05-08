module spring.boot.hexagonal.in.http {
    requires spring.boot.hexagonal.application;
    requires spring.context;
    requires spring.web;
    requires static lombok;
    requires org.mapstruct;

    opens nd.jar.springhexboot.adapter.in.http to spring.core, spring.beans;
}