package exercise_2;

public class Numbers {

    public Numbers(){}

    /**
     * Method to check if a given number is prime
     * @param number given number to check
     * @return true if the number is prime; false if the number is not prime
     */
    public boolean isPrime(int number){
        int count = 0;

        for(int i=1; i<number; i++){
            //check if rest of division is 0
            if(number%i == 0){
                //increment number of times that number is divisible
                count++;
            }
            //break the cycle if it is already a non-prime number
            if (count > 1){
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks if a given number is even
     * @param number given number to check
     * @return true if the number is even; false if the number is odd
     */
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    /**
     * This method checks if a number is multiple of another
     * @param number given number to check if it is multiple
     * @param divisor given divisor
     * @return true if number is multiple; false if it is not multiple
     */
    public boolean isMultiple(int number, int divisor){
        return divisor%number == 0;
    }
}
