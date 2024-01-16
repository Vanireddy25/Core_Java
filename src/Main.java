public class Main {
    public static void main(String[] args) {
        Department department = new Department1(6);
        System.out.println(department.getDepartmenSize());


        Product product = new Product(5);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(8));


        Parent parent1 = new Parent();
        parent1.message();
        Child child1 = new Child();
        child1.message();
        Parent parent2 = new Child();
        parent2.message();

    }

}