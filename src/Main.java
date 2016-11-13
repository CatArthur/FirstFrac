import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Frac d=new Frac(sc.nextInt(),sc.nextInt());
        System.out.println(d.isShorten());
    }
}
