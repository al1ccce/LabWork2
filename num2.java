import java.util.Scanner;

public class BottleExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("full bottles: ");
        int n = scanner.nextInt();
        
        System.out.print("empty bottles for exchange: ");
        int m = scanner.nextInt();
        
        int mc = n;
        int mcount = n;
        int count = 0;
        int ost = 0;
        int drinkedBottles = 0;
        
        while (mcount > 0) {
            System.out.println("F".repeat(n));
            drinkedBottles += n;
            count++;
            mc = n + ost;
            System.out.println("E".repeat(mc));
            ost = mc % m;
            n = mc / m;
            count++;
            mc = ost;
            mcount = n;
        }
        
        System.out.println(drinkedBottles + " " + (count - 1));
    }
}
