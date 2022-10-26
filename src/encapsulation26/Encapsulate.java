package encapsulation26;

public class Encapsulate {

    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable
    public String getName() {
        return name;
    }

    //set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }

    //get method for roll to access private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for roll to access private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //get method for age to access private variable age
    public int getAge() {
        return age;
    }

    //set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }

    public class TestEncapsulation {

        public void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            //setting value of the variables
            obj.setName("Amit");
            obj.setAge(19);
            obj.setRollNo(51);
            //Displaying values of the variables
            System.out.println("Prime's name : " + obj.getName());
            System.out.println("Prime's age: :" + obj.getAge());
            System.out.println("Pirme's rollNo: " + obj.getRollNo());
            //Direct access of rollNo is not possible to encapsulation

        }
    }
}
