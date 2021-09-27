import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener{
	
	static double a=0,b=0,result=0;
	static int operator=0; 
	
	JFrame jf;
	JLabel DisplayLabel;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton divbutton;
	JButton mulbutton;
	JButton minusbutton;
	JButton plusbutton;
	JButton clearbutton;

	public Calculator() {
		
		
		
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(350, 100);
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(30, 50, 540, 40);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.WHITE);
		jf.add(DisplayLabel);
		
	    sevenbutton=new JButton("7");
		sevenbutton.setBounds(30,130,80,80);
		sevenbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);
		
	    eightbutton=new JButton("8");
		eightbutton.setBounds(130,130,80,80);
		eightbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230,130,80,80);
		ninebutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30,230,80,80);
		fourbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130,230,80,80);
		fivebutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230,230,80,80);
		sixbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);
		
		onebutton=new JButton("1");
		onebutton.setBounds(30,330,80,80);
		onebutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		onebutton.addActionListener(this);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130,330,80,80);
		twobutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		twobutton.addActionListener(this);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230,330,80,80);
		threebutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		threebutton.addActionListener(this);
		jf.add(threebutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30,430,80,80);
		dotbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		dotbutton.addActionListener(this);
		jf.add(dotbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130,430,80,80);
		zerobutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);
		
	    equalbutton=new JButton("=");
		equalbutton.setBounds(230,430,80,80);
		equalbutton.setFont(new Font("Arial", Font.CENTER_BASELINE, 36));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);
		
		divbutton=new JButton("/");
		divbutton.setBounds(330,130,80,80);
		divbutton.setFont(new Font("Arial", Font.BOLD, 38));
		divbutton.addActionListener(this);
		
		jf.add(divbutton);
		
		mulbutton=new JButton("x");
		mulbutton.setBounds(330,230,80,80);
		mulbutton.setFont(new Font("Arial", Font.BOLD, 38));
		mulbutton.addActionListener(this);
		jf.add(mulbutton);
		
		minusbutton=new JButton("-");
		minusbutton.setBounds(330,330,80,80);
		minusbutton.setFont(new Font("Arial", Font.BOLD, 38));
		minusbutton.addActionListener(this);
		jf.add(minusbutton);
		
		plusbutton=new JButton("+");
		plusbutton.setBounds(330,430,80,80);
		plusbutton.setFont(new Font("Arial", Font.BOLD, 38));
		plusbutton.addActionListener( this);
		jf.add(plusbutton);
		
		clearbutton=new JButton("C");
		clearbutton.setBounds(430,430,80,80);
		clearbutton.setFont(new Font("Arial", Font.BOLD, 38));
		clearbutton.addActionListener( this);
		jf.add(clearbutton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenbutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("7"));
		}if(e.getSource()==eightbutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("8"));
		}if(e.getSource()==ninebutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("9"));
		}if(e.getSource()==fourbutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("4"));
		}if(e.getSource()==fivebutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("5"));
		}if(e.getSource()==sixbutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("6"));
		}if(e.getSource()==onebutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("1"));
		}if(e.getSource()==twobutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("2"));
		}if(e.getSource()==threebutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("3"));
		}if(e.getSource()==zerobutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("0"));
		}if(e.getSource()==dotbutton) {
			DisplayLabel.setText(DisplayLabel.getText().concat("."));
		}if(e.getSource()==divbutton) {
			a=Double.parseDouble(DisplayLabel.getText());
			operator=1;
			DisplayLabel.setText("");
		}if(e.getSource()==mulbutton) {
			a=Double.parseDouble(DisplayLabel.getText());
			operator=2;
			DisplayLabel.setText("");
		}if(e.getSource()==minusbutton) {
			a=Double.parseDouble(DisplayLabel.getText());
			operator=3;
			DisplayLabel.setText("");
		}if(e.getSource()==plusbutton) {
			a=Double.parseDouble(DisplayLabel.getText());
			operator=4;
			DisplayLabel.setText("");
		}if(e.getSource()==equalbutton) {
			b=Double.parseDouble(DisplayLabel.getText());
		
			switch(operator) {
			case 1: result=a/b;
			break;
			case 2: result=a*b;
			break;
			case 3: result=a-b;
			break;
			case 4: result=a+b;
			break;
			
			default: result=0;
			}
			DisplayLabel.setText(""+result);
		}if(e.getSource()==clearbutton) {
			DisplayLabel.setText("");
		}
	}
	}
