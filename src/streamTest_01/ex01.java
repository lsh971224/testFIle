package streamTest_01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    private String name;
    private int age;

    public Student(){}

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
class DTO{
    private String name;
    DTO(){}

    DTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class DAO{

}

public class ex01 {
    public static void main(String[] args) {
        DTO d = new DTO("홍길동");
        System.out.println(d.getName());
        Map<DTO, DAO> map = new HashMap<>();
        map.put(new DTO(), new DAO());
        for (Map.Entry<DTO, DAO> m : map.entrySet()) {
            System.out.println("m : getKey()"+m.getKey()+"m : getValue()"+m.getValue());
        }

    }
}
