package Java_Programming;

public class PenPerStudent {
	public static void main (String [] args) {
		int pens = 14;
		int students = 3;
		int perStudent = pens / students;
	    int remaining = pens % students;
	    System.out.println ("Total number of Pen per student are" + perStudent + 
	    		" Remaining Number of pens are " + remaining);

	}
	
}
