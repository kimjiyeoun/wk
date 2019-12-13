package java;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Start extends JFrame {
	public static JPanel contentPane = new JPanel();
	JLabel title = new JLabel("�޴���");
	JButton btn1 = new JButton("����");
	
	public Start() {
		setTitle("ī�� �޴��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
	
		c.add(title);
		
		c.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Mainmenu();
			}
		});
		
				
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	
		
	}
	public static void main(String[] args) {
		new Start();
	}
	
}

class Mainmenu extends JFrame{
	
	JLabel Americano = new JLabel("�Ƹ޸�ī��: 3000");
	JLabel Espresso = new JLabel("����������: 3000");
	JLabel Latte = new JLabel("��: 3500");
	JLabel Cappuccino = new JLabel("īǪġ��: 3500");
	JLabel Icedtea = new JLabel("���̽�Ƽ: 4000");
	JButton btn2 = new JButton("�ֹ��ϱ�");
	
	Mainmenu(){
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
	
		c.add(Americano);
		
		c.add(Espresso);
		
		c.add(Latte);
		
		c.add(Cappuccino);
		
		c.add(Icedtea);
		
		btn2.setSize(100, 100);
		btn2.setLocation(150, 480);
		c.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Order();
			}
		});

		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
			
}

class Order extends JFrame{
	JLabel o = new JLabel("�ֹ��Ͻ� ���Ḧ �Է����ּ���.");
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	JButton btn3 = new JButton("�ֹ��� ����");
	
	Order(){
		setTitle("�ֹ��ϱ�");
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
		c.add(o);
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); 
				t.setText("");
				c.requestFocus();
			}
		});
		
		btn3.setSize(100, 100);
		c.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Complete();
			}
		});
		
		
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
				
	}
	public static void main(String[] args) {
		new Order();
	}
}
class Complete extends JFrame {
	JLabel o = new JLabel("�ֹ��Ϸ�");
	
	JButton btn4 = new JButton("�Ϸ�");
			
	Complete(){
		setTitle("�ֹ� �Ϸ�");
		Container c = getContentPane();
		
		
		c.setLayout(new FlowLayout());
		
		c.add(o);
		
		btn4.setSize(100, 100);
		c.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;;
			}
		});
		setSize(300,300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
				
	}
	public static void main(String[] args) {
		new Complete();
	}
}
		


