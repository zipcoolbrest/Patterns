package factoryMethod;

public class SomeAuto_A_Creator implements AutoCreator{
    @Override
    public Auto create() {
        return new SomeAuto_A();
    }
}
