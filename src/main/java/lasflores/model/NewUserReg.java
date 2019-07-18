 package lasflores.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="customer")
public class NewUserReg 
{

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="userreg_generator")
	@SequenceGenerator(name="userreg_generator",sequenceName="userreg",allocationSize=1)
	@Column(name="id",updatable=false,nullable=false)
	private int id;
	
	@Column(name="firstname") 
	private String firstname;
	
	@Column(name="lastname") 
	private String lastname;
	
	//@Size(min=6)
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name= "phoneno")
	private String phoneno;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "addressLine1")
	private String addressLine1;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	 private String pincode;
	 


	

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	@Override
	public String toString() {
		return "NewUserReg [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", email=" + email + ", phoneno=" + phoneno + ", gender=" + gender + ", addressLine1=" + addressLine1
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	


}
