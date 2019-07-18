package lasflores.dao;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lasflores.model.RetailerVer;


@Repository
@Transactional
public class RetailerDAOImpl implements RetailerDAO {
	
	@Autowired
	 SessionFactory sessionFactory;

	@Transactional
	public RetailerVer checkRetailer(RetailerVer theRetaileVer) {
		// TODO Auto-generated method stub
		RetailerVer retail = null;
		Session session=null;
		
		try {
			 session = sessionFactory.getCurrentSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<RetailerVer> cq = cb.createQuery(RetailerVer.class);
			Root<RetailerVer> root = cq.from(RetailerVer.class);
			
			//cq.select(root.get("id"));
			cq.select(root).where(cb.and(
					cb.equal(root.get("email"), theRetaileVer.getEmail()),
					cb.equal(root.get("password"),theRetaileVer.getPassword())
				));
			
			Query query = session.createQuery(cq);
			query.setMaxResults(1);
			retail=(RetailerVer)query.getSingleResult();
			
			} catch (HibernateException  e) {
				e.printStackTrace();
			} finally {
				if (session != null) {
					//session.close();
				}
			}
			
			return retail;
		}

}
