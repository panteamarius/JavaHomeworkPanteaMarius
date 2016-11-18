/*
 This is an execrise to use operators on primary data type and wrappers
 */
package javahomeworkpanteamarius;
/**
 *
 * @author admin
 */
public class VarOperator {
    
    public static void main(String[] args) {  
    //This is an exercise for using operators on byte data type
    byte b1 = 8 * 2;
    byte b2 = 4 / 2;
    byte b3 = 2 + 4;
    byte b4 = 8 - 6;
    byte b5 = b4++;
    byte b6 = b5--;
    byte b7 = 10 % 7;
    System.out.println("Here are the results on using operators on byte data type");
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);
    System.out.println(b7);
    // This is an exercise for byte wrapper class
    Byte b11 = new Byte("11");
    int bwrapp = 80 + b11;
    System.out.println(bwrapp);
    //This is an exercise for using operators on short data type
    short s1 = 100 * 4;
    short s2 = 500 / 2;
    short s3 = 300 % 2;
    short s4 = 345 + 234;
    short s5 = 234 - 123;
    short s6 = s5--;
    short s7 = s6++;
    System.out.println("Here are the results on using operators on short data type");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    //This is an exercise for short wrapper class
    Short s11 = new Short("200");
    String rezultat = "Your result is" + " " + s11;
    System.out.println(rezultat);
    //This is an exercise for using operators on int data type
    int i1 = 1000 * 2000;
    int i2 = 2000 / 2000;
    int i3 = i1 + 6000;
    int i4 = i2 - 7000;
    int i5 = i1 ++;
    int i6 = i2 --;
    int i7 = i2 % 100;         
    System.out.println("Here are the results on using operators on int data type");
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(i4);
    System.out.println(i5);
    System.out.println(i6);
    System.out.println(i7);
    //This is an exercise for Integer Wrapper Class
    Integer i11 = new Integer("2443");
    float f = i11.floatValue();
    System.out.println(f);
    //This is an exercise for using operators on long data type
    long l1 = 100000 * 5;
    long l2 = 600000 / 2;
    long l3 = 5000000 + 213433;
    long l4 = 2342398 - 123213;
    long l5 = 1000000 % 10;
    long l6 = l5 ++;
    long l7 = l4 --;
    System.out.println("Here are the results on using operators on long data type");
    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);
    System.out.println(l5);
    System.out.println(l6);
    System.out.println(l7);
    //This is an exercise for Long Wrapper Class
    Long l11 = new Long("2017");
    String year= "In just a few mounths, we are going to enter year" + " " + l11;
    System.out.println(year);
    //This is an exercise for using operators on float data type
    float f1 = (float) (2.5 * 1.0);
    float f2 = (float) (4.0 / 1.2);
    float f3 = (float) (6.3 + 2.7);
    float f4 = (float) (8.2 * 5.8);
    System.out.println("Here are the results on using operators on float data type");
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    //This is an exercise for Float Wrapper Class
    Float f11= new Float("2.2");
    int i= f11.intValue();
    System.out.println(i);
    //This is an exercise for using operators on double data type
    double d1 = 100.40;
    double d2 = 2.20;
    double d3 = d1 * d2;
    double d4 = d2 / d1;
    double d5 = d3 + d4;
    double d6 = d1-d2;
    double d7 = 100.00 % 10.00;
    double d8 = d7 ++;
    double d9 = d7 --;
    System.out.println("Here are the results on using operators on double data type");
    System.out.println(d3);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println(d6);
    System.out.println(d7);
    System.out.println(d8);
    System.out.println(d9);
    //This is an exercise for Double Wrapper Class
    Double d11= new Double("20.40");
    float ff = d11.floatValue();
    System.out.println(ff);
    //This is an exercise for using operators on string data type 
    char initialName = 'M';
    char initialSurName = 'P';
    String Name = "Marius-Cornel";
    String SurName = "Pantea";
    String FullName = Name +" "+ SurName;
    System.out.println("Here is the result of concatenating two strings");
    System.out.println(FullName);
    //This is an exercise for using operators on boolean data type
    System.out.println("Here are the results for using operators on boolean data type");
    int x = 100;
    int y = 15;
    System.out.println(x<=15);
    System.out.println(x==y);
    System.out.println(x<y);
    System.out.println(x>y);
    boolean isBigger = x<y;
    //This is an exercise for Boolean Wrapper Class
    String ghig = "default";
    Boolean nn1 = Boolean.valueOf(ghig);
    }
}
