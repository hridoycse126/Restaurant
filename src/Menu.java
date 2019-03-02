import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.AttributedCharacterIterator.Attribute;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class Menu {

	public Menu() {
		JFrame frame=new JFrame("King's Kitchen");
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setLayout(null);
		
		JLabel lab=new JLabel("Foods Item :");
		lab.setFont(new Font("Dialog", Font.BOLD, 20));
		lab.setBounds(20, 20, 180, 20);
		//lab.setEnabled(false);
		lab.setBackground(Color.BLACK);
		lab.setForeground(Color.BLUE);
		frame.add(lab);
		
		JLabel lab1=new JLabel();
		lab1.setText("Beef");
		lab1.setBounds(20, 60, 100, 20);
		frame.add(lab1);
		JLabel lab01=new JLabel();
		lab01.setBounds(380,60,180,20);
		frame.add(lab01);
		
		final JTextField tf1=new JTextField();
		tf1.setText("250");
		tf1.setEditable(false);
		tf1.setBounds(148, 60, 100, 20);
		frame.add(tf1);
		final JTextField tf01=new JTextField();
		tf01.setBounds(248, 60, 100, 20);
		tf01.setText("0");
		frame.add(tf01);
		
		JLabel lab2=new JLabel();
		lab2.setText("Chicken");
		lab2.setBounds(20, 80, 100, 20);
		frame.add(lab2);
		JLabel lab02=new JLabel();
		lab02.setBounds(380,80,180,20);
		frame.add(lab02);
		
		
		final JTextField tf2=new JTextField();
		tf2.setText("180");
		tf2.setEditable(false);
		tf2.setBounds(148, 80, 100, 20);
		frame.add(tf2);
		final JTextField tf02=new JTextField();
		tf02.setBounds(248, 80, 100, 20);
		tf02.setText("0");
		frame.add(tf02);
		
		JLabel lab3=new JLabel();
		lab3.setText("Cheese Burger");
		lab3.setBounds(20, 100, 100, 20);
		frame.add(lab3);
		JLabel lab03=new JLabel();
		lab03.setBounds(380,100,180,20);
		frame.add(lab03);
		
		
		final JTextField tf3=new JTextField();
		tf3.setText("150");
		tf3.setEditable(false);
		tf3.setBounds(148, 100, 100, 20);
		frame.add(tf3);
		final JTextField tf03=new JTextField();
		tf03.setBounds(248, 100, 100, 20);
		tf03.setText("0");
		frame.add(tf03);
		
		JLabel lab4=new JLabel();
		lab4.setText("Fried Rice");
		lab4.setBounds(20, 120, 100, 20);
		frame.add(lab4);
		JLabel lab04=new JLabel();
		lab04.setBounds(380,120,180,20);
		frame.add(lab04);
		
		
		final JTextField tf4=new JTextField();
		tf4.setText("280");
		tf4.setEditable(false);
		tf4.setBounds(148, 120, 100, 20);
		frame.add(tf4);
		final JTextField tf04=new JTextField();
		tf04.setBounds(248, 120, 100, 20);
		tf04.setText("0");
		frame.add(tf04);
		
		JLabel lab5=new JLabel();
		lab5.setText("Fish");
		lab5.setBounds(20, 140, 100, 20);
		frame.add(lab5);
		JLabel lab05=new JLabel();
		lab05.setBounds(380,140,180,20);
		frame.add(lab05);
		
		final JTextField tf5=new JTextField();
		tf5.setText("200");
		tf5.setEditable(false);
		tf5.setBounds(148, 140, 100, 20);
		frame.add(tf5);
		final JTextField tf05=new JTextField();
		tf05.setBounds(248, 140, 100, 20);
		tf05.setText("0");
		frame.add(tf05);
		
		JLabel lab6=new JLabel();
		lab6.setText("Vegetable");
		lab6.setBounds(20, 160, 100, 20);
		frame.add(lab6);
		JLabel lab06=new JLabel();
		lab06.setBounds(380,160,180,20);
		frame.add(lab06);
		
		
		final JTextField tf6=new JTextField();
		tf6.setText("120");
		tf6.setEditable(false);
		tf6.setBounds(148, 160, 100, 20);
		frame.add(tf6);
		final JTextField tf06=new JTextField();
		tf06.setBounds(248, 160, 100, 20);
		tf06.setText("0");
		frame.add(tf06);
		
		JLabel lab7=new JLabel();
		lab7.setText("Sandwich");
		lab7.setBounds(20, 180, 100, 20);
		frame.add(lab7);
		JLabel lab07=new JLabel();
		lab07.setBounds(380,180,180,20);
		frame.add(lab07);
		
		
		final JTextField tf7=new JTextField();
		tf7.setText("110");
		tf7.setEditable(false);
		tf7.setBounds(148, 180, 100, 20);
		frame.add(tf7);
		final JTextField tf07=new JTextField();
		tf07.setBounds(248, 180, 100, 20);
		tf07.setText("0");
		frame.add(tf07);
		
		JLabel lab8=new JLabel();
		lab8.setText("Meat Masala");
		lab8.setBounds(20, 200, 100, 20);
		frame.add(lab8);
		JLabel lab08=new JLabel();
		lab08.setBounds(380,200,180,20);
		frame.add(lab08);
		
		final JTextField tf8=new JTextField();
		tf8.setText("160");
		tf8.setEditable(false);
		tf8.setBounds(148, 200, 100, 20);
		frame.add(tf8);
		final JTextField tf08=new JTextField();
		tf08.setBounds(248, 200, 100, 20);
		tf08.setText("0");
		frame.add(tf08);
		
		JLabel lab9=new JLabel();
		lab9.setText("Pizza");
		lab9.setBounds(20, 220, 100, 20);
		frame.add(lab9);
		JLabel lab09=new JLabel();
		lab09.setBounds(380,220,180,20);
		frame.add(lab09);
		
		final JTextField tf9=new JTextField();
		tf9.setText("250");
		tf9.setEditable(false);
		tf9.setBounds(148, 220, 100, 20);
		frame.add(tf9);
		final JTextField tf09=new JTextField();
		tf09.setBounds(248, 220, 100, 20);
		tf09.setText("0");
		frame.add(tf09);
		
		JLabel lab10=new JLabel();
		lab10.setText("Chicken Biriyani");
		lab10.setBounds(20, 240, 100, 20);
		frame.add(lab10);
		JLabel lab010=new JLabel();
		lab010.setBounds(380,240,180,20);
		frame.add(lab010);
		
		final JTextField tf10=new JTextField();
		tf10.setText("120");
		tf10.setEditable(false);
		tf10.setBounds(148, 240, 100, 20);
		frame.add(tf10);
		final JTextField tf010=new JTextField();
		tf010.setBounds(248, 240, 100, 20);
		tf010.setText("0");
		frame.add(tf010);
		
		JLabel lab11=new JLabel();
		lab11.setText("Beef with Curry Sauce");
		lab11.setBounds(20, 260, 180, 20);
		frame.add(lab11);
		JLabel lab011=new JLabel();
		lab011.setBounds(380,260,180,20);
		frame.add(lab011);
		
		final JTextField tf11=new JTextField();
		tf11.setText("280");   //Price
		tf11.setEditable(false);
		tf11.setBounds(148, 260, 100, 20);
		frame.add(tf11);
		final JTextField tf011=new JTextField();
		tf011.setBounds(248, 260, 100, 20);
		tf011.setText("0"); // Count
		frame.add(tf011);
		
		JButton add=new JButton("Add");
		add.setFont(new Font("Dialog", Font.BOLD, 15));
		add.setBounds(200, 280, 100, 20);
		frame.add(add);
		
		final JTextField tffood=new JTextField();
		//tffood.setText("0");
		tffood.setEditable(false);
		tffood.setBounds(670, 460, 100, 20);
		frame.add(tffood);
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				lab01.setText("Beef : " +Integer.parseInt(tf1.getText())*Integer.parseInt(tf01.getText())+"Tk.");
				lab02.setText("Chicken : " +Integer.parseInt(tf2.getText())*Integer.parseInt(tf02.getText())+"Tk.");
				lab03.setText("Cheese Burger : " +Integer.parseInt(tf3.getText())*Integer.parseInt(tf03.getText())+"Tk.");
				lab04.setText("Fried Rice : " +Integer.parseInt(tf4.getText())*Integer.parseInt(tf04.getText())+"Tk.");
				lab05.setText("Fish : " +Integer.parseInt(tf5.getText())*Integer.parseInt(tf05.getText())+"Tk.");
				lab06.setText("Vegetable : " +Integer.parseInt(tf6.getText())*Integer.parseInt(tf06.getText())+"Tk.");
				lab07.setText("Sandwich : " +Integer.parseInt(tf7.getText())*Integer.parseInt(tf07.getText())+"Tk.");
				lab08.setText("Meat Masala : " +Integer.parseInt(tf8.getText())*Integer.parseInt(tf08.getText())+"Tk.");
				lab09.setText("Pizza : " +Integer.parseInt(tf9.getText())*Integer.parseInt(tf09.getText())+"Tk.");
				lab010.setText("Chicken Biriyani : " +Integer.parseInt(tf10.getText())*Integer.parseInt(tf010.getText())+"Tk.");
				lab011.setText("Beef with Curry Sauce : " +Integer.parseInt(tf11.getText())*Integer.parseInt(tf011.getText())+"Tk.");
				
				
				int a = Integer.parseInt(tf1.getText())*Integer.parseInt(tf01.getText());
				int b = Integer.parseInt(tf2.getText())*Integer.parseInt(tf02.getText());
				int c = Integer.parseInt(tf3.getText())*Integer.parseInt(tf03.getText());
				int d = Integer.parseInt(tf4.getText())*Integer.parseInt(tf04.getText());
				int e = Integer.parseInt(tf5.getText())*Integer.parseInt(tf05.getText());
				int f = Integer.parseInt(tf6.getText())*Integer.parseInt(tf06.getText());
				int g = Integer.parseInt(tf7.getText())*Integer.parseInt(tf07.getText());
				int h = Integer.parseInt(tf8.getText())*Integer.parseInt(tf08.getText());
				int i = Integer.parseInt(tf9.getText())*Integer.parseInt(tf09.getText());
				int j = Integer.parseInt(tf10.getText())*Integer.parseInt(tf010.getText());
				int k = Integer.parseInt(tf11.getText())*Integer.parseInt(tf011.getText());
				tffood.setText(" "+(a+b+c+d+e+f+g+h+i+j+k));
				
			}
		});
		
		JLabel drin=new JLabel("Drinks Item :");
		drin.setFont(new Font("Dialog", Font.BOLD, 20));
		drin.setBounds(20, 300, 180, 20);
		drin.setBackground(Color.BLACK);
		drin.setForeground(Color.BLUE);
		frame.add(drin);
		
		JLabel drin1=new JLabel();
		drin1.setText("Lemon Juice");
		drin1.setBounds(20, 340, 100, 20);
		frame.add(drin1);
		JLabel drin01=new JLabel();
		drin01.setBounds(380, 340, 180, 20);
		frame.add(drin01);
		
		final JTextField tfd1=new JTextField();
		tfd1.setText("80");
		tfd1.setEditable(false);
		tfd1.setBounds(148, 340, 100, 20);
		frame.add(tfd1);
		final JTextField tfd01=new JTextField();
		tfd01.setBounds(248, 340, 100, 20);
		tfd01.setText("0");
		frame.add(tfd01);
		
		JLabel drin2=new JLabel();
		drin2.setText("Mango Juice");
		drin2.setBounds(20, 360, 100, 20);
		frame.add(drin2);
		JLabel drin02=new JLabel();
		drin02.setBounds(380, 360, 180, 20);
		frame.add(drin02);
		
		final JTextField tfd2=new JTextField();
		tfd2.setText("120");
		tfd2.setEditable(false);
		tfd2.setBounds(148, 360, 100, 20);
		frame.add(tfd2);
		final JTextField tfd02=new JTextField();
		tfd02.setBounds(248, 360, 100, 20);
		tfd02.setText("0");
		frame.add(tfd02);
		
		JLabel drin3=new JLabel();
		drin3.setText("Apple Juice");
		drin3.setBounds(20, 380, 100, 20);
		frame.add(drin3);
		JLabel drin03=new JLabel();
		drin03.setBounds(380, 380, 180, 20);
		frame.add(drin03);
		
		
		final JTextField tfd3=new JTextField();
		tfd3.setText("100");     //Price
		tfd3.setEditable(false);
		tfd3.setBounds(148, 380, 100, 20);
		frame.add(tfd3);
		final JTextField tfd03=new JTextField();
		tfd03.setBounds(248, 380, 100, 20);
		tfd03.setText("0");     //Counter
		frame.add(tfd03);
		
		JLabel drin4=new JLabel();
		drin4.setText("Orange Juice");
		drin4.setBounds(20, 400, 100, 20);
		frame.add(drin4);
		JLabel drin04=new JLabel();
		drin04.setBounds(380, 400, 180, 20);
		frame.add(drin04);
		
		final JTextField tfd4=new JTextField();
		tfd4.setText("110");     //Price
		tfd4.setEditable(false);
		tfd4.setBounds(148, 400, 100, 20);
		frame.add(tfd4);
		final JTextField tfd04=new JTextField();
		tfd04.setBounds(248, 400, 100, 20);
		tfd04.setText("0"); //Count set
		frame.add(tfd04);
		
		JLabel drin5=new JLabel();
		drin5.setText("Coke/Pepsi/Sprite");
		drin5.setBounds(20, 420, 180, 20);
		frame.add(drin5);
		JLabel drin05=new JLabel();
		drin05.setBounds(380, 420, 180, 20);
		frame.add(drin05);
		
		final JTextField tfd5=new JTextField();
		tfd5.setText("20");
		tfd5.setEditable(false);
		tfd5.setBounds(148, 420, 100, 20);
		frame.add(tfd5);
		final JTextField tfd05=new JTextField();
		tfd05.setBounds(248, 420, 100, 20);
		tfd05.setText("0");
		frame.add(tfd05);
		
		JButton add1=new JButton("Add");
		add1.setFont(new Font("Dialog", Font.BOLD, 15));
		add1.setBounds(200, 440, 100, 20);
		frame.add(add1);
		
		final JTextField tfdrink=new JTextField();
		tfdrink.setEditable(false);
		tfdrink.setBounds(670, 480, 100, 20);
		frame.add(tfdrink);
		
		add1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				drin01.setText("Lemon Juice : " +Integer.parseInt(tfd1.getText())*Integer.parseInt(tfd01.getText())+"Tk.");
				drin02.setText("Mango Juice : " +Integer.parseInt(tfd2.getText())*Integer.parseInt(tfd02.getText())+"Tk.");
				drin03.setText("Apple Juice : " +Integer.parseInt(tfd3.getText())*Integer.parseInt(tfd03.getText())+"Tk.");
				drin04.setText("Orange Juice : " +Integer.parseInt(tfd4.getText())*Integer.parseInt(tfd04.getText())+"Tk.");
				drin05.setText("Coke/Pepsi/Sprite : " +Integer.parseInt(tfd5.getText())*Integer.parseInt(tfd05.getText())+"Tk.");
				
				int a = Integer.parseInt(tfd1.getText())*Integer.parseInt(tfd01.getText());
				int b = Integer.parseInt(tfd2.getText())*Integer.parseInt(tfd02.getText());
				int c = Integer.parseInt(tfd3.getText())*Integer.parseInt(tfd03.getText());
				int d = Integer.parseInt(tfd4.getText())*Integer.parseInt(tfd04.getText());
				int e = Integer.parseInt(tfd5.getText())*Integer.parseInt(tfd05.getText());
				tfdrink.setText(" "+(a+b+c+d+e));
			}
		});
		JLabel other=new JLabel("Other Items :");
		other.setFont(new Font("Dialog", Font.BOLD, 20));
		other.setBounds(20, 460, 180, 20);
		other.setBackground(Color.BLACK);
		other.setForeground(Color.BLUE);
		frame.add(other);
		
		JLabel other1=new JLabel();
		other1.setText("1L Water");
		other1.setBounds(20, 500, 100, 20);
		frame.add(other1);
		JLabel other01=new JLabel();
		other01.setBounds(380, 500, 100, 20);
		frame.add(other01);
		
		final JTextField tfoi1=new JTextField();
		tfoi1.setText("25");
		tfoi1.setEditable(false);
		tfoi1.setBounds(148, 500, 100, 20);
		frame.add(tfoi1);
		final JTextField tfoi01=new JTextField();
		tfoi01.setBounds(248, 500, 100, 20);
		tfoi01.setText("0");
		frame.add(tfoi01);
		
		JLabel other2=new JLabel();
		other2.setText("Chocolate Ice Cream");
		other2.setBounds(20, 520, 180, 20);
		frame.add(other2);
		JLabel other02=new JLabel();
		other02.setBounds(380, 520, 180, 20);
		frame.add(other02);
		
		final JTextField tfoi2=new JTextField();
		tfoi2.setText("250");
		tfoi2.setEditable(false);
		tfoi2.setBounds(148, 520, 100, 20);
		frame.add(tfoi2);
		final JTextField tfoi02=new JTextField();
		tfoi02.setBounds(248, 520, 100, 20);
		tfoi02.setText("0");
		frame.add(tfoi02);
		
		JLabel other3=new JLabel();
		other3.setText("Vanilla Ice Cream");
		other3.setBounds(20, 540, 180, 20);
		frame.add(other3);
		JLabel other03=new JLabel();
		other03.setBounds(380, 540, 180, 20);
		frame.add(other03);
		
		final JTextField tfoi3=new JTextField();
		tfoi3.setText("180");
		tfoi3.setEditable(false);
		tfoi3.setBounds(148, 540, 100, 20);
		frame.add(tfoi3);
		final JTextField tfoi03=new JTextField();
		tfoi03.setBounds(248, 540, 100, 20);
		tfoi03.setText("0");
		frame.add(tfoi03);
		
		JLabel other4=new JLabel();
		other4.setText("Coffee");
		other4.setBounds(20, 560, 100, 20);
		frame.add(other4);
		JLabel other04=new JLabel();
		other04.setBounds(380, 560, 180, 20);
		frame.add(other04);
		
		final JTextField tfoi4=new JTextField();
		tfoi4.setText("80");
		tfoi4.setEditable(false);
		tfoi4.setBounds(148, 560, 100, 20);
		frame.add(tfoi4);
		final JTextField tfoi04=new JTextField();
		tfoi04.setBounds(248, 560, 100, 20);
		tfoi04.setText("0");
		frame.add(tfoi04);
		
		JLabel other5=new JLabel();
		other5.setText("Tea");
		other5.setBounds(20, 580, 100, 20);
		frame.add(other5);
		JLabel other05=new JLabel();
		other05.setBounds(380, 580, 180, 20);
		frame.add(other05);
		
		final JTextField tfoi5=new JTextField();
		tfoi5.setText("15");
		tfoi5.setEditable(false);
		tfoi5.setBounds(148, 580, 100, 20);
		frame.add(tfoi5);
		final JTextField tfoi05=new JTextField();
		tfoi05.setBounds(248, 580, 100, 20);
		tfoi05.setText("0");
		frame.add(tfoi05);
		
		
		JButton add2=new JButton("Add");
		add2.setFont(new Font("Dialog", Font.BOLD, 15));
		add2.setBounds(200, 600, 100, 20);
		//add2.setBackground(Color.BLUE);
		//add2.setForeground(Color.BLACK);
		frame.add(add2);
		
		final JTextField tfother=new JTextField();
		tfother.setEditable(false);
		tfother.setBounds(670, 500, 100, 20);
		frame.add(tfother);
		
		add2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				other01.setText("1L Water : " +Integer.parseInt(tfoi1.getText())*Integer.parseInt(tfoi01.getText())+"Tk.");
				other02.setText("Chocolate Ice Cream : " +Integer.parseInt(tfoi2.getText())*Integer.parseInt(tfoi02.getText())+"Tk.");
				other03.setText("Vanilla Ice Cream : " +Integer.parseInt(tfoi3.getText())*Integer.parseInt(tfoi03.getText())+"Tk.");
				other04.setText("Coffee : " +Integer.parseInt(tfoi4.getText())*Integer.parseInt(tfoi04.getText())+"Tk.");
				other05.setText("Tea : " +Integer.parseInt(tfoi5.getText())*Integer.parseInt(tfoi05.getText())+"Tk.");
				
				int a = Integer.parseInt(tfoi1.getText())*Integer.parseInt(tfoi01.getText());
				int b = Integer.parseInt(tfoi2.getText())*Integer.parseInt(tfoi02.getText());
				int c = Integer.parseInt(tfoi3.getText())*Integer.parseInt(tfoi03.getText());
				int d = Integer.parseInt(tfoi4.getText())*Integer.parseInt(tfoi04.getText());
				int e = Integer.parseInt(tfoi5.getText())*Integer.parseInt(tfoi05.getText());
				tfother.setText(" "+(a+b+c+d+e));
			}
		});
		
		JLabel tfood=new JLabel();
		tfood.setText("Foods Amount");
		tfood.setBounds(580, 460, 100, 20);
		frame.add(tfood);
		
		
		
		JLabel tdrink=new JLabel();
		tdrink.setText("Drinks Amount");
		tdrink.setBounds(580, 480, 100, 20);
		frame.add(tdrink);
		
		JLabel tother=new JLabel();
		tother.setText("Others Amount");
		tother.setBounds(580, 500, 100, 20);
		frame.add(tother);
		
		JLabel vat=new JLabel();
		vat.setText("VAT 5%(+)");
		vat.setBounds(580, 520, 100, 20);
		frame.add(vat);
		
		final JTextField tfv=new JTextField();
		tfv.setEditable(false);
		tfv.setBounds(670,520,100,20);
		frame.add(tfv);
		
		JLabel dis=new JLabel();
		dis.setText("Discount 3%(-)");
		dis.setBounds(580, 540, 100, 20);
		frame.add(dis);
		
		final JTextField tfd=new JTextField();
		tfd.setEditable(false);
		tfd.setBounds(670, 540, 100, 20);
		frame.add(tfd);
		
		JButton totalbill=new JButton("Total Bill");
		totalbill.setFont(new Font("Dialog", Font.BOLD, 15));
		totalbill.setBounds(650, 560, 150, 20);
		frame.add(totalbill);
		
		final JLabel result=new JLabel();
		result.setBounds(810, 560, 450, 20);
		frame.add(result);
		
		totalbill.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(tffood.getText());
				double b=Double.parseDouble(tfdrink.getText());
				double c=Double.parseDouble(tfother.getText());
				double x=(a+b+c)*0.05;
				tfv.setText(" "+x);
				double y=(a+b+c)*0.03;
				tfd.setText(" "+y);
				result.setText("Total Amount Is : "+(a+b+c+x-y)+"Tk.");
				
				}
		});
		
		JLabel fine=new JLabel("*****THANK YOU*****");
		fine.setFont(new Font("Dialog", Font.BOLD, 20));
		fine.setBounds(600, 620, 250, 20);
		frame.add(fine);
		
		
		
	}
}
