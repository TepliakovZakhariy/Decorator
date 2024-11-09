package ua.edu.ucu.apps.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimedDocumentTests {
        
        @Test
        public void testTimedDocument() {
            String expected = "Mocked text";
            Document doc = new MockedDocument(expected);
            TimedDocument timedDoc = new TimedDocument(doc);
            assertEquals(expected, timedDoc.parse());
        }
}
