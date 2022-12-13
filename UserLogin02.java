import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UserLogin02 extends JFrame implements ActionListener,Runnable{
	private Shape rectangle,rectangle02;
	private Thread thread01,thread02;
	private JButton btnEasy;
	private JButton btnNormal;
	private JLabel lblInfo;
	private static CreatAcount h1;
	public UserLogin02() {
		setLayout(null);
		btnEasy = new JButton("EASY");
		btnEasy.setBounds(60, 10, 100, 20);
		btnEasy.setOpaque(true);
		btnEasy.setBackground(new Color(0.8f,0.2f,0.4f,0.5f));
		btnNormal = new JButton("NORMAL");
		btnNormal.setBounds(200, 10, 100, 20);
		btnNormal.setOpaque(true);
		btnNormal.setBackground(new Color(0.8f,0.2f,0.4f,0.5f));
		lblInfo = new JLabel(" SYSTEM LOADING ");
		lblInfo.setBounds(120, 55, 130, 20);
		lblInfo.setOpaque(true);
		lblInfo.setBackground(new Color(0.5f,0.6f,0.4f,0.5f));
		
		
		rectangle = new Shape(10,120,20,20);
		rectangle02 = new Shape(350,120,20,20);
		thread01 = new Thread(this);
		thread01.setName("t1");
		thread01.start();
		thread02 = new Thread(this);
		thread02.setName("t2");
		thread02.start();
		add(btnEasy);
		add(btnNormal);
		add(lblInfo);
		setSize(400,200);
		setVisible(true);
		btnEasy.addActionListener(this);
		btnNormal.addActionListener(this);
		getContentPane().setBackground(Color.WHITE);
		setTitle("CHOOSE LEVEL");
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
/*
	public static void main(String[] args) {
new UserLogin02();
	}*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnEasy) {
			JOptionPane.showMessageDialog(btnEasy, "YOUR GAME IS BEING CREATING");
			ThirdPage(5,5);
		}
		if(e.getSource()==btnNormal) {
			JOptionPane.showMessageDialog(btnNormal, "YOUR GAME IS BEING CREATING");
			ThirdPage(9,10);
		}
	}
	private void ThirdPage(int a,int b){
		new Minesweeper(a,b);
		dispose();
	}

	@Override
	public void run() {
		if(Thread.currentThread().getName()==thread01.getName()){
			
		
		while(true) {
			try {
				Thread.currentThread().sleep(400);
				rectangle.move();
				if(rectangle.getX()>350||rectangle.getX()<10) {
					
					rectangle.setSpeedX(rectangle.getSpeedX()*-1);
				}
				
				
				repaint();
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		else if(Thread.currentThread().getName()==thread02.getName()){
			
			while(true) {
				try {
					Thread.currentThread().sleep(400);
					rectangle02.move();
					if(rectangle02.getX()<350||rectangle02.getX()>10) {
						
						rectangle02.setSpeedX(rectangle.getSpeedX()*-1);
					}
					
					
					repaint();
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
			
				
			
			
		}
		
		
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(rectangle.getCol());
		g.fillRect(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getWeight());
		
		g.setColor(rectangle02.getCol());
		g.fillRect(rectangle02.getX(), rectangle02.getY(), rectangle02.getWidth(), rectangle02.getWeight());
		
	}
	


	

}
