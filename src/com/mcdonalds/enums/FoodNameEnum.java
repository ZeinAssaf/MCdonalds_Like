package com.mcdonalds.enums;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FoodNameEnum {
	
	private String bigmac;
	@XmlRootElement
	public enum DrinkType {		
		SMOOTHIE("Smoothie"), COCACOLA("Coca cola"), FANTA("fanta"), ZERO("zero");
		private String name;
		private DrinkType(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	@XmlRootElement
	public enum MenuType {
		BIGMAC("bic mac"), BIGSHARE("big share"), HOTWINGS("Hot wings"), MCVEGAN("mcvegan");
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
		private MenuType(String name) {
			this.name=name();
		}

	}
	@XmlRootElement
	public enum BurgerType {
		CHEESE("Cheese"), HAM("ham"), BEEF("Beef"), MOZZARELLA("Mozzerella");
		
		private String name;
		private BurgerType(String name) {
			this.name=name();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

}
