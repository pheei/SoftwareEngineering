package controller;

import model.Info;
import view.DisplayConsole;
import view.TestConsole;

public class MainController {
	
	public static void main(String args[]){
		DisplayController displayController = new DisplayController();
		displayController.initiateConsole();
		TestController testController = new TestController(displayController);
		testController.initiateConsole();
	}


}
