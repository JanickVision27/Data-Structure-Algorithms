public class Basic_Math {

    /*
     * You have to use the trimmer for counting digits
     * temp = temp / 10
     * count++;
     */
    public void countNumbers() {
        int n = 12345;
        int count = 0;

        int temp = n;
        System.out.println();

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("The Number of Digits : " + count);
    }

    public void reverseNumbers() {
        int num = 12345;
        int reverse = 0;

        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse Numbers : " + reverse);

    }

}
