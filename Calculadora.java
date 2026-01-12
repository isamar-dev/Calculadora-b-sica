import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.print("Introdueix el primer número: ");
        double x = sc.nextDouble();

        System.out.println("Selecciona una operació (+, -, *, /): ");
        System.out.print("Operació: ");
        char operacio = sc.next().charAt(0);

        System.out.print("Introdueix el segon número: ");
        double y = sc.nextDouble();

        double resultat;

        switch (operacio) {
            case '+':
                resultat = x + y;
                System.out.println("Resultat: " + resultat);
                break;

            case '-':
                resultat = x - y;
                System.out.println("Resultat: " + resultat);
                break;

            case '*':
                resultat = x * y;
                System.out.println("Resultat: " + resultat);
                break;

            case '/':
                if (y != 0) {
                    resultat = x / y;
                    System.out.println("Resultat: " + resultat);
                } else {
                    System.out.println("Error: no es pot dividir entre 0.");
                }
                break;

            default:
                System.out.println("Operació no vàlida.");
        }

        sc.close();
    }
}
