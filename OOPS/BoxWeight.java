package OOPS; 

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double l, double h, double b, double weight) {
        super(l, h, b);//call the parent class constructor Box(double l,double b,double h)
        //used to initialize values present in parent class
        this.weight = weight;
    }

    public BoxWeight() {
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other){
        super(other);//have access to Box(Box old);
        weight=other.weight;
    }
    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

}
//every class refer to Object class//every class inherit object class
