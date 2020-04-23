class University{
void listOfColleges(){
System.out.println("1.CBIT 2.MGIT 3.TKR 4.CMR 5.KITS");
}
void selectColleges(int clgcode1,int clgcode2){
System.out.println("Selected college code is "+clgcode1+" and "+clgcode2);
}
int seatAlloted(){
return 4;
}
String payFees(int fees){
System.out.println("Fees give is"+fees);
return "Confirmed";
}
}
class Student{
public static void main(String args[]){
University shiva=new University();
shiva.listOfColleges();
shiva.selectColleges(2,4);
System.out.println("Seat Alloted in "+shiva.seatAlloted());
System.out.println("Seat "+shiva.payFees(20000));
}
}
