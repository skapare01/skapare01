package utils;

import java.util.Random;

public class RandomGenerator {

    public static String randomName() {
        String[] names = {"Peak", "Mountain", "Sun", "Hill", "Valley", "Cross", "Steel", "Good", "Bad", "Cave", "Strong"
                        , "Brave", "Courage", "Heights", "ABC", "Clean", "Service"};

        Random r = new Random();
        int low = 1;
        int high = 100;
        int num = r.nextInt(high-low) + low;
        String result = String.valueOf(num);

        return result + " " + names[new Random().nextInt(names.length)] + " " + names[new Random().nextInt(names.length)];
    }

    public static String randomNumber() {
        Random r = new Random();
        int low = 1000;
        int high = 1000000000;
        int randomNum = r.nextInt(high-low) + low;

        return String.valueOf(randomNum);
    }

    //Creates random email
    public static String randomEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        int length = 8;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        return randomString + "@gmail.com";
    }

    //Creates random email (MILITARY ONLY)
    public static String randomMilitaryEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        int length = 8;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }

        return randomString + "@gmail.testing.gov";
    }

    //Creates random SSN number
    public static String randomSocialSecurityNumber() {
        String numbers = "123456789";
        String randomSsnNumbers = "";
        int length = 9;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = numbers.charAt(rand.nextInt(numbers.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomSsnNumbers += text[i];
        }

        return randomSsnNumbers;
    }

    //Creates random phone number
    public static String randomPhoneNumber() {
        String numbers = "23456789";
        String randomPhNumbers = "";
        int length = 10;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = numbers.charAt(rand.nextInt(numbers.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomPhNumbers += text[i];
        }

        return randomPhNumbers;
    }

    public static String randomUsername() {
        String[] names = {"Tom", "Jill", "Frank", "Joe", "Lucy", "Tony", "Aang", "Luke", "Patricia", "Ben", "Jimmy",
                          "Bill", "Sandy", "Wilfred", "Sydney", "Phil", "James", "Sam", "Ryan", "Carly"};

        Random r = new Random();
        int low = 1;
        int high = 100;
        int num = r.nextInt(high-low) + low;
        String result = String.valueOf(num);

        return names[new Random().nextInt(names.length)] + result;
    }

    public static String randomRoutingNumber() {
        Random r = new Random();
        int low = 100000000;
        int high = 1000000000;
        int randomNum = r.nextInt(high-low) + low;

        return String.valueOf(randomNum);
    }
    public static String randomLastName() {
        String[] names = {"Johnson", "Martinez", "Jones", "Thompson", "Freeman", "King", "Smith", "Rodriguez", "Taylor", "Brown", "Miller",
                "Jackson", "Martin", "Adams", "Allen", "Harris", "Lopez", "Wilson", "Wright", "Young"};
        return names[new Random().nextInt(names.length)];
    }
}
