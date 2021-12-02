package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size=0;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
    }

    public int getsize() {
        return size;
    }
    public Object getdata(int size) {
        return data[size];
    }
    public void clear() {
        for(int i=0;i<size;++i)
            data[i]=null;
        size =0;
    }

    public void add(T other) {
        if(get(other)) {
            data[size] = other;
            size++;
        }
    }
    public boolean get(T other) {
        for(int i=0;i<size;++i) {
            if(other.equals(data[i]))
                return false;
        }
        return true;
    }
}
