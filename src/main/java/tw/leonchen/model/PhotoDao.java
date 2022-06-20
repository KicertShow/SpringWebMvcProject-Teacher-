package tw.leonchen.model;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


	

@Repository
@Transactional
public class PhotoDao {
	
	private SessionFactory sessionFactory;
	public Photo insert(Photo photo) {
		Session session = sessionFactory.openSession();
		if (photo!=null) {
			session.save(photo);
		}
		session.close();
		
		return photo;
	}
	
	
		
}
