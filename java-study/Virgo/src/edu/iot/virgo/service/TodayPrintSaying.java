package edu.iot.virgo.service;

import java.util.Date;

import edu.iot.virgo.model.Saying;

public class TodayPrintSaying extends PrintSaying {

	@Override
	public void printHead() {
		Date date = new Date();
		System.out.println("---------------------------------------------------------------");
		System.out.println(date);
		System.out.println("---------------------------------------------------------------");
	}

	@Override
	public void printBody(Saying saying) {
		System.out.println();
		System.out.println(saying.getSentence());
		System.out.println();
		System.out.println("                                          -"+saying.getWho()+"-");
	}

	@Override
	public void printFooter() {
		System.out.println("===============================================================");

	}

}
