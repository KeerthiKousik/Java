class Car{
void start(){
System.out.println("Starts with a key");
}
}
class Audi extends Car{
void audiFeatures(){
System.out.println("Audi features ");
}
}
class Bmw extends Car{
void bmwFeatures(){
System.out.println("Bmw features");
}
}
class InheritanceDemo{
public static void main(String args[]){
Audi x=new Audi();
x.start();
x.audiFeatures();
Bmw y=new Bmw();
y.start();
y.bmwFeatures();
}
}