module spring.boot.hexagonal.out.redis {
    requires static lombok;
    requires spring.context;
    requires spring.data.redis;
    requires com.fasterxml.jackson.databind;
    requires spring.boot.hexagonal.application;
    requires org.apache.logging.log4j;

}