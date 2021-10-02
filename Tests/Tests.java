package Tests;
import Algorithms.NumOccurencesOfCharacters;
import Algorithms.SievePrimesAlgorithm;

public class Tests {

	public static void main(String[] args) {
		
		
		SievePrimesAlgorithm sp = new SievePrimesAlgorithm();
		
		sp.start();
		
		for(int i=0;i<20;i++)
			System.out.println(i+" being prime is "+sp.isPrime(i));
		
		NumOccurencesOfCharacters nm = new NumOccurencesOfCharacters();
		
		
		nm.findNumOccurencesOfAllCharacters("hehehe");
		
		System.out.println(nm.findNumOccurencesOfCharacter("abcadefgh", 'a' ));
	}
	
}
