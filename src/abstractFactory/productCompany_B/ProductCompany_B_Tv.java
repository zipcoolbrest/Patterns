package abstractFactory.productCompany_B;

import abstractFactory.Tv;

public class ProductCompany_B_Tv implements Tv {
    @Override
    public void on() {
        System.out.println("ProductCompany_B_Tv is on!");
    }

    @Override
    public void off() {
        System.out.println("ProductCompany_B_Tv is off!");
    }
}
