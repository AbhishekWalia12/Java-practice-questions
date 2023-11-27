import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class arraysExample {
    public static void main(String[] args) {
        int[] rollNum = new int[5];
//        //or
//        //int[] rollNum = {12, 13, 14, 15, 16};
        System.out.println("enter the roll num :");

        for(int i = 0; i<5; i++ ) {
            Scanner sc = new Scanner(System.in);

            rollNum[i] = sc.nextInt();
        }
        System.out.println("Printed numbers : ");
        for(int i=0;i<5;i++) {
            System.out.print(rollNum[i]);
        }
//        ArrayList<Integer> rollNum2 = new ArrayList<>();
//        rollNum2.add(1);
//        rollNum2.add(2);
//        rollNum2.add(3);
//        rollNum2.add(4);
//        System.out.println("arraylist: " + rollNum2 );
//        Stack<Character> s=new Stack<>();
//        s.push('q');
//        s.push('a');
//        s.push('v');
//        System.out.println(s);
//        s.pop();






    }

}

