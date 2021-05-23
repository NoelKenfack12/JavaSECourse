import java.util.Scanner;
public class Conditions{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre : ");
		int nbre = sc.nextInt();

		if(nbre > 0){
			System.out.println("Le nombre :  " + nbre + " est supérieur à Zéro");
		}else if(nbre == 0){
			System.out.println("Le nombre : " + nbre +" est égale à Zéro");
		}else{
			System.out.println("Le nombre : " + nbre + " est négatif");
		}
	}
}
