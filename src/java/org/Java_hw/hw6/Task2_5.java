package org.Java_hw.hw6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task2_5 {
	public static void main(String[] args) {
		List<Book> bookArray = new ArrayList<Book>();
		Book book1 = new Book();
		bookArray.add(book1);
		SortedBook sb = new SortedBook();
		Scanner in = new Scanner(System.in);
        String command = "end";
        do {
            System.out.print("\n Enter command: ");
            command = in.nextLine();
            if(command.equals("author")){
                System.out.print("\n Enter author: ");
                command = in.nextLine();
                System.out.println(sb.sortedByAuthor(command, bookArray));
                
            }
            else if(command.equals("year")){
                System.out.print("\n Enter year: ");
                int command2 = in.nextInt();
                System.out.println(sb.sortedByYear(command2, bookArray));
            }
            else if(command.equals("publishing house")){
                System.out.print("\n Enter publishing house: ");
                command = in.nextLine();
                System.out.println(sb.sortedByPublishingHouse(command, bookArray));
            }
        } while(command != "end");
	}
}
