package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int rta;
        String rta2 = "";
        do {
            System.out.println("Menu");
            System.out.println("1- ");
            System.out.println("2- ");
            System.out.println("3- ");
            System.out.println("4- ");
            System.out.println("5- Salir");

            rta = leer.nextInt();
            if (rta == 5) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:

                    rta = 6;
                    break;
                case 2:

                    rta = 6;
                    break;
                case 3:

                    rta = 6;
                    break;
                case 4:

                    rta = 6;
                    break;
            }

        } while (rta > 5 || rta < 1 || !rta2.equals("s"));

    }

}
