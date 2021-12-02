public class Student {
    private String name;
    private int year;

    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public Integer getYear() {
        return year;
    }

    public String toString() { return String.format("[" + name + ", " + year + "학년]");}

    public boolean equals(Object o) {
        if(!(o instanceof Student)) return false;
        Student s = (Student) o;
        return name.equals(s.name) && year == s.year;

    }
}
