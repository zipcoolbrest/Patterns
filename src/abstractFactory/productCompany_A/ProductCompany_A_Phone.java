package abstractFactory.productCompany_A;

import abstractFactory.Phone;

public class ProductCompany_A_Phone implements Phone {
    @Override
    public void call() {
        System.out.println("ProductCompany_A_Phone is call!");
    }
}
