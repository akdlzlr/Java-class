package edu.iot.common.ui;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Menu {
	String title;
	List<Menu> menuList;
	
	public Menu(String title) {
		this.title = title;
	}
	
	public void add(Menu menu) {
		menuList.add(menu);
	}
	
	public abstract void execute() throws Exception;
}
