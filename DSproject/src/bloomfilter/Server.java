package bloomfilter;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.BitSet;

@SuppressWarnings("serial")
public class Server extends UnicastRemoteObject implements BloomInterface{

	Client cli = new Client();
	int bitSize = Integer.parseInt(cli.bfSize);
		
	protected Server() throws RemoteException {
		// TODO Auto-generated constructor stub
	}
	
//	public void initiateBF(String s) {
//		// TODO Auto-generated method stub
//		int bfSize = Integer.parseInt(s);
//		BloomInterface.bloomfilter = new BitSet(bfSize);
//		
//	}

	@Override
	public void add(String s) {
		System.out.println(bloomfilter.length());
		// TODO Auto-generated method stub
		//call hash function1(s, bitSize)
		//store return value
		//set to 1 at that value on bloom filter
		//***************
		////call hash function2
		//store return value
		//set to 1 at that value on bloom filter
		//***************
		//call hash function3
		//store return value
		//set to 1 at that value on bloom filter
		//***************
		//call hash function4
		//store return value
		//set to 1 at that value on bloom filter
		
	}

	@Override
	public Boolean isPresent(String s) {
		// TODO Auto-generated method stub
		//call hash function1
		//store return value
		//check if bit is set or not. If set, increase the counter.
		//call hash function2
		//store return value
		//check if bit is set or not. If set, increase the counter.
		//call hash function3
		//store return value
		//check if bit is set or not. If set, increase the counter.
		//call hash function4
		//store return value
		//check if bit is set or not. If set, increase the counter.
		//Check if counter is equal to num of has functions, equal - String is present, else false.
		if(bloomfilter.get(0)){
			System.out.println("Bit is Set");
		}
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		bloomfilter.clear();
		
	}
	
	public long hashfuction1(String s,int bfbitSize) {
		  int intLength = s.length() / 4;
		     long sum = 0;
		     for (int j = 0; j < intLength; j++) {
		       char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
		       long mult = 1;
		       for (int k = 0; k < c.length; k++) {
			 sum += c[k] * mult;
			 mult *= 256;
		       }
		     }

		     char c[] = s.substring(intLength * 4).toCharArray();
		     long mult = 1;
		     for (int k = 0; k < c.length; k++) {
		       sum += c[k] * mult;
		       mult *= 256;
		     }
		     return(Math.abs(sum) % bfbitSize);//add seed here
	}	
	
	public long hashfunction2(String s, int bfbitSize) {
		 int intLength = s.length() / 4;
	     long sum = 0;
	     for (int j = 0; j < intLength; j++) {
	       char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
	       long mult = 1;
	       for (int k = 0; k < c.length; k++) {
		 sum += c[k] * mult;
		 mult *= 256;
	       }
	     }

	     char c[] = s.substring(intLength * 4).toCharArray();
	     long mult = 1;
	     for (int k = 0; k < c.length; k++) {
	       sum += c[k] * mult;
	       mult *= 256;
	     }
	     return(Math.abs(sum) % bfbitSize);//add seed here
	}
	
	public long hashfunction3(String s, int bfbitSize) {
		 int intLength = s.length() / 4;
	     long sum = 0;
	     for (int j = 0; j < intLength; j++) {
	       char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
	       long mult = 1;
	       for (int k = 0; k < c.length; k++) {
		 sum += c[k] * mult;
		 mult *= 256;
	       }
	     }

	     char c[] = s.substring(intLength * 4).toCharArray();
	     long mult = 1;
	     for (int k = 0; k < c.length; k++) {
	       sum += c[k] * mult;
	       mult *= 256;
	     }
	     return(Math.abs(sum) % bfbitSize);//add seed here
	}
	
	public long hashfunction4(String s, int bfbitSize) {
		 int intLength = s.length() / 4;
	     long sum = 0;
	     for (int j = 0; j < intLength; j++) {
	       char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
	       long mult = 1;
	       for (int k = 0; k < c.length; k++) {
		 sum += c[k] * mult;
		 mult *= 256;
	       }
	     }

	     char c[] = s.substring(intLength * 4).toCharArray();
	     long mult = 1;
	     for (int k = 0; k < c.length; k++) {
	       sum += c[k] * mult;
	       mult *= 256;
	     }
	     return(Math.abs(sum) % bfbitSize);//add seed here
	}
}
