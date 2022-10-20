public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,11));
    }
    public static boolean isOdd(int number){
      if(number < 0) return false;
      return number % 2 == 0 ? false : true;
    }

    public static int sumOdd(int start, int end){
        int oddNumbersSum = 0;
        if((end >= start) && (start > 0 && end > 0)){
        for(int i = start; i < end; i++){
          if(isOdd(i)){
           oddNumbersSum += i;
          }
         }
         return oddNumbersSum;
        }else{
         return -1;
        }
    }
}