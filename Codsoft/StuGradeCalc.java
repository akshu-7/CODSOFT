package codsoft;
import java.util.Scanner;
public class StuGradeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
        	sc.nextLine(); // Consume newline
            System.out.print("Enter the subject name for subject " + (i+1) + ": ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter marks obtained in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
        	totalMarks += mark;
        }
        double averagePercentage = (double) totalMarks / numSubjects;
        String grade;
        if (averagePercentage >= 90) {
        	grade = "A";
        }
        else if (averagePercentage >= 80) {
        	grade = "B";
        }
        else if (averagePercentage >= 70) {
        	grade = "C";
        }
        else if (averagePercentage >= 60) {
        	grade = "D";
        }
        else {
        	grade = "F";
        }
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < numSubjects; i++) {
        	System.out.println(subjects[i] + ": " + marks[i]);
        }
      

	}

}
