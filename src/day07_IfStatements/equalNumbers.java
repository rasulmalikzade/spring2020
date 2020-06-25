package day07_IfStatements;

public class equalNumbers {
    /*declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal*/
    public static void main(String[] args) {
        double n1 =100,n2=170,n3=170;
        boolean n1n2 = n1==n2 && n1!=n3;
        boolean n1n3 = n1==n3 && n1!=n2;
        boolean n2n3 = n2==n3 && n2!=n1;
        boolean n1n2n3 = n1==n2 && n1==n3;
        //boolean none = n1!=n2 && n2!=n3 && n1!=n3;
        boolean none1 = !n1n2 && !n2n3 && !n1n3;  // short way
        if (n1n2) {
            System.out.println("n1=n2");
        } if (n2n3) {
            System.out.println("n2=n3");
        }



    }
}
