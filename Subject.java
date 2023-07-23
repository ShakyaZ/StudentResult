package week7.console;
public class Subject {
    private int mathMarks;
    private int scienceMarks;
    private int nepaliMarks;

    private Student student;
    String division;
    static HighestMarks highestMarksList;
    //float percentage;

    String result;

//    public float getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(float percentage) {
//        this.percentage = percentage;
//    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public String toString() {
        return  "Subjects:     | "+" Marks Obtained: |"+" Highest Marks: | "+" Pass Marks: | "+" Full Marks:  |"+"\n"+
                " Math :        | "+ mathMarks   +"               |"+highestMarksList.mathHigh+   "              |       40     |"+"   100         |"+"\n"+
                " Science:      | "+ scienceMarks+"               |"+highestMarksList.scienceHigh+"              |       40     |"+"   100         |"+"\n"+
                " Nepali:       | "+ nepaliMarks +"               |"+highestMarksList.nepaliHigh+ "              |       40     |"+"   100         |"+"\n"+
                " Status:       |"+ result+       "               | Division:    "+division;
    }
    public Subject() {

    }
    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getNepaliMarks() {
        return nepaliMarks;
    }

    public void setNepaliMarks(int nepaliMarks) {
        this.nepaliMarks = nepaliMarks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public HighestMarks getHighestMarksList() {
        return highestMarksList;
    }

    public void setHighestMarksList(HighestMarks highestMarksList) {
        this.highestMarksList = highestMarksList;
    }
}
