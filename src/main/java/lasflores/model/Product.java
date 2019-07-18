package lasflores.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product 

{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="product_generator")
	@SequenceGenerator(name="product_generator",sequenceName="product_seq",allocationSize=1)
	@Column(name="pid",updatable=false,nullable=true)
	private int pid;
	
	@Column(name="ptype")
	private String ptype;
	
	
	@Column(name ="pname")
	private String pname;
	
	@Column(name = "brand")
	private String brand;
		
	@Column(name="description")
	private String description;
	
	@Column(name = "price")
	private int price;
	
	@Column(name="stock")
	private int stock;
		
	@Column(name ="images")
	private Blob image;
	
	
}
