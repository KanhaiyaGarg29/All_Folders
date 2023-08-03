package OOPS;

public class Box {
    double l;
    double b;
    double h;

    Box(){
       // super(); Object class
        this.h=-1;
        this.b=-1;
        this.l=-1;
    }

    //cube
    Box(double side){
        this.b=side;
        this.h=side;
        this.l=side;
    }

    Box(double l,double h,double b){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.b=old.b;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
