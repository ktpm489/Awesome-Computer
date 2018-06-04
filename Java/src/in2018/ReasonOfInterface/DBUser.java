package in2018.ReasonOfInterface;

interface DB {
    void connection();
    void runTransaction();
    void commit();
}

class DB2 implements DB {
    @Override
    public void connection() {
        System.out.println("DB2연결");
    }

    @Override
    public void runTransaction() {
        System.out.println("DB2샤용");
    }

    @Override
    public void commit() {
        System.out.println("DB2저장");
    }
}

class Oracle implements DB {
    @Override
    public void connection() {
        System.out.println("오라클연결");
    }

    @Override
    public void runTransaction() {
        System.out.println("오라클사용");
    }

    @Override
    public void commit() {
        System.out.println("오라클저장");
    }
}

public class DBUser {
    public static void main(String[] args) {
        Oracle db = new Oracle();

        db.connection();
        db.runTransaction();
        db.commit();
    }
}
