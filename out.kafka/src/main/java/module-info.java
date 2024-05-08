module spring.boot.hexagonal.out.kafka {
    requires static lombok;
    requires spring.context;
    requires spring.boot.hexagonal.application;
    requires spring.kafka;
    requires com.fasterxml.jackson.databind;
    requires org.apache.logging.log4j;


    opens nd.jar.springhexboot.adapter.out.kafka to spring.core, spring.beans;
}