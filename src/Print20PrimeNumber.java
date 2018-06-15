public class Print20PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while (count < 20) {
            boolean isPrime = true;
            if (n < 2) {
                isPrime =false;
            }else {
                int i = 2;
                while (i < n) {
                    if(n%i== 0){
                        isPrime = false;
                        break;
                    }
                    i++;
                }
            }
            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}

