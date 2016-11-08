/*
 * This is a a java program that will use scanner class to read from keyboard and print it in console
 */
package javahomeworkpanteamarius;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaHomeworkPanteaMarius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please:" );  
        String username = (scan.nextLine());
        System.out.println("Your name is " + username);
    }