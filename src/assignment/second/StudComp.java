package assignment.second;

import java.util.Comparator;

public class StudComp  implements Comparator<Student> {

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
