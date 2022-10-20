public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i<=1000; i++){
            if(i % 15 == 0){
              count++;
              sum += i;
              System.out.println("Number that can be divided with both 3 and 5: " + i);
            }
            if(count == 5) break;
        }
        System.out.println("The Result is: " + sum);
    }
}