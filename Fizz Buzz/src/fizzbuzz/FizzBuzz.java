/*
 *Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz”."
 */
package fizzbuzz;

/**
 *
 * @author Tania Chin
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for (int number = 1; number <= 100; number++) {
	    String count="";
        if (number % 3 == 0){
            count = count + "Fizz";
        }
	    if (number % 5 == 0){
	        count = count + "Buzz";
	    }
        if (number % 3 != 0 && number % 5 != 0){ //print the number, the int
            System.out.println(number);
        }
        else{
            System.out.println(count);
        }
        
 }
    }
    
}
