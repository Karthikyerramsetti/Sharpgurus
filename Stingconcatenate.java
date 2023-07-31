public class Stingconcatenate {
    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = "Karthik";
    
        String concatenatedString = concatenateStrings(str1, str2);
        System.out.println(concatenatedString);
        }
    
        public static String concatenateStrings(String str1, String str2) {
            return str1 + str2;
        }
    }
