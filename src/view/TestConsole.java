package view;

import controller.TestController;
import model.Info;
import model.TestInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConsole extends JFrame {

	TestController testController;
	TestInfo testInfo;
	List<String> oldLi;
	List<String> newLi;

	Container c = getContentPane();
	Font my_font = new Font("Calibri", 1, 20);

	//JLabel l_room = new JLabel("ROOM");
	//JLabel l_name = new JLabel("NAME");
	//JLabel l_state = new JLabel("STATE");

	//JButton b_1enter = new JButton();
	JButton b_1reset = new JButton();
	//JButton b_1clear = new JButton();
	JButton b_run = new JButton();
	//JButton b_3enter = new JButton();

	static JTextArea ta_1 = new JTextArea();
	static JScrollPane sp_1 = new JScrollPane(ta_1);

	static JTextArea ta_2 = new JTextArea();
	static JScrollPane sp_2 = new JScrollPane(ta_2);

	//static JTextField t_room = new JTextField();
	//static JTextField t_name = new JTextField();
	//static JTextField t_state = new JTextField();




	public void display() {


		b_1reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testController.runPredefinedScript();
			}
		} );

		b_run.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String textFieldValue = ta_2.getText();
				// .... do some operation on value ...
				String[] list = textFieldValue.split("\n");
				testInfo.setNewLi(Arrays.asList(list));
				testController.runManuallyScript();
			}
		});

		setLayout(null);

		Color grey=new Color(54,54,54);

		c.add(sp_1);
		sp_1.setBounds(50, 30, 200, 240);

		/**
		c.add(b_1enter);
		b_1enter.setIcon(new ImageIcon("./te.png"));;
		b_1enter.setBounds(270, 50, 48, 48);
		b_1enter.setBackground(grey);
		*/

		c.add(b_1reset);
		b_1reset.setIcon(new ImageIcon("./tr.png"));
		b_1reset.setBounds(270, 125, 48, 48);
		b_1reset.setBackground(grey);

		/**
		c.add(b_1clear);
		b_1clear.setIcon(new ImageIcon("./tc.png"));
		b_1clear.setBounds(270, 200, 48, 48);
		b_1clear.setBackground(grey);
		*/
		c.add(sp_2);
		sp_2.setBounds(400, 30, 200, 240);

		c.add(b_run);
		b_run.setIcon(new ImageIcon("./trun.png"));
		b_run.setBounds(620, 125, 48, 48);
		b_run.setBackground(Color.WHITE);

		/**
		c.add(l_room);
		l_room.setBounds(80, 320, 80, 30);
		l_room.setFont(my_font);

		c.add(t_room);
		t_room.setBounds(60, 360, 100, 30);

		c.add(l_name);
		l_name.setBounds(200, 320, 80, 30);
		l_name.setFont(my_font);

		c.add(t_name);
		t_name.setBounds(180, 360, 100, 30);

		c.add(l_state);
		l_state.setBounds(320, 320, 80, 30);
		l_state.setFont(my_font);

		c.add(t_state);
		t_state.setBounds(300, 360, 100, 30);

		c.add(b_3enter);
		b_3enter.setIcon(new ImageIcon("./te.png"));;
		b_3enter.setBounds(430, 350, 48, 48);
		b_3enter.setBackground(grey);

		 */

		StringBuffer sb = new StringBuffer();
		for(String s : oldLi){
			sb.append(s+"\n");
		}
		ta_1.setText(sb.toString());


		setTitle("Wirtten by Weike Wu");
		setBounds(50, 10, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(new JFrame().EXIT_ON_CLOSE);

	}


	public TestConsole(TestController testController){
		this.testController = testController;
		this.testInfo = testController.getTestInfo();
		this.oldLi = testInfo.getOriginalLi();
		this.newLi = testInfo.getNewLi();

	}
	//call this function when select button is clicked
	public void select(String item){
		newLi.add(item);
		display();
	}

	//call this function when reset button is clicked
	public void reset(){
		oldLi = new ArrayList<>();
		display();
	}

	//call this function when submit button is clicked
	public void submitNewInput(String input){
		oldLi.add(input);
		display();
	}

	//call this function when run button is clicked
	public void runManua(){
		testController.runManuallyScript();
	}

	public void runPre(){
		testController.runPredefinedScript();
	}



	//UI code for test console
	//public void display(){



	//}
}
