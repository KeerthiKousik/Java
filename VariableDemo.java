class Student{
int id;
double per;
static String clg;
}
class Employee{
int empid;
static String company_name;
int salary;
}
class VariableDemo{
public static void main(String args[]){
Student rahul=new Student();
System.out.println(rahul.id);
System.out.println(rahul.per);
System.out.println(Student.clg);
Employee shiva=new Employee();
shiva.empid=1024;
shiva.salary=54000;
Employee.company_name="Infosys";
System.out.println("Employee id="+shiva.empid);
System.out.println("Employee salary="+shiva.salary);
System.out.println("Employee name="+Employee.company_name);

}
}







