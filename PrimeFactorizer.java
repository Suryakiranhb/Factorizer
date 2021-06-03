class PrimeFactorizer {
    public static void main(String[] args) {
    //    int factors;
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;
        int number = 888;
        
        while(number%2==0) {
            number = number / 2;
            count2++;
        }
        
        while(number%3==0) {
            number = number / 3;
            count3++;
        }

        while(number%5==0) {
            number = number / 5;
            count5++;
        }

        System.out.println("Twos: " + count2);
        System.out.println("Threes: " + count3);
        System.out.println("Fives: " + count5);

        if(number%2!=0 || number%3!=0) {
            System.out.println("Other: " +number);
        }

        
    }
}