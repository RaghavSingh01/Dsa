package Patterns;

public class New {
    public static void main(String[] args) {
        pattern31(5);
    }
    // static void star(int n){                        //To print the reverse star pattern. 4 stars in 1st line and 1 in last line.
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = i; j >= 1; j--) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
            
    //     }
    // }

    // static void nums(int n){                          //To print the triangle of numbers. First row has1 and last row has 1234.
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
            
    //     }
    // }

//     static void pattern(int n){          //i = row, j = column, h = row, k = column.
//         for (int i = 0; i <= n; i++) {          //In this code i put together the code of upside down and normal triangle to form a pyramid. 
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//                 }
//                 System.out.println();
//             }
//             for (int h = n-1; h >= 1 ; h--) {
//                     for (int k = h ; k >= 1; k--){
//                         System.out.print("* ");
//                     }
//                     System.out.println();
//                 }         
// }

// static void pattern(int n){                  //Shorter way to write the above pattern code. In this code we used a formulae to print a pyramid.
//     for (int i = 0; i < 2*n ; i++) {       //It was a vertical pyramid.
//         int cols = i > n ? 2*n - i: i;
//         for (int j = 0; j < cols; j++) {
//             System.out.print("* ");            
//         }
//         System.out.println();
//     }
// }


// static void pyramid(int n){                  //For printing pyramid with odd number of stars in each line.
//     for (int i = 0; i < n; i++) {
//         int col = i % 2 == 0 ? i + 1 : i;
//         for (int j = 0; j < col; j++) {
//             System.out.print("* ");
            
//         }
//         System.out.println();

        
//     }
// }


// static void pattern(int n){                                             // For printing a diamond.
//         for (int i = 0; i < 2*n ; i++) {     
           
//             int cols = i > n ? 2*n - i: i;
//             int noofspaces = n - cols;
//             for (int h = 0; h < noofspaces ; h++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < cols; j++) {
//                 System.out.print("* ");       
//             }
//             System.out.println();
           
//         }
      
//     }


// static void newpattern(int n){               // Pyramid of specifically stacked numbers.
//     for (int i = 0; i < 2*n; i++) {
//         int c = i > n ? 2 * n - i : i;
//         for (int s = 0; s <= n - c ; s++) {
//             System.out.print(" ");
            
//         }

//         for (int j = c; j >= 1; j--) {
//             System.out.print(j);
//         }
//             for (int k = 2; k <= c ; k++) {
//                 System.out.print(k);   
//             }
      
//         System.out.println();
//     }
//     }

static void pattern31(int n){
    int N = n;
    n = 2*n;
    for (int i = 0; i <= n; i++) {
        for(int j = 0; j <= n; j++){
            int elements = N - Math.min(Math.min(i, j), Math.min(n - i, n - j));
            System.out.print(elements + " ");
        }
        System.out.println();
    }
}

}
    

