package lasflores.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lasflores.dao.RetailerRegDAO;
import lasflores.model.Retailer;

@Service
public class RetailerRegServiceImpl implements RetailerRegService {
	
	@Autowired
	private RetailerRegDAO retailerregDAO;
	
	@Transactional
	public void saveRetailer(Retailer theRetailer) {
		retailerregDAO.saveRetailer(theRetailer);
		// TODO Auto-generated method stub

	}
	
	@Transactional
	public Retailer getRetailerReg(int theId) {
		// TODO Auto-generated method stub
		return retailerregDAO.getRetailerReg(theId);
	}

	@Transactional
	public List<Retailer> getRetailerReg() {
		// TODO Auto-generated method stub
		 return retailerregDAO.getRetailerReg();
	}

}
