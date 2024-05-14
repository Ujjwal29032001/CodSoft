import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args) {
        System.out.println("Enter marks out of 100 for 5 subjects :");
        Scanner sc = new Scanner(System.in);
        double m1,m2,m3,m4,m5;
        int totalSubject=5;
        m1=sc.nextDouble();
        m2=sc.nextDouble();
        m3=sc.nextDouble();
        m4=sc.nextDouble();
        m5=sc.nextDouble();

        double totalMarksObtained=m1+m2+m3+m4+m5;
        double avgPercentage=totalMarksObtained/totalSubject;
        String grade="";

        if(avgPercentage>=91){
            grade="A+";
        }
        else if(avgPercentage>=81 && avgPercentage<=90){
            grade="A";
        }
        else if(avgPercentage>=71 && avgPercentage<=80){
            grade="B+";
        }
        else if(avgPercentage>=61 && avgPercentage<=70){
            grade="B";
        }
        else if(avgPercentage>=51 && avgPercentage<=60){
            grade="C";
        }
        else{
            grade="D";
        }
        System.out.println("Result : ");
        System.out.println("Total Marks: "+totalMarksObtained);
        System.out.println("Average Percenatge :"+avgPercentage);
        System.out.println("Grade :"+grade);
    }
}




