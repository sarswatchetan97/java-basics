import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class StudentArrayList {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(19, "Chetan", 45));
        studentList.add(new Student(23, "Billu", 87));
        studentList.add(new Student(32, "Shallu", 78));
        studentList.add(new Student(12, "Golla", 25));
        studentList.add(new Student(23, "Lalu", 98));

        System.out.println(studentList);

//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getWeight() - o2.getWeight();
//            }
//        });

        Collections.sort(studentList, new WeightComparator());

        System.out.println(studentList);
    }
}