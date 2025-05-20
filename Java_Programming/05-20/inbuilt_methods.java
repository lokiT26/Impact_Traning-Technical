// Some built-in methods for String

public class inbuilt_methods {
    public static void main(String[] args) {
        String s = "Hello There";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf("o"));
        System.out.println(s.concat(" World!"));
        System.out.println(s.length());
        System.out.println(s.contains("l"));
        System.out.println(s.repeat(2));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String[] parts = s.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println(s.compareToIgnoreCase("hello there"));
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("e"));
        System.out.println(s.substring(1, 4));
        System.out.println(s.replace('l', 'x'));
        System.out.println(s.isEmpty());
        System.out.println(s.trim());
    }
}