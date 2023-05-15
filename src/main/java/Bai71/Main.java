package Bai71;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John");
        customer1.setMember(true);
        customer1.setMemberType("Cao cấp");

        Customer customer2 = new Customer("Jane");
        customer2.setMember(true);
        customer2.setMemberType("Vàng");

        Customer customer3 = new Customer("Alice");
        customer3.setMember(true);
        customer3.setMemberType("Bạc");

        Customer customer4 = new Customer("Bob");

        // Create visits
        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);
        System.out.println("Total expense for " + visit1.getName() + ": $" + visit1.getTotalExpense());

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(80);
        visit2.setProductExpense(30);
        System.out.println("Total expense for " + visit2.getName() + ": $" + visit2.getTotalExpense());

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setServiceExpense(120);
        visit3.setProductExpense(70);
        System.out.println("Total expense for " + visit3.getName() + ": $" + visit3.getTotalExpense());

        Visit visit4 = new Visit(customer4, new Date());
        visit4.setServiceExpense(90);
        visit4.setProductExpense(40);
        System.out.println("Total expense for " + visit4.getName() + ": $" + visit4.getTotalExpense());
    }
}

