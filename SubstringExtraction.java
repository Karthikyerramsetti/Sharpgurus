public class SubstringExtraction {
public static void main(String[] args) {
    String originalString = "Hello Karthik";
        int startIndex = 7;
        int endIndex = 12;
        String extractedSubstring = extractSubstring(originalString, startIndex, endIndex);
        System.out.println("Extracted Substring: " + extractedSubstring);
        }
    
        public static String extractSubstring(String originalString, int startIndex, int endIndex) {

            return originalString.substring(startIndex, endIndex);
        }
    }
