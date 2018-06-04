package in2018.AbstractEx;

class Linux extends OS {
    @Override
    public void textClear() {
        System.out.println("clear");
    }

    @Override
    public void showList() {
        System.out.println("ls");
    }
}

class Mac extends OS {
    @Override
    public void textClear() {
        System.out.println("??");
    }

    @Override
    public void showList() {
        System.out.println("ls");
    }
}

class Windows extends OS {
    @Override
    public void textClear() {
        System.out.println("cls");
    }

    @Override
    public void showList() {
        System.out.println("dir");
    }
}

public class Main {
    public static void main(String[] args) {
        
    }
}
