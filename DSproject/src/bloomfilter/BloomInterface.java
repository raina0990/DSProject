package bloomfilter;
import java.rmi.*;

public interface BloomInterface extends Remote{
	//Adding a string to bloom filter
	public void add(String s);
	//Check for the the presence of the string in the bloom filter
	public Boolean isPresent(String s);
	//reset bloom filter
	public void reset();
	
}
