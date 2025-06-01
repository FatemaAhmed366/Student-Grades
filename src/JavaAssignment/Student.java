package JavaAssignment;

public class Student {
    private String name;
    private int id;
    private double grade1 , grade2 , grade3;
    private double average;
   //constructor
    public Student() {
    }

    public Student(String name, int id, double grade1, double grade2, double grade3, double average) {
        this.name = name;
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.average= average;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getGrade1() {
        return grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public double getGrade3() {
        return grade3;
    }
    public double getAverage() {
        return average;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }
    public void setAverage(double average) {
        this.average = average;
    }

    // method to calculate average
    public void calculateAverage(){
    double totalGrades=3;
    average=(grade1 + grade2 + grade3) / totalGrades;
    }
    // method to check if student passed
    public  boolean isPassed (){
        if(average>=50){
         //   notifyUser(true);
            return true;
        }
        else{
            notifyUser(false);
            return false;
        }}

        public void notifyUser(boolean isPassed){
            if(isPassed){
                System.out.println("Gongratulation you have passed");
            }else {
                System.out.println("sorry you have failed");
            }
        }

    public void displayInfo(){
        System.out.println();

        System.out.println("----Student Information----");

        System.out.println("name: "+name);

        System.out.println("id: "+id);

        System.out.println("Grades: "+grade1+','+grade2+','+grade3);

        calculateAverage();
        System.out.println("your grades average is "+average);

        isPassed();
    }


}

