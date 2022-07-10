import java.util.InputMismatchException;
import java.util.Scanner;
public class WelcomePage {
	
public static void Goback(int num1) {
		
		Scanner sc=new Scanner(System.in);
	
		if (num1==4) {
			mainMenu();
		}
		else {
			System.out.println("Enter a valid option");
			 System.out.println("4. Go back");
			 int k7  = sc.nextInt();
			 Goback(k7);
         
		}
	}
	
public static void Goback1(int num2) {
		
			Scanner sc=new Scanner(System.in);
			if (num2==4) {
				Submenu();
			}
			else {
				System.out.println("Enter a valid option");
				 System.out.println("4. Go back");
				int k9  = sc.nextInt();
	     	   Goback1(k9);
	         
			}
		}

public static void mainMenu() {
try {
		Options p=new Options();
		Scanner sc=new Scanner(System.in);
        System.out.println("Choose from the options: ");
        System.out.println("1 . Show All available Files");
        System.out.println("2 . Add,Delete and Search Files");
        System.out.println("3 . Exit");
      
        int   num = sc.nextInt();   
     
       switch(num){    
       case 1: 
    	   		p.Filenames();
    	   		System.out.println("4. Go back to Main menu");
    	   		int k  = sc.nextInt();
    	   		Goback(k);
    	   		break;
       case 2:	
    	   		Submenu();
    	   		System.out.println("4. Go back to Main menu");
    	   		break;
    	   				
 
					
       case 3: 
    	   		System.out.print("Exited ....\nThankyou");
    	   		System.exit(0);       	   		
                break;
      
                 
       default: 
    	   		System.out.println("Enter Valid options!!!");
    	   		System.out.println("4. Go back to Main menu");
    	   		int k5  = sc.nextInt();
    	   		Goback(k5);
       }}
catch(InputMismatchException ee) {
				System.out.println("An Error Occured , Please Select from the options");
				mainMenu();
}
catch(Exception ee) {
				System.out.println("An error Occured");
				mainMenu();
}
 
}


	
public static void Submenu() {
		try {	
			System.out.println("Choose from the options: ");
			System.out.println("1 . Add a file");
	   	    System.out.println("2 . Delete a File");
	   	    System.out.println("3 . Search a file");
	   	    System.out.println("4 . Go back to Main menu");
			
			Options p=new Options();
			Scanner sc=new Scanner(System.in);
			int value=sc.nextInt();
	
		switch(value) {
			case 1:	
				System.out.println("Enter File Name");
				String c=sc.next();
				p.AddUser(c);
				System.out.println("4. Go back");
				int k1  = sc.nextInt();
				Goback1(k1);
				break;
				
			case 2:	
				System.out.println("Enter the file you want to delete");
				String g=sc.next();
				p.Deleteuser(g);
				System.out.println("4. Go back");
				int k2  = sc.nextInt();
				Goback1(k2);
				break;
				
		  case 3: 	
	   			System.out.println("Enter the file you want to search");
				String content = sc.next();
				p.SearchUser(content);
				System.out.println("4. Go back");
				int k3  = sc.nextInt();
				Goback1(k3);
				break;
				
		  case 4:
			  	mainMenu();
			  	break;
			 
		  default: 
       	   		System.out.println("Enter Valid options!!!");
       	   		System.out.println("4. Go back");
       	   		int k10  = sc.nextInt();
       	   		Goback1(k10);
          }
		}
		catch(InputMismatchException eee) {
				System.out.println("An Error Occured");
				Submenu();
		}
		catch(Exception eee) {
				System.out.println("An error Occured");
				Submenu();
		}
			}
			
	
	


	public static void main(String[] args) {	
			System.out.println("Welcome to the Page");
			 System.out.println("****************************************************************");
	         System.out.println("*************************** LockedME.com  ********************");
	         System.out.println("**********************      Sankalp Mathur    ************************");
	         System.out.println("****************************************************************");
	         System.out.println();
		     System.out.println("File Directory : UserInputz");
		     System.out.println();
		
		     mainMenu();
		     Submenu();
	}

}
