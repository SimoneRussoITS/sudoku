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
                    tabella += " "  +coordinate[i][j]+ " ||";
                } else {
                    tabella += " " + coordinate[i][j] + " |";
                }
            }

            if (i != 8){
                if(i == 2 || i == 5){
                    tabella += "\n\n\n||";
                }else {
                    tabella += "\n\n||";
                }
            }
        }

            
    
        //System.out.println(tabella);

        stampaSoduko(coordinate, tabella);





        in.close();
}

    public static void stampaSoduko(int [][] cor, String tab){
        System.out.println("\nHai completato il sudoku");
        for (int i = 0; i < cor.length; i++) {
            for (int j = 0; j < cor.length; j++) {    
            }

        } System.out.println(tab);
    }
}
