package sogang.ip.ex.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="account")
public class Account {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy. MM. dd HH:mm:ss");
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String username;
	
	private String password;

	private String lastName;
	
	private String firstName;
	
	private Calendar date;

	public Account() {
		super();
	}
	
	public Account(String username, String password, String lastName, String firstName) {
		super();
		this.username = username;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.date = Calendar.getInstance();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDate() {
		return date == null ? null : sdf.format(date.getTime());
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", lastName=" + lastName + ", firstName=" + firstName + ", date=" + date
				+ "]";
	}
}
