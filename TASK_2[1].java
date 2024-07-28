package code_soft;
import java.util.Scanner;
class TASK_2 
{
    public static void main(String[]args) 
 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER TOTAL NUMBER OF SUBJECTS:");
        int Subjects=scan.nextInt();
        System.out.println("***************************");
        int[]marks=new int[Subjects];
        for(int i=0;i<Subjects;i++) 
        {
            System.out.println("Marks obtained in subject"+(i+1)+"(out of 100):??");
            marks[i]=scan.nextInt();
        }
        System.out.println("***************************");
        int totalMarks=calculateTotalMarks(marks);
        int average=calculateAveragePercentage(totalMarks, Subjects);
        String grade=calculateGrade(average);
        System.out.println("MAXIMUM MARK GIVEN=="+(Subjects*100));

        System.out.println("\nTOTAL MARKS YOU SCORED =="+totalMarks);
        System.out.println("AVERAGE PERCENTAGE =="+(average) + "%");
        System.out.println("GRADE=="+grade);
        scan.close();
        System.out.println("\n***************************");
    }
    public static int calculateTotalMarks(int[] marks) {
    	int total=0;
        for (int mark:marks) 
        {
            total += mark;
        }
        return total;
    }
    public static int calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (totalMarks/numSubjects); 
    }
    public static String calculateGrade(int average) {
        if(average>=90) 
        {
            return "A- outstanding";
        } 
        else if(average>=80) 
        {
            return "B- Marvellos";
        } 
        else if(average>=70) 
        {
            return "C- very good";
        } 
        else if(average>=60) 
        {
            return "D-  GOOD";
        } 
        else 
        {
            return" E- FAIL";
        }
        
    }
    
}

