package decorator;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

public class AttentionWriterDecorator implements Writer{
    private Writer writer;

    public AttentionWriterDecorator(Writer writer){
        this.writer = writer;
    }

    public void write() {
        System.out.println("!!!!!!!Attention!!!!!!");
        writer.write();
    }
}
