public class Dog extends Animal{
	public Dog(String name, int legs){
		super(name, legs);
	}
	public String toString(){
		return name + " " + legs;
	}
}
