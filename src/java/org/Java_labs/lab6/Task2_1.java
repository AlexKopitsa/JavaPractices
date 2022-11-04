package org.Java_labs.lab6;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;  

public class Task2_1 {
    public static void main(String[] args) throws ParseException {
        Student[] list = new Student[] {
            new Student(new String[] {"StudentL1", "StudentN1", "StudentS1", "01.01.2002", "address1", "faculty1", "000-000-00-01", 3, 1}),
            new Student(new String[] {"StudentL2", "StudentN2", "StudentS2", "01.02.2002", "address2", "faculty2", "000-000-00-02", 2, 3}),
            new Student(new String[] {"StudentL3", "StudentN3", "StudentS3", "01.03.2002", "address3", "faculty3", "000-000-00-03", 3, 4}),
            new Student(new String[] {"StudentL4", "StudentN4", "StudentS4", "01.04.2002", "address4", "faculty4", "000-000-00-04", 3, 5}),
            new Student(new String[] {"StudentL5", "StudentN5", "StudentS5", "01.05.2002", "address5", "faculty5", "000-000-00-05", 1, 3})
		};
        Scanner in = new Scanner(System.in);
        String command = "end";
        do {
            System.out.print("\n Enter command (faculty, year or group): ");
            command = in.nextLine();
            if (command.equals("faculty")){
                System.out.print("\n Enter faculty: ");
                command = in.nextLine();
                for (Student a: list){
                    if (a.getFaculty().equals(command))
                        System.out.print(a.toString());
                }
            }
            else if(command.equals("year")){
                System.out.print("\n Enter date: ");
                command = in.nextLine();
                Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(command);  
                for (Student a: list){
                    Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse(a.getDateOfBirth());  
                    if (date2.compareTo(date1) > 0)
                        System.out.print(a.toString());
                }
            }
            else if(command.equals("group")){
                System.out.print("\n Enter group: ");
                command = in.nextLine();
                System.out.printf("Groups: ");
                for (Student a: list){
                    if (a.getFaculty().equals(command))
                        System.out.printf("%d ", a.getGroup());
                }
            }
        } while(command != "end");
    }
}
