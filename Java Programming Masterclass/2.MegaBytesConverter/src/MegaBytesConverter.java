public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int megabytes;
        int remainder;
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            megabytes = kiloBytes / 1024;
            remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
        }
    }
}
