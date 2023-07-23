package week7.console;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private String address;
    private int symbolNo;
    List<Subject> subjects;
    int rank;
    float percentage;

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public  int compareTo(Student another){
        return Float.compare( another.percentage,this.percentage);

    }

    public Student(String name, String address, int symbolNo, List<Subject> subjects) {
        this.name = name;
        this.address = address;
        this.symbolNo = symbolNo;
        this.subjects = subjects;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSymbolNo() {
        return symbolNo;
    }

    public void setSymbolNo(int symbolNo) {
        this.symbolNo = symbolNo;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    void studentInfo() {
        System.out.println("------------------------------------------------------" + "\n" +
                "Student Details" + "\n" +
                "Student name:     " + name + '\n' +
                "address:          " + address + '\n' +
                "symbolNo:         " + symbolNo + '\n' +
                "------------------------------------------------------" + "\n" +
                "Subject Marks" + "\n" +
                subjects+ "\n" +
                " Percentage:   "+ percentage+"%"+"|        Rank:     "+ rank);
    }
}
