public class instancevariable {
   public String studentName;
   public int age;
    public instancevariable(){
        this.studentName="adarsh";
        this.age=23;

    }
    public static void main(String args[]){
        instancevariable student = new instancevariable();
  
    System.out.println("student name is:"+student.studentName);
    System.out.println("and age is :"+student.age);

    }

}