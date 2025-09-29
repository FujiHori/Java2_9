
public class Exp9_PetShop {

	public static void main(String[] args) {

		Exp9_CatState cat1 = new Exp9_CatState();

		cat1.kinds = "三毛猫";
		cat1.age = 1;
		cat1.weight = 4;
		cat1.bloodType = 'A';
		cat1.pedigree = false;
		
		System.out.println("種類：" + cat1.kinds
				+ "\n年齢：" + cat1.age
				+ "\n体重：" + cat1.weight
				+ "\n血液型：" + cat1.bloodType
				+ "\n血統書の有無：" +cat1.pedigree
		);
		
		Exp9_CatState cat2 = new Exp9_CatState();
		
		cat2.kinds = "ペルシャ猫";
		cat2.age = 3;
		cat2.weight = 6;
		cat2.bloodType = 'B';
		cat2.pedigree = true;
		
		System.out.println("\n種類：" + cat2.kinds
				+ "\n年齢：" + cat2.age
				+ "\n体重：" + cat2.weight
				+ "\n血液型：" + cat2.bloodType
				+ "\n血統書の有無：" +cat2.pedigree
				);
		
		
		Exp9_OoperLooper upa = new Exp9_OoperLooper();

		upa.kind = "アルビノ";
		upa.age = 2;
		
		System.out.println("\n種類：" + upa.kind
				+ "\n年齢：" + upa.age);
		
	}

}
