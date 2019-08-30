package example;

//プログラム3
public class SandwichMenu implements Order{
	private String name;
	SandwichMenu(String name){this.name = name;}
	public String getName() {return name;}
	}

public abstract interface SideMenu extends Order {
		private String name;
		SideMneu(String name){this.name = name;}
		public String getname() {return name;}
	}
public abstract class DrinkMenu /**/{
	private String name;
	DrinkMenu(String name){this.name = name;}
	public String getName() {return name;}
}

