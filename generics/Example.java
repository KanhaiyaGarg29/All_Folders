package generics;
class BankAccount<T>{
    T t1;
    BankAccount(T t1){
        this.t1=t1;
    }
    public void display(){
        System.out.println(t1);
    }
    public <T> void depositMoney(T[] money){
        for(T i:money){
            System.out.println(i);
        }
    }
}
public class Example{
    public static void main(String[] args) {
        // BankAccount<String>b1=new BankAccount("HEllo");
        // BankAccount<Integer>b2=new BankAccount(34);
        // // b1.display();
        // // b2.display();
        // Integer[] m1={100,200,300};
        // Double[] m2={20.45,67.98,90.78};
        // b1.depositMoney(m1);
        // b1.depositMoney(m2);
       
    }
}