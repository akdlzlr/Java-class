package edu.iot.part3.chapter13.ex04;

public class ChildProduct<T, M, C> extends Product<T, M> {
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company = company;}
}