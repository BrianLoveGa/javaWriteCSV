package com.BrianLoveless1;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // System.out.println("howdy");

        String ID = "0003";
        String firstName = "Ben";
        String lastName = "Franklin";
        String state = "Massachusetts Bay Colony";
        String email = "bornbeforewehadstates@usa.gov";

        String filepath = "data.txt";

        saveRecord(ID, firstName, lastName, state, email, filepath);

    }

    public static void saveRecord(String ID, String firstName, String lastName, String state, String email, String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ID + "," + firstName + "," + lastName + "," + state + "," + email);

            pw.flush();
            pw.close();

            JOptionPane.showMessageDialog(null, "record success file updated");


        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "error record not saved");
        }


    }
}
