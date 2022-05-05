package adapter;

public class MultipleWriter {
    MultipleWriterAdapter adapter;

    public void setAdapter(MultipleWriterAdapter adapter){
        this.adapter = adapter;
    }
    public void write(){
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            System.out.println(adapter.getByIndex(i));
        }
    }
}
