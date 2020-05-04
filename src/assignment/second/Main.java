package assignment.second;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Student> p = new PriorityQueue<>();
        Student s1 = new Student("abc", 7.5);
        p.add(s1);
    }
}
