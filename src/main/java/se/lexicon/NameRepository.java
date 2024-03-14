package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    static String[] names = new String[0];

    public static String find(final String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    public static boolean add(final String fullName) {
        String foundFulName = find(fullName);
        if (foundFulName != null) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[newNames.length - 1] = fullName;
        names = newNames;
        return true;
    }

    public static int getSize() {
        return names.length;
    }

    public static String[] findByFirstName(final String firstName) {
        // String testName = firstName;
        String[] result = new String[names.length];
        int index = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                result[index] = name;
                index++;
            }
        }
        result = Arrays.copyOfRange(result, 0, index);
        return result;
    }

    public static String[] findByLastName(final String lastName) {
        // String testName = lastName;
        String[] result = new String[names.length];
        int index = 0;
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                result[index] = name;
                index++;
            }
        }
        result = Arrays.copyOfRange(result, 0, index);
        return result;
    }

/*
    public static boolean update(final String original, final String updatedName) {
        //todo: implement the logic

        return null; //result;
    }
*/
}
