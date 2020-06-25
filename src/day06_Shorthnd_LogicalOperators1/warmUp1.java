package day06_Shorthnd_LogicalOperators1;

public class warmUp1 {

        public static void main(String[] args) {

            double gallon = 1;
            double liter = 3.785 * gallon;
            System.out.println(gallon);
            System.out.println("======================================");

            int a = 200;
            int b = -a++ + - --a * a-- % 2;

            System.out.println(b);
            System.out.println(a);

            int a1 =100;
            int b1= (a1*=2)+ ++a1;
            System.out.println(b1);
            System.out.println("+++++++++++++++++++++++++");

            int num1=300;
            num1/=2;
            System.out.println(num1);

            int n1 =-400;
            n1%=3*5;
            System.out.println(n1);

        }
}

/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;


 */
