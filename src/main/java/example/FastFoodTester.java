package example;

public class FastFoodTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SandwichSet order1 = new SandwichSet{
			new SandwichMenu("ハンバーガー"),
			new SoftDrink("コーラ",'M'),new Potato('S'));
		System.out.printf("注文セット１ -> %s%n",order1.getName());
		SandwichSet order2=new SandwichSet(
				new SandwichMenu("チーズバーガー"),
				new Coffee("1,2"),new SaLad("和風ドレッシング"));
		System.out.printf("注文セット2 -> %s%n",oder2.getName());




	}

}
