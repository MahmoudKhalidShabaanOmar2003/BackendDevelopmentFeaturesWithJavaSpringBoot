/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingdifferentescapesequences;

/**
 *
 * @author moka
 */
public class DisplayingDifferentEscapeSequences{
    public static void main(String[] args){
        System.out.println("There Are Different Escape Characters (Escape "
        + "Sequences) Like:");
        System.out.print("\n: New Line , It Is Mainly Used To Move The "
        + "\nScreen Cursor To The Next New Line...\n");
        System.out.print("\t: Horizontal Tab , It Is Mainly Used To Position "
        + "\nThe Screen Cursor To The Next Tab Stop...");
        System.out.println("\r : Carriage Return , It Is Mainly Used "
        + "\nTo Position The Screen Cursor To The Beginning Of The Same Line , Not"
        + "\n Advanced To The Next Line , Any Characters After The Carriage Return "
        + "\nOverwrite Different Characters Previously... \r");
        System.out.println("\\: It Is Mainly Used To Print A Backslash...");
        System.out.println("\": It Is Mainly Used To Print A Double Quotations...");
        System.out.print("\' Is Mainly Used To Print A Single Quotation...");
    }
}