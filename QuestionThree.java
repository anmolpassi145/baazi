package com.baazi.questionThree;




public class QuestionThree {

    public static void main(String[] args) {
        Account firstAccount = new Account(2,3,"Alpha");
        System.out.println(firstAccount);
        Account secondAccount = new Account(3,6,"Sigma");
        System.out.println(secondAccount);
        System.out.println("comparing first with second ->>> "+firstAccount.compareTo(secondAccount));
    }
}
