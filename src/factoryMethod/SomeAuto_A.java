package factoryMethod;

public class SomeAuto_A implements Auto{
    @Override
    public void drive(String name) {
        System.out.println("ExampleAuto_A (" + name + ") is drive!");
    }

    @Override
    public void stop(String name) {
        System.out.println("ExampleAuto_A (" + name + ") is stop!");
    }
}
