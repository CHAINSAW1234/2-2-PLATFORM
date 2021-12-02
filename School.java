package edu.pnu.admin;
import edu.pnu.collection.GenericList;

public class School {
    private final String name;
    private final int limit;
    private GenericList<Student> students = new GenericList<Student>();

    public School(final String name, final int limit) {
        this.name = name;
        this.limit = limit;
    }

    public String toString() {
        String msg = "School Name: " + name + " Student Count: " + students.getsize() + "\n";
        for(int i=0;i< students.getsize();++i) {
            msg += "\t" + students.getdata(i) + "\n";
        }
        return msg;
    }
    public void addStudent(Student std) {
        students.add(std);
    }
    public Student findStudent(final String name,final int year) {
        Student std = new Student(name, year);
        for(int i=0;i< students.getsize();++i) {
            if (std.equals(students.getdata(i)))
                return std;
        }
        return null;
    }
    public void removeAllStudent() {
        students.clear();
        }
    }

