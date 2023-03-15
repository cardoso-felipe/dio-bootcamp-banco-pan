package br.com.felipe.estruturadados.mystack;

public class Main {
    public static void main(String[] args) {
        
        MyStack stack = new MyStack();
        
        stack.push(new Element("Blue"));
        stack.push(new Element("Red"));
        stack.push(new Element("Yellow"));
        stack.push(new Element("Green"));
        stack.push(new Element("White"));
        stack.push(new Element("Orange"));

        System.out.println(stack);

        System.out.println("Popped: " + stack.pop());
        
        System.out.println(stack);
        
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        
        System.out.println("\nPushed: Black");
        System.out.println("Pushed: Gold\n");

        stack.push(new Element("Black"));
        stack.push(new Element("Gold"));

        System.out.println(stack);

        System.out.println(stack.top());

    }
}
