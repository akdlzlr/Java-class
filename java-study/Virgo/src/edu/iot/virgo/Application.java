package edu.iot.virgo;

import java.util.Scanner;

import edu.iot.virgo.model.Saying;
import edu.iot.virgo.service.FamousSaying;
import edu.iot.virgo.service.NormalPrintSaying;

public class Application {

	public static void main(String[] args) {
		
//		FamousSaying fs = new FamousSaying();
		
		
		Scanner sc = new Scanner(System.in);
		int n=1;
		while(true){
			FamousSaying fs = FamousSaying.getinstence(); // �̱���
			Saying saying = fs.getSaying();
			fs.print(new NormalPrintSaying(), saying);
			
			System.out.println(n+" ���� ����� ���ðڽ��ϱ�? (y/n)");
			String result = sc.nextLine();
			
			if(result.equals("n")||result.equals("N")) {
				System.out.println("�����մϴ�.");
				break;
			}
			n++;
			System.out.println();
			System.out.println();
		}
	}	// cmd���� ����� java -jar famoussaying.jar
}