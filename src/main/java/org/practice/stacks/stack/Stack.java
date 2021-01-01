package org.practice.stacks.stack;

import java.util.ArrayList;

public class Stack {

    //***************************Don't touch***************************
    private String [] collection;
    private int capacity = 10;
    private int count = 0;

    public Stack() {
        this.collection = new String[10];
    }
    //***************************Don't touch***************************

    /**
     * Should push an incoming element onto the top of the stack if it's not full.
     * @param letter A letter A-Z
     */
    public void push(String letter) {

    }

    /**
     * Should pop the element at the top of the stack.
     * @param letter A letter A-Z
     */
    public void pop(String letter) {

    }

    /**
     * @return what is currently at the top of the stack.
     */
    public String peek () {
        return "";
    }

    /**
     * @param letter A letter A-Z
     * @return true if the letter is in the stack.  False otherwise.
     */
    public boolean inStack(String letter) {
        return false;
    }

    /**
     * @return true is the stack is empty.  False otherwise.
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * @return true if the stack is at max capacity.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @param letter A letter A-Z
     * @return all contents of the stack, without emptying this stack.
     */
    public String print(String letter) {
        return "";
    }

}