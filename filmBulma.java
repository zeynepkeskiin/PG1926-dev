package zey;

import java.util.ArrayList;
import java.util.Scanner;

public class filmBulma {

	public static void main(String[] args) {
	
		System.out.println("Film Listesi Uygulamasýna Hoþ Geldiniz");
		System.out.println();
		System.out.println("Listede 20 film var");
		String choice="y";
				Scanner scanner=new Scanner(System.in);
				
				ArrayList<String> korku= new ArrayList<>();
				korku.add("Arýnma Gecesi");
				korku.add("Countdown");
				korku.add("Ölümcül Sular");
				korku.add("Kadaver");
				korku.add("World War Z");
		         
		         
		         ArrayList<String> animasyon = new ArrayList<>();
		         animasyon.add("Oscar Çölde");
		         animasyon.add("Patron Bebek");
		         animasyon.add("Madagaskar");
		         animasyon.add("Çýlgýn Hýrsýz");
		         animasyon.add("Ters Yüz");
		         
		         
		         ArrayList<String> romantik = new ArrayList<>();
		         romantik.add("Aþk ve Gurur");
		         romantik.add("Titanik");
		         romantik.add("Senden Önce Ben");
		         romantik.add("The Notebook");
		         romantik.add("Five Feet Apart");
		         
		         ArrayList<String> bilimkurgu = new ArrayList<>();
		         bilimkurgu.add("Ýnception");
		         bilimkurgu.add("Matrix");
		         bilimkurgu.add("Yýldýzlararasý");
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