/**
 * 
 */

/**
 * @author mjone
 *
 */
import java.util.*;

public class RandomMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 12);
		
		switch(num) {
		
		case 0: System.out.println("January, Happy New Year!!"); break;
		case 1: System.out.println("February, Happy Valentines Day!!"); break;
		case 2: System.out.println("March, Happy St.Patty's Day!!"); break;
		case 3: System.out.println("April, April Fools!!"); break;
		case 4: System.out.println("May, Happy Mother's Day!!"); break;
		case 5: System.out.println("June, Happy Father's Day!!"); break;
		case 6: System.out.println("July, Happy Independence Day!!"); break;
		case 7: System.out.println("August, Welcome to Fall!!"); break;
		case 8: System.out.println("September, Football Season Starts!!"); break;
		case 9: System.out.println("October, Happy Halloween!!"); break;
		case 10: System.out.println("November, Happy Thanksgiving!!"); break;
		case 11: System.out.println("December, Merry Christmas!!"); break;
		}

	}

}
