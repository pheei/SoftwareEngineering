package view;

import Utils.Judge;
import controller.DisplayController;
import model.Info;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayConsole extends JFrame{

	DisplayController displayController;
	Info info;

	int cam1w=300;
	int cam1h=250;
	int cam2w=300;
	int cam2h=250;
	int cam3w=300;
	int cam3h=250;
	int cam4w=300;
	int cam4h=250;

	public ImageIcon redImageIcon;
	Container c = getContentPane();
	Font my_font = new Font("Calibri", 1, 20);

	public ImageIcon greenImageIcon;
	Color green= Color.green;

	JLabel l_outsidetem = new JLabel("Outside Temp");
	JLabel l_temp = new JLabel("Inside Temp");
	JLabel l_walltemp = new JLabel("Wall Temp");
	JLabel l_humidity = new JLabel("Humidity");
	JLabel l_oxygen = new JLabel("Oxygen");
	JLabel l_pressure = new JLabel("Pressure");
	JLabel l_smoke = new JLabel("Smoke");
	JLabel l_gasalert = new JLabel("Gas Alert");
	JLabel l_live = new JLabel("LIVE");
	JLabel l_com = new JLabel("COM");
	JLabel l_lab = new JLabel("LAB");
	JLabel l_stg = new JLabel("STG");
	JLabel l_wel = new JLabel("WEL");
	JLabel l_hc = new JLabel("H&C");

	JLabel l_note1 = new JLabel("°›2%: Yellow");
	JLabel l_note2 = new JLabel("°›5%: Red + flash (2/sec)");
	JLabel l_note3 = new JLabel("°›7%: Red + flash (2/sec) + Alarm");

	JLabel l_outsidetem1 = new JLabel("105F");
	JLabel l_outsidetem2 = new JLabel("95F");
	JLabel l_outsidetem3 = new JLabel("156F");
	JLabel l_outsidetem4 = new JLabel("144F");
	JLabel l_outsidetem5 = new JLabel("101F");
	JLabel l_outsidetem6 = new JLabel("80F");

	JLabel l_temp1 = new JLabel("72F");
	JLabel l_temp2 = new JLabel("73F");
	JLabel l_temp3 = new JLabel("72F");
	JLabel l_temp4 = new JLabel("71F");
	JLabel l_temp5 = new JLabel("72F");
	JLabel l_temp6 = new JLabel("72F");

	JLabel l_walltemp1 = new JLabel("28F");
	JLabel l_walltemp2 = new JLabel("29F");
	JLabel l_walltemp3 = new JLabel("28F");
	JLabel l_walltemp4 = new JLabel("27F");
	JLabel l_walltemp5 = new JLabel("28F");
	JLabel l_walltemp6 = new JLabel("28F");

	JLabel l_humidity1 = new JLabel("45%");
	JLabel l_humidity2 = new JLabel("46%");
	JLabel l_humidity3 = new JLabel("45%");
	JLabel l_humidity4 = new JLabel("44%");
	JLabel l_humidity5 = new JLabel("45%");
	JLabel l_humidity6 = new JLabel("45%");

	JLabel l_oxygen1 = new JLabel("21%");
	JLabel l_oxygen2 = new JLabel("21%");
	JLabel l_oxygen3 = new JLabel("22%");
	JLabel l_oxygen4 = new JLabel("20%");
	JLabel l_oxygen5 = new JLabel("21%");
	JLabel l_oxygen6 = new JLabel("21%");

	JLabel l_pressure1 = new JLabel("14.5psi");
	JLabel l_pressure2 = new JLabel("14.4psi");
	JLabel l_pressure3 = new JLabel("14.6psi");
	JLabel l_pressure4 = new JLabel("14.4psi");
	JLabel l_pressure5 = new JLabel("14.5psi");
	JLabel l_pressure6 = new JLabel("14.5psi");

	public JLabel l_tempa = new JLabel();
	public JLabel l_walltempa = new JLabel();
	public JLabel l_humiditya = new JLabel();
	public JLabel l_oxygena = new JLabel();
	public JLabel l_presurea = new JLabel();

	JLabel l_smoke1 = new JLabel();
	JLabel l_smoke2 = new JLabel();
	JLabel l_smoke3 = new JLabel();
	JLabel l_smoke4 = new JLabel();
	JLabel l_smoke5 = new JLabel();
	JLabel l_smoke6 = new JLabel();

	JLabel l_gas1 = new JLabel();
	JLabel l_gas2 = new JLabel();
	JLabel l_gas3 = new JLabel();
	JLabel l_gas4 = new JLabel();
	JLabel l_gas5 = new JLabel();
	JLabel l_gas6 = new JLabel();

	JButton b_temp = new JButton();
	JButton b_walltemp = new JButton();
	JButton b_humidity = new JButton();
	JButton b_oxygen = new JButton();
	JButton b_presure = new JButton();

	JButton b_robot = new JButton();
	JButton b_reset = new JButton();

	JLabel l_disPicture1 = new JLabel();
	JLabel l_disPicture2 = new JLabel();
	JLabel l_disPicture3 = new JLabel();
	JLabel l_disPicture4 = new JLabel();

	JButton b_cam11 = new JButton();
	JButton b_cam12 = new JButton();
	JButton b_cam13 = new JButton();
	JButton b_cam14 = new JButton();
	JButton b_cam15 = new JButton();
	JButton b_cam16 = new JButton();
	JButton b_cam17 = new JButton();
	JButton b_cam18 = new JButton();
	JButton b_cam19 = new JButton();

	JButton b_cam21 = new JButton();
	JButton b_cam22 = new JButton();
	JButton b_cam23 = new JButton();
	JButton b_cam24 = new JButton();
	JButton b_cam25 = new JButton();
	JButton b_cam26 = new JButton();
	JButton b_cam27 = new JButton();
	JButton b_cam28 = new JButton();
	JButton b_cam29 = new JButton();

	JButton b_cam31 = new JButton();
	JButton b_cam32 = new JButton();
	JButton b_cam33 = new JButton();
	JButton b_cam34 = new JButton();
	JButton b_cam35 = new JButton();
	JButton b_cam36 = new JButton();
	JButton b_cam37 = new JButton();
	JButton b_cam38 = new JButton();
	JButton b_cam39 = new JButton();

	JButton b_cam41 = new JButton();
	JButton b_cam42 = new JButton();
	JButton b_cam43 = new JButton();
	JButton b_cam44 = new JButton();
	JButton b_cam45 = new JButton();
	JButton b_cam46 = new JButton();
	JButton b_cam47 = new JButton();
	JButton b_cam48 = new JButton();
	JButton b_cam49 = new JButton();

	JLabel l_camera1 = new JLabel("CAM1");
	JLabel l_camera2 = new JLabel("CAM2");
	JLabel l_camera3 = new JLabel("CAM3");
	JLabel l_camera4 = new JLabel("CAM4");

	JLabel l_url = new JLabel("CAM URL:");
	static JTextField t_url = new JTextField();
	JButton b_add = new JButton("ADD");

	ImageIcon imageIcon;
	Image image;
	Image smallImage;
	ImageIcon smallIcon;

//	JButton b_analysis = new JButton("Analysis Picture");
//	JButton b_convert = new JButton("Convert Data and Save into .txt File");

	static JTextArea ta_result = new JTextArea();
	static JScrollPane sp_result = new JScrollPane(ta_result);
	static JTextArea ta_console = new JTextArea();
	static JScrollPane sp_console = new JScrollPane(ta_console);

	public void display() {


		redImageIcon = new ImageIcon("./a2.png");
		Image redImage = redImageIcon.getImage();
		Image redSmallImage = redImage.getScaledInstance(30, 30,
				Image.SCALE_FAST);
		redImageIcon = new ImageIcon(redSmallImage);

		greenImageIcon = new ImageIcon("./a1.png");
		Image greenImage = greenImageIcon.getImage();
		Image greenSmallImage = greenImage.getScaledInstance(30, 30,
				Image.SCALE_FAST);
		greenImageIcon = new ImageIcon(greenSmallImage);


		setLayout(null);

		b_robot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayController.activeRobot();
			}
		});

		b_reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayController.resetAlarm();
			}
		});
		c.add(l_outsidetem);
		l_outsidetem.setBounds(30, 50, 200, 30);
		l_outsidetem.setFont(my_font);

		c.add(l_outsidetem1);
		l_outsidetem1.setBounds(250, 50, 200, 30);
		l_outsidetem1.setFont(my_font);
		l_outsidetem1.setForeground(green);

		c.add(l_outsidetem2);
		l_outsidetem2.setBounds(350, 50, 200, 30);
		l_outsidetem2.setFont(my_font);
		l_outsidetem2.setForeground(green);

		c.add(l_outsidetem3);
		l_outsidetem3.setBounds(450, 50, 200, 30);
		l_outsidetem3.setFont(my_font);
		l_outsidetem3.setForeground(green);

		c.add(l_outsidetem4);
		l_outsidetem4.setBounds(550, 50, 200, 30);
		l_outsidetem4.setFont(my_font);
		l_outsidetem4.setForeground(green);

		c.add(l_outsidetem5);
		l_outsidetem5.setBounds(650, 50, 200, 30);
		l_outsidetem5.setFont(my_font);
		l_outsidetem5.setForeground(green);

		c.add(l_outsidetem6);
		l_outsidetem6.setBounds(750, 50, 200, 30);
		l_outsidetem6.setFont(my_font);
		l_outsidetem6.setForeground(green);

		c.add(l_temp);
		l_temp.setBounds(30, 90, 200, 30);
		l_temp.setFont(my_font);

		imageIcon = new ImageIcon("./a1.png");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(30, 30,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);

		c.add(l_tempa);
		l_tempa.setBounds(170, 90, 30, 30);
		l_tempa.setIcon(smallIcon);

		c.add(l_temp1);
		l_temp1.setBounds(250, 90, 200, 30);
		l_temp1.setFont(my_font);
		l_temp1.setForeground(green);

		c.add(l_temp2);
		l_temp2.setBounds(350, 90, 200, 30);
		l_temp2.setFont(my_font);
		l_temp2.setForeground(green);

		c.add(l_temp3);
		l_temp3.setBounds(450, 90, 200, 30);
		l_temp3.setFont(my_font);
		l_temp3.setForeground(green);

		c.add(l_temp4);
		l_temp4.setBounds(550, 90, 200, 30);
		l_temp4.setFont(my_font);
		l_temp4.setForeground(green);

		c.add(l_temp5);
		l_temp5.setBounds(650, 90, 200, 30);
		l_temp5.setFont(my_font);
		l_temp5.setForeground(green);

		c.add(l_temp6);
		l_temp6.setBounds(750, 90, 200, 30);
		l_temp6.setFont(my_font);
		l_temp6.setForeground(green);

		c.add(l_walltemp);
		l_walltemp.setBounds(30, 130, 200, 30);
		l_walltemp.setFont(my_font);

		c.add(l_walltempa);
		l_walltempa.setBounds(170, 130, 30, 30);
		l_walltempa.setIcon(smallIcon);

		c.add(l_walltemp1);
		l_walltemp1.setBounds(250, 130, 200, 30);
		l_walltemp1.setFont(my_font);
		l_walltemp1.setForeground(green);

		c.add(l_walltemp2);
		l_walltemp2.setBounds(350, 130, 200, 30);
		l_walltemp2.setFont(my_font);
		l_walltemp2.setForeground(green);

		c.add(l_walltemp3);
		l_walltemp3.setBounds(450, 130, 200, 30);
		l_walltemp3.setFont(my_font);
		l_walltemp3.setForeground(green);

		c.add(l_walltemp4);
		l_walltemp4.setBounds(550, 130, 200, 30);
		l_walltemp4.setFont(my_font);
		l_walltemp4.setForeground(green);

		c.add(l_walltemp5);
		l_walltemp5.setBounds(650, 130, 200, 30);
		l_walltemp5.setFont(my_font);
		l_walltemp5.setForeground(green);

		c.add(l_walltemp6);
		l_walltemp6.setBounds(750, 130, 200, 30);
		l_walltemp6.setFont(my_font);
		l_walltemp6.setForeground(green);

		c.add(l_humidity);
		l_humidity.setBounds(30, 170, 200, 30);
		l_humidity.setFont(my_font);

		c.add(l_humiditya);
		l_humiditya.setBounds(170, 170, 30, 30);
		l_humiditya.setIcon(smallIcon);

		c.add(l_humidity1);
		l_humidity1.setBounds(250, 170, 200, 30);
		l_humidity1.setFont(my_font);
		l_humidity1.setForeground(green);

		c.add(l_humidity2);
		l_humidity2.setBounds(350, 170, 200, 30);
		l_humidity2.setFont(my_font);
		l_humidity2.setForeground(green);

		c.add(l_humidity3);
		l_humidity3.setBounds(450, 170, 200, 30);
		l_humidity3.setFont(my_font);
		l_humidity3.setForeground(green);

		c.add(l_humidity4);
		l_humidity4.setBounds(550, 170, 200, 30);
		l_humidity4.setFont(my_font);
		l_humidity4.setForeground(green);

		c.add(l_humidity5);
		l_humidity5.setBounds(650, 170, 200, 30);
		l_humidity5.setFont(my_font);
		l_humidity5.setForeground(green);

		c.add(l_humidity6);
		l_humidity6.setBounds(750, 170, 200, 30);
		l_humidity6.setFont(my_font);
		l_humidity6.setForeground(green);

		c.add(l_oxygen);
		l_oxygen.setBounds(30, 210, 200, 30);
		l_oxygen.setFont(my_font);

		c.add(l_oxygena);
		l_oxygena.setBounds(170, 210, 30, 30);
		l_oxygena.setIcon(smallIcon);

		c.add(l_oxygen1);
		l_oxygen1.setBounds(250, 210, 200, 30);
		l_oxygen1.setFont(my_font);
		l_oxygen1.setForeground(green);

		c.add(l_oxygen2);
		l_oxygen2.setBounds(350, 210, 200, 30);
		l_oxygen2.setFont(my_font);
		l_oxygen2.setForeground(green);

		c.add(l_oxygen3);
		l_oxygen3.setBounds(450, 210, 200, 30);
		l_oxygen3.setFont(my_font);
		l_oxygen3.setForeground(green);

		c.add(l_oxygen4);
		l_oxygen4.setBounds(550, 210, 200, 30);
		l_oxygen4.setFont(my_font);
		l_oxygen4.setForeground(green);

		c.add(l_oxygen5);
		l_oxygen5.setBounds(650, 210, 200, 30);
		l_oxygen5.setFont(my_font);
		l_oxygen5.setForeground(green);

		c.add(l_oxygen6);
		l_oxygen6.setBounds(750, 210, 200, 30);
		l_oxygen6.setFont(my_font);
		l_oxygen6.setForeground(green);

		c.add(l_pressure);
		l_pressure.setBounds(30, 250, 200, 30);
		l_pressure.setFont(my_font);

		c.add(l_presurea);
		l_presurea.setBounds(170, 250, 30, 30);
		l_presurea.setIcon(smallIcon);

		c.add(l_pressure1);
		l_pressure1.setBounds(250, 250, 200, 30);
		l_pressure1.setFont(my_font);
		l_pressure1.setForeground(green);

		c.add(l_pressure2);
		l_pressure2.setBounds(350, 250, 200, 30);
		l_pressure2.setFont(my_font);
		l_pressure2.setForeground(green);

		c.add(l_pressure3);
		l_pressure3.setBounds(450, 250, 200, 30);
		l_pressure3.setFont(my_font);
		l_pressure3.setForeground(green);

		c.add(l_pressure4);
		l_pressure4.setBounds(550, 250, 200, 30);
		l_pressure4.setFont(my_font);
		l_pressure4.setForeground(green);

		c.add(l_pressure5);
		l_pressure5.setBounds(650, 250, 200, 30);
		l_pressure5.setFont(my_font);
		l_pressure5.setForeground(green);

		c.add(l_pressure6);
		l_pressure6.setBounds(750, 250, 200, 30);
		l_pressure6.setFont(my_font);
		l_pressure6.setForeground(green);

		c.add(l_smoke);
		l_smoke.setBounds(30, 290, 200, 30);
		l_smoke.setFont(my_font);

		c.add(l_smoke1);
		l_smoke1.setBounds(250, 290, 30, 30);
		l_smoke1.setIcon(smallIcon);

		c.add(l_smoke2);
		l_smoke2.setBounds(350, 290, 30, 30);
		l_smoke2.setIcon(smallIcon);

		c.add(l_smoke3);
		l_smoke3.setBounds(450, 290, 30, 30);
		l_smoke3.setIcon(smallIcon);

		c.add(l_smoke4);
		l_smoke4.setBounds(550, 290, 30, 30);
		l_smoke4.setIcon(smallIcon);

		c.add(l_smoke5);
		l_smoke5.setBounds(650, 290, 30, 30);
		l_smoke5.setIcon(smallIcon);

		c.add(l_smoke6);
		l_smoke6.setBounds(750, 290, 30, 30);
		l_smoke6.setIcon(smallIcon);

		c.add(l_gasalert);
		l_gasalert.setBounds(30, 330, 200, 30);
		l_gasalert.setFont(my_font);

		c.add(l_gas1);
		l_gas1.setBounds(250, 330, 30, 30);
		l_gas1.setIcon(smallIcon);

		c.add(l_gas2);
		l_gas2.setBounds(350, 330, 30, 30);
		l_gas2.setIcon(smallIcon);

		c.add(l_gas3);
		l_gas3.setBounds(450, 330, 30, 30);
		l_gas3.setIcon(smallIcon);

		c.add(l_gas4);
		l_gas4.setBounds(550, 330, 30, 30);
		l_gas4.setIcon(smallIcon);

		c.add(l_gas5);
		l_gas5.setBounds(650, 330, 30, 30);
		l_gas5.setIcon(smallIcon);

		c.add(l_gas6);
		l_gas6.setBounds(750, 330, 30, 30);
		l_gas6.setIcon(smallIcon);

		c.add(l_note1);
		l_note1.setBounds(250, 400, 400, 30);
		l_note1.setFont(new Font("Calibri", 1, 20));

		c.add(l_note2);
		l_note2.setBounds(250, 430, 400, 30);
		l_note2.setFont(new Font("Calibri", 1, 20));

		c.add(l_note3);
		l_note3.setBounds(250, 460, 400, 30);
		l_note3.setFont(new Font("Calibri", 1, 20));

		imageIcon = new ImageIcon("./r.png");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(128,128 ,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);

		c.add(b_robot);
		b_robot.setIcon(smallIcon);
		b_robot.setBounds(150, 550, 240, 150);

		imageIcon = new ImageIcon("./re.png");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(128,128 ,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);

		c.add(b_reset);
		b_reset.setIcon(smallIcon);
		b_reset.setBounds(450, 550, 240, 150);

		c.add(l_live);
		l_live.setBounds(250, 10, 80, 30);
		l_live.setFont(my_font);

		c.add(l_com);
		l_com.setBounds(350, 10, 80, 30);
		l_com.setFont(my_font);

		c.add(l_lab);
		l_lab.setBounds(450, 10, 80, 30);
		l_lab.setFont(my_font);

		c.add(l_stg);
		l_stg.setBounds(550, 10, 80, 30);
		l_stg.setFont(my_font);

		c.add(l_wel);
		l_wel.setBounds(650, 10, 80, 30);
		l_wel.setFont(my_font);

		c.add(l_hc);
		l_hc.setBounds(750, 10, 80, 30);
		l_hc.setFont(my_font);

		c.add(l_disPicture1);
		imageIcon = new ImageIcon("./1.jpg");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(cam1w, cam1h,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);
		l_disPicture1.setIcon(smallIcon);
		l_disPicture1.setBounds(900, 30, 300, 250);

		c.add(b_cam11);
		b_cam11.setIcon(new ImageIcon("./c1.png"));
		b_cam11.setBounds(1240,60,30,30);

		c.add(b_cam12);
		b_cam12.setIcon(new ImageIcon("./c2.png"));
		b_cam12.setBounds(1240,120,30,30);

		c.add(b_cam13);
		b_cam13.setIcon(new ImageIcon("./c3.png"));
		b_cam13.setBounds(1210,90,30,30);

		c.add(b_cam14);
		b_cam14.setIcon(new ImageIcon("./c4.png"));
		b_cam14.setBounds(1270,90,30,30);

		c.add(b_cam15);
		b_cam15.setIcon(new ImageIcon("./plus.png"));
		b_cam15.setBounds(1240,180,30,30);
		b_cam15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam1w=cam1w+30;
				cam1h=cam1h+30;
				imageIcon = new ImageIcon("./1.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam1w, cam1h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture1.setIcon(smallIcon);
				l_disPicture1.setBounds(900, 30, 300, 250);
			}
		});

		c.add(b_cam16);
		b_cam16.setIcon(new ImageIcon("./minus.png"));
		b_cam16.setBounds(1240,230,30,30);
		b_cam16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam1w=cam1w-30;
				cam1h=cam1h-30;
				imageIcon = new ImageIcon("./1.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam1w, cam1h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture1.setIcon(smallIcon);
				l_disPicture1.setBounds(900, 30, 300, 250);
			}
		});

		c.add(l_camera1);
		l_camera1.setBounds(930, 293, 80, 30);
		l_camera1.setFont(my_font);

		c.add(b_cam17);
		b_cam17.setBackground(Color.WHITE);
		b_cam17.setIcon(new ImageIcon("./l.png"));
		b_cam17.setBounds(1000,290,50,30);

		c.add(b_cam18);
		b_cam18.setBackground(Color.WHITE);
		b_cam18.setIcon(new ImageIcon("./ri.png"));
		b_cam18.setBounds(1060,290,50,30);

		c.add(b_cam19);
		b_cam19.setBackground(Color.WHITE);
		b_cam19.setIcon(new ImageIcon("./del.png"));
		b_cam19.setBounds(1150,290,30,30);

		c.add(l_disPicture2);
		imageIcon = new ImageIcon("./2.jpg");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(300, 250,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);
		l_disPicture2.setIcon(smallIcon);
		l_disPicture2.setBounds(1320, 30, 300, 250);

		c.add(b_cam21);
		b_cam21.setIcon(new ImageIcon("./c1.png"));
		b_cam21.setBounds(1660,60,30,30);

		c.add(b_cam22);
		b_cam22.setIcon(new ImageIcon("./c2.png"));
		b_cam22.setBounds(1660,120,30,30);

		c.add(b_cam23);
		b_cam23.setIcon(new ImageIcon("./c3.png"));
		b_cam23.setBounds(1630,90,30,30);

		c.add(b_cam24);
		b_cam24.setIcon(new ImageIcon("./c4.png"));
		b_cam24.setBounds(1690,90,30,30);

		c.add(b_cam25);
		b_cam25.setIcon(new ImageIcon("./plus.png"));
		b_cam25.setBounds(1660,180,30,30);
		b_cam25.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam2w=cam2w+30;
				cam2h=cam2h+30;
				imageIcon = new ImageIcon("./2.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam2w, cam2h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture2.setIcon(smallIcon);
				l_disPicture2.setBounds(1320, 30, 300, 250);
			}
		});

		c.add(b_cam26);
		b_cam26.setIcon(new ImageIcon("./minus.png"));
		b_cam26.setBounds(1660,230,30,30);
		b_cam26.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam2w=cam2w-30;
				cam2h=cam2h-30;
				imageIcon = new ImageIcon("./2.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam2w, cam2h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture2.setIcon(smallIcon);
				l_disPicture2.setBounds(1320, 30, 300, 250);
			}
		});

		c.add(l_camera2);
		l_camera2.setBounds(1350, 293, 80, 30);
		l_camera2.setFont(my_font);

		c.add(b_cam27);
		b_cam27.setBackground(Color.WHITE);
		b_cam27.setIcon(new ImageIcon("./l.png"));
		b_cam27.setBounds(1420,290,50,30);

		c.add(b_cam28);
		b_cam28.setBackground(Color.WHITE);
		b_cam28.setIcon(new ImageIcon("./ri.png"));
		b_cam28.setBounds(1480,290,50,30);

		c.add(b_cam29);
		b_cam29.setBackground(Color.WHITE);
		b_cam29.setIcon(new ImageIcon("./del.png"));
		b_cam29.setBounds(1570,290,30,30);

		c.add(l_disPicture3);
		imageIcon = new ImageIcon("./3.jpg");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(300, 250,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);
		l_disPicture3.setIcon(smallIcon);
		l_disPicture3.setBounds(900, 350, 300, 250);

		c.add(b_cam31);
		b_cam31.setIcon(new ImageIcon("./c1.png"));
		b_cam31.setBounds(1240,380,30,30);

		c.add(b_cam32);
		b_cam32.setIcon(new ImageIcon("./c2.png"));
		b_cam32.setBounds(1240,440,30,30);

		c.add(b_cam33);
		b_cam33.setIcon(new ImageIcon("./c3.png"));
		b_cam33.setBounds(1210,410,30,30);

		c.add(b_cam34);
		b_cam34.setIcon(new ImageIcon("./c4.png"));
		b_cam34.setBounds(1270,410,30,30);

		c.add(b_cam35);
		b_cam35.setIcon(new ImageIcon("./plus.png"));
		b_cam35.setBounds(1240,500,30,30);
		b_cam35.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam3w=cam3w+30;
				cam3h=cam3h+30;
				imageIcon = new ImageIcon("./3.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam3w, cam3h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture3.setIcon(smallIcon);
				l_disPicture3.setBounds(900, 350, 300, 250);
			}
		});

		c.add(b_cam36);
		b_cam36.setIcon(new ImageIcon("./minus.png"));
		b_cam36.setBounds(1240,550,30,30);
		b_cam36.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam3w=cam3w-30;
				cam3h=cam3h-30;
				imageIcon = new ImageIcon("./3.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam3w, cam3h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture3.setIcon(smallIcon);
				l_disPicture3.setBounds(900, 350, 300, 250);
			}
		});

		c.add(l_camera3);
		l_camera3.setBounds(930, 613, 80, 30);
		l_camera3.setFont(my_font);

		c.add(b_cam37);
		b_cam37.setBackground(Color.WHITE);
		b_cam37.setIcon(new ImageIcon("./l.png"));
		b_cam37.setBounds(1000,610,50,30);

		c.add(b_cam38);
		b_cam38.setBackground(Color.WHITE);
		b_cam38.setIcon(new ImageIcon("./ri.png"));
		b_cam38.setBounds(1060,610,50,30);

		c.add(b_cam39);
		b_cam39.setBackground(Color.WHITE);
		b_cam39.setIcon(new ImageIcon("./del.png"));
		b_cam39.setBounds(1150,610,30,30);

		c.add(l_disPicture4);
		imageIcon = new ImageIcon("./4.jpg");
		image = imageIcon.getImage();
		smallImage = image.getScaledInstance(300, 250,
				Image.SCALE_FAST);
		smallIcon = new ImageIcon(smallImage);
		l_disPicture4.setIcon(smallIcon);
		l_disPicture4.setBounds(1320, 350, 300, 250);

		c.add(b_cam41);
		b_cam41.setIcon(new ImageIcon("./c1.png"));
		b_cam41.setBounds(1660,380,30,30);

		c.add(b_cam42);
		b_cam42.setIcon(new ImageIcon("./c2.png"));
		b_cam42.setBounds(1660,440,30,30);

		c.add(b_cam43);
		b_cam43.setIcon(new ImageIcon("./c3.png"));
		b_cam43.setBounds(1630,410,30,30);

		c.add(b_cam44);
		b_cam44.setIcon(new ImageIcon("./c4.png"));
		b_cam44.setBounds(1690,410,30,30);

		c.add(b_cam45);
		b_cam45.setIcon(new ImageIcon("./plus.png"));
		b_cam45.setBounds(1660,500,30,30);
		b_cam45.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam4w=cam4w+30;
				cam4h=cam4h+30;
				imageIcon = new ImageIcon("./4.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam4w, cam4h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture4.setIcon(smallIcon);
				l_disPicture4.setBounds(1320, 350, 300, 250);
			}
		});

		c.add(b_cam46);
		b_cam46.setIcon(new ImageIcon("./minus.png"));
		b_cam46.setBounds(1660,550,30,30);
		b_cam46.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cam4w=cam4w-30;
				cam4h=cam4h-30;
				imageIcon = new ImageIcon("./4.jpg");
				image = imageIcon.getImage();
				smallImage = image.getScaledInstance(cam4w, cam4h,
						Image.SCALE_FAST);
				smallIcon = new ImageIcon(smallImage);
				l_disPicture4.setIcon(smallIcon);
				l_disPicture4.setBounds(1320, 350, 300, 250);
			}
		});

		c.add(l_camera4);
		l_camera4.setBounds(1350, 613, 80, 30);
		l_camera4.setFont(my_font);

		c.add(b_cam47);
		b_cam47.setBackground(Color.WHITE);
		b_cam47.setIcon(new ImageIcon("./l.png"));
		b_cam47.setBounds(1420,610,50,30);

		c.add(b_cam48);
		b_cam48.setBackground(Color.WHITE);
		b_cam48.setIcon(new ImageIcon("./ri.png"));
		b_cam48.setBounds(1480,610,50,30);

		c.add(b_cam49);
		b_cam49.setBackground(Color.WHITE);
		b_cam49.setIcon(new ImageIcon("./del.png"));
		b_cam49.setBounds(1570,610,30,30);

		c.add(l_url);
		l_url.setBounds(900, 680, 120, 30);
		l_url.setFont(new Font("Calibri", 1, 24));

		c.add(t_url);
		t_url.setBounds(1030, 680, 500, 30);

		c.add(b_add);
		b_add.setFont(new Font("Calibri", 0, 20));
		b_add.setBounds(1550, 679, 150, 30);

		l_outsidetem1.setText(info.outTemp);
		l_outsidetem2.setText(info.outTemp);
		l_outsidetem3.setText(info.outTemp);
		l_outsidetem4.setText(info.outTemp);
		l_outsidetem5.setText(info.outTemp);
		l_outsidetem6.setText(info.outTemp);

		l_temp1.setText(info.inTemp[0]);
		l_temp2.setText(info.inTemp[1]);
		l_temp3.setText(info.inTemp[2]);
		l_temp4.setText(info.inTemp[3]);
		l_temp5.setText(info.inTemp[4]);
		l_temp6.setText(info.inTemp[5]);

		l_walltemp1.setText(info.wallTemp[0]);
		l_walltemp2.setText(info.wallTemp[1]);
		l_walltemp3.setText(info.wallTemp[2]);
		l_walltemp4.setText(info.wallTemp[3]);
		l_walltemp5.setText(info.wallTemp[4]);
		l_walltemp6.setText(info.wallTemp[5]);

		l_humidity1.setText(info.humid[0]);
		l_humidity2.setText(info.humid[1]);
		l_humidity3.setText(info.humid[2]);
		l_humidity4.setText(info.humid[3]);
		l_humidity5.setText(info.humid[4]);
		l_humidity6.setText(info.humid[5]);

		l_oxygen1.setText(info.oxygen[0]);
		l_oxygen2.setText(info.oxygen[1]);
		l_oxygen3.setText(info.oxygen[2]);
		l_oxygen4.setText(info.oxygen[3]);
		l_oxygen5.setText(info.oxygen[4]);
		l_oxygen6.setText(info.oxygen[5]);

		l_pressure1.setText(info.pressure[0]);
		l_pressure2.setText(info.pressure[1]);
		l_pressure3.setText(info.pressure[2]);
		l_pressure4.setText(info.pressure[3]);
		l_pressure5.setText(info.pressure[4]);
		l_pressure6.setText(info.pressure[5]);

		if(info.smoke[0]){
			l_smoke1.setIcon(redImageIcon);
		}
		if(info.smoke[1]){
			l_smoke2.setIcon(redImageIcon);
		}
		if(info.smoke[2]){
			l_smoke3.setIcon(redImageIcon);
		}
		if(info.smoke[3]){
			l_smoke4.setIcon(redImageIcon);
		}
		if(info.smoke[4]){
			l_smoke5.setIcon(redImageIcon);
		}
		if(info.smoke[5]){
			l_smoke6.setIcon(redImageIcon);
		}

		if (info.gas[0]){
			l_gas1.setIcon(redImageIcon);
		}
		if (info.gas[1]){
			l_gas2.setIcon(redImageIcon);
		}
		if (info.gas[2]){
			l_gas3.setIcon(redImageIcon);
		}
		if (info.gas[3]){
			l_gas4.setIcon(redImageIcon);
		}
		if (info.gas[4]){
			l_gas5.setIcon(redImageIcon);
		}
		if (info.gas[5]){
			l_gas6.setIcon(redImageIcon);
		}


		l_temp1.setText(info.inTemp[0]);
		l_temp1.setForeground(Judge.temp(info.inTemp[0], 0));

		l_temp2.setText(info.inTemp[1]);
		l_temp2.setForeground(Judge.temp(info.inTemp[1], 1));

		l_temp3.setText(info.inTemp[2]);
		l_temp3.setForeground(Judge.temp(info.inTemp[2], 2));

		l_temp4.setText(info.inTemp[3]);
		l_temp4.setForeground(Judge.temp(info.inTemp[3], 3));

		l_temp5.setText(info.inTemp[4]);
		l_temp5.setForeground(Judge.temp(info.inTemp[4], 4));

		l_temp6.setText(info.inTemp[5]);
		l_temp6.setForeground(Judge.temp(info.inTemp[5], 5));

		if(l_temp1.getForeground()==Color.BLACK || l_temp2.getForeground()==Color.BLACK ||l_temp2.getForeground()==Color.BLACK ||l_temp3.getForeground()==Color.BLACK ||l_temp4.getForeground()==Color.BLACK ||l_temp5.getForeground()==Color.BLACK || l_temp6.getForeground()==Color.BLACK){
			l_tempa.setIcon(redImageIcon);
		}

		l_walltemp1.setText(info.wallTemp[0]);
		l_walltemp1.setForeground(Judge.external(info.wallTemp[0]));

		l_walltemp2.setText(info.wallTemp[1]);
		l_walltemp2.setForeground(Judge.external(info.wallTemp[1]));

		l_walltemp3.setText(info.wallTemp[2]);
		l_walltemp3.setForeground(Judge.external(info.wallTemp[2]));

		l_walltemp4.setText(info.wallTemp[3]);
		l_walltemp4.setForeground(Judge.external(info.wallTemp[3]));

		l_walltemp5.setText(info.wallTemp[4]);
		l_walltemp5.setForeground(Judge.external(info.wallTemp[4]));

		l_walltemp6.setText(info.wallTemp[5]);
		l_walltemp6.setForeground(Judge.external(info.wallTemp[5]));

		if(l_walltemp1.getForeground()==Color.BLACK || l_walltemp2.getForeground()==Color.BLACK ||l_walltemp3.getForeground()==Color.BLACK ||l_walltemp4.getForeground()==Color.BLACK ||l_walltemp5.getForeground()==Color.BLACK ||l_walltemp6.getForeground()==Color.BLACK){
			l_walltempa.setIcon(redImageIcon);
		}


		l_humidity1.setText(info.humid[0]);
		l_humidity1.setForeground(Judge.humid(info.humid[0], 0));

		l_humidity2.setText(info.humid[1]);
		l_humidity2.setForeground(Judge.humid(info.humid[1], 1));

		l_humidity3.setText(info.humid[2]);
		l_humidity3.setForeground(Judge.humid(info.humid[2], 2));

		l_humidity4.setText(info.humid[3]);
		l_humidity4.setForeground(Judge.humid(info.humid[3], 3));

		l_humidity5.setText(info.humid[4]);
		l_humidity5.setForeground(Judge.humid(info.humid[4], 4));

		l_humidity6.setText(info.humid[5]);
		l_humidity6.setForeground(Judge.humid(info.humid[5], 5));

		if(l_humidity1.getForeground() == Color.BLACK ||l_humidity2.getForeground() == Color.BLACK ||l_humidity3.getForeground() == Color.BLACK ||l_humidity4.getForeground() == Color.BLACK ||l_humidity5.getForeground() == Color.BLACK ||l_humidity6.getForeground() == Color.BLACK ){
			l_humiditya.setIcon(redImageIcon);
		}

		l_oxygen1.setText(info.oxygen[0]);
		l_oxygen1.setForeground(Judge.oxy(info.oxygen[0]));

		l_oxygen2.setText(info.oxygen[1]);
		l_oxygen2.setForeground(Judge.oxy(info.oxygen[1]));

		l_oxygen3.setText(info.oxygen[2]);
		l_oxygen3.setForeground(Judge.oxy(info.oxygen[2]));

		l_oxygen4.setText(info.oxygen[3]);
		l_oxygen4.setForeground(Judge.oxy(info.oxygen[3]));

		l_oxygen5.setText(info.oxygen[4]);
		l_oxygen5.setForeground(Judge.oxy(info.oxygen[4]));

		l_oxygen6.setText(info.oxygen[5]);
		l_oxygen6.setForeground(Judge.oxy(info.oxygen[5]));

		if(l_oxygen1.getForeground() == Color.BLACK ||l_oxygen2.getForeground() == Color.BLACK ||l_oxygen3.getForeground() == Color.BLACK ||l_oxygen4.getForeground() == Color.BLACK ||l_oxygen5.getForeground() == Color.BLACK ||l_oxygen6.getForeground() == Color.BLACK){
			l_oxygena.setIcon(redImageIcon);
		}

		l_pressure1.setText(info.pressure[0]);
		l_pressure1.setForeground(Judge.pres(info.pressure[0]));

		l_pressure2.setText(info.pressure[1]);
		l_pressure2.setForeground(Judge.pres(info.pressure[1]));

		l_pressure3.setText(info.pressure[2]);
		l_pressure3.setForeground(Judge.pres(info.pressure[2]));

		l_pressure4.setText(info.pressure[3]);
		l_pressure4.setForeground(Judge.pres(info.pressure[3]));

		l_pressure5.setText(info.pressure[4]);
		l_pressure5.setForeground(Judge.pres(info.pressure[4]));

		l_pressure6.setText(info.pressure[5]);
		l_pressure6.setForeground(Judge.pres(info.pressure[5]));

		if (l_pressure1.getForeground()==Color.BLACK ||l_pressure2.getForeground()==Color.BLACK ||l_pressure3.getForeground()==Color.BLACK ||l_pressure4.getForeground()==Color.BLACK ||l_pressure5.getForeground()==Color.BLACK ||l_pressure6.getForeground()==Color.BLACK ){
			l_presurea.setIcon(redImageIcon);
		}

		b_reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayController.resetAlarm();
			}
		});

