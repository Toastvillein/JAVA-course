package chapter3.optional.assignment;

import java.util.Optional;

public class CampService {

        private static  Student[] students = {
                new Student("spartan"),
                new Student("Steve"),
                new Student("John")
        };

        public Optional<Student> findStudentByName(String name) {
            for (Student student : students) {
                String studentName = student.getName();
                if (studentName.equals(name)) {
                    return Optional.ofNullable(student);
                }
            } return Optional.ofNullable(null);
        }

}
