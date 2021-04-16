public class Employee{
    public void name(){
    System.out.println("Name : Robert ");
    }
    
    public void yearOfJoining(){
    System.out.println("Year of joining : 1994"); 
    }
    
    public void salary(){
     System.out.println("Salary : 64 k per month");  
    }

    public void address(){
        System.out.println("Address :64C- WallsStreet Sam 2000 68D- WallsStreet John 1999 26B- WallsStreet");
    }
public static void main(String args[]){
  Employee obj=new Employee();
  obj.name();
  obj.yearOfJoining();
  obj.salary();
  obj.address();

}
}
