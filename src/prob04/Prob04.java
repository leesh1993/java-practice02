package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {

		char c[] = new char[str.length()] ;
			 
		for(int i = 0; i < str.length(); i++) {
			c[-i+str.length()-1] = str.charAt(i); 
		}

		return c;
	}

	public static void printCharArray(char[] array){

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}
}