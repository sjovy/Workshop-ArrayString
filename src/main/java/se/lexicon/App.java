package se.lexicon;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize()); // 0
        NameRepository.add("Test Svensson");
        NameRepository.add("Test Testsson");
        NameRepository.add("Best Karlsson");

        System.out.println(NameRepository.getSize()); // 1
        String foundTestName = NameRepository.find("test test");
        System.out.println("foundTestName = " + foundTestName);

        String[] testNames = NameRepository.findByFirstName("best");
        for (String testName : testNames) {
            System.out.println("testName = " + testName);
        }

        testNames = NameRepository.findByLastName("Svensson");
        for (String testName : testNames) {
            System.out.println("testName = " + testName);
        }

    }
}
