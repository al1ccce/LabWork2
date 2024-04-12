import java.util.Scanner;

public class ChessMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        System.out.println("m = ");
        int m = scanner.nextInt();
        System.out.println("moves = ");
        String hodi = scanner.next();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int[] result = moves(hodi, i, j, n, m);
                int nnew = result[0];
                int mnew = result[1];
                if (nnew > 0 && nnew <= n && mnew > 0 && mnew <= m) {
                    System.out.println(i + " " + j);
                    System.exit(0);
                }
                if (nnew == -123) {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }

    public static int[] moves(String hodi, int n, int m, int nlocal, int mlocal) {
        for (char hod : hodi.toCharArray()) {
            switch (hod) {
                case 'L':
                    m -= 1;
                    break;
                case 'R':
                    m += 1;
                    break;
                case 'D':
                    n += 1;
                    break;
                case 'U':
                    n -= 1;
                    break;
                default:
                    System.out.println(hod + " is undefined");
                    return new int[]{-123, 0};
            }
            if (n <= 0 || n > nlocal || m <= 0 || m > mlocal) {
                return new int[]{0, 0};
            }
        }
        return new int[]{n, m};
    }
}
