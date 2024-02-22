import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int coordinate[][] = new int[9][9];
        String tabella = "";
        for (int i = 0; i < coordinate.length; i++) {
            if (i == 0) {
                tabella += "||";
            }
            for (int j = 0; j < coordinate.length; j++) {
                if (j == 2 || j == 5 || j == 8) {
                    tabella += " " + coordinate[i][j] + " ||";
                } else {
                    tabella += " " + coordinate[i][j] + " |";
                }
            }

            if (i != 8) {
                if (i == 2 || i == 5) {
                    tabella += "\n\n\n||";
                } else {
                    tabella += "\n\n||";
                }
            }
        }

        // System.out.println(tabella);

        stampaSoduko(coordinate, tabella);

        prendiInput(coordinate);

        controllaInput(coordinate);

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

    public static void controllaInput(int[][] tabella) {
        //Controllo righe
        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella.length; j++) {
                if (tabella[i][j + 1] == tabella[i][j]) {
                    System.out.println("error");
                    break;
                }
            }
        }
        //Controllo colonne
        for (int i = 0; i < tabella.length; i++) {
            for (int j = 0; j < tabella.length; j++) {
                if (tabella[i + 1][j] == tabella[i][j]) {
                    System.out.println("error");
                    break;
                }
            }
        }
    }

    public static void stampaSoduko(int[][] cor, String tab) {
        System.out.println("\nHai completato il sudoku");
        for (int i = 0; i < cor.length; i++) {
            for (int j = 0; j < cor.length; j++) {
            }

        }
        System.out.println(tab);
    }
}
