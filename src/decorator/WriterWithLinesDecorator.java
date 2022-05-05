package decorator;

public class WriterWithLinesDecorator implements Writer{
    private Writer writer;

    public WriterWithLinesDecorator(Writer writer){
        this.writer = writer;
    }

    public void write() {
        System.out.println("~~~~~~~~~~~~");
        writer.write();
        System.out.println("~~~~~~~~~~~~~");
    }
}
