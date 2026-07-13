public class StringOperations {
    public static void main(String[] args) {

        // String Creation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        // Concatenation
        System.out.println("Concatenation: " + str1.concat(" " + str2));

        // Length
        System.out.println("Length: " + str1.length());

        // Character at Index
        System.out.println("Character at index 1: " + str1.charAt(1));

        // Compare Strings
        System.out.println("Equals: " + str1.equals("Hello"));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        // Contains
        System.out.println("Contains 'ell': " + str1.contains("ell"));

        // StartsWith & EndsWith
        System.out.println("StartsWith 'He': " + str1.startsWith("He"));
        System.out.println("EndsWith 'lo': " + str1.endsWith("lo"));

        // IndexOf & LastIndexOf
        String text = "Java is a programming language. Java is popular.";
        System.out.println("First Index of Java: " + text.indexOf("Java"));
        System.out.println("Last Index of Java: " + text.lastIndexOf("Java"));

        // Substring
        System.out.println("Substring: " + text.substring(0, 4));

        // Replace
        System.out.println("Replace Java with Python: " + text.replace("Java", "Python"));

        // Uppercase & Lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // Trim
        System.out.println("Trim: '" + str3.trim() + "'");

        // Split
        String sentence = "Apple,Banana,Mango";
        String[] fruits = sentence.split(",");
        System.out.println("Split:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Join
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Joined String: " + joined);

        // isEmpty
        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());

        // Repeat (Java 11+)
        System.out.println("Repeat: " + str1.repeat(3));

        // toCharArray
        char[] chars = str1.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ValueOf
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("String ValueOf: " + numStr);

        // String to Integer
        int num = Integer.parseInt("123");
        System.out.println("Parsed Integer: " + num);

        // Integer to String
        String s = Integer.toString(456);
        System.out.println("Integer to String: " + s);

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);

        // Compare using ==
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));
    }
}