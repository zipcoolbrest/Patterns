package abstractFactory.productCompany_B;

import abstractFactory.Phone;

public class ProductCompany_B_Phone implements Phone {
    @Override
    public void call() {
        System.out.println("ProductCompany_B_Phone is call!");
    }
}
