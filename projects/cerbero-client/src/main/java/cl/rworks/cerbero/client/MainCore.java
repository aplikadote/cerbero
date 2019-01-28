/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rworks.cerbero.client;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aplik
 */
public class MainCore {

    public MainCore() {
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese codigo: ");
            String isbn = scanner.nextLine();
            if (isbn.getBytes().length != 13) {
                System.out.println("... nop! ");
                continue;
            }

            System.out.println("Autorizado!");
        }

    }

}
