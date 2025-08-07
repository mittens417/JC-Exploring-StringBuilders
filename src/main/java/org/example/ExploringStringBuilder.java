package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExploringStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(", Cadets!");
        System.out.println(" --- Exercise 1: --- ");
        System.out.println(sb1);
        System.out.println();

        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        System.out.println(" --- Exercise 2: --- ");
        System.out.println(sb2);
        System.out.println();

        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb3.delete(8, 16);
        System.out.println(" --- Exercise 3: --- ");
        System.out.println("After delete(8, 16): " + sb3);

        // Deletes the character at index 4 (the ' ')
        sb3.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb3);
        System.out.println();

        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        System.out.println(" --- Exercise 4: --- ");
        sb4.replace(24, 30, "Java");
        System.out.println(sb4);
        System.out.println();

        StringBuilder sb5 = new StringBuilder("Start");
        sb5.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(" --- Exercise 5: --- ");
        System.out.println(sb5);
        System.out.println();

        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        System.out.println(" --- Exercise 6: --- ");
        // Substring returns a String, it does not modify the StringBuilder
        String sub = sb6.substring(16, 19);
        System.out.println("Substring: " + sub);
        // indexOf works just like in String
        int indexOfFox = sb6.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        // Searching for a word that doesn't exist
        int indexOfCat = sb6.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
        System.out.println();

        StringBuilder sb7 = new StringBuilder("Status: ");
        System.out.println(" --- Exercise 7: --- ");
        sb7.append("Pending");
        // Now, we need a final, unchangeable String
        String finalStatus = sb7.toString();
        // Let's try to change the StringBuilder again
        sb7.append(" - Approved");

        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);
        System.out.println();
    }
}