package in2017;

public class Overriding {

    public static void main(String[] args) {
        DObject start, n, obj;
        start = new Line();

        n = start;

        obj = new Rect();
        n.setNext(obj);
        n = obj;

        obj = new Line();
        n.setNext(obj);
        n = obj;

        obj = new Circle();
        n.setNext(obj);

        while (start != null)
        {
            start.draw();
            start = start.getNext();
        }
    }
}

class DObject {
    private DObject next;

    DObject() {
        next = null;
    }

    public void draw() {
        System.out.println("in2017.DObject Draw");
    }

    public void setNext(DObject next) {
        this.next = next;
    }

    public DObject getNext() {
        return next;
    }
}

class Line extends DObject {
    public void draw() {
        System.out.println("in2017.Line");
    }
}

class Rect extends DObject {
    public void draw() {
        System.out.println("in2017.Rect");
    }
}

class Circle extends DObject {
    @Override
    public void draw() {
        System.out.println("in2017.Circle");
    }
}