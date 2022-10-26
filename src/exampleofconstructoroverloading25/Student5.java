package exampleofconstructoroverloading25;

//Java programe to overload constructor
public class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three args constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;

    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");//calling first constructor
        Student5 s2 = new Student5(222, "Aryan", 25);//calling seco d constructor
        s1.display();
        s2.display();
    }


}
