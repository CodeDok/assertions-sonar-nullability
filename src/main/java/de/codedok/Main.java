package de.codedok;

import org.jspecify.annotations.NonNull;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public @NonNull String test2;

    public Main() {
        test2 = "";
    }

    public static void main(String[] args) {

        String test = "test";
        Main main = new Main();

        main.test2 = ObjectAssertions.with("test", test).isNotNullReturn();

        System.out.println(main.test2);
    }
}