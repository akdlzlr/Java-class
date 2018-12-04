package chapter2;

public class Ex2 {

	public static void printAlphabet(char a) {
		for(int i=0;i<26;i++) {
			System.out.println(a);
			a++;
		}
	}
	public static void main(String[] args) {
		printAlphabet('a');
		lib.Decoration.printCharacter('-', 10);
		printAlphabet('A');
		lib.Decoration.printCharacter('-', 10);
	}
		
/*	public static void main(String[] args) {
		char a = 'A';
		
		int i=0;
		for(i=0;i<26;i++) {
			System.out.println((char)(a+i));
		}
		
		a='a';
		
		int i=0;
		for(i=0;i<26;i++) {
			System.out.println((char)(a+i));
		}
	}*/
}