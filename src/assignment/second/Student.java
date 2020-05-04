package assignment.second;

import java.util.Comparator;

public class Student implements Comparator {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getCgpa()>o2.getCgpa()) {
            return -1;
        }
        else if(o1.getCgpa()<o2.getCgpa()) {
            return 1;
        }
        return 0;
    }
}
