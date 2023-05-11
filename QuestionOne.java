package com.baazi.questionOne;

public class QuestionOne {
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int balancedSum(int[] arr) {
        int sum = getSum(arr);
        int pivotElement = -1;
        int rightSum = sum - arr[0];
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (rightSum == leftSum) return i;
            leftSum += arr[i];
            if (i + 1 < arr.length) {
                rightSum -= arr[i + 1];
            }
        }
        return pivotElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 6 };
        int ans  = balancedSum(arr);
        System.out.println(ans);
    }
}
