
public class Animals{
	
	private String nameOfAnimal;
	private String animalDescription;
	private String animalTaunt;
	
	public Animals(String animalName){
		this.nameOfAnimal = animalName;
	}
	
	//This method uses calls to the instance data
	public void setAnimalDescription(){
		if((this.nameOfAnimal).equalsIgnoreCase("elephant")){
			this.animalDescription = "The elephant is the world's largest living mammal.  African and Asian elephants both"
					+ " are known for their long trunks, large ears, and wrinkly grey skin.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("lion")){
			this.animalDescription = "If you ever saw The Lion King, you'll know that the lion is king of the animal world"
					+ " and is at the top of the food chain.  Lions are found mostly on the African Savannah.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("polar bear")){
			this.animalDescription = "The polar bear lives in the Arctic tundra and loves cold environments.  Its white fur"
					+ "helps it blend in with the snows of its home while it hunts for seals.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("seal")){
			this.animalDescription = "Seals stay warmas they glide through the arctic waters due to their thick coating of"
					+ "blubber.  They snack on fish and small aquatic animals.";
		}
		else if((this.nameOfAnimal).equals("penguin")){
			this.animalDescription = "Have you ever seen Happy Feet?  That's what penguins do.  I'm serious.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("meerkat")){
			this.animalDescription = "Again, The lion King is pretty accurate here.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("camel")){
			this.animalDescription = "Camels store fat in their humps, not water as many assume.  In addition, they are the"
					+ "only animal in the world to step with both legs on one side at the same time.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("rhino")){
			this.animalDescription = "They got a big horn";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("shark")){
			this.animalDescription = "We're gonna need a bigger boat";
		}
		else{
			this.animalDescription = "The " + (this.nameOfAnimal) + " is not at home right now.";
		}
	}
	
	public void setAnimalTaunt(){
		if((this.nameOfAnimal).equalsIgnoreCase("elephant")){
			this.animalTaunt = "The elephant trumpets and makes a rude elephant gesture at you.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("lion")){
			this.animalTaunt = "The lion roars at you and scratches the walls of its enclosure, scaring the shit out of"
					+ " you.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("polar bear")){
			this.animalTaunt = "The polar bear seems to hot and sweaty to care.  Poor guy.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("seal")){
			this.animalTaunt = "The seal jumps up out of the water and does a double backflip.  Now that's what you"
					+ " came here to see!";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("penguin")){
			this.animalTaunt = "The penguin flaps its wings at you, squawks, and splashes water.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("meerkat")){
			this.animalTaunt = "The meerkat is actively ignoring you.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("camel")){
			this.animalTaunt = "The camel honks and spits at you, right in your face.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("rhino")){
			this.animalTaunt = "The rhino charges you, smashing through the wall of the enclosure and killing"
					+ " you instantly.";
		}
		else if((this.nameOfAnimal).equalsIgnoreCase("shark")){
			this.animalTaunt = "The shark kills and eats like eight people and is cast as the lead role in the Steven"
					+ " Spielberg movie Jaws.";
		}
		else{
			this.animalTaunt = "The " + (this.nameOfAnimal) + " is not at home right now.";
		}
	}
	
	public String getAnimalDescription(){
		return this.animalDescription;
	}
	
	public String getAnimalTaunt(){
		return this.animalTaunt;
	}
	
	public String getAnimalName(){
		return this.nameOfAnimal;
	}
}