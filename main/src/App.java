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
        System.out.println(tabella);

        controllaInput(coordinate);
        // Nelson prendiInput(coordinate);
        // Leo stampaSudoku(coordinate);


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
}
