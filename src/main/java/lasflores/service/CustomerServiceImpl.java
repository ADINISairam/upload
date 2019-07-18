package lasflores.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lasflores.model.User;
import lasflores.dao.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO CustomerDAO;
	
	@Transactional
	public User checkUser(User theUser) {
		// TODO Auto-generated method stub
	
			return CustomerDAO.checkUser(theUser);

	}

}
