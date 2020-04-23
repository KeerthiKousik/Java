class Restuarant{
void menu(){
System.out.println("1.Statters 2.Main Course 3.Chinese 4.Desert");
}
void takeOrder(String order)
{
System.out.println("Order given is "+order);
}
String serveFood(){
return "Desert";
}
String payBill(int amount){
System.out.println("Amount given is "+amount);
return "paid";
}

}
public class Customer{
public static void main(String args[]){
Restuarant ohris=new Restuarant();
ohris.menu();
ohris.takeOrder("Desert");
System.out.println("Food served is "+ohris.serveFood());
System.out.println("Bill "+ohris.payBill(456));
}
}
