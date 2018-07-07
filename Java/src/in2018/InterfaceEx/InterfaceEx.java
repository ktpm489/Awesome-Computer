package in2018.InterfaceEx;

import java.util.ArrayList;

class User {
    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

interface UserFunction {
    void createUser(int id, String name, int age);
    User getUserInfo(int id);
}

class UserFunctionImpl implements UserFunction {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void createUser(int id, String name, int age) {
        users.add(new User(id, name, age));
    }

    @Override
    public User getUserInfo(int id) {
        for(User user : users)
            if(user.getId() == id)
                return user;
        return null;
    }
}

class InterfaceEx {
    public static void main(String[] args) {
        UserFunctionImpl userFunction = new UserFunctionImpl();

        userFunction.createUser(1, "kim", 18);
        System.out.println(userFunction.getUserInfo(1).getName());
    }
}