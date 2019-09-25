package bloomfilter;
import java.rmi.*;
import java.io.*;


public class Client {
	public static String bfSize;
	public static void main(String args[]) throws IOException {
		
		Server s= new Server();
		
		bfSize = args[1];
		System.out.println("Entered File Name: "+args[0]);
		System.out.println("Entered Bloom Filter Size: "+bfSize);
				
		//s.initiateBF(args[1]);
		FileInputStream finput  = new FileInputStream(args[0]);
		DataInputStream input  = new DataInputStream(finput);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
		
		//Calling bloom filter interface		
		try {
		//Reading input from a file
			String readStr;
			String[] splitString;
			
		    while ((readStr =buffer.readLine()) != null ) {
		    	System.out.println(readStr);
		    	splitString = readStr.split(" ");
		    	System.out.println(splitString[0]);
		    	
		    // Calling add method of bloom filter remotely
		    	if (splitString[0].contentEquals("add")) {
		    			s.add(null);
		    			System.out.println("Calling add method of bloom filter remotely on" + splitString[1]);		    			
		    	}
		    	
		   // Calling isPresent method of bloom filter remotely
		    	if (splitString[0].contentEquals("test")) {		    		
		    			s.isPresent(null);
		    			System.out.println("Calling is method of bloom filter remotely on" + splitString[1]);
		    	}		    
		    }//while
		//Generate output 
			
			
		}//try
		catch(Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}//catch
		finally {
			input.close();
		}//finally
}//main

	
	
}
