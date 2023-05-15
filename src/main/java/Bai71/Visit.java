package Bai71;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double expense) {
        this.serviceExpense = expense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double expense) {
        this.productExpense = expense;
    }

    public double getTotalExpense() {
        double serviceDiscountRate = customer.getServiceDiscountRate();
        double productDiscountRate = customer.getProductDiscountRate();

        double discountedServiceExpense = serviceExpense - (serviceExpense * serviceDiscountRate);
        double discountedProductExpense = productExpense - (productExpense * productDiscountRate);

        return discountedServiceExpense + discountedProductExpense;
    }

    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}

