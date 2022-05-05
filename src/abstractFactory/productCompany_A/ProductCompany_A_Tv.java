package abstractFactory.productCompany_A;

import abstractFactory.Tv;

public class ProductCompany_A_Tv implements Tv {
    @Override
    public void on() {
        System.out.println("ProductCompany_A_Tv is on!");
    }

    @Override
    public void off() {
        System.out.println("ProductCompany_A_Tv is off!");
    }
}
