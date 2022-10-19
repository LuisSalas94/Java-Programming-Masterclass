public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString = " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString = " + myString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastSting is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastSting is equal to " + lastString);
    }
}