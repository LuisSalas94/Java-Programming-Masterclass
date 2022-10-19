public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking && hourOfDay < 0){
          return  false;
        }else if(!barking && hourOfDay == 24){
            return  false;
        }else if(barking && hourOfDay < 8){
          return true;
        }else if(barking && hourOfDay == 8 || hourOfDay == 23){
          return true;
        }else if(barking && hourOfDay > 23){
          return  false;
        }else if(!barking && hourOfDay < 8 || hourOfDay > 22){
          return false;
        }else if((!barking || barking) && hourOfDay == 8 || hourOfDay == 22){
            return false;
        }
        return barking;
    }
}
