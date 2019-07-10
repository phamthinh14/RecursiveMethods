package com.company;

public class RecursiveTesting {
    private int n1 = 0;//instance variable
    private int n2 = 1;//instance variable
    private int n3 = 0;//instance variable
    private int container;

    public void Fibo(int count) {
//        int n1 = 0;
//        int n2 = 1;
//        int n3 = 0;
//These three local variables are not suitable for situation when you need something to be updated.
        /*For example: This fibonacci series need to be updated because the third number is the
        sum of the first and second number before it. However, the local variable will die if it get out
        of the method. As a result, every time the Fibo(int count) recursive method is call. int n1,n2,n3 are
        "renew" with the value which was set before.
        Those three //instance variables will live in the stack as long as the class live. Therefore, their values are updated
        even though the recursive method Fibo(int count) call itself. As a result, the output by using instance variables meets our
        expectation.
         */
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            displayFibo(n3);
            Fibo(count - 1);
        }

    }

    private void displayFibo(int number) {
        System.out.print(number + " ");
    }

    public void Collatz(int number) {
        this.container = number;
//        if (this.container == 1) {
//            System.out.println(this.container);
//        }
        if (this.container != 1) {
//            if (this.container == 1) {
//                System.out.println(this.container);
//            }
            if (this.container % 2 == 0 && this.container != 1) {
                this.container = this.container / 2;
                System.out.println(this.container);
//                if (this.container == 1) {
//                    System.out.println(this.container);
//                }
                if (this.container >= 2) {
                    Collatz(this.container);
                }


            }
            if (this.container % 2 != 0 && this.container != 1) {
                this.container = (this.container * 3) + 1;
                System.out.println(this.container);
//                if (this.container == 1) {
//                    System.out.println("1");
//                }
                if (this.container >= 2) {
                    Collatz(this.container);
                }

            }
//            if (this.container == 1) {
//                break;
//            }
        }

    }
}
