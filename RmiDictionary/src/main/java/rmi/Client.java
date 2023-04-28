package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Registry registry = LocateRegistry.getRegistry("localhost");
		IDict dict = (IDict) registry.lookup("translate");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your selection: ");
		int choice = sc.nextInt();
		boolean loop = true;
		String word, mean;
		
		while (loop == true) {
			
			System.out.println("----------------------------");
			System.out.println("1. Tra từ");
			System.out.println("2. Thêm từ");
			System.out.println("3. Sửa nghĩa của từ");
			System.out.println("4. Xóa từ");
			System.out.println("5. Thoát");
			System.out.println("----------------------------");
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("Input word: ");
				String xStr = sc.nextLine();
				mean = dict.dictENtoVn(xStr);
				System.out.println("\nMean: " + mean);
				break;
			case 2:
				System.out.print("Input word: ");
				word = sc.nextLine();
				System.out.print("\nInput mean of word: ");
				mean = sc.nextLine();
				dict.addWord(word, mean);
				break;
			case 3: 
				System.out.print("Input word: ");
				word = sc.nextLine();
				System.out.print("\nInput update mean of word");
				mean = sc.nextLine();
				dict.updateMean(word, mean);
				break;
			case 4: 
				System.out.print("Input word need to delete");
				word = sc.nextLine();
				dict.delete(word);
				break;
			case 5: 
				loop = false;
				break;
			default:
				loop = false;
				break;
			}
			
			System.out.println("Input your selection: ");
			choice = sc.nextInt();

		}
		
	}
}
