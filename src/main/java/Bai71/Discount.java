package Bai71;

public class Discount {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type.equals("Cao cấp")) {
            return serviceDiscountPremium;
        } else if (type.equals("Vàng")) {
            return serviceDiscountGold;
        } else if (type.equals("Bạc")) {
            return serviceDiscountSilver;
        } else {
            return 0;
        }
    }

    public static double getProductDiscountRate(String type) {
        if (type.equals("Cao cấp")) {
            return productDiscountPremium;
        } else if (type.equals("Vàng")) {
            return productDiscountGold;
        } else if (type.equals("Bạc")) {
            return productDiscountSilver;
        } else {
            return 0;
        }
    }
}
