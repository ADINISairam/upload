package lasflores.dao;

import java.util.List;

import lasflores.model.Retailer;



public interface RetailerRegDAO
{
public void saveRetailer(Retailer theRetailer);
	
	public List<Retailer>getRetailerReg();
	
	public Retailer getRetailerReg(int theId);
	
	//public void deleteRetailer(int theId);
	
}
