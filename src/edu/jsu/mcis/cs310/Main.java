package edu.jsu.mcis.cs310;

public class Main {

     public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder MessageReverse = new StringBuilder();
        MessageReverse.append(message);
        MessageReverse.reverse();
        return MessageReverse.toString();
           
    }
}