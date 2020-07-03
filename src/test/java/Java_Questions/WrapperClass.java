package Java_Questions;

public class WrapperClass {
    public static void main(String[] args)
    {
        //integer to string
        int i = 5;
        String j=String.valueOf(i);

        System.out.println("Converting integer " + i + " into string and value is " + j);

        //double to string
        double d = 22288;
        String e=String.valueOf(d);

        System.out.println("Converting double " + d + "into string and the value is " + e);

        //string to int
        String s="100";
        int t=Integer.parseInt(s);

        System.out.println("Converting string" + s +" into integer " + t);


        //string to double
        String a= " 12.33";
        double b=Double.valueOf(a);
        double c = Double.parseDouble(a);

        System.out.println("Converting String " + a+ " in to double and the value is " + b + "  " + c) ;

        //string to boolean
        String x = "true";
        boolean y = Boolean.parseBoolean(x);

        System.out.println("Converting string " + x +" into boolean and the value is " + y);

    }
}
