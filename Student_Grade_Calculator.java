//Task 2

import java.util.*;
// This is used to calculate to give the grade according to their average score in exam
public class Student_Grade_Calculator {
    public static void main(String[] args) {

        HashMap<String, Integer> reportcard = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("How many subjects are present");
        int subjects = sc.nextInt();//Getting the input of number of subjects are present

        sc.nextLine();
        int i = 0;

// Taking the inoput of subject name with marks
        while (i < subjects) {

            System.out.println("Enter the name of the subject");

            String subjectname = sc.nextLine();

            System.out.println("Enter the marks of " + subjectname);

            int marks = sc.nextInt();

            sc.nextLine();

            while (marks < 0 || marks > 100) {

                System.out.print("Invalid input. Enter marks between 0 and 100: ");
                marks = sc.nextInt();

            }

            reportcard.put(subjectname, marks); //Putting subjectname as a key and marks as a value in Hashtable for further operations

            i++;

        }
        for (Map.Entry<String, Integer> entry : reportcard.entrySet()) {

            sum = sum + entry.getValue(); //Getting the value to add from HashTable

        }

        double percent = (double) sum / subjects; //Calculating the percentage of a total marks the student has scored 

        System.out.println("Report card :- \n");

        System.out.println(reportcard+"\n");

        System.out.println("Total Marks = " + sum);

        System.out.println("Percent = " + percent);

        //Giving the grade according to the percentage scored
        if (percent >= 90) {

            System.out.println("Grade: A+");

        } else if (percent >= 80) {

            System.out.println("Grade: A");

        } else if (percent >= 70) {

            System.out.println("Grade: B");

        } else if (percent >= 60) {

            System.out.println("Grade: C");

        } else if (percent >= 50) {

            System.out.println("Grade: D");

        } else {

            System.out.println("Grade: F");

        }

    }
}
