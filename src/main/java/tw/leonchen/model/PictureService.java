package tw.leonchen.model;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class PictureService {
	@Autowired
	private PictureDao pDao;
	
	public Picture insert(Picture p) {
		return pDao.insert(p);
	}
}
