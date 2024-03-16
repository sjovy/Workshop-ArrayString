package se.lexicon;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize());
        NameRepository.add("Åsa Testsson");
        NameRepository.add("Test Testsson");
        NameRepository.add("Best Testsson");

        System.out.println(NameRepository.getSize());
        String foundTestName = NameRepository.find("test test");
        System.out.println("foundTestName = " + foundTestName);

        String[] testNames = NameRepository.findByFirstName("best");
        for (String testName : testNames) {
            System.out.println("testFirst = " + testName);
        }

        testNames = NameRepository.findByLastName("testsson");
        for (String testName : testNames) {
            System.out.println("testLast = " + testName);
        }

        boolean changeName = NameRepository.update("Best Testsson", "Ola Karlsson");
        System.out.println(changeName);
        System.out.println(NameRepository.names[0]);
        System.out.println(NameRepository.names[1]);
        System.out.println(NameRepository.names[2]);

        boolean removeName = NameRepository.remove("Åsa Testsson");
        System.out.println(removeName);

        System.out.println(NameRepository.names[0]);
        System.out.println(NameRepository.names[1]);
        // System.out.println(NameRepository.names[2]);

    }
}
