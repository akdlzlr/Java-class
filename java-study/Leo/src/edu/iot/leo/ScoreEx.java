package edu.iot.leo;

import edu.iot.leo.service.ScoreService;
import edu.iot.leo.util.Bubble;
import edu.iot.leo.util.DesBubble;

public class ScoreEx {

	public static void main(String[] args) {
		
		int[] score = {80,80,40,90,70,30};
		
//		Bubble bubble = new Bubble();
//		ScoreService ss = new ScoreService(score, bubble);
		
		ScoreService ss = new ScoreService(score, new Bubble()); 
//										bubble을 변수에 저장하지 않고 바로 사용
		ss.print();
		ss.printRanking(new DesBubble());
		ss.print();
	}
}
//	단일 책임의 원칙 객체는 한가지 책임만 가져야한다.