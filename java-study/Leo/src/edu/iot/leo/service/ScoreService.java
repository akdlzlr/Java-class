package edu.iot.leo.service;

import edu.iot.leo.util.Sort;

public class ScoreService {
//	필드
	private int[] scores;
	private Sort sorter;
//	생성자
	public ScoreService(int[] scores, Sort sorter) {
		this.scores=scores;
		this.sorter=sorter;
	}
//	메서드
//	출력 메서드
	public void print() {
		sorter.sort(scores);
		System.out.println("---------------------");
		for(int value : scores) {
			System.out.println(value);
		}
		System.out.println("---------------------");
	}
//	랭킹 메서드
	public void printRanking(Sort sorter) {
		sorter.sort(scores);
		int rank=1;
		System.out.println(rank+"등 : "+scores[0]);
		for(int i=1;i<scores.length;i++) {
//			if(scores[i]==scores[i-1]) {
//				System.out.println(rank + "등 : "+scores[i]);
//			}else {
//				rank=i+1;
//				System.out.println(rank + "등 : "+scores[i]);
//			}
			if(scores[i-1]!=scores[i]) {
				rank=i+1;
			}
			System.out.println(rank + "등 : "+scores[i]);
		}
	}
}