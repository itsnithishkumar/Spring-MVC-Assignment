package navin;

import org.springframework.stereotype.Service;

@Service
public class Recognation {
	
	public boolean RecongnationUser(String name,String accountNo)
	{
		
		if(name.equals("Nithish")&& accountNo.equals("0101010101"))
		{
			
			return true;
		}
		return false;
		
	}

}
