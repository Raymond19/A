package external.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import external.Link;



public class Main {
	

	public static void main(String[] args) throws FileNotFoundException {
		
		LinkList theLinkedList = new LinkList();
		Scanner input = new Scanner(System.in);
		
		
		int value = 9;
		
		while(value > 0)
		{
			System.out.println("would you like to add data to the file");// calls the insert to link function
			String line = input.nextLine();
			String name1;
			String number1;
			if(line.equals("yes"))
			{
				System.out.println("Enter name then press enter");
				name1 = input.nextLine();
				System.out.println("Enter number then press enter");
				number1 = input.nextLine();
				theLinkedList.insert(name1, number1);
				theLinkedList.addtofile();
				
			}
			
			theLinkedList.insert("Jane","202432332");
		
		    theLinkedList.insert("Antha","200335321");
		
		    theLinkedList.insert("Ruduku", "1504532264");
		    
		    theLinkedList.insert("Harry", "410353107");
			theLinkedList.addtofile();
			
			System.out.println("would you like to delete data from the file");// calls the delete function
			line = input.nextLine();
			if(line.equals("yes"))
			{
				System.out.println("Enter name then press enter");
				name1 = input.nextLine();
				theLinkedList.removeLink(name1);
				theLinkedList.addtofile();
				
			}
			System.out.println("would you like to look up a number in the file"); // calls the finf function
			line = input.nextLine();
			if(line.equals("yes"))
			{
				System.out.println("Enter name then press enter");
				name1 = input.nextLine();
				System.out.println(name1);
				theLinkedList.find("Jane");
				
				
			}
			
			System.out.println("would you like to update data on the file"); // calls the update function
			line = input.nextLine();
			if(line.equals("yes"))
			{
				System.out.println("Enter name then press enter");
				name1 = input.nextLine();
				System.out.println("Enter number you want to replace then press enter");
				number1 = input.nextLine();
				theLinkedList.findandupdate(name1, number1); 
				theLinkedList.addtofile();
				
			}
			
		    
			System.out.println("would you like to see what is in the file");
			line = input.nextLine();
			if(line.equals("yes"))
			{
				 String filename = "/Users/user/Desktop/writer.txt"; // this part reads from the file
				 
				 File textFile = new File(filename);
				 
				 Scanner in = new Scanner(textFile);
				 
				 
				 
				 while(in.hasNextLine()) {
					 
					 String line5 = in.nextLine();
					 
					 System.out.print( line5 ); 
					 
					 System.out.print('\n');
					 
					 
				 
				 
		           }	     
				 in.close();
			}
		
			System.out.println("would you like to see what is in the link list");
			line = input.nextLine();
			if(line.equals("yes"))
			{
				
				theLinkedList.display();// displays to screen
				
			}
			

			System.out.println("would you like to exit");
			line = input.nextLine();
			if(line.equals("yes"))
			{
				
				break;
				
			}
			
			
		
			
		}	
			
	   }			
	}		
		    
		    
			
		
		


