import java.util.Scanner;

public class ChessMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("Moves: ");
        String moves = scanner.next();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (FuncMoves(moves, i, j, n, m)) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("No");
    }
    public static boolean FuncMoves(String moves, int n, int m, int boardSizeN, int boardSizeM) {
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L':
                    m--;
                    break;
                case 'R':
                    m++;
                    break;
                case 'D':
                    n++;
                    break;
                case 'U':
                    n--;
                    break;
                default:
                    System.out.println(move + " is undefined");
                    return false;
            }
        }
        return n > 0 && n <= boardSizeN && m > 0 && m <= boardSizeM;
    }
}
