package controller;

import Utils.Utils;
import model.Info;
import model.TestInfo;
import view.TestConsole;

import java.util.List;

public class TestController {
	DisplayController displayController;
	TestInfo testInfo;
	TestConsole testConsole;
	
	public TestController(DisplayController displayController){
		this.displayController = displayController;
		testInfo = new TestInfo();

		testConsole = new TestConsole(this);
	}

	public void initiateConsole(){
		testConsole.display();
	}

	public TestInfo getTestInfo(){
		return testInfo;
	}


	public void runManuallyScript() {
		List<String> li = testInfo.getNewLi();
		for (String s: li){
			parse(s);
		}
		displayController.updateConsole();
	}

	public void runPredefinedScript(){
		List<String> li = testInfo.getOriginalLi();
		for (String s: li){
			parse(s);
		}
		displayController.updateConsole();
	}


	public void parse(String str){
		String[] arr = str.split(" ");
		Info info = displayController.getInfo();
		switch (arr[0]) {
			case "TEM":
				info.inTemp[Utils.mapper(arr[1])] = arr[2];
				break;
			case "OUT":
				info.outTemp = arr[1];
				break;
			case "HUM":
				info.humid[Utils.mapper(arr[1])] = arr[2];
				break;
			case "OXY":
				info.oxygen[Utils.mapper(arr[1])] = arr[2];
				break;
			case "PRE":
				info.pressure[Utils.mapper(arr[1])] = arr[2];
				break;
			case "SMO":
				info.smoke[Utils.mapper(arr[1])] = arr[2].equals("TRUE") ? true : false;
				break;
			case "GAS":
				info.gas[Utils.mapper(arr[1])] = arr[2].equals("TRUE") ? true : false;
				break;
			case "WAL":
				info.wallTemp[Utils.mapper(arr[1])] = arr[2];
				break;
			default:
				break;
		}
	}
}
