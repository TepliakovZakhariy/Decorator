package ua.edu.ucu.apps;

import ua.edu.ucu.apps.decorator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MockedDocument mockedDoc = new MockedDocument();
        System.out.println(mockedDoc.parse());

        TimedDocument timedDoc = new TimedDocument(mockedDoc);
        System.out.println(timedDoc.parse());
    }
}