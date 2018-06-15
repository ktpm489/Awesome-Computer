package in2018.GenericEx;

class Car{
}

class Tv{
}

class Product<T, M> {
    private T kind;
    private M model;

    T getKind() {
        return kind;
    }

    M getModel() {
        return model;
    }

    void setKind(T kind) {
        this.kind = kind;
    }

    void setModel(M model) {
        this.model = model;
    }
}

public class MultiTypeGenericEx {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트TV");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();
        System.out.println(tvModel);

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();
        System.out.println(carModel);
    }
}
