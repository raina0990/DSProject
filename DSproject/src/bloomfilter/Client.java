package bloomfilter;
import java.rmi.*;
import java.io.*;

public class Client {
	
	public static String bfSize;
	public static int noOfHashFn;
	
	
	public static void main(String args[]) throws IOException {
		
		Server s= new Server();
		
		bfSize = args[1];
	    double noOfStrIns = 0;
		
		System.out.println("Entered File Name: "+args[0]);
		System.out.println("Entered Bloom Filter Size: "+bfSize);
				
		//s.initiateBF(args[1]);
		FileInputStream finput  = new FileInputStream(args[0]);
		DataInputStream input  = new DataInputStream(finput);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
		
		//Output File from isPresent 
		
		FileOutputStream foutput = new FileOutputStream(args[2]);
		DataOutputStream output = new DataOutputStream(new BufferedOutputStream(foutput));
		
		
		
		//Output File from false positive rate
		
		FileOutputStream foutput_false = new FileOutputStream("outputFalsePositive.txt");
		DataOutputStream output_false = new DataOutputStream(new BufferedOutputStream(foutput_false));
		
		//Calling bloom filter interface		
		try {
		//Reading input from a file
			String readInLine;
			String[] splitInLine;
			String readOutLine;
			String[] splitOutLine;
			
			
		    while ((readInLine =buffer.readLine()) != null ) {
		    	System.out.println(readInLine);
		    	splitInLine = readInLine.split(" ");
		    	System.out.println(splitInLine[0]);
		    	
		    // Calling add method of bloom filter remotely
		    	if (splitInLine[0].contentEquals("add")) {
		    			s.add(null);
		    			noOfStrIns++;
		    			System.out.println("Calling add method of bloom filter remotely on" + splitInLine[1]);		    			
		    	}
		    	
		   // Calling isPresent method of bloom filter remotely
		    	if (splitInLine[0].contentEquals("test")) {		    		
		    			s.isPresent(null);
		    			System.out.println("Calling is method of bloom filter remotely on" + splitInLine[1]);
		    	
		    	       //create output file from the isPresent function
	  
		    	
		    	
		    	}		    
		    }//while
		   
		   //Calculate false positive rate
		    
		    double falserate = calFalsePositveRate(noOfHashFn,Integer.parseInt(bfSize),noOfStrIns);
		    
		  //Generate output
		    
		    String outLine = "False Positive Rate: " + falserate;
			   
		    output_false.writeUTF(outLine);
		    
			
			
		}//try
		catch(Exception e) {
			System.out.println("Exception :" + e.getMessage());
		}//catch
		finally {
			finput.close();
			foutput.close();
			foutput_false.close();
			
		}//finally
}//main

	
//Calculating false positive rate	
public static double calFalsePositveRate(int noOfHashFn,int noOfBits, double noOfStrIns) {
		double falsePosRate = 0;
		
		
		
		return falsePosRate;
		
	}
	
}

