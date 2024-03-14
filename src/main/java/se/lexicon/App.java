package se.lexicon;

public class App {
    public static void main(String[] args) {
        System.out.println(NameRepository.getSize()); // 0
        boolean isAddedTestName = NameRepository.add("Test Testsson");
        System.out.println("isAddedTestName = " + isAddedTestName);
        System.out.println(NameRepository.getSize()); // 1
        String foundTestName = NameRepository.find("test test");
        System.out.println("foundTestName = " + foundTestName);

    }
}
