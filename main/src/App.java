import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int coordinate[][] = new int[9][9];
        String tabella = "";
        for (int i = 0; i < coordinate.length; i++) {
            if (i == 0) {
                tabella += "||";
            }
            for (int j = 0; j < coordinate.length; j++) {
                if (j == 2 || j == 5 || j == 8) {
                    tabella += "  ||";
                } else {
                    tabella += "  |";
                }
            }
            if (i != 8) {
                tabella += "\n\n||";
            }

        }
        // System.out.println(tabella);
        in.close();

        prendiInput(coordinate);

    }

    public static void prendiInput(int[][] cor) {
        Scanner in = new Scanner(System.in);
        try {
            int rig, col, num;
            System.out.print("\nin che riga vuoi inserire il numero? ");
            rig = in.nextInt();
            System.out.print("\nin che colonna vuoi inserire il numero: ");
            col = in.nextInt();
            System.out.print("che numero vuoi inserire (1-9): ");
            num = in.nextInt();
            for (int i = 0; i < cor.length; i++) {
                for (int j = 0; j < cor.length; j++) {
                    if (i == rig - 1 && j == col - 1) {
                        cor[i][j] = num;
                    }
                }
            }
        } catch (Exception e) {
            // SCRIVI QUALCOSA
        }
        in.close();
    }
}
