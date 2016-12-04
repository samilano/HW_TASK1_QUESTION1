package anagrams;

import java.util.Arrays;

/**
 * This class implements the logic of comparing 2 strings if they are anagrams
 * @author Sasa Milanovic
 *
 */
public class Anagram {

	public static void main(String[] args) {
		
		String sentence[] = new String[10];
		sentence[0] = "Punishment";
		sentence[1] = "Nine Thumps";
		sentence[2] = "The Morse code";
		sentence[3] = "Here come dots";
		sentence[4] = "Snooze alarms ";
		sentence[5] = "Alas! No more Zs";
		sentence[6] = "Halley's Comet";
		sentence[7] = "Shall yet come";
		sentence[8] = "One good turn deserves another.";
		sentence[9] = "Do rogues endorse that? No, never!";
		
		for (int i=0; i<10; i+=2) {
			if (prepareSentence(sentence[i]).equals(prepareSentence(sentence[i+1]))) {
				System.out.println(sentence[i] + "    " + sentence[i+1] + "  ->   IS AN ANAGRAM!!!");
			} else {
				System.out.println(sentence[i] + "    " + sentence[i+1] + "  ->   IS NOT AN ANAGRAM!!!");
			}
		}		   
	}

	/**
	 * This method takes one of the sentences, trimms it, turns it into lower case,
	 * and replaces all interpuction characters from it, then with such a string it calls 
	 * sortString method 
	 * @param s string representing the sentence
	 * @return sorted lower case string
	 */
	public static String prepareSentence(String s) {
		
		String prepared = s.trim().toLowerCase().replaceAll("[\\W]", "");
		
		return sortString(prepared);
	}
	
	/**
	 * Converts string to a char array, sorts it
	 * and then converts it back to String
	 * 
	 * @param preparedString prepared string
	 * @return sortedString sorted String
	 */
	public static String sortString(String preparedString) {
		
		char[] charArray = preparedString.toCharArray();
		Arrays.sort(charArray);
		String sortedString = new String(charArray);

		return sortedString;
	}
}
