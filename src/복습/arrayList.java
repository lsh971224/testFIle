package 복습;

import java.util.HashMap;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class arrayList {
    public static void main(String[] args) {
        HashMap<Integer, Student> map = new HashMap<>();
        Student lee = new Student("이순신", 22);
        map.put(1, lee);
        System.out.println(map.get(1).getName());
    }
}
