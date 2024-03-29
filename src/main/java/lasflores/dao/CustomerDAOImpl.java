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

import lasflores.model.User;



@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	 
	@Autowired
	 SessionFactory sessionFactory;
	
		@Transactional
		public User checkUser(User theUser) {
			// TODO Auto-generated method stub
			User usr=null;
			Session session=null;
			try {
			 session = sessionFactory.getCurrentSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<User> cq = cb.createQuery(User.class);
			Root<User> root = cq.from(User.class);
			
			//cq.select(root.get("id"));
			cq.select(root).where(cb.and(
					cb.equal(root.get("email"), theUser.getEmail()),
					cb.equal(root.get("password"),theUser.getPassword())
				));
			
			Query query = session.createQuery(cq);
			query.setMaxResults(1);
			usr=(User) query.getSingleResult();
			
			} catch (HibernateException  e) {
				e.printStackTrace();
			} finally {
				if (session != null) {
					//session.close();
				}
			}
			
			return usr;
		}
}