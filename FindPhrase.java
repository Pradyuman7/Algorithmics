
public class FindPhrase {
	
	public int timesFound(String string, String phrase) {
		
		int count = 0;
		
		int lenPhrase = phrase.length();
        
        for (int i = 0; i < string.length(); i++) 
            if (string.charAt(i) != phrase.charAt(i % lenPhrase)) 
            	count++;
        
        return count;
		
	}

}
