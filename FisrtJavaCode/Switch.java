import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre note : ");
        int note = sc.nextInt();
        switch(note)
        {
            case 0:
                System.out.println("Null, Ouch !!!");
                break ;
            case 10:
                System.out.println("Vous avez juste la moyenne");
                break ;
            case 20:
                System.out.println("Vous avez tout trouvé, Parfait !!!");
                break ;
            default:
                System.out.println("Echec !!! Saisissez une bonne note.");
                break ;
        }
    }
}
