package File_operations;
//Importing the FileWriter class  
import java.io.FileWriter;
import java.io.IOException;   

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {  
		        FileWriter fwrite = new FileWriter("FileOperationExample.txt");  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("Hello T.Y. Class. This is very first line written in to file");
		           
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Content is successfully wrote to the file.");  
		    } catch (IOException e) {  
		        System.out.println("Unexpected error occurred");  
		        e.printStackTrace();  
		        }  
	}

}