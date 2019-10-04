/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program Kejujuran
 */
public class PBO210118080Latihan30Cakep {

    /**
     * @param args the command line arguments
     */
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";

        public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
        public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ANSI_RED + "Kamu " + ANSI_GREEN+"ngerjain sendiri "+ANSI_YELLOW+"latihan 17 sampe "+ANSI_BLUE+"latihan 30 ini? : "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"Jawab"+ANSI_RED+" (Yoi/Enggak) : "+ANSI_RESET);
        Scanner a = new Scanner(System.in);
        String jwb = a.nextLine();
        System.out.println("");
        if ("yoi".equals(jwb.toLowerCase())) {
            System.out.println(ANSI_RED+"Cakep Bener."+ANSI_PURPLE+" Good Job"+ANSI_RESET);
        } else if ("enggak".equals(jwb.toLowerCase())) {
            System.out.println(ANSI_RED+"Tetep cakep sih."+ANSI_RESET);
            System.out.println(ANSI_CYAN+"Sing penting paham konsep nya yee."+ANSI_RESET);
            System.out.println("Keep the code work dude.");
        }else {
            System.out.println("Jawab sesuai pilihan gais!");
        }
        System.out.println("");
         System.out.println(ANSI_RED_BACKGROUND+ANSI_WHITE+"Developed by"+ANSI_WHITE_BACKGROUND+ANSI_RED+" Taufiq Rizky"+ANSI_RESET);
    }
    
}
