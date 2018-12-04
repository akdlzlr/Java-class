package edu.iot.virgo.service;

import edu.iot.virgo.model.Saying;

public class NormalPrintSaying extends PrintSaying {

	public NormalPrintSaying() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printHead() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("                                                  ¿À´ÃÀÇ ¸í¾ð");
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
