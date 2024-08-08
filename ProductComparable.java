package hash;
import java.util.*;
class Product implements Comparable<Product>{
	int pId;
	String pName;
	int pcost;
	
	Product(int pId,String pName,int pcost){
		this.pId=pId;
		this.pName=pName;
		this.pcost=pcost;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPcost() {
		return pcost;
	}

	public void setPcost(int pcost) {
		this.pcost = pcost;
	}

	@Override
	public int compareTo(Product o) {
		 if(this.pcost > o.pcost){
		        return 1;
		       }else if(this.pcost == o.pcost) {
		        return 0;
		       }else{
		        return -1;

		
	}
}
}

public class ProductComparable {

	public static void main(String[] args) {
		List<Product> product= new ArrayList<>();
        product.add(new Product(309, "Bycycle", 10000));
        product.add(new Product(107, "Helmet", 300000));
        product.add(new Product(208, "Car", 4000000));
        
        Collections.sort(product);
        product.forEach(n-> System.out.println(n.getpName()+" is of $ "+n.getPcost()));
        



	}

}
