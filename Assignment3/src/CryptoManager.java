

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		//This will the boolean that we'll return
		boolean isValid = true;
		
		/*
		 * This loop will check  if the variable is outside the upper and lower bound
		 */
		for(int i = 0; i < plainText.length(); i++) {
			
			//This variable will hold a character from the array
			char a = plainText.charAt(i);
			
			/*
			 * This will check whether or not the character
			 * is within bounds
			 */
			if(a < LOWER_BOUND || a > UPPER_BOUND) {
				
				isValid = false;
			}
			
		}
		
		//Returns the boolean
		return isValid;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		/*
		 * We first need to make sure that we 
		 * checked the logic for plainText and see
		 * if it's true
		 */
		if(!stringInBounds(plainText)) {
			
			return " ";
		}
		
		/*
		 * This will be used to encrypt the Ceasar
		 */
		String encrypted = " ";
		
		//This will go through the whole String of chars
		for(int i = 0; i < plainText.length(); i++){
			
			//This is to pull a character from the string variable
			char c = plainText.charAt(i);
			//Changes the char "c" to an int so it's comparable
			int encrypt = (int)c + key;
			
			/*
			 * This while method is used to make the encrypt
			 * variable lower than the upper bound
			 */
			while(encrypt > UPPER_BOUND) {
				
				encrypt -= RANGE;
				
			}
			
			//This'll append to the String
			encrypted += (char)encrypt;
			
		}
		return encrypted;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
			
		/*
		 * @param encrypted, used to return a string after
		 * it gets encrypted
		 * @param uBound, is used to help make the certain char be 
		 * under a certain amount
		 * @param bellaso, this is used to get the length 
		 * of the bellaso string
		 */
		String encrypted = " ";
		int uBound = (int)UPPER_BOUND;
		int bellaso = bellasoStr.length();
		
		//A for loop to get through the bellaso String
		for(int i = 0; i < plainText.length(); i++){
			
			/*
			 * This holds a character from the String
			 */
			char c =  plainText.charAt(i);
			
			/*
			 * This is used to get the total for the bellaso
			 * String while changing it to an int
			 */
			int enc = (int)c + (int)bellasoStr.charAt(i % bellaso);
			
			/*
			 * This will help make the enc
			 * variable in bound
			 */
			while(enc > uBound) {
				
				enc -= RANGE;
			}
			
			//This'll append to the encrypted
			encrypted += (char)enc;
		}
		
		//Returns the string 
		return encrypted;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		
		/*
		 * @param decrypted, this is what the method will return
		 */
		String decrypted = "";
		
		/*
		 * This loop will check every single character in the
		 * encrypted String
		 */
		for(int a = 0; a < encryptedText.length(); a++) {
			
			//This will hold the current character from the  string
			char c = encryptedText.charAt(a);
			//This will be used for decryption
			int decrypt = (int)c - key;
			
			/*
			 * This while loop will check to make sure that the 
			 * certain char variable stays in bounds
			 */
			while(decrypt < LOWER_BOUND) {
				
				decrypt += RANGE;
			}
			
			//Appends to the decrypted String
			decrypted += (char)decrypt;
		}
		
		return decrypted;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		
		//This is usd to get the length of the bellaso String
		int bLength = bellasoStr.length();
		//This is to get the lower bound in terms of int
		int lowBound = (int)LOWER_BOUND;
		//This is what will return frmo this method
		String decrypted = " ";
		
		/*
		 * This for loop will help encrypt the bellaso String to 
		 * get in in bounds
		 */
		for(int z = 0; z < encryptedText.length(); z++) {
			
			
			//This holds a character
			char f = encryptedText.charAt(z);
			//this decrypts a character from the bellaso variables
			int decryptBellaso = (int)f - (int)bellasoStr.charAt(z % bLength);
			
			/*
			 * A while loop to make sure that the variable
			 */
			while(decryptBellaso < lowBound){
				
				decryptBellaso += RANGE;
			}
			
			//It adds the chars to be decrypted
			decrypted += (char)decryptBellaso;
			
		}
		
		return decrypted;
	}
}
