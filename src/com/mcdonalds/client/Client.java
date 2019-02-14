package com.mcdonalds.client;

import com.mcdonalds.additionals.FrenchFries;
import com.mcdonalds.additionals.Cheese;
import com.mcdonalds.additionals.Salad;
import java.util.Scanner;
import com.mcdonalds.enums.FactoryType;
import com.mcdonalds.enums.FoodNameEnum;
import com.mcdonalds.factories.FactorySelector;
import com.mcdonalds.interfaces.Extras;
import com.mcdonalds.interfaces.Factory;
import com.mcdonalds.interfaces.Meal;

public class Client {
	static Scanner scanner;

	public static void main(String[] args) throws InterruptedException {
		FactorySelector selector= new FactorySelector();
		Factory factory=null;
		Meal meal=null;
		
		
		while (true) {
			System.out.println("\nWhat do you want to have\n1. Menu\n2. Burger\n3. Drink");
			String input= input();
			
			
			switch (input) {
			case "1":
				factory=selector.factoryChosen(FactoryType.MENUFACTORY);
				System.out.println("Please choose one of the menus below\n1. Bic Mac\n2. Big Share\n3. Hot Wings\n4. McVegan");
				String input1=input();
				switch (input1) {
				case "1":
					meal=factory.getMenu(FoodNameEnum.MenuType.BIGMAC);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "2":
					meal=factory.getMenu(FoodNameEnum.MenuType.BIGSHARE);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "3":
					meal=factory.getMenu(FoodNameEnum.MenuType.HOTWINGS);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "4":
					meal=factory.getMenu(FoodNameEnum.MenuType.MCVEGAN);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				default:
					System.out.println("please enter one of the above");
					break;
				}
			
				break;
			case "2":
				factory=selector.factoryChosen(FactoryType.BURGERFACTORY);
				System.out.println(factory.name());
				System.out.println("Please choose one of the burgers below \n1. Beef\n2. Chees\n3. Ham\n4. Mozzarella");
				String input2=input();
				switch (input2) {
				case "1":
					meal=factory.getBurger(FoodNameEnum.BurgerType.BEEF);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "2":
					meal=factory.getBurger(FoodNameEnum.BurgerType.CHEESE);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "3":
					meal=factory.getBurger(FoodNameEnum.BurgerType.HAM);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "4":
					meal=factory.getBurger(FoodNameEnum.BurgerType.MOZZARELLA);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				default:
					System.out.println("please enter one of the above");
					break;
				}
				break;
			case "3":
				factory=selector.factoryChosen(FactoryType.DRINKFACTORY);
				System.out.println(factory.name());
				System.out.println("Please choose one of the drinks below\n1. Coke\n2. Cocacola Zero\n3. Fanta\n4. Smoothie");
				String input3=input();
				switch (input3) {
				case "1":
					meal= factory.getDrink(FoodNameEnum.DrinkType.COCACOLA);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "2":
					meal= factory.getDrink(FoodNameEnum.DrinkType.ZERO);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "3":
					meal= factory.getDrink(FoodNameEnum.DrinkType.FANTA);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;
				case "4":
					meal= factory.getDrink(FoodNameEnum.DrinkType.SMOOTHIE);
					addAdditionals(meal);
					Thread.sleep(2000);
					break;

				default:
					System.out.println("Please enter one of the option above");
					break;
				}
				
				break;

			default:
				System.out.println("Please enter one of the option above");
				break;
			}
		}
		
	}

	public static String input() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		return input;
	}

	public static void addAdditionals(Meal meal) {
		Extras extras = null;
		int price;
		System.out.println("Do you want any additionals \ny/n");
		String input = input();
		if (input.equalsIgnoreCase("y") |input.equals("yes")) {
			System.out.println("Choose one of the following:\n1. Cheese\n2. French Fries\n3. Salad");
			String input1 = input();
			switch (input1) {
			case "1":
				extras = new Cheese();
				System.out.println("The price is " + extras.getPrice(meal));
				break;
			case "2":
				extras = new FrenchFries();
				System.out.println("The price is " + extras.getPrice(meal));
				break;
			case "3":
				extras = new Salad();
				System.out.println("The price is " + extras.getPrice(meal) + "\nenjoy your meal");
				break;
			default:
				System.out.println("Please choose one of the above");
				break;
			}
		} else {
			System.out.println("the price is "+meal.getPrice()+"\nThank you! enjoy your meal!!!!!!!!!!!!");
		}
	}

}
