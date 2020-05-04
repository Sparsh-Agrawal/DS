package assignment.second;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> p = new PriorityQueue<>();
        Student s1 = new Student("abc", 7.5);
        p.add(s1);
        Student s2 = new Student("def", 9.6);
        p.add(s2);
        Student s3 = new Student("ghi" , 6.4);
        p.add(s3);
        System.out.println("Students in Priority Order");
        Iterator i = p.iterator();
        while (i.hasNext()) {
            System.out.println(p.peek().getName());
            p.poll();
        }
    }
}
