package io;

import java.io.Console;

public class ConsoleDemo {
    public static void show(){
        Console console = System.console();
//        System.out.print("Name: ");
//
//        String name = console.readLine();
//        System.out.println(name);
//
//        System.out.print("Password: ");
//
//        var password = console.readPassword();
//        var p = Arrays.toString(password);
//        System.out.println(p);
//
        var pass = console.readPassword("Password: ");
        System.out.println(pass);
    }
}
