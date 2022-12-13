import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreatAcount extends JFrame implements ActionListener{
	 private JButton btnCreate,btnExit ;
	 private JLabel lblName,lblSurName,lblEmail,lblPassword,lblUserName;
	 private JTextField txtName,txtSurname,txtEmail,txtUserName;
	 private String a;
	 public JPasswordField pswPassword ;
	 public ArrayList<User> u1;
	 public User user;

	 public CreatAcount() {
		 
		 setLayout(new GridLayout(0,2));
		 // LABEL
		 lblName = new JLabel("NAME:");
		 //lblName.setOpaque(true);
		 //lblName.setForeground(Color.green);
		 lblSurName = new JLabel("SURNAME: ");
		 //lblSurName.setOpaque(true);
		 //lblSurName.setBackground(Color.LIGHT_GRAY);
		 lblEmail = new JLabel("EMAİL:");
		 lblPassword = new JLabel("PASSWORD:");
		 lblUserName = new JLabel("USER NAME: ");
		 // BUTTONS
		 btnCreate = new JButton("ENTER");
		 btnCreate.setOpaque(true);
		 btnCreate.setForeground(Color.black);
		 btnCreate.setBackground(Color.green);
		 btnExit = new JButton("EXIT");
		 btnExit.setOpaque(true);
		 btnExit.setForeground(Color.black);
		 btnExit.setBackground(Color.red);
	 
		 //TEXTFİELD
		 txtName = new JTextField();
		 txtSurname = new JTextField();
		
	     txtEmail = new JTextField();
		 txtUserName =new JTextField();
		 //password
		 	pswPassword=new JPasswordField();
		    pswPassword.setEchoChar('*');
			pswPassword.setSize(100, 30);
			pswPassword.setLocation(450, 70);
			
		 
		 
		 add(lblName);
		 add(txtName);
		 add(lblSurName);
		 add(txtSurname);
		 add(lblEmail);
		 add(txtEmail);
		 add(lblPassword);
		 add(pswPassword);
		 add(lblUserName);
		 add(txtUserName);
		 add(btnCreate);
		 add(btnExit);
		 
		 
		 btnCreate.addActionListener(this);
		 btnExit.addActionListener(this);
		 
		 
		 
		 setSize(500,300);
		 setVisible(true);
		 setTitle("MINESWEEPER");
		 setResizable(true);
		 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		 getContentPane().setBackground(new Color(0.8f,0.2f,0.4f,0.5f));
		 
	 }
	
	public static void main(String[] args) {
		 new CreatAcount();

 
	}


	
	@Override
	public void actionPerformed(ActionEvent e) {
		a =String.valueOf(pswPassword.getText());
		int length = a.length();
		if(e.getSource()==btnCreate) {
			
			if(length<6||length>10) {
			 JOptionPane.showMessageDialog(this, "Please write the password again.it must be between 6 to 10.","PASSWORD",JOptionPane.ERROR_MESSAGE);
			 System.exit(1);
			
			}
			
			 if(txtName.getText().equals("")||txtSurname.getText().equals("")||txtEmail.getText().equals("")||txtUserName.getText().equals("")||pswPassword.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "please write the all informations","ERROR MESAGE",JOptionPane.ERROR_MESSAGE);
			}
			 else {
			
				Submit();
				setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				FirstPage();
				
				
				
			}
		}
		if(e.getSource()==btnExit) {
			int s= (int) JOptionPane.showConfirmDialog(this, 
					"Do you wanna exit from the system?", "MINESWEEPER", JOptionPane.YES_NO_OPTION);
			if(s == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this, "Failed to create record");
			System.exit(1);
		}
		}
		
		
		
	}
	private void Submit() {
		
	 JOptionPane.showMessageDialog(this, "Your registration has been created","MINESWEEPER",JOptionPane.INFORMATION_MESSAGE);
	 JOptionPane.showMessageDialog(this,txtName.getText()+ "\nWelcome to the Minesweeper  ","MINESWEEPER",JOptionPane.INFORMATION_MESSAGE);
	 
	 user = new User(txtName.getText(),txtSurname.getText(),txtEmail.getText(),txtUserName.getText());
	 u1 = new ArrayList<User> ();
	 u1.add(user);
	 Add();
	
		
	}
	private void FirstPage() {
		new UserLogin(user);
		dispose();
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public void setTxtName(JTextField txtName) {
		this.txtName = txtName;
	}

	public JTextField getTxtSurname() {
		return txtSurname;
	}

	public void setTxtSurname(JTextField txtSurname) {
		this.txtSurname = txtSurname;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(JTextField txtUserName) {
		this.txtUserName = txtUserName;
	}

	public JPasswordField getPswPassword() {
		return pswPassword;
	}

	public void setPswPassword(JPasswordField pswPassword) {
		this.pswPassword = pswPassword;
	}
	
	public void Add() {
		try {
	           
            FileOutputStream file = new FileOutputStream("Users.ser");
            ObjectOutputStream write = new ObjectOutputStream(file);
            write.writeObject(u1);
            write.close();
        } catch (Exception e) {
            System.out.println("heyyo");
        }

	}
	
	
	
	}
	
	


