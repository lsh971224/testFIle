package 복습;

public class MineralRun {
    public static void main(String[] args) {
        MineralCal m = new MineralCal();
        m.getValue(new GoldMineral());
        m.getValue(new Siver());
        m.getValue(new BronzeMineral());
        System.out.println(m.value);
    }
}
