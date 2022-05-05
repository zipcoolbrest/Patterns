package abstractFactory.productCompany_A;

import abstractFactory.DeviceFactory;
import abstractFactory.Phone;
import abstractFactory.Tv;

public class ProductCompany_A_DeviceFactory implements DeviceFactory {
    @Override
    public Tv createTv() {
        return new ProductCompany_A_Tv();
    }

    @Override
    public Phone createPhone() {
        return new ProductCompany_A_Phone();
    }
}
