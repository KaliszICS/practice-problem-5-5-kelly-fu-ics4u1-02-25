/**
 * Represents a student with a name, age, and student number.
 * @author Kelly Fu
 * @version 17.0.1
 */

public class Student implements Comparable<Object> {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructs a new Student object.
     * 
     * @param name the name of the student
     * @param age the age of the student
     * @param studentNumber the student number (as String)
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Returns a string representation of the student.
     * Format: "N:name A:age SN:studentNumber"
     */
    @Override
    public String toString() {
        return "N:" + name + " A:" + age + " SN:" + studentNumber;
    }

    /**
     * Compares this student with another based on student number (String).
     *
     * @param obj another object to compare with
     * @return a negative, zero, or positive number as this object is less than,
     * equal to, or greater than the specified object
     */
    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Student)) {
            throw new IllegalArgumentException("Can only compare with another Student");
        }
        Student other = (Student) obj;
        return this.studentNumber.compareTo(other.studentNumber);
    }
}
