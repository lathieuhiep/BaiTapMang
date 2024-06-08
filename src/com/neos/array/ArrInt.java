package com.neos.array;

public class ArrInt {
    private int[] arrInt;

    public ArrInt() {
        arrInt = new int[] {1, 2, 3, 4, 5, 2, 3, 1, 5, 4, 1, 4, 5, 3, 2};
    }

    // kiểm tra số nguyên tố
    public boolean checkPrime(int number) {
        if ( number < 2 ) {
            return false;
        }

        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 ) {
                isPrime = false;

                break;
            }
        }

        return isPrime;
    }

    // In ra cặp đôi 2 phần tử liền kề nhau có tổng là một số nguyên tố
    public void printPrimePairs() {
        System.out.println("cặp đôi 2 phần tử liền kề nhau có tổng là một số nguyên tố");

        for (int i = 0; i < arrInt.length -1; i++) {
            int sum = arrInt[i] + arrInt[i + 1];

            if ( checkPrime( sum ) ) {
                System.out.print("(" + arrInt[i] + ", " + arrInt[i + 1] + ") ");
            }
        }
    }

    // In ra vị trí của phần tử giống nhau
    public void printSimilarNumber() {
        System.out.println("\nPhần tử giống nhau");
        boolean arrTrace[] = new boolean[arrInt.length];

        for (int i = 0; i < arrInt.length; i++) {
          if (arrTrace[i]) {
              continue;
          }

          printPositionOfNumber(arrInt[i], i, arrTrace);
        }
    }

    private void printPositionOfNumber(int number, int start, boolean[] arrTrace) {
        System.out.print("\n" + number + ": " + start);

        for (int i = start + 1; i < arrInt.length; i++) {
            if (arrInt[i] == number) {
                System.out.print(", " + i );
                arrTrace[i] = true;
            }
        }
    }
}
