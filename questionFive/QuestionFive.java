package com.baazi.questionFive;

public class QuestionFive {
    public static void main(String[] args) {
        StackImpl<Integer> st = new StackImpl<>();
        st.push(1);
        st.push(2);
        System.out.println("Size: " + st.size());
        System.out.println("Top: " + st.top());
        st.pop();
        System.out.println("Top: " + st.top());
    }
}
