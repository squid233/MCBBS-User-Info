package io.github.squid233.mcbbsuserinfo;

import io.github.squid233.mcbbsuserinfo.user.PrintUser;

public class Main {

    public static String exit = "n";

    public static void main(String[] args) {

        while (!exit.equalsIgnoreCase("y")) {
            new PrintUser();

            if (exit.equalsIgnoreCase("y")) {
                System.exit(0);
            }

        }

    }

}
