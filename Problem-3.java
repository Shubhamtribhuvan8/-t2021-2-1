# Problem-3:  With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
    Output: (examples)
        1) input a = 1, then output : 1
        2) input a = 2, then output : 1
        3) input a = 3, then output : 1, 3, 5
        4) input a = 4, then output : 1, 3, 5
        5) input a = 5, then output : 1, 3, 5, 7, 9
        6) input a = 6, then output : 1, 3, 5, 7, 9
        .
        .
        7) input a = x, then output : 1, 3, 5, 7, .......
# Solution:Approch 1=>
//I TRIED THIS APPROCH BUT FAILING SOME TEST CASES!!!
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();//Taking input for series
        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print((2 * i - 1) + " ");
        }
        System.out.println();
    }
}
Time Complexity:O(N)
Space Complexity: O(1)
