// if, else
//     else if
// switch
// break

// import java.util.*;

// public class conditionalstatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age >= 18) {
//             System.out.println("Adult");
//          } else {
//                 System.out.println("Not Adult");
//             }
//             sc.close();
//         }
//     }

//     import java.util.*;

// public class ConditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Not Adult");
//         }

//         sc.close(); // good practice
//     }
// }


// import java.util.*;

// public class Conditions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }


// import java.util.*;
// public class Conditions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         if( x == y ) {
//             System.out.println("x is equal to y");
//         } if( x > y ) {
//             System.out.println("x is greater than y");
//         } else {
//             System.out.println("x is lesser than y");
//         }

//         }
//     }


import java.util.*;
public class Condition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        int x = sc.nextInt();
//         // int y = sc.nextInt();
//         // int z = sc.nextInt();
//         if (x == 1 ) {
//             System.out.println("Hello!");
//                } else if(x == 2){
//                 System.out.println("Namaste!");
//                } else if(x == 3){
//                 System.out.println("Bonjour!");
//                } else {
//                 System.out.println("Invalid button");
//                }
//     }
// }


switch(x) {
    case 1 : System.out.println("Hello");
    break;
    case 2 : System.out.println("Namaste");
    break;
    case 3 : System.out.println("Bonjour");
    break;
    default : System.out.println("Invalid Button");
}
  }
}