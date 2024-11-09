package ua.edu.ucu.apps.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockedDocumentTests {
    
    @Test
    public void testMockedDocument() {
        String expected = "Mocked text";
        MockedDocument doc = new MockedDocument(expected);
        assertEquals(expected, doc.parse());
    }
}
