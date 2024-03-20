import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double in = 0;
        double out = 0;
        while (in != -1){
            System.out.print("Please input your query in the form \"1 metric = imperial\" (Ex: 3.4 km = mi), type -1 to quit: ");
            in = scan.nextDouble();
            String first = scan.next();
            scan.next();
            String second = scan.next();
            
            if(first.equals("km")) {
                if(second.equals("mi")){
                    out = in * 0.621371;
                    System.out.println(String.valueOf(in) + " kilometers in miles is " + String.valueOf(out));
                }
                else if(second.equals("yd")){
                    out = in * 1093.61;
                    System.out.println(String.valueOf(in) + " kilometers in yards is " + String.valueOf(out));
                }
                else {
                    System.out.println("Input is invalid. Accepted inputs are: \nkm = mi\nkm = yd\nkg = lb\ng = oz\nm = yd\nm = ft");
                }
            }
            else if(first.equals("m")){
                if (second.equals("yd")){
                    out = in * 1.09361;
                    System.out.println(String.valueOf(in) + " meters in yards is " + String.valueOf(out));
                }
                else if (second.equals("ft")) {
                    out = in * 3.28084;
                    System.out.println(String.valueOf(in) + " meters in feet is " + String.valueOf(out));
                }
                else {
                    System.out.println("Input is invalid. Accepted inputs are: \nkm = mi\nkm = yd\nkg = lb\ng = oz\nm = yd\nm = ft");
                }
            }
            else if (first.equals("kg")){
                if (second.equals("lb")){
                    out = in * 2.20462;
                    System.out.println(String.valueOf(in) + " kilograms in pounds is " + String.valueOf(out));
                }
                else {
                    System.out.println("Input is invalid. Accepted inputs are: \nkm = mi\nkm = yd\nkg = lb\ng = oz\nm = yd\nm = ft");
                }
            }
            else if (first.equals("g")){
                if(second.equals("oz")){
                    out = in * 0.035274;
                    System.out.println(String.valueOf(in) + " grams in ounces is " + String.valueOf(out));
                }
                else {
                    System.out.println("Input is invalid. Accepted inputs are: \nkm = mi\nkm = yd\nkg = lb\ng = oz\nm = yd\nm = ft");
                }
            }
            else {
                System.out.println("Input is invalid. Accepted inputs are: \nkm = mi\nkm = yd\nkg = lb\ng = oz\nm = yd\nm = ft");
            }
        }
        scan.close();
    }    
}