package external.main;





import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import external.Link;
public class Class {

	
	
	public String name; // Sets to public
	public String number;
	
	// References to next link made in the LinkList
	
	
	public Link next; // Set to null until it is connected to other links
	
	
	public Class(String name, String number){
		
		this.name = name;
		this.number = number;
		
	}
	
	public void display(){
		
		System.out.println(name + " " + number );
		
	}
	
	public String toString(){
		
		return name;
		
	}
	
	
}


class LinkList{
	
	
	
	public Link firstLink; 
	
	LinkList(){
		
		
		firstLink = null;// First link is set to null 
		
	}
	
		public boolean isEmpty(){
		
		return(firstLink == null); // checks if link list is empty
		
	}

	public void insert(String name, String number){
		
		Link newLink = new Link(name, number);
		
		 
		
		newLink.next = firstLink; // Connects the firstLink to the new Link
		
		firstLink = newLink;
		
	}
	
	public Link removeFirst(){
		
		Link linkReference = firstLink;
		
		if(!isEmpty()){
		
			// this removes the Link from the List
		
			firstLink = firstLink.next; 
		
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		return linkReference;
		
	}
	
	public void display(){
		
		Link theLink = firstLink;
		
		// Starts at the  reference stored in firstLink and keep getting the references stored in next for every Link until  returns null
		
		while(theLink != null){
			
			theLink.display();
			
		
			
			theLink = theLink.next;
			
			System.out.println();
			
		}
		
	}
	
	
/*	
public Link find(String name){
		
		Link theLink = firstLink;
		
		if(!isEmpty()){
		
			while(theLink.name != name){
			
				// Checks if at the end of the LinkedList
			
				if(theLink.next == null){
				
					// Got to the end of the Links in LinkedList
					// without finding a match
				
					return null;
				
				} else {
				
					// Found a matching Link in the LinkedList
				
					theLink = theLink.next;
				
				}
			
			}
			
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		System.out.println(theLink.number);
		
		return theLink;
		
	}
	
	*/
	
	
	
	public  Link find(String name){
		
		
		Link theLink = firstLink;
		
		if(!isEmpty()){
		
			while(theLink.name != name){
			
				
			     //
				
			    if(theLink.next == null){
				
					// If  is got to the end of the Links in LinkedList without finding the match
				    
			    	
					return null;
				
				} else {
				
					// Has found a matching Link in the List's structure
					if(theLink.name.equals(name))
					{  
						
					    
					    System.out.println(theLink.number);
					    theLink = theLink.next;
					    
					}
					
					theLink = theLink.next;
				}
			}
			
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		
		
		
		System.out.println(theLink.number);
		return theLink;
		
	}
	
	public Link removeLink(String name){
		
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		// Keep  the list until searching until you found the match
		
		while(currentLink.name != name){
			
			// Check if at the last Link in the LinkedList
			
			if(currentLink.next == null){
				
				//  if name  is not found  leave this method
				
				return null; 
				
			} else {
				
				// move to next link in the list
				
				previousLink = currentLink; 
				
				currentLink = currentLink.next;
				
			}
			
		}
		
		if(currentLink == firstLink){
			
			// if this statement is satisfied then that means move on to the next link
			firstLink = firstLink.next;
			
		} else {
			
			//  There was a match in a Link besides the firstLink. 
			
			//System.out.println("FOUND A MATCH");
			//System.out.println("currentLink: " + currentLink);
			//System.out.println("firstLink: " + firstLink);
			
			previousLink.next = currentLink.next;
			
		}
		
		return currentLink;
		
	}
	

      public void addtofile(){
		
		Link currentLink = firstLink;
		
		String nom, val;
		// Keep searching as long as a match isn't made
		
		File file = new File("/Users/user/Desktop/writer.txt");     
		
				try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
				   
					while(currentLink != null){
						
						
						nom = currentLink.name; 
						val = currentLink.number;
					// writes the value to the file	
					br.write(nom);
				    br.write(" ");
					br.write(val);
				    br.newLine();
					
				    currentLink = currentLink.next;
					}
				 }catch (IOException e) {
						System.out.println("Unable to" + file.toString());
				     }
					
				
				
			
			
		}
      

public Link findandupdate(String name, String number){
	
	Link theLink = firstLink;
	
	if(!isEmpty()){
	
		while(theLink.name != name){
		
			// Checks if at the end of the LinkedList
		
			if(theLink.next == null){
			
				// Goes to the end of the Links in LinkedList without finding the match
				
				return null;
			
			} else {
			
				// Found a matching Link in the LinkedList
				//theLink.number = number;
				
				theLink = theLink.next;
				 
			}
			//theLink = theLink.next;
		}
		
	} else {
		
		System.out.println("Empty LinkedList");
		
	}
	
	
	theLink.number = number; // find the number
	return theLink;
	
}
}
