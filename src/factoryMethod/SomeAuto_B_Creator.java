package factoryMethod;

public class SomeAuto_B_Creator implements AutoCreator{
    @Override
    public Auto create() {
        return new SomeAuto_B();
    }
}
