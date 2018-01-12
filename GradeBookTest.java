package GradeBookTest;
import java.util.Scanner;
public class GradeBookTest 
{
   public static void main( String °¢rgs[])
   {
	   Scanner input = new Scanner( System.in );
	   GradeBook myGradeBook = new GradeBook();
	   System.out.printf( "Initial course name is: %s\n\n",myGradeBook.getCourseName() );
	   String theName=input.nextLine();
	   myGradeBook.setCourseName( theName );
	   System.out.println();
	   myGradeBook.displayMessage();
   }
}
