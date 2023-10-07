/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chal1;

/**
 *
 * @author russel
 */
public class boring {

    static void Typed(String str) throws InterruptedException {
        for (int i = 0; i < str.length(); i++) {
            System.out.print("" + str.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print("\b \b");

        }
    }

    public static void main(String[] args) throws InterruptedException {
        String str = "Magaan na ba ang 'yong paghinga bumalik ka na sa'kin";
        String str1 = "Klaro na ba ang isip sinta bumalik ka na sa'kin";
        String str2 = "Hindi ka na nagparamdam";
        String str3 = "Buhat ng cool off ako'y nahibang";
        String str4 = "Sige na please 'wag nang mainis bumalik ka na sa'kin";
        String str5 = "Sorry mahal ika'y nasaktan bumalik ka na sa'kin";
        String str6 = "Bumalik ka na sa akin";
        Typed(str);
        Typed(str1);
        Typed(str2);
        Typed(str3);
        Typed(str4);
        Typed(str5);
        Typed(str6);
    }
}
