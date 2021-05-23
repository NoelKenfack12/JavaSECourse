import java.util.Scanner;
public class TP1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'effectif de votre classe:");
        int effectif = sc.nextInt();
        double somme = 0;
        double tableauNote[] = new double[effectif];

        for(int i = 0 ; i < tableauNote.length ; i++)
        {
            System.out.println("Saisissez la note Numero " + (i + 1));
            double note = sc.nextDouble();
            tableauNote[i] = note;
        }

        for(int i = 0 ; i < tableauNote.length ; i++)
        {
            somme = somme + tableauNote[i];
        }

        System.out.println("La moyenne de la classe est " + (somme/effectif));
    }
}