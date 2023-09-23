package Ques_3;

public class main {
    public static void main(String[] args){
        customer customer1 = new valuedcustomer("John", 100.0);
        customer customer2 = new corporatemembers("Alice", 150.0);
        customer customer3 = new nonmenbers("Bob", 200.0);

        customer1.display();
        System.out.println("Discounted Amount: $" + customer1.discount());

        customer2.display();
        System.out.println("Discounted Amount: $" + customer2.discount());

        customer3.display();
        System.out.println("Discounted Amount: $" + customer3.discount());
    }
}
