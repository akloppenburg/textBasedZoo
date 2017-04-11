import java.util.Scanner;

public class Zoo {
	
	public static final int MOVE_FORWARD = 1;
	public static final int MOVE_BACK = 2;
	public static final int MOVE_LEFT = 3;
	public static final int MOVE_RIGHT = 4;
	public static final int OBSERVE_ANIMAL = 5;
	public static final int TAUNT_ANIMAL = 6;
	public static final int VIEW_MAP = 7;
	public static final int GUEST_POEM = 8;
	public static final int QUIT = 9;
	
	public static void main(String[] args){
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Creates "zoo" as a 3x3 array of Exhibits and populates it in an order I randomly chose with my 10 exhibits
		//First set of brackets is X coords, second is Y coords
		Exhibit[][] zoo = new Exhibit[3][3];
		populateZoo(zoo);
		
		//Creates you
		Guest you = new Guest("Alex Kloppenburg");
		
		//Priming Read
		System.out.println("You have just entered the OU Zoo.  You are next to the penguin exhibit."
				+ "  Please choose an option:");
		System.out.println("1. Walk forwards to the next exhibit.");
		System.out.println("2. Walk backwards to the next exhibit.");
		System.out.println("3. Walk left to the next exhibit.");
		System.out.println("4. Walk right to the next exhibit.");
		System.out.println("5. Read the plaque describing the exhibit next to you.");
		System.out.println("6. Taunt the animal in the exhibit next to you.");
		System.out.println("7. View your map of the zoo.");
		System.out.println("8. Quote poetry, because you're probably an English major or something weird.");
		System.out.println("9. Leave the zoo.");
		menuChoice(input, you, zoo);
		System.out.println("Thank you for visiting the OU Zoo!  Goodbye!");
	}

	
	public static String printZooMap(Exhibit[][] theZoo){
		
		String map = "";
		for(int i = 2; i >=0; --i){
			for(int j = 0; j <= 2; ++j){
				map += String.format("%-8s", ((theZoo[j][i].getAnimalExhibited()).getAnimalName())) + "  ";
			}
			map += "\n";
		}
		map += "\n";
		
		return map;
	}
	
	//Fill zoo with the 10 animals I created in 10 positions I chose randomly
	public static void populateZoo(Exhibit[][] theZoo){
		theZoo[1][1] = new Exhibit("elephant");
		theZoo[1][0] = new Exhibit("lion");
		theZoo[2][0] = new Exhibit("polar bear");
		theZoo[1][2] = new Exhibit("seal");
		theZoo[0][0] = new Exhibit("penguin");
		theZoo[2][2] = new Exhibit("meerkat");
		theZoo[0][2] = new Exhibit("camel");
		theZoo[0][1] = new Exhibit("rhino");
		theZoo[2][1] = new Exhibit("shark");
	}
	
	public static int menuChoice(Scanner input, Guest you, Exhibit[][] zoo){
		
		int choiceFromMenu = input.nextInt();
		
		while(choiceFromMenu != QUIT){
			
			if(choiceFromMenu == MOVE_FORWARD){
				you.moveGuest("F");
				if(you.getGuestPositionX() == 0 || you.getGuestPositionY() == 0){
					System.out.print("This is the edge of the zoo, you can't go any further.  ");
				}
			}
			else if(choiceFromMenu == MOVE_BACK){
				you.moveGuest("B");
				if(you.getGuestPositionX() == 0 || you.getGuestPositionY() == 0){
					System.out.print("This is the edge of the zoo, you can't go any further.  ");
				}
			}
			else if(choiceFromMenu == MOVE_LEFT){
				you.moveGuest("L");
				if(you.getGuestPositionX() == 0 || you.getGuestPositionY() == 0){
					System.out.print("This is the edge of the zoo, you can't go any further.  ");
				}
			}
			else if(choiceFromMenu == MOVE_RIGHT){
				you.moveGuest("R");
				if(you.getGuestPositionX() == 0 || you.getGuestPositionY() == 0){
					System.out.print("This is the edge of the zoo, you can't go any further.  ");
				}
			}
			else if(choiceFromMenu == OBSERVE_ANIMAL){
				Exhibit currentExhibit = zoo[you.getGuestPositionX()][you.getGuestPositionY()];
				Animals currentAnimal = currentExhibit.getAnimalExhibited();
				System.out.println("You are looking at the " + currentAnimal.getAnimalName() + " exhibit.");
				System.out.println(currentAnimal.getAnimalDescription() + "\n");
			}
			else if(choiceFromMenu == TAUNT_ANIMAL){
				Exhibit currentExhibit = zoo[you.getGuestPositionX()][you.getGuestPositionY()];
				Animals currentAnimal = currentExhibit.getAnimalExhibited();
				System.out.println("You yell at the " + currentAnimal.getAnimalName() + " and bang on the walls of its "
						+ "enclosure.  Then:");
				System.out.println(currentAnimal.getAnimalTaunt() + "\n");
			}
			else if(choiceFromMenu == VIEW_MAP){
				System.out.print(printZooMap(zoo));
			}
			else if(choiceFromMenu == GUEST_POEM){
				System.out.println(you.poemGenerator());
			}
			else{
				System.out.println("Please choose an option from the menu.");
			}
			Exhibit currentExhibit = zoo[you.getGuestPositionX()][you.getGuestPositionY()];
			Animals currentAnimal = currentExhibit.getAnimalExhibited();
			
			System.out.println("You are next to the " + currentAnimal.getAnimalName() + " exhibit."
					+ "  Please choose an option:");
			System.out.println("1. Walk forwards to the next exhibit.");
			System.out.println("2. Walk backwards to the next exhibit.");
			System.out.println("3. Walk left to the next exhibit.");
			System.out.println("4. Walk right to the next exhibit.");
			System.out.println("5. Read the plaque describing the exhibit next to you.");
			System.out.println("6. Taunt the animal in the exhibit next to you.");
			System.out.println("7. View your map of the zoo.");
			System.out.println("8. Quote poetry, because you're probably an English major or something weird.");
			System.out.println("9. Leave the zoo.");
			choiceFromMenu = input.nextInt();
		}
		return choiceFromMenu;
	}
}