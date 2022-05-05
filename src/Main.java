import abstractFactory.DeviceFactory;
import abstractFactory.Phone;
import abstractFactory.Tv;
import abstractFactory.productCompany_A.ProductCompany_A_DeviceFactory;
import adapter.MultipleWriter;
import adapter.User;
import adapter.UserListMultipleWriterAdapter;
import builder.Config;
import decorator.AttentionWriterDecorator;
import decorator.UserWriter;
import decorator.WriterWithLinesDecorator;
import decorator.Writer;
import factoryMethod.Auto;
import factoryMethod.AutoCreator;
import factoryMethod.SomeAuto_A_Creator;
import iterator.ArrayIterator;
import observer.Subscriber;
import observer.YouTuber;
import singleton.Singleton;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void SingletonExample(){
        //thread-safe implementation
        Singleton singleton = Singleton.getInstance();//variable = 0
        System.out.println(singleton.getVariable());//print 0
        singleton.setVariable(222);//variable = 222
        System.out.println(singleton.getVariable());//print 222
        Singleton new_singleton = Singleton.getInstance();
        System.out.println(new_singleton.getVariable());//print 222
    }

    public static void factoryMethodExample(){
        //just change class name to ExampleAuto_B_Creator
        AutoCreator creator = new SomeAuto_A_Creator();

        Auto auto_1 = creator.create();
        Auto auto_2 = creator.create();

        auto_1.drive("auto_1");
        auto_2.drive("auto_2");
        auto_1.stop("auto_1");
        auto_2.stop("auto_2");
    }

    public static void abstractFactoryExample(){
        //just change class name to ProductCompany_B_DeviceFactory
        DeviceFactory factory = new ProductCompany_A_DeviceFactory();
        Phone phone = factory.createPhone();
        Tv tv = factory.createTv();
        phone.call();
        tv.on();
    }

    public static void builderExample(){
        Config config = Config.builder().bold(true).color("black").height(11).width(22).build();
        Config conf = Config.builder().bold(false).width(33).build();
    }

    public static void adapterExample(){
        MultipleWriter writer = new MultipleWriter();
        List<User> users = Arrays.asList(
                new User ("vasia", "pupkin"),
                new User ("vladimir", "ivanov"),
                new User ("nikolai", "andreev"),
                new User ("sergei", "sohin"),
                new User ("daniil", "terkin"),
                new User ("aleksey", "fedorov")
        );
        UserListMultipleWriterAdapter adapter = new UserListMultipleWriterAdapter(users);
        writer.setAdapter(adapter);
        writer.write();
    }

    public static void decoratorExample(){
        User user = new User ("vasia", "pupkin");
        Writer writer = new UserWriter(user);
        Writer writer1 = new AttentionWriterDecorator(
                new WriterWithLinesDecorator(new UserWriter(user))
        );
        writer.write();
        System.out.println();
        writer1.write();
    }

    public static void iteratorExample(){
        String[] strings = new String[]{"a","s","d","f"};
        Iterator<String> iterator =new ArrayIterator<>(strings);

        while (iterator.hasNext()){
            System.out.println((iterator.next()));
        }
    }

    public static void observerExample(){
        YouTuber youTuber = new YouTuber("Vasia");
        Subscriber subscriber_from_china = new Subscriber() {
            @Override
            public void onNewVideo(String message) {
                System.out.println("Hello, subscriber_from_china, " + message);
            }
        };

        Subscriber subscriber_from_italy = new Subscriber() {
            @Override
            public void onNewVideo(String message) {
                System.out.println("Hi, subscriber_from_italy, " + message);
            }
        };
        youTuber.subscribe(subscriber_from_china);
        youTuber.subscribe(subscriber_from_italy);

        youTuber.newVideo("MY_video");
    }

    public static void main(String[] args) {
        observerExample();
    }
}
