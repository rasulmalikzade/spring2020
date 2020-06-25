package day25_MethodsRecap;

public class Driver {
    public static void main(String[] args) {
        //getDriver();  // argument is mandatory
        String str = getDriver("chrome");
        System.out.println(str);

    }

    public static String getDriver(String browserName) {
        String result = "";

        switch (browserName.toLowerCase()) {
            case "chrome": result = "Chrome Driver";
            break;
            case "firefox": result = "Firefox Driver";
            break;
            case "safari": result = "Safari Driver";
            break;
            case "opera" : result = "Opera Driver";
            break;
            case "edge": result = "Edge Driver";
                break;
            default: result = "Invalid Driver";

        }



        return result;
    }
}
