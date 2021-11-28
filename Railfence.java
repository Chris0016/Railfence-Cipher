public class Railfence{
	private String encryptedText;
	private int pTextLength;

	public String railfenceEncrypt(String plaintext, int rails){
		
		
		if (rails < 2 )
			throw new IllegalArgumentException("Invalid number of rails: Must be greater than 2 and less than the number of letters");
		

		String part1 = "";
		String part2 = "";
		String curr = "";
		

		pTextLength =	plaintext.length();
		int buckets = pTextLength;
		String[][] holder = new String[rails + 1][buckets + 1];
		encryptedText = "";
			
		plaintext = plaintext.replaceAll("\\s+","");
		

		int countY = 0;
		int countX = 0;

		boolean dir_isDown = false;

		//FIX ME
		for(int i = 0; i < pTextLength; i++){
			curr = Character.toString(plaintext.charAt(i));
			//System.out.println("Count X: " + countX);
			//System.out.println("Count Y: " + countY );
			//System.out.println("i: " + i + "\n\n");

			if(countX == 0 || countX == rails - 1){
				countY++;
				dir_isDown = !dir_isDown;
			}

			holder[countX][countY] = curr;

			if  (dir_isDown) 
				countX++; 
			else
				countX--;


			

		}
	for(int y = 0; y < rails; y++){
		for (int x = 0; x < buckets; x++){
				if (!(holder[y][x] == null))
					encryptedText += holder[y][x] + "";
			}
		}

		return encryptedText.toUpperCase();
			
	}
	
}