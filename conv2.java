package converter22;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class conv2 {
	public static void converter()
	{
		JFrame f = new JFrame("CONVERTER");
		f.getContentPane().setBackground(Color.BLACK);
		JLabel l1, l2, l3,l4,l5,l6,l7,l8,l9;
		JTextField t1, t2, t3 ,t5,t6;
		JButton b1, b2, b3, b4;
		l1=new JLabel("Rupees");
		l1.setForeground(Color.GREEN);
		l1.setFont(new Font("Verdana",Font.BOLD,14));
		l1.setBounds(20,40,60,30);
		l2=new JLabel("Dollars");
		l2.setForeground(Color.GREEN);
		l2.setFont(new Font("Verdana",Font.BOLD,14));
		l2.setBounds(20,80,60,30);
		l3=new JLabel("Euro");
		l3.setForeground(Color.GREEN);
		l3.setFont(new Font("Verdana",Font.BOLD,14));
		l3.setBounds(400,80,60,30);
		t1=new JTextField("0");
		t1.setBounds(80,40,200,30);
		t2=new JTextField("0");
		t2.setBounds(80,80,200,30);
		t3=new JTextField("0");
		t3.setBounds(450,80,200,30);
		l9=new JLabel();
		l9.setFont(new Font("Verdana",Font.BOLD,15));
		l9.setForeground(Color.RED);
		l9.setBounds(50,500,600,50);
		l4=new JLabel("Please share your knowledge...!");
		l4.setForeground(Color.GREEN);
		l4.setFont(new Font("Verdana",Font.BOLD,16));
		l4.setBounds(100,310,500,30);
		l5=new JLabel("1$=");
		l5.setForeground(Color.GREEN);
		l5.setFont(new Font("Verdana",Font.BOLD,14));
		l5.setBounds(30,370,60,30);
		l6=new JLabel("Rupees");
		l6.setForeground(Color.GREEN);
		l6.setFont(new Font("Verdana",Font.BOLD,14));
		l6.setBounds(160,370,60,30);
		t5=new JTextField("0");
		t5.setBounds(70,370,70,30);
		l7=new JLabel("1 EURO=");
		l7.setForeground(Color.GREEN);
		l7.setFont(new Font("Verdana",Font.BOLD,14));
		l7.setBounds(290,370,80,30);
		l8=new JLabel("Rupees");
		l8.setForeground(Color.GREEN);
		l8.setFont(new Font("Verdana",Font.BOLD,14));
		l8.setBounds(450,370,60,30);
		t6=new JTextField("0");
		t6.setBounds(380,370,70,30);
		
		
		b1=new JButton("Convert");
		b1.setBounds(130,160,200,50);
		b2=new JButton("Clear");
		b2.setBounds(330,160,200,50);
		b3=new JButton("Close");
		b3.setBounds(250,240,200,50);
		b4=new JButton("Clear");
		b4.setBounds(230,420,100,30);
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				double d1,d2,d3,d4=65.25,d5=89.0,d6,d7;
				double r1,r2;
				try
				{
				d1=Double.parseDouble(t1.getText());
				d2=Double.parseDouble(t2.getText());
				d3=Double.parseDouble(t3.getText());
				d6=Double.parseDouble(t5.getText());
				d7=Double.parseDouble(t6.getText());
					if(d1<0 ||d2<0 ||d3<0||d4<0||d5<0)
						throw new ArithmeticException("negative");
					if(d6!=0 || d7!=0)
					{
						if(d6!=0)
							d4=d6;
						if(d7!=0)
							d5=d7;
					}
					
				
				if(d1>0)
				{
					r1=(d1/d4);
				
				String str1=String.valueOf(r1);
				t2.setText(str1);
				r2=(d1/d5);
				String str2=String.valueOf(r2);
				t3.setText(str2);
				}
				if(d2>0)
				{
					r1=d2*d4;
					
					String str1=String.valueOf(r1);
					t1.setText(str1);
					r2=d2*(d4/d5);
					String str2=String.valueOf(r2);
					t3.setText(str2);
				}
				if(d3>0)
				{
					r1=d5*d3;
					
					String str1=String.valueOf(r1);
					t1.setText(str1);
					r2=(d3/(d4/d5));
					String str2=String.valueOf(r2);
					t2.setText(str2);
				}
				}
				
				catch(Exception v)
				{
					String b=v.toString();
					
					l9.setText(b);
					
				}
				}
				}
		);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
				}
		);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			t1.setText("0");
			t2.setText("0");
			t3.setText("0");
			l9.setText(null);
			}
				}
		);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
			t5.setText("0");
			t6.setText("0");
			}
				}
		);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		// Adding the created objects
		// to the form
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l9);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(t5);
		f.add(l7);
		f.add(l8);
		f.add(t6);
		f.add(b4);

		f.setLayout(null);
		f.setSize(700, 600);
		f.setVisible(true);
	}

	public static void main(String args[])
	{
		converter();
	}
}
				
			
					
	


