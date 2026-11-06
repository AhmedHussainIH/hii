package enumeration;

import java.util.Scanner ;
enum Department {
	CSE, ISE, ECE, MECH
}
 public class EnumDemo {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("AVAILABLE DEPARTMENTS: CSE, ISE, ECE, MECH");
		 System.out.print("enter the department name:");
		 String inpu = sc.nextLine().trim().toUpperCase();
		 try {
			 Department dept = Department.valueOf(input);
			 System.out.println("selected department:" + dept);		 
		 } catch(IllegalArgumentException e) {
			 System.out.println("error! invalid department name entered");
		 } finally {
			 sc.close();
		 }
	     }
		 }
		
			 