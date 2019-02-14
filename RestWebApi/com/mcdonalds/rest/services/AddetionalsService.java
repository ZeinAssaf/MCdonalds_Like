package com.mcdonalds.rest.services;

import java.util.ArrayList;
import java.util.List;

import com.mcdonalds.rest.entities.Addetional;

public class AddetionalsService {
	private ArrayList<Addetional> addetioalsList = new ArrayList<>();

	public AddetionalsService() {
		addetioalsList.add(new Addetional(1, "Cheese"));
		addetioalsList.add(new Addetional(2, "Salad"));
		addetioalsList.add(new Addetional(3, "French fies"));
		addetioalsList.add(new Addetional(4, "ice cream"));
	}

	public List<Addetional> getAddetionls() {
		return addetioalsList;
	}

}
