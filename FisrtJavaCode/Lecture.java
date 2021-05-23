import java.util.Scanner;

public class Lecture{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);


		System.out.println("Veuillez saisir un nombre : ");
		int nbre = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " + nbre);

	}
}