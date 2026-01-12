import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//presentació títol de la Calculadora
        System.out.println("Calculadora");
        
//demanem a l'usuari que introdueixi el primer número
        System.out.print("Introdueix el primer número: ");
        double x = sc.nextDouble();
        
//demanem a l'usuari l'operació que vol realitzar i el següent número
        System.out.println("Selecciona una operació (+, -, *, /): ");
        System.out.print("Operació: ");
        char operacio = sc.next().charAt(0);

        System.out.print("Introdueix el segon número: ");
        double y = sc.nextDouble();

        double resultat;

//com que només tenim 4 opcions, considero oportú utilitzar switch. Encara que també es podria utilitzar l'estructura *if else*
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
