import java.util.Scanner;
public class Bouclefor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom : ");
        String nom = sc.nextLine();
        for(int i = 0 ; i < 6 ; i++)
        {
            System.out.println("Votre nom est : " + nom);
        }
    }
}
