package edu.iot.libra.command;

public class ExitCommand implements Command {

	
	public void execute() throws Exception{
		System.out.println("종료합니다.");
		System.exit(0);
	}

}
