package lasflores.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="retailer")
public class Retailer 

{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="retailer_generator")
	@SequenceGenerator(name="retailer_generator",sequenceName="retailer_seq",allocationSize=1)
	@Column(name="rid",updatable=false,nullable=true)
	private int rid;
	
	@Column(name="rname") 
	private String rname;
	
	
	//@Size(min=6)
	@Column(name = "gender")
	private String gender;
	
	@Column(name ="email")
	private String email;
	
	@Column(name= "phoneno")
	private String phoneno;
	
	
	@Column(name="password")
	private String password;
	
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

	
	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getRname() {
		return rname;
	}


	public void setRname(String rname) {
		this.rname = rname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
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



	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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
		return "Retailer [rid=" + rid + ", rname=" + rname + ", gender=" + gender + ", email=" + email + ", phoneno="
				+ phoneno + ", password=" + password + ", addressLine1=" + addressLine1 + ", city=" + city + ", state="
				+ state + ", country=" + country + ", pincode=" + pincode + "]";
	}



}
