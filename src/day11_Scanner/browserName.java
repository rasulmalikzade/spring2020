package day11_Scanner;

public class browserName {
    public static void main(String[] args) {
        String browserName = "Firefox";
        switch (browserName) {
            case "Chrome" :
                System.out.println("Chrome is opening...");
                 break;
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid browser naim...");
        }
    }
}
