

package OOPS;
class Student1{
    //for every single student
    int rno;
    String name;
    float marks;
    //constructor
    Student1(int rno,String name,float marks){
       this.rno=rno;
       this.name=name;
       this.marks=marks;
    }
    //We need a way to add the values of the above properties object by object

    //We need one word to access every object
    // Student1(){
    //     this.rno=13;   //kanhaiya.rno
    //     this.name="Kanhaiya";   //kanhaiya.name
    //     this.marks=88.5f;   //kanhaiya.marks
    // }
    Student1(Student1 other){
        this.rno=other.rno;       //this=random other=kunal
        this.name=other.name;
        this.marks=other.marks;
    }

    void greeting(){
        System.out.println("My name is "+this.name);
    }
    void changeName(String Newname){
        this.name=Newname;
    }
}
public class Oops1 {
    public static void main(String[] args) {
        // Student1 kanhaiya=new Student1();
        Student1 kanhaiya=new Student1(13,"Kanhaiya",88.4f);
        Student1 random=new Student1(kanhaiya);
        // Student1 one=new Student1();
        // one.name="Hello";
        // Student1 two=one;
       

        // kanhaiya.rno=12;
        // kanhaiya.name="Kanhaiya Garg";
        // kanhaiya.marks=89;

        System.out.println(kanhaiya.rno);
        System.out.println(kanhaiya.name);
        System.out.println(kanhaiya.marks);
        kanhaiya.changeName("Kunal");
        kanhaiya.greeting();

        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
      
        // System.out.println(two.name);
    }
}
//void hello(int ... var)
//System.out.println(Arrays.toString(var));
//WrapperExample