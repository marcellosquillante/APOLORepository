package compile.example;


public class Exercise2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//    B  u  r  i  e  d     T  r  e  a  s  u  r  e     C  h  e  s  t  ! 
		// 01 2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
		
		String pirateMessage = "  Buried Treasure Chest! ";
		
		// charAt example	
		System.out.println(" charAt example ");
		
		char c1 = pirateMessage.charAt(0);
		char c2 = pirateMessage.charAt(2);
		char c3 = pirateMessage.charAt(9);
		char c4 = pirateMessage.charAt(18);
		char c5 = pirateMessage.charAt(23);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		System.out.print(c4);
		System.out.println(c5);
		
		
		// indexOf example 
		System.out.println(" indexOf example ");
		
		// is the first 'u' index in the string // 3
		int i1 = pirateMessage.indexOf('u');
		
		// is the first 'u' in the string past location 9 // 14
		int i2 = pirateMessage.indexOf('u', 9); 
		
		// it starts at location 13 in the string // 13
		int i3 = pirateMessage.indexOf("sure");
		
		// there is no Treasure string on or past location 10 // -1
		int i4 = pirateMessage.indexOf("Treasure", 10);
		
		// there is no character 'u' on or past location 100
		int i5 = pirateMessage.indexOf("u", 100);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		// length example
		System.out.println(" length example ");
		
		// the string's length of 25
		int i = pirateMessage.length(); // 25
		
		// use of string's length method
		String string = "box";
		int value1 = string.length(); // 3
		
		// use of array's length attribute
		String[] stringArray = new String[3];
		int value2 = stringArray.length; // 3
		
		System.out.println(i);
		System.out.println(value1);
		System.out.println(value2);
		
		
		// concat example
		System.out.println(" concat example ");
		
		String c = pirateMessage.concat("Weigh anchor!");
		
		System.out.println(c);
		
		// replace example
		System.out.println(" replace example ".toUpperCase());
		
		String s1 = pirateMessage.replace('B', 'J'); // Juried Treasure Chest !
		
		String s2 = pirateMessage.replace(' ', 'X'); // XXBuriedXTreasureXChest!X
		
		String s3 = pirateMessage.replace("Chest", "Coins"); // Buried Treasure Coins!
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// startWith example .... after continue
		
		

	}

}
