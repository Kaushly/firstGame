package ru.game.divvvan.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleUtils {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int getIntFromConsole() {
        try {
            String s = reader.readLine();
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное число, попробуйте еще раз");
            return getIntFromConsole();
        }
    }
}
