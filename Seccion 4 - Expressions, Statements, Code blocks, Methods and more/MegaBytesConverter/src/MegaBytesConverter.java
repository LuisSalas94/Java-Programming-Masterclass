public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else if(kiloBytes == 0){
            System.out.println(0 + " KB = " + 0 + " MB" + " and " + 0 + " KB");
        }else{
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB" + " and " + kiloBytes % 1024 + " KB");
        }
    }
}
