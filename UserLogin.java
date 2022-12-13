import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLogin extends JFrame implements ActionListener {
	private JLabel lblUserName,lblPassword;
	private JTextField txtUserNameCheck;
	private JButton btnEnter,btnExit;
	private static CreatAcount h1;
	private User u1;
	
	
	private JPasswordField txtPasswordCheck ;
	public UserLogin(User u1) {
		setLayout(new GridLayout(0,2));
		lblUserName = new JLabel("USER NAME");
		lblPassword = new JLabel("PASSWORD");
		txtUserNameCheck = new JTextField();
		txtPasswordCheck = new JPasswordField();
		btnEnter = new JButton("ENTER");
		btnExit = new JButton("EXIT");
		this.u1 = u1;
		
		
		add(lblUserName);
		add(txtUserNameCheck);
		add(lblPassword);
		add(txtPasswordCheck);
		add(btnEnter);
		add(btnExit);
		
		
		btnEnter.addActionListener(this);
		btnExit.addActionListener(this);
		
		
		
		setSize(600,600);
		setVisible(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		setTitle("KULLANICI GİRİŞİ");
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		 
		
	}

	public static void main(String[] args) {
	
	h1 = new CreatAcount();
	
	
	
	
		

	}
	private void SecondPage() {
		new UserLogin02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//CreatAcount h1 =new CreatAcount();
		if(e.getSource()== btnEnter) {
			
			//System.out.println("çalışıyo mu" + h1.getTxtUserName().getText());
			if(txtUserNameCheck.getText().equals(h1.getTxtUserName().getText())&& (h1.getPswPassword().getText().equals(txtPasswordCheck.getText()))) {
				JOptionPane.showMessageDialog(this, "giriş başarılı", "Welcome again", JOptionPane.INFORMATION_MESSAGE);
				SecondPage();
				dispose();
				
			
			
			
				
			}
		else
			JOptionPane.showMessageDialog(this, "kullanıcı adı veya şifre hatalı", "MINESWEEPER", JOptionPane.WARNING_MESSAGE);
			
		
			
		}
		else if (e.getSource()== btnExit) {
			System.exit(1);
		}
	
	
		
	}
}
	



