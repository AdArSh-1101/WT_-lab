import java.io.*;

class Student implements Serializable {
    private int studentId;
    private String name;
    private String specialization;
    private double cgpa;

    public Student(int studentId, String name, String specialization, double cgpa) {
        this.studentId = studentId;
        this.name = name;
        this.specialization = specialization;
        this.cgpa = cgpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class StudentDetails {

    // write student details to file
    public static void writeToFile(Student[] students, String fname) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
            for (Student student : students) {
                oos.writeObject(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read student details from file
    public static void readFromFile(String fname) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))) {
            Student student;
            while ((student = (Student) ois.readObject()) != null) {
                System.out.println(student);
            }
        } catch (EOFException e) {
            // end of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // main method
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(1001, "abc", "AI", 8.8),
                new Student(2001, "lmn", "Blockchain", 9.6),
                new Student(3001, "pqrs", "IOT", 8.9),
                new Student(4001, "xyz", "Data Analytics", 8.6),
                new Student(5001, "abcd", "Smart City", 9.5)
        };

        writeToFile(students, "student_details.txt"); 
                readFromFile("student_details.txt"); 
    }
}