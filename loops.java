// public class loops {
//     public static void main(String args []) {
// for(int counter = 0; counter < 100; counter = counter + 1 ) {
//     System.out.println("Hello World!");
// }
//     }
// }


// public class loops{
//     public static void main(String args[]) {
//         for(int i = 0; i < 11; i++) {
//         System.out.println(i);
//     }
// }
// }


// public class loops{
//     public static void main(String args[]) {
// int i = 0;
// while(i < 11) {
//     System.out.println(i);
//     i = i + 1;
// }
//     }
// }


// public class loops{
//     public static void main(String arg[]){
//         int i = 0;
//         do {
//             System.out.println(i);
//             i = i + 1;
//         }while(i < 11);
//     }
// }


public class loops{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i ++) {
            sum = sum + i;
        }

        System.out.println(sum);
}
}