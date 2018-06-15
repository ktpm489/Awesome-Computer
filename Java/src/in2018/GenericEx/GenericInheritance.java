package in2018.GenericEx;

class Product2<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}

class Tv2{ }

class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    public C getCompany() {
        return company;
    }

    void setCompany(C company) {
        this.company = company;
    }
}

interface Storage<T> {
    void add (T item, int index);
    T get(int index);
}

class StorageImpl<T> implements Storage<T> {
    private T[] array;

    StorageImpl(int capacity) {
        this.array = (T[]) (new Object[capacity]);
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        ChildProduct<Tv2, String, String> product = new ChildProduct<>();
        product.setKind(new Tv2());
        product.setModel("SmartTv");
        product.setCompany("Samsung");

        Storage<Tv2> storage = new StorageImpl<Tv2>(100);
        storage.add(new Tv2(), 0);
        Tv2 tv = storage.get(0);
    }
}
