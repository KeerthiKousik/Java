class Mobile{
void cost(){
System.out.println("No cost");
}
void ram(){
System.out.println("No ram");
}
}
class Nokia extends Mobile{
void cost(){
System.out.println("Nokia cost starts from 8000");
}
void ram(){
System.out.println("Nokia ram starts from 2gb");
}
}
class Iphone extends Mobile{
void cost(){
System.out.println("Iphone cost starts from 60k");
}
void ram(){
System.out.println("Iphone ram starts from 1gb");
}

}
class ExampleOverriding{
public static void main(String args[]){
Mobile m=new Mobile();
m.cost();
m.ram();
m=new Nokia();
m.cost();
m.ram();
m=new Iphone();
m.cost();
m.ram();
}
}


