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

    public static String[] findByTestName(final String testName, int num) {
        String[] result = new String[names.length];
        int i = 0;
        for (String name : names) {
            if (name.split(" ")[num].equalsIgnoreCase(testName)) {
                result[i++] = name;
            }
        }
        result = Arrays.copyOfRange(result, 0, i);
        return result;
    }

    public static String[] findByFirstName(final String firstName) {
        if (firstName != null) {
            return findByTestName(firstName, 0);
        }
        return null;
    }

    public static String[] findByLastName(final String lastName) {
        if (lastName != null) {
            return findByTestName(lastName, 1);
        }
        return null;
    }


    public static boolean update(final String original, final String updatedName) {

        //todo: implement the logic

        return false;
    }

    public static boolean remove(final String fullName) {

        //todo: implement the logic

        return false;
    }


}
