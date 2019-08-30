package example;

public class SandwichSet {
	private Order[] items;
	SandwichSet(SandwichMenu item0,DrinkMenu item1,SideMenu item2){
		items = new Order[] {item0,item1,item2};

	}
	public String getName(); {
		return items[0].getName() + " / "
			+  items[1].getName() + " / "
			+  items[2].getName();
	}

}







