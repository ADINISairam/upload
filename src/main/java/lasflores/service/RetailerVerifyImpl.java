package lasflores.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 

import lasflores.model.RetailerVer;
import lasflores.dao.RetailerDAO;


@Service
public class RetailerVerifyImpl implements RetailerVerify {
	@Autowired
	private RetailerDAO RetailerDAO;

	public RetailerVer checkRetailer(RetailerVer theRetaileVer) {
		// TODO Auto-generated method stub
		return RetailerDAO.checkRetailer(theRetaileVer);
	}

}
