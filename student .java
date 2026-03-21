import java.util.*;
class StudentInformation{
   String studentname;
   int age;
   String dob;
   String gender;
   String section;
   int year;
   String department;
   Long phoneNo;
StudentInformation(String a,int b,String c,String d,String e,int f,String g,Long h){
   this.studentname=a;
   this.age=b;
   this.dob=c;
   this.gender=d;
   this.section=e;
   this.year=f;
   this.department=g;
   this.phoneNo=h;
}
void display(){
   System.out.println("StudentName: " +studentname);
   System.out.println("Age: "+ age);
   System.out.println("DOB: " +dob);
   System.out.println("Gender: " +gender);
   System.out.println("Section: " +section);
   System.out.println("Year: " +year);
   System.out.println("Department: " +department);
   System.out.println("PhoneNumber: " +phoneNo);
}
}
public class Solution{
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of Students");
       int n=sc.nextInt();
       sc.nextLine();
       StudentInformation s[]=new StudentInformation[n];
       for(int i=0;i<n;i++){
          System.out.println("Enter the StudentName");
          String studentname=sc.nextLine();
          System.out.println("Enter the Age");
          int age=Integer.parseInt(sc.nextLine());
          System.out.println("Enter the DateofBirth");
          String dob=sc.nextLine();
          System.out.println("Enter the Gender");
          String gender=sc.nextLine();
          System.out.println("Enter the Section");
          String section=sc.nextLine();
          System.out.println("Enter the Year");
          int year=Integer.parseInt(sc.nextLine());
          System.out.println("Enter the Department");
          String department=sc.nextLine();
          System.out.println("Enter the PhoneNumber");
          Long phoneNo=Long.parseLong(sc.nextLine());
          s[i]=new StudentInformation(studentname,age,dob,gender,section,year,department,phoneNo);
      }
     System.out.println("Student Details");
     for(int i=0;i<n;i++){
         s[i].display();
     }
}
}
