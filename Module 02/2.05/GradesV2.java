/** 
 * The purpose of this project is to write a program that will calculate
 * the average grade each time a new score is added to the total.
 * 
 * 
 * 
 * 
 * 
 * @author: Tony Bonadio
 * @version: 10/16/201
 * 
**/

public class GradesV2 { 

    public static void main(String[] args) {
        
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        //New Score 1
        testGrade = 97;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //New Score 2
        testGrade = 79;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //New Score 3
        testGrade = 83;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //New Score 4
        testGrade = 88;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //Personal Made Score 1
        testGrade = 63;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //Person Made Score 2
        testGrade = 99;        
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //Personal Made Score 3
        testGrade = 55;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        //Personal Made Score 4
        testGrade = 26;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        
    }
}