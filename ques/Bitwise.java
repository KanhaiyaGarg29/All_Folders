// package ques;
// import java.util.*;
// public class Bitwise {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int k=sc.nextInt();
//     int resAnd=0;
//     int resOr=0;
//     int resXor=0;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<=n;j++){
//             int currAnd=i&j;
//             int currOr=i|j;
//             int currXor=i^j;
//             if(currAnd<k){
//                 resAnd=Math.max(resAnd,currAnd);
//             }
//             if(currOr<k){
//                 resOr=Math.max(resOr,currOr);
//             }
//             if(currXor<k){
//                 resXor=Math.max(resXor,currXor);
//             }
//         }
//     }
// }
