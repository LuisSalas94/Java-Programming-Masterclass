public class CalculateFeet {
    public static void main(String[] args){
        calcFeetAndInchesToCentimeters(6,-10);
        double feetResult = calcFeetAndInchesToCentimeters(0.5);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && (inches >= 0 && inches <= 12)){
          double centimeters =  (feet * 30.48) + (inches * 2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm" );
            return centimeters;
        }else{
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
          return inches * 0.0833333d;
        }
        return -1;
    }

}
