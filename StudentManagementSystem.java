import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentManagementSystem {

	    public static void main(String[] args) {

	        // 1. Store students in ArrayList
	        List<Student> students = new ArrayList<>();
	        students.add(new Student(101, "Jnanesh", 85));
	        students.add(new Student(102, "Rahul", 78));
	        students.add(new Student(103, "Anita", 92));
	        students.add(new Student(101, "Jnanesh", 85)); // duplicate

	        // 2. Remove duplicates using Set
	        Set<Integer> uniqueIds = new HashSet<>();
	        List<Student> uniqueStudents = new ArrayList<>();

	        for (Student s : students) {
	            if (uniqueIds.add(s.getId())) {
	                uniqueStudents.add(s);
	            }
	        }

	        // 3. Use HashMap for fast lookup
	        Map<Integer, Student> studentMap = new HashMap<>();
	        for (Student s : uniqueStudents) {
	            studentMap.put(s.getId(), s);
	        }

	        // 4. Sorting using Comparator (by marks)
	        uniqueStudents.sort(new Comparator<Student>() {
	            @Override
	            public int compare(Student s1, Student s2) {
	                return s2.getMarks() - s1.getMarks();
	            }
	        });

	        // 5. Display sorted report
	        System.out.println("---- Student Report (Sorted by Marks) ----");
	        for (Student s : uniqueStudents) {
	            System.out.println(s);
	        }

	        // 6. Fast lookup using HashMap
	        System.out.println("\nStudent with ID 102:");
	        System.out.println(studentMap.get(102));
	    }
	}
