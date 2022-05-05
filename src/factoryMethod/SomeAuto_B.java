package factoryMethod;

public class SomeAuto_B implements Auto{
    @Override
    public void drive(String name) {
        System.out.println("ExampleAuto_B (" + name + ") is drive!");
    }

    @Override
    public void stop(String name) {
        System.out.println("ExampleAuto_B (" + name + ") is stop!");
    }
}
