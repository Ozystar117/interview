/**
 * 
 */
package interview;

/**
 * @author Emmanuel Ozioma
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		convertToLCD("81340");
//		convertToLCD("1");
    }
	
	/**
	 * Display the number passed in the parameter in lcd format
	 * @param num
	 */
	public static void convertToLCD(String num) {
		// length of the input string
		int len = num.length();
		
		// array to store all the characters in the input string
        int[][][] chars = new int[len][3][3];
        
        //create 2d array for a char, in each array, the 1st element is |
        // 2nd is -, and 3rd is |
        int[][] one = {{0,0,0}, {0,0,1}, {0,0,1}}; // format for 1
        int[][] two = {{0,1,0}, {0,1,1}, {1,1,0}};
        int[][] three = {{0,1,0}, {0,1,1}, {0,1,1}};
        int[][] four = {{0,0,0}, {1,1,1}, {0,0,1}};
        int[][] five = {{0,1,0}, {1,1,0}, {0,1,1}};
        int[][] six = {{0,1,0}, {1,1,0}, {1,1,1}};
        int[][] seven = {{0,1,0}, {0,0,1}, {0,0,1}};
        int[][] eight = {{0,1,0}, {1,1,1}, {1,1,1}};
        int[][] nine = {{0,1,0}, {1,1,1}, {0,1,1}};
        int[][] zero = {{0,1,0}, {1,0,1}, {1,1,1}};
         
        for(int i=0; i<len; i++){
            if(num.charAt(i)=='1') chars[i] = one;
            else if(num.charAt(i)=='2') chars[i] = two;
            else if(num.charAt(i)=='3') chars[i] = three;
            else if(num.charAt(i)=='4') chars[i] = four;
            else if(num.charAt(i)=='5') chars[i] = five;
            else if(num.charAt(i)=='6') chars[i] = six;
            else if(num.charAt(i)=='7') chars[i] = seven;
            else if(num.charAt(i)=='8') chars[i] = eight;
            else if(num.charAt(i)=='9') chars[i] = nine;
            else if(num.charAt(i)=='0') chars[i] = zero;
            else chars[i] = four;
        }
        
        // loop 3 times (the height of each lcd number)
        for (int j = 0; j < 3; j++) {
        	//loop through all chars in the input string
            for (int i = 0; i < len; i++) {
            	// determine if '_' should be displayed or '|'
                for (int k = 0; k < 3; k++) {
                	//if k is not 0
                    if (chars[i][j][k] == 1) {
                        if (k == 1) System.out.print("_"); //if it is the number at the centre
                        else System.out.print("|");
                    }
                    else System.out.print(" ");
                }
                System.out.print(" "); // space out each char
            }
            System.out.println(); // go to the next line
        }
	}

}
