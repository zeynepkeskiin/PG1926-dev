package zey;

import java.util.ArrayList;
import java.util.Scanner;

public class filmBulma {

	public static void main(String[] args) {
	
		System.out.println("Film Listesi Uygulamas�na Ho� Geldiniz");
		System.out.println();
		System.out.println("Listede 20 film var");
		String choice="y";
				Scanner scanner=new Scanner(System.in);
				
				ArrayList<String> korku= new ArrayList<>();
				korku.add("Ar�nma Gecesi");
				korku.add("Countdown");
				korku.add("�l�mc�l Sular");
				korku.add("Kadaver");
				korku.add("World War Z");
		         
		         
		         ArrayList<String> animasyon = new ArrayList<>();
		         animasyon.add("Oscar ��lde");
		         animasyon.add("Patron Bebek");
		         animasyon.add("Madagaskar");
		         animasyon.add("��lg�n H�rs�z");
		         animasyon.add("Ters Y�z");
		         
		         
		         ArrayList<String> romantik = new ArrayList<>();
		         romantik.add("A�k ve Gurur");
		         romantik.add("Titanik");
		         romantik.add("Senden �nce Ben");
		         romantik.add("The Notebook");
		         romantik.add("Five Feet Apart");
		         
		         ArrayList<String> bilimkurgu = new ArrayList<>();
		         bilimkurgu.add("�nception");
		         bilimkurgu.add("Matrix");
		         bilimkurgu.add("Y�ld�zlararas�");
		         bilimkurgu.add("Avatar");
		         bilimkurgu.add("Yenilmezler");
		         
		         
		         while(choice.equalsIgnoreCase("y"))
		            {
		            System.out.print("Hangi kategoriyle ilgileniyorsunuz??");

		                        String movielist = scanner.nextLine();
		                    switch (movielist) {
		                        case "korku":
		                            System.out.println(korku);
		                            break;
		                        case "animasyon":
		                            System.out.println(animasyon);
		                            break;
		                        case "romantik":
		                            System.out.println(romantik);
		                            break;
		                        case "bilimkurgu":
		                            System.out.println(bilimkurgu);
		                            break;
		                    }

		            System.out.print("Devam et? y/n): ");
		            choice = scanner.next();
		           
	}

}
}