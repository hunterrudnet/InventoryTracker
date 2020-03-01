
public class Inventory {
	private String productName;
	private double productSize;
	private boolean productCondition; 
	private String productBrand;
	private boolean listedGoat;
	private boolean listedStockx;
	
	public Inventory(String productName, double productSize, boolean productCondition, String productBrand, boolean listedGoat, boolean listedStockx)
	{
		this.productName = productName;
		this.productSize = productSize;
		this.productCondition = productCondition;
		this.productBrand = productBrand;
		this.listedGoat = listedGoat;
		this.listedStockx = listedStockx;
	}
	public String getName()
	{
		return productName;
	}
	public double getSize()
	{
		return productSize;
	}
	public boolean getCondition()
	{
		return productCondition;
	}
	public String getBrand()
	{
		return productBrand;
	}
	public boolean getListedGoat()
	{
		return listedGoat;
	}
	public boolean getListedStockx()
	{
		return listedStockx;
	}
	public void setName(String productName)
	{
	    this.productName = productName;
	}
	public void setSize(double productSize)
	{
	    this.productSize = productSize;
	}
	public void setProductCondition(boolean productCondition)
	{
	    this.productCondition = productCondition;
	}
	public void setProductBrand(String productBrand)
	{
	    this.productBrand = productBrand;
	}
	public void setListedGoat(boolean listedGoat)
	{
	    this.listedGoat = listedGoat;
	}
	public void setListedStockx(boolean listedStockx)
	{
	    this.listedStockx = listedStockx;
	}
	public String toString()
	{
		String a = "The product is: " + productName;
		String b = "The size is: " + productSize;
		String c, e, f = "";
		if (this.productCondition == true) {
			 c = "The product is new";
		} else {
			 c = "The product is used";
		}
		String d = "The brand is: " + productBrand;
		if (this.listedGoat == true) {
			 e = "The product is listed on GOAT";
		} else
		{
			 e = "The product is not listed on GOAT";
		}
		if (this.listedStockx == true) {
			 f = "The product is listed on StockX";
		} else {
			 f = "The product is not listed on StockX";
		}
		return (a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n");
	}
}
