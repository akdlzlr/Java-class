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
//										bubble�� ������ �������� �ʰ� �ٷ� ���
		ss.print();
		ss.printRanking(new DesBubble());
		ss.print();
	}
}
//	���� å���� ��Ģ ��ü�� �Ѱ��� å�Ӹ� �������Ѵ�.