//		c.add(b_convert);
//		b_convert.setFont(new Font("Calibri", 0, 20));
//		b_convert.setBounds(200, 370, 350, 30);
//
//		c.add(sp_result);
//		sp_result.setBounds(30, 450, 650, 200);
//
//		c.add(sp_console);
//		sp_console.setBounds(30, 720, 650, 200);

		setTitle("Wirtten by Weike Wu");
		setBounds(50, 10, 1800, 800);
		setVisible(true);
		setDefaultCloseOperation(new JFrame().EXIT_ON_CLOSE);



//		b_convert.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});
//
//		b_analysis.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});


	}


	public DisplayConsole(DisplayController displayController) {
		// TODO Auto-generated constructor stub
		this.displayController = displayController;
		this.info = displayController.getInfo();

	}

	//call this function when "mode" button is clicked. Use changeMode("normal") to enter normal mode, and changeMode("test") to enter test mode
	public void changeMode(String mode){
		if(mode.equals("normal")){
			displayController.activeNormalMode();
		}
		else if(mode.equals("test")){
			displayController.activeTestMode();
		}
	}

	//call this function when reset alarm button is clicked
	public void resetAllAlarm(){
		displayController.resetAlarm();
	}

	public void activeRobot(){
		displayController.activeRobot();
	}

	//UI code will be placed here. Data is stored in Info object.
	//public void display(){

	//}


}
