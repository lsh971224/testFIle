package streamTest_01;

interface A{
    public int aa(int x, int y);
}
interface B{
    public void aa();
}

public class ex92lamda {
    public static void main(String[] args) {
        A a = (x,y)->{ return x+y;};
        System.out.println(a.aa(3,5));
        B b = () -> {
            System.out.println("hi");
        };
        b.aa();
    }
}
