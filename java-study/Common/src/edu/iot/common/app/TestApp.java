package edu.iot.common.app;

import edu.iot.common.ui.Menu;
import edu.iot.common.ui.MenuGroup;
import edu.iot.common.ui.MenuItem;
import edu.iot.common.command.Command;

public class TestApp extends Application {

	@Override
	public void createMenu(Menu menu) {
		
		MenuGroup fileMenu = new MenuGroup("File");
		
		fileMenu.add(new MenuItem("Open",new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("열려라 참께!");
				System.out.println();
			}
		}));
		
		fileMenu.add(new MenuItem("Save",new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("저장은 습관!");
				System.out.println();
			}
		}));
		
		MenuGroup printMenu = new MenuGroup("Print");
		printMenu.add(new MenuItem("PageSetup",null));
		printMenu.add(new MenuItem("Print",null));
		fileMenu.add(printMenu);
		
		fileMenu.add(new MenuItem("Exit",new Command() {

			@Override
			public void execute() throws Exception {
				System.out.println("종료합니다");
				System.exit(0);
			}
		}));
		
		menu.add(fileMenu);
		
		menu.add(new MenuItem("Help",new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("도움을 별로 주고 싶지 않습니다.");
				System.out.println();
			}
		}));
		menu.add(new MenuItem("About", new Command() {
			
			@Override
			public void execute() throws Exception {
				System.out.println("TestApp Ver 1.0");
				System.out.println("created by 이순신");
				System.out.println("관심과 사랑은 돈이 최고입니다.");
				System.out.println("후원입금 계좌번호 123456-123-123456");
				System.out.println();
			}
		}));
	
	}
	
	public static void main(String[] args) {
		TestApp app = new TestApp();
		app.run();
	}
}