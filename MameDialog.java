package GradeBookTest;

import javax.swing.JOptionPane;

public class MameDialog
{
   public static void main( String args[] )
   {
	   String name = JOptionPane.showInputDialog( "What is your name?" );
	   String message = String.format( "Welcome, %s, to Java Program!", name );
	   JOptionPane.showMessageDialog( null, message );
   }
}
