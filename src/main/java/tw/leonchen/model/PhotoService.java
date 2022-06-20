package tw.leonchen.model;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class PhotoService {
	
	private PhotoDao pDao;
	public Photo insert(Photo photo) {
		pDao.insert(photo);
		return photo;
	}
	
}
