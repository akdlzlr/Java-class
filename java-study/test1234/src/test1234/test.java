package test1234;

public class test {
	
	public static void main(String[] args) {
		makeHtml("div + p + p");
	}
	
	public static void makeHtml(String str) {
		String[] subStr = str.split(" ");
		String[] command = new String[subStr.length/2];
		String changeStr="";
		
		int num=0;
		
		for(int i=1; i<subStr.length-1;i=i+2) {
			command[num]=subStr[i];
			num++;
		}
		
		for(int i=command.length-1; i>=0;i--) {	
			switch(command[i]) {
				case ">":
					break;
				case "+":
					break;
				case "*":
					break;
			}
		}
		System.out.println(changeStr);
	}
	
	public static String makePlus(String subStr) {
		String changeStr = "<"+subStr+">"+"</"+subStr+">\n";
		return changeStr;
	}
	
	
}
