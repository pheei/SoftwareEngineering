package model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Info {
	//alarm; 0: temp; 1: wall temp; 2: humidity; 3: oxygen; 4: pressure
	public boolean[] alarm = new boolean[5];
	
	//0: LIV; 1: COM; 2:LAB; 3: STG; 4: WEL; 5: H&C
	public String outTemp;
	public String[] wallTemp = new String[6];
	public String[] inTemp = new String[6];
	public String[] humid = new String[6];
	public String[] oxygen = new String[6];
	public String[] pressure = new String[6];
	public boolean[] smoke = new boolean[6];
	public boolean[] gas = new boolean[6];
	
	public Info(){
		outTemp = "null";
		Arrays.fill(alarm, false);
		Arrays.fill(wallTemp, "null");
		Arrays.fill(inTemp, "null");
		Arrays.fill(humid, "null");
		Arrays.fill(oxygen, "null");
		Arrays.fill(pressure, "null");
		Arrays.fill(smoke, false);
		Arrays.fill(gas, false);
	}

	
	
}
