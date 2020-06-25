package day27_DataTime;
import java.time.LocalDate;
public class Dates {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate Birthday = LocalDate.of(1992, 04,24);
        System.out.println(Birthday);
        String birth = Birthday.toString();
        System.out.println(birth.replace("-", "/"));
        System.out.println(now);

    }
}
