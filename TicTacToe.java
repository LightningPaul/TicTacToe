import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        int spieler;                // spieler int 1 oder 2
        boolean gewonnen;           // gewonnen true/false
        int auswahl;                // auswahl der Felder
        String ok = "Nein";

        Scanner input = new Scanner(System.in);

        String[][] feld = new String[3][3];

        feld[0][0] = "1";           //feld 1
        feld[0][1] = "2";           //feld 2
        feld[0][2] = "3";           //feld 3
        feld[1][0] = "4";           //feld 4
        feld[1][1] = "5";           //feld 5
        feld[1][2] = "6";           //feld 6
        feld[2][0] = "7";           //feld 7
        feld[2][1] = "8";           //feld 8
        feld[2][2] = "9";           //feld 9

        System.out.println("Das Spiel Tic-Tac-Toe wurde gestartet, Felder werden durch die Zahlen 1-9 gewählt: ");

        feldDraw(feld);         //printet das aktuelle Spielfeld

        feld[0][0] = " ";           //feld 1
        feld[0][1] = " ";           //feld 2
        feld[0][2] = " ";           //feld 3
        feld[1][0] = " ";           //feld 4
        feld[1][1] = " ";           //feld 5
        feld[1][2] = " ";           //feld 6
        feld[2][0] = " ";           //feld 7
        feld[2][1] = " ";           //feld 8
        feld[2][2] = " ";           //feld 9


            System.out.println("Welcher Spieler soll anfangen [1] oder [2]");
            spieler = input.nextInt();


                    feldDraw(feld);
                do {

                    System.out.println("Spieler " + spieler + ", Waehle ein Feld:");
                    auswahl = input.nextInt();
                    feldChoose(auswahl, feld, spieler);
                    feldDraw(feld);

                    //bestimmung des gewinners
                    if (feld[0][0].equals("o") && feld[1][0].equals("o") && feld[2][0].equals("o")) {
                        gewonnen = true;
                    } else if (feld[0][1].equals("o") && feld[1][1].equals("o") && feld[2][1].equals("o")) {
                        gewonnen = true;
                    } else if (feld[0][2].equals("o") && feld[1][2].equals("o") && feld[2][2].equals("o")) {
                        gewonnen = true;
                    } else if (feld[0][0].equals("o") && feld[0][1].equals("o") && feld[0][2].equals("o")) {
                        gewonnen = true;
                    } else if (feld[1][0].equals("o") && feld[1][1].equals("o") && feld[1][2].equals("o")) {
                        gewonnen = true;
                    } else if (feld[2][0].equals("o") && feld[2][1].equals("o") && feld[2][2].equals("o")) {
                        gewonnen = true;
                    } else if (feld[0][0].equals("o") && feld[1][1].equals("o") && feld[2][2].equals("o")) {
                        gewonnen = true;
                    } else gewonnen = feld[2][0].equals("o") && feld[1][1].equals("o") && feld[0][2].equals("o");

                    //  oder

                    if (feld[0][0].equals("x") && feld[1][0].equals("x") && feld[2][0].equals("x")) {
                        gewonnen = true;
                    } else if (feld[0][1].equals("x") && feld[1][1].equals("x") && feld[2][1].equals("x")) {
                        gewonnen = true;
                    } else if (feld[0][2].equals("x") && feld[1][2].equals("x") && feld[2][2].equals("x")) {
                        gewonnen = true;
                    } else if (feld[0][0].equals("x") && feld[0][1].equals("x") && feld[0][2].equals("x")) {
                        gewonnen = true;
                    } else if (feld[1][0].equals("x") && feld[1][1].equals("x") && feld[1][2].equals("x")) {
                        gewonnen = true;
                    } else if (feld[2][0].equals("x") && feld[2][1].equals("x") && feld[2][2].equals("x")) {
                        gewonnen = true;
                    } else if (feld[0][0].equals("x") && feld[1][1].equals("x") && feld[2][2].equals("x")) {
                        gewonnen = true;
                    } else gewonnen = feld[2][0].equals("x") && feld[1][1].equals("x") && feld[0][2].equals("x");

                    if (spieler == 1) {
                        spieler++;
                    } else{
                        spieler--;
                    }
                } while (!gewonnen);
        System.out.println("Spieler " + spieler + " hat gewonnen!");
        }



    public static void feldDraw(String[][] feld) {
        System.out.println("*Aktuelles Spielfeld*");

        System.out.println("|" + feld[0][0] + "|" + feld[0][1] + "|" + feld[0][2] + "|");
        System.out.println("|" + feld[1][0] + "|" + feld[1][1] + "|" + feld[1][2] + "|");
        System.out.println("|" + feld[2][0] + "|" + feld[2][1] + "|" + feld[2][2] + "|");
    }

    public static void feldChoose(int auswahl, String[][] feld, int spieler) {

        switch (auswahl) {
            case 1:
                if (spieler == 1) {
                    feld[0][0] = "x";
                } else if (spieler == 2) {
                    feld[0][0] = "o";
                }
                break;
            case 2:
                if (spieler == 1) {
                    feld[0][1] = "x";
                } else if (spieler == 2) {
                    feld[0][1] = "o";
                }
                break;
            case 3:
                if (spieler == 1) {
                    feld[0][2] = "x";
                } else if (spieler == 2) {
                    feld[0][2] = "o";
                }
                break;
            case 4:
                if (spieler == 1) {
                    feld[1][0] = "x";
                } else if (spieler == 2) {
                    feld[1][0] = "o";
                }
                break;
            case 5:
                if (spieler == 1) {
                    feld[1][1] = "x";
                } else if (spieler == 2) {
                    feld[1][1] = "o";
                }
                break;
            case 6:
                if (spieler == 1) {
                    feld[1][2] = "x";
                } else if (spieler == 2) {
                    feld[1][2] = "o";
                }
                break;
            case 7:
                if (spieler == 1) {
                    feld[2][0] = "x";
                } else if (spieler == 2) {
                    feld[2][0] = "o";
                }
                break;
            case 8:
                if (spieler == 1) {
                    feld[2][1] = "x";
                } else if (spieler == 2) {
                    feld[2][1] = "o";
                }
                break;
            case 9:
                if (spieler == 1) {
                    feld[2][2] = "x";
                } else if (spieler == 2) {
                    feld[2][2] = "o";
                }
                break;
            default:
                System.out.println("Ungültige Position!!!");
                break;
        }
    }
}


