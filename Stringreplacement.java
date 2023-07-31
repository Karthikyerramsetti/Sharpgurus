public class Stringreplacement {
        public static void main(String[] args) {
            String originalString = "Hello Karthik";
            String substringToReplace = "Hello";
            String replacementString = "Hi";
    
            String modifiedString = replaceSubstring(originalString, substringToReplace, replacementString);
            System.out.println("Modified String: " + modifiedString);
        }
    
        public static String replaceSubstring(String originalString, String substringToReplace, String replacementString) {
            return originalString.replace(substringToReplace, replacementString);
        }
    }
