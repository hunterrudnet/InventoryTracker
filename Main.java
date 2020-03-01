import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<Inventory> inv = new ArrayList<Inventory>();
		Inventory prod1 = new Inventory("Royal 1", 9, true, "Jordan", false, true);
		inv.add(prod1); //Stopped here!
		addToList(inv);
		System.out.println(inv);
		findProduct(inv);
		changeValue(inv);
	}
	public static void addToList(ArrayList<Inventory> arrListPass)
	{
		int con = 1;
		while(con == 1) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter name of shoe: ");
			String shoe = (scan.nextLine());
			
			System.out.println("Enter size: ");
			double size = (scan.nextDouble());
			
			System.out.println("Enter condition (true for deadstock): ");
			boolean deadstock = (scan.nextBoolean());
			
			System.out.println("Enter brand name: ");
			String brand = (scan.nextLine() + scan.nextLine());
			
			System.out.println("Listed on goat (true for yes): ");
			boolean goat = (scan.nextBoolean());
			
			System.out.println("Listed on stockx (true for yes): ");
			boolean stockx = (scan.nextBoolean());
			
			Inventory object = new Inventory(shoe, size, deadstock, brand, goat, stockx); 
			arrListPass.add(object);
			System.out.println("Would you like to add another product? (1 for Y, 0 for N)");
			con = (scan.nextInt());
		}
	}
	public static void findProduct(ArrayList<Inventory> arrList)
	{
		int con = 1;
		while(con == 1) {
			int counter = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your method of search | ProdName(0) Size(1) Deadstock(2) Brand(3) Goat(4) Stockx(5) :");
			int answer = scan.nextInt();
			switch(answer) {
			case 0:
				System.out.println("Enter the Product you are searching for: ");
				String prod = scan.nextLine() + scan.nextLine();
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getName().equals(prod)) { 
						System.out.println(arrList.get(i));
						counter ++;
					}
				}
				if (counter == 0)
				{
						System.out.println("Value is not in list");
				}
				System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
				con = (scan.nextInt()); 
				break;
			case 1:
				System.out.println("Enter the size you are searching for: ");
				double size = scan.nextDouble();
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getSize() == (size)) { 
						System.out.println(arrList.get(i));
						counter ++;
					}
				}
				if (counter == 0) 
				{
						System.out.println("Value is not in list");
					}
				System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
				con = (scan.nextInt()); 
				break;
			case 2:
				System.out.println("Enter 'true' for deadstock or 'false' for used ");
				boolean condition = scan.nextBoolean();				
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getCondition() == condition) { 
						System.out.println(arrList.get(i));
						counter ++;	
						}
					}
					if (counter == 0)
					{
							System.out.println("Value is not in list");
					}
					System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
					con = (scan.nextInt()); 
					break;
			case 3:
				System.out.println("Enter the brand name of the product you want to search for: ");
				String brand = scan.nextLine();				
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getBrand().equals(brand)) { 
						System.out.println(arrList.get(i));
						counter ++;	
						}
					}
					if (counter == 0)
					{
							System.out.println("Value is not in list");
					}
					System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
					con = (scan.nextInt()); 
					break;
			case 4:
				System.out.println("Enter 'true' for goatListings or 'false' for not listed ");
				boolean goat = scan.nextBoolean();				
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getCondition() == goat) { 
						System.out.println(arrList.get(i));
						counter ++;	
						}
					}
					if (counter == 0)
					{
							System.out.println("Value is not in list");
					}
					System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
					con = (scan.nextInt()); 
					break;	
			case 5:
				System.out.println("Enter 'true' for stockX listings or 'false' for not listed ");
				boolean stockx = scan.nextBoolean();				
				for(int i = 0; i < arrList.size(); i++) {
					if(arrList.get(i).getCondition() == stockx) { 
						System.out.println(arrList.get(i));
						counter ++;	
						}
					}
					if (counter == 0)
					{
							System.out.println("Value is not in list");
					}
					System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
					con = (scan.nextInt()); 
					break;
			}
		}
	}
	public static void changeValue(ArrayList<Inventory> arrList)
	{
		int con = 1;
		while (con == 1) {
		System.out.println(arrList.get(0)); // For now it only has the ability to mutate the first object, I will update this in the future
		System.out.println("Which value would you like to change| ProdName(0) Size(1) Deadstock(2) Brand(3) Goat(4) Stockx(5) ");
		System.out.println("Enter 6 to change nothing...");
		Scanner scan = new Scanner (System.in);
		int change = scan.nextInt();
		switch (change) {
		case 0:
			System.out.println("Enter the new value: ");
			String prod = scan.nextLine() + scan.nextLine();
			arrList.get(0).setName(prod);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 1:
			System.out.println("Enter the new value: ");
			double size = scan.nextDouble();
			arrList.get(0).setSize(size);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 2:
			System.out.println("Enter the new value: ");
			boolean deadstock = scan.nextBoolean();
			arrList.get(0).setProductCondition(deadstock);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 3:
			System.out.println("Enter the new value: ");
			String brand = scan.nextLine() + scan.nextLine();
			arrList.get(0).setProductBrand(brand);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 4: 
			System.out.println("Enter the new value: ");
			boolean goat = scan.nextBoolean();
			arrList.get(0).setListedGoat(goat);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 5: 
			System.out.println("Enter the new value: ");
			boolean stockx = scan.nextBoolean();
			arrList.get(0).setListedStockx(stockx);
			System.out.println(arrList.get(0));
			System.out.println("Would you like to search for something else? (1 for Y, 0 for N)");
			con = (scan.nextInt()); 
			break;
		case 6:
			System.out.println(arrList.get(0));
			break;
		}
		}
	}
}
