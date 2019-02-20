package com.mcdonalds.rest.services;

import java.util.List;
import com.mcdonalds.database.AddetionalsDao;
import com.mcdonalds.rest.models.Addetional;

public class AddetionalsService {
	private AddetionalsDao addetionalsDao = new AddetionalsDao();

	public AddetionalsService() {
	}

	public List<Addetional> getAddetionls() {
		return addetionalsDao.getItems();
	}

	public Addetional getAddetionlsById(int id) {
		return addetionalsDao.getItemById(id);
	}

	public void addAddetional(Addetional addetional) {
		addetionalsDao.saveItem(addetional);
	}

	public void deleteAddetional(int id) {
		addetionalsDao.deleteItem(id);
	}

}
