package edu.iot.common.ui;

import java.util.ArrayList;
import java.util.List;

public class Pagination<T> {

	//	필드값
	final static int PER_PAGE = 10;		//	페이지당 갖는 데이터 수
	List<T> list;						//	전체 리스트 수
	
	int totalCount;						//	전체 데이터 수
	int totalPage;						//	전체 페이지 수
	int page;							//	현재 페이지
	
	//	생성자
	public Pagination(List<T> list) {
		this.list = list;
		totalCount = list.size();
		totalPage = (int) Math.ceil((double)totalCount/PER_PAGE);
		page = 1;
	}
	
	//	메서드
	public List<T> getPage(int page){
		this.page = page;
		
		List<T> pageList = new ArrayList<>();
		int start = (page-1)*PER_PAGE;			// 페이지의 시작 인덱스
		int end = start+PER_PAGE;				// 페이지의 마지막 인덱스
		if(end>list.size()) {					// 마지막 페이지인 경우
			end = list.size();					// 데이터 수가 end가 됨
		}
		for(int i = start;i<end;i++) {
			pageList.add(list.get(i));			// 해당 페이지의 데이터 리스트
		}
		return pageList;
	}
	
	public List<T> getPage(){
		return getPage(page);
		}
	
	public int next() {
		page = (page==totalPage) ? 1 : page+1;
		return page;
		}
	
	public int previous() {
		page = (page==1) ? totalPage : page-1;
		return page;
		}
	
	public void printPages() {
		for(int i=1; i<=totalPage; i++) {
			if(i==page) {
				System.out.printf("[%d] ",i);
			}else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}