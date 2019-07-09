package WorkingWithAbstraction.StudentSystem;

public class StudentSystem {
    private StudentRepository repository;

    public StudentSystem() {
        this.repository = new StudentRepository();
    }

    public StudentRepository getAllStudents() {
        return this.repository;
    }

    public void executeCommand(String[] args) {
        if (args[0].equals("Create")) {
            this.createStudent(args);
        } else if (args[0].equals("Show")) {
            this.showStudent(args);
        }
    }

    private void createStudent(String[] args) {
        String name = args[1];
        if (repository.existsStudent(name)) {
            return;
        }
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);

        Student student = new Student(name, age, grade);
        repository.addStudent(student);
    }

    private void showStudent(String[] args) {
        String name = args[1];
        if (!this.repository.existsStudent(name)) {
            return;
        }
        Student student = this.repository.getStudent(name);
        System.out.println(student.toString());
    }
}
