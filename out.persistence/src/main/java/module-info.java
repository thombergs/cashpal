module spring.boot.hexagonal.out.persistence {
    requires spring.boot.hexagonal.application;
    requires jakarta.persistence;
    requires static lombok;
    requires org.mapstruct;
    requires spring.data.jpa;
    requires spring.context;
}