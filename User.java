import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	private String Name,Surname,email,userName;
	
	

	public User(String Name, String Surname, String email, String userName) {
		//super();
		this.Name = Name;
		this.Surname = Surname;
		this.email = email;
		this.userName = userName;
	}
	
	


	public String getName() {
		return Name;
	}





	public void setName(String name) {
		Name = name;
	}




	public String getSurname() {
		return Surname;
	}




	public void setSurname(String surname) {
		Surname = surname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}

   //FileOutputStream fileStream = new FileOutputStream(String file);
	//ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
  
	
	
}
