package com.techelevator;

import java.time.LocalDate;

public class StringFormatExample {

    public static void main(String[] args) {

        Person person1 = new Person("James", "Kirk", LocalDate.now(), "123-456-789");

        String name = "Kirk";
        String color = "green";
        String day = "Wednesday";
        int messageCount = 5;

        String msg = name + ", you have " + messageCount + " messages.";

        String msgUsingFormat = String.format("%s, %20.20s %s you have %d messages.",
                person1,  color, day, messageCount);


        System.out.println(msg);
        System.out.println(msgUsingFormat);

    }
}
