package edu.iot.leo.service;

import edu.iot.leo.util.Sort;

public class ScoreService {
//	�ʵ�
	private int[] scores;
	private Sort sorter;
//	������
	public ScoreService(int[] scores, Sort sorter) {
		this.scores=scores;
		this.sorter=sorter;
	}
//	�޼���
//	��� �޼���
	public void print() {
		sorter.sort(scores);
		System.out.println("---------------------");
		for(int value : scores) {
			System.out.println(value);
		}
		System.out.println("---------------------");
	}
//	��ŷ �޼���
	public void printRanking(Sort sorter) {
		sorter.sort(scores);
		int rank=1;
		System.out.println(rank+"�� : "+scores[0]);
		for(int i=1;i<scores.length;i++) {
//			if(scores[i]==scores[i-1]) {
//				System.out.println(rank + "�� : "+scores[i]);
//			}else {
//				rank=i+1;
//				System.out.println(rank + "�� : "+scores[i]);
//			}
			if(scores[i-1]!=scores[i]) {
				rank=i+1;
			}
			System.out.println(rank + "�� : "+scores[i]);
		}
	}
}