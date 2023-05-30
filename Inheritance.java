// Parent class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
}

// Child class
class Student extends Person {
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying in grade " + grade);
    }
}

// Usage example
public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("John", 10);
        student.introduce();
        student.study();
    }
}
