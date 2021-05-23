import java.util.Scanner;
public class Tableaux{
    public static void main(String[] args){
        char tableauCaractere[] = {'a','b','c','d','e','f'};

        for(int i = 0 ; i < tableauCaractere.length ; i++)
        {
            System.out.println("A l'emplacement "+ i + " du tableau, nous avons : " + tableauCaractere[i]);
        }
    }
}
