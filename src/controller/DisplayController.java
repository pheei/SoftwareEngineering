package controller;

import java.util.Arrays;

import model.Info;
import view.DisplayConsole;
import view.TestConsole;

public class DisplayController {
	
	private Info info;
	private DisplayConsole displayConsole;
	

	public DisplayController() {
		// TODO Auto-generated constructor stub
		this.info = new Info();
		this.displayConsole = new DisplayConsole(this);
	}

	public void initiateConsole(){
		displayConsole.display();
	}


	public void activeNormalMode() {
		// TODO Auto-generated method stub
		this.info = new Info();
		displayConsole.display();

	}


	public void activeTestMode() {
		// TODO Auto-generated method stub
		this.info = new Info();
		displayConsole.display();


	}


	public void resetAlarm() {
		// TODO Auto-generated method stub
		Arrays.fill(info.alarm, false);
		displayConsole.display();
	}


	public void activeRobot() {
		// TODO Auto-generated method stub
		Arrays.fill(info.wallTemp, "28F");
		displayConsole.display();
	}

	public Info getInfo(){
		return info;
	}

	public void updateConsole(){
		displayConsole.display();
	}
}
