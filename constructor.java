public class constractor {
   public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "tabrej";
        s1.age = 20;
        s1.rollNumber = 45;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);

    }
}
class Student {
    String name;
    int age;
    int rollNumber;

}
Student s1 = new Student();
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.rollNumber);
System.out.println(s1.college);
    }
}
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        name = "tabrej";
        age = 20;
        rollNumber = 45;
        college = "mit meerut";
    }
}
class Student{
String name;
int age;
int rollNumber;
String college;

// constructor
  Student() {
    name = "tabrej";
    age = 20;
    rollNumber = 7;
    college = "miet meerut";
}
public static void main(String[] args){
    Student s1 = new Student();
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.rollNumber);
System.out.println(s1.college);

}
    }

class Student {
    String name;
    int age;
    int rollNumber;
    String college;
    

Student() {
    name = "tabrej shaikh";
    age = 20;
    rollNumber = 121;
    college = "miet";
}
public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNumber);
    System.out.println(s1.college);

}
}

//parameterized constructor
class Student {
   
    String name;
    int age; 
    int rollNumber;
    String college;
    
 Student(String n, int a, int r, String c){
 name = n;
 age = a;
 rollNumber = r;
college = c;
}
     public static void main(String[] args) {
    Student s1 = new Student("tabrej",44,57,"miet");
    Student s2 = new Student("ram",4,24,"miet");
 System.out.println(s1.name);
        System.out.println(s1.age);
            System.out.println(s1.rollNumber);
                System.out.println(s1.college);
                        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNumber);
        System.out.println(s2.college);

}
}
