
public class Guest {
	
	//Data
	private String guestName;
	private int[] guestPosition = new int[2];
	
	//Constructs a new Guest with the specified name and a location at the "entrance" to the zoo
	public Guest(String name){
		this.guestName = name;
		
		//Index zero holds X values
		this.guestPosition[0] = 0;
		//Index 1 holds y values
		this.guestPosition[1] = 0;
	}
	
	//Spits out a not really that random line from a poem (only 5 options) because why not
	public String poemGenerator(){
		double pGen = Math.random();
		
		if(pGen >= 0 && pGen < .20){
			return "Maggie and Millie and Molly and May" + "\n" + "Went down to the sea to play one day." + "\n";
		}
		if(pGen >= .20 && pGen < .40){
			return "I saw the best minds of my generation destroyed by madness, starving hysterical naked," + "\n";
		}
		if(pGen >= .40 && pGen < .60){
			return "My friend, you would not tell with such high zest" + "\n" + "To children ardentfor some desperate "
					+ "glory," + "\n" + "The old Lie; Dulce et Decorum est" + "\n" + "Pro patria mori." + "\n";
		}
		if(pGen >= .60 && pGen < .80){
			return "It was many and many a year ago," + "\n" + "In a kingdom by the sea," + "\n" + "That a maiden there "
					+ "lived whom you may know" + "\n" + "By the name of Annabel Lee" + "\n";
		}
		//Math.random() only returns values between 0 and 1 so this covers the last .2
		else{
			return "'mother nature's a whore', said the shotgun to the head." + "\n" + "and it smelled like teen spirit"
					+ "\n" + "angst driven insecure" + "\n" + "a country in puberty" + "\n" + "a country at war." + "\n";
		}
	}
	
	public String getGuestName(){
		return this.guestName;
	}
	
	public int getGuestPositionX(){
		return this.guestPosition[0];
	}
	
	public int getGuestPositionY(){
		return this.guestPosition[1];
	}
	
	public int[] moveGuest(String direction){
		
		//Increases Y position value by one if direction input is forward
		if(direction.equals("F") && this.guestPosition[1] < 2){
			this.guestPosition[1] += 1;
			return this.guestPosition;
		}
		//Decreases Y position value by one if direction input is back
		else if(direction.equals("B") && this.guestPosition[1] > 0){
			this.guestPosition[1] -= 1;
			return this.guestPosition;
		}
		//Increases X position value by one if direction input is left
		else if(direction.equals("L") && this.guestPosition[0] > 0){
			this.guestPosition[0] -= 1;
			return this.guestPosition;
		}
		//Decreases X position value by one if direction input is right
		else if(direction.equals("R") && this.guestPosition[0] < 2){
			this.guestPosition[0] += 1;
			return this.guestPosition;
		}
		else{
			int[] empty = {0,0};
			return empty;
			
		}
	}
}