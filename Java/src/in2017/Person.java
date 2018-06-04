package in2017;

public class Person {
    int age;
    public String name;
    protected int height;
    private int weight;

    Person(String name){
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
