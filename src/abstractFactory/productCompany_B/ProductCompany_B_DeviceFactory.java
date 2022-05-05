package abstractFactory.productCompany_B;

import abstractFactory.DeviceFactory;
import abstractFactory.Phone;
import abstractFactory.Tv;

public class ProductCompany_B_DeviceFactory implements DeviceFactory {
    @Override
    public Tv createTv() {
        return new ProductCompany_B_Tv();
    }

    @Override
    public Phone createPhone() {
        return new ProductCompany_B_Phone();
    }
}
