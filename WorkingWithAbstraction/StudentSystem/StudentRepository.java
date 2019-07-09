package WorkingWithAbstraction.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, Student> storage;

    public StudentRepository() {
        this.storage = new HashMap<>();
    }

    public Student getStudent(String name) {
        return this.storage.get(name);
    }

    public void addStudent(Student student){
        this.storage.put(student.getName(), student);
    }

    public boolean existsStudent(String name){
        return this.storage.containsKey(name);
    }
}
