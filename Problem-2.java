# Problem 2 Statement:With a single integer as the input, generate the following until 
            a = x [series of numbers as shown in below examples]
Output: (examples)
1) input a = 1, then output : 1
2) input a = 2, then output : 1, 3
3) input a = 3, then output : 1, 3, 5
4) input a = 4, then output : 1, 3, 5, 7
.
.
.
5) input a = x, then output : 1, 3, 5, 7, .......  

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<1) {
            System.out.println("Invalid input. 'a' should be a positive integer.");
        } else {
            for(int i=1;i<=a;i++) {
                System.out.print(i*2-1);
                if (i!=a) {
                    System.out.print(",");
                }
            }
        }
    }
}
TEST CASE I:
Input :2
Output:1,3

TEST CASE II:
Input :20
Output:1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39

TEST CASE III:
Input :200
Output:1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63,
       65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 117, 119, 121,
       123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153, 155, 157, 159, 161, 163, 165, 167, 169, 171, 
       173, 175, 177, 179, 181, 183, 185, 187, 189...
