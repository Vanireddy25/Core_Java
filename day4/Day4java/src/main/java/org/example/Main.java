package org.example;

public class Main {
    public static void main(String[] args) {
        Department department = new Department1(12);
        System.out.println(department.getDepartmenSize());


        Product product = new Product(18);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(6));


        Parent parent1 = new Parent();
        parent1.msg();
        Child child1 = new Child();
        child1.msg();
        Parent parent2 = new Child();
        parent2.msg();

    }
}