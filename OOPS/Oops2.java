package OOPS;
public class Oops2{
public static void main(String[] args) {
    // Human kanhaiya=new Human(20,"Kanhaiya Garg",15000,false);
    // Human Rahul=new Human(24,"Rahul",25000,true);
    System.out.println(Human.population);
    System.out.println(Human.population);

}
}
//we can use static variables without making objects
//we know that something which is not static belong to object
//static variable can be accessed withou object because it belongs to class
//static block is written before main method and is run before main method

// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         if(arr[i]==arr[j]){
//             for(k=i;k<n;k++){
//                 arr[k]=arr[k+1];
//             }
//             n--;
//             j--;
//         }
//     }
// }