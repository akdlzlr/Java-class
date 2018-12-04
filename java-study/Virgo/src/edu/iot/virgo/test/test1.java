package edu.iot.virgo.test;

import edu.iot.virgo.model.Saying;
import edu.iot.virgo.service.FamousSaying;
import edu.iot.virgo.service.NormalPrintSaying;
import edu.iot.virgo.service.TodayPrintSaying;

public class test1 {

	public static void main(String[] args) {
//		FamousSaying famousSaying = new FamousSaying();
		
//		Saying[] saying = famousSaying.getArchive();
//		for(Saying s : saying) {
//		System.out.println(s);
//		}
//		
//		System.out.println(famousSaying.getSaying());
//		System.out.println(famousSaying.getSaying());
//		System.out.println(famousSaying.getSaying());
		FamousSaying famousSaying = FamousSaying.getinstence();
		Saying say = famousSaying.getSaying();
		famousSaying.print(new NormalPrintSaying(), say);
		System.out.println();
		System.out.println();
		System.out.println();
		say = famousSaying.getSaying();
		famousSaying.print(new TodayPrintSaying(), say);
	}

}