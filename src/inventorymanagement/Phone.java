
package inventorymanagement;

public class Phone {
    String catagory,name;
    int id,quantity,Total_sell;
    double purchase_rate,sell_rate;
   
    public Phone(String catagory,String name,int id,int quantity, double purchase_rate,double sell_rate){
        this.catagory=catagory;
        this.name=name;
        this.id=id;
        this.purchase_rate=purchase_rate;
        this.sell_rate=sell_rate;
        this.quantity=quantity;
    }
  void print(){
      System.out.println("Phone element: ");
      System.out.println("catagory: "+catagory);
      System.out.println("name: "+name);
      System.out.println("id: "+id);
      System.out.println("quantity: "+quantity);
      System.out.println("purchase_rate: "+purchase_rate);
      System.out.println("sell_rate: "+sell_rate);
  }
  public String getName(){
    return name;
  }
  
  public String getCatagory(){
    return catagory;
  }
   public int getId(){
    return id;
  }
    public int getQuantity(){
    return quantity;
    }
    public double getPurchase_rate(){
    return purchase_rate;
    }
     
   public double getSell_rate(){
    return sell_rate;
   }
   
  public void sell(int x){
     
   
     this.quantity-=x;
      
    this.Total_sell+=x;
  }
  
}
