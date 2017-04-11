
public class Exhibit {
	
	//Data
	private Animals animalExhibited;
	
	public Exhibit(String animalInExhibit){
		
		//Creates the animal and sets the appropriate description and taunt
		this.animalExhibited = new Animals(animalInExhibit);
		this.animalExhibited.setAnimalDescription();
		this.animalExhibited.setAnimalTaunt();
	}
	
	public Animals getAnimalExhibited(){
		return this.animalExhibited;
	}
}