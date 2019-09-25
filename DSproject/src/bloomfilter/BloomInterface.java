package bloomfilter;
import java.rmi.*;
import java.util.BitSet;

public interface BloomInterface extends Remote{
	 
	public BitSet bloomfilter= new BitSet();
	//Adding a string to bloom filter
	public void add(String s) throws RemoteException;
	//Check for the the presence of the string in the bloom filter
	public Boolean isPresent(String s) throws RemoteException;
	//reset bloom filter
	public void reset() throws RemoteException;
	
}
