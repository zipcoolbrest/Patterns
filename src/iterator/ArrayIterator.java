package iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    int current = 0;

    public ArrayIterator(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return current < array.length;
    }

    @Override
    public T next() {
        return array[current++];
    }
}
