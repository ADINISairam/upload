package lasflores.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lasflores.model.NewUserReg;
import lasflores.model.Retailer;


@Repository
public class RetailerRegDAOImpl implements RetailerRegDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveRetailer(Retailer theRetailer) {
		// TODO Auto-generated method stub
				Session currentSession=sessionFactory.getCurrentSession();
				currentSession.saveOrUpdate(theRetailer);
	}

	public List<Retailer> getRetailerReg() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb= session.getCriteriaBuilder();
		CriteriaQuery<Retailer> cq=cb.createQuery(Retailer.class);
		Root<Retailer>root =cq.from(Retailer.class);
		cq.select(root);
		Query query= session.createQuery(cq);
		return query.getResultList();
	}

	public Retailer getRetailerReg(int theId) {
		// TODO Auto-generated method stub
		Session currentSession= sessionFactory.getCurrentSession();
		Retailer theRetailer=currentSession.get(Retailer.class,theId);
		return theRetailer;
	}

}
