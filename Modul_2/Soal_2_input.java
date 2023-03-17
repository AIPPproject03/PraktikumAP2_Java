package Modul_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soal_2_input {
    public static String bacaString () {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = ""; 
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return string;
    }

    public static int bacaInt() {
        return Integer.parseInt(bacaString());
    }
}