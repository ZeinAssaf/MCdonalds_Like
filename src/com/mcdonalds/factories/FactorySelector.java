package com.mcdonalds.factories;

import com.mcdonalds.enums.FactoryType;
import com.mcdonalds.interfaces.Factory;

public class FactorySelector {
	Factory factory=null;
	public Factory factoryChosen(FactoryType type) {
		switch (type) {
		case DRINKFACTORY:
			return factory= new DrinkFactory();
		case BURGERFACTORY:
			return factory= new BurgerFactory();
		case MENUFACTORY:
			return factory= new MenuFactory();
		}
		return factory;
	}

}
