package lasflores.service;

import java.util.List;

import lasflores.model.NewUserReg;
import lasflores.model.Retailer;

public interface RetailerRegService 
{
public void saveRetailer(Retailer theRetailer);
	
	public Retailer getRetailerReg(int theId);
	
	public List<Retailer>getRetailerReg();
}
