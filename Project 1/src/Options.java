import java.io.File;
import java.io.IOException;
import java.util.*;


public class Options {
	
	public void Filenames(){
		
		   File folder = new File("UserInputz/" );
		  
		File[] files = folder.listFiles();
		 if (files.length==0) 
	            System.out.println("No files in the directory");
		   
		   else {
	        Arrays.sort(files);
	        for (File file : files)
	        {
	            System.out.println(file.getName());
	        }
	        
	}}
	public void AddUser(String c)  {
		try {		
			
				File f=new File("UserInputz/" +c);
				if(f.createNewFile()) {
					System.out.println("File Created: "  +f.getName());			
				}
				else {
					if(f.exists()) {
						System.out.println("file already exists");
					
				}}}
		catch (IOException e) {
					System.out.println("An Error Occured");
				}
	}
	
	
	public void Deleteuser(String g) {
	try {	
		
	
		File myObj = new File("UserInputz/" + g ); 
			    if (myObj.delete()) { 
			     System.out.println("Deleted the file: " + myObj.getName());
			    }
			    else {
			      System.out.println("Failed to delete the file.File don't exist");
			    } }
	catch(Exception e)  
				{  
					System.out.println("An Error occured");
				}	
				}
	
	
	public void SearchUser(String content) {
	try {	
		
		File search = new File("UserInputz/" + content ); 
			      if(search.exists()){
			    	  System.out.println("File exists in Directory: " +search.getName());
			      }
			      else {
			    	  System.out.println("File doesnot exists");
			      }
	}
	catch(Exception e) {
				System.out.println("An Error Occured");
	}
	}



}
   

