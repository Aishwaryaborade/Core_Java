package concepts;
public class Stringmethod {
    public static void main(java.lang.String[] args) 
		{
        String str1 = "Aishwarya";
        String str2 = "Borade";

        System.out.println("String 1:" + str1 );
        System.out.println("String 2:" + str2 );

        // Length of the strings
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());
        
        // Convert to lowercase
        System.out.println("String 1 Lowercase: " + str1.toLowerCase());
        System.out.println("String 2 Lowercase: " + str2.toLowerCase());

        // Convert to uppercase
        System.out.println("String 1 Uppercase: " + str1.toUpperCase());
        System.out.println("String 2 Uppercase: " + str2.toUpperCase());

        // Check if the strings start with a specific substring
        String prefix = "Hello";
        System.out.println("String 1 starts with '" + prefix + "': " + str1.startsWith(prefix));
        System.out.println("String 2 starts with '" + prefix + "': " + str2.startsWith(prefix));

        // Check if the strings end with a specific substring
        String suffix = "example";
        System.out.println("String 1 ends with '" + suffix + "': " + str1.endsWith(suffix));
        System.out.println("String 2 ends with '" + suffix + "': " + str2.endsWith(suffix));

        
        // Replace a substring with another string
        String oldSubstring = "is";
        String newSubstring = "was";
        String replacedString1 = str1.replace(oldSubstring, newSubstring);
        String replacedString2 = str2.replace(oldSubstring, newSubstring);
        System.out.println("Replaced '" + oldSubstring + "' with '" + newSubstring + "' in String 1: '" + replacedString1 + "'");
        System.out.println("Replaced '" + oldSubstring + "' with '" + newSubstring + "' in String 2: '" + replacedString2 + "'");

        // Join strings using a delimiter
        String delimiter = "-";
        String joinedString = str1 + delimiter + str2;
        System.out.println("Joined Strings using '-': '" + joinedString + "'");
        
        //trim
        System.out.println("trim of str 1:"+str1.trim());
        System.out.println("trim of str2:"+str2.trim());
        //equal or not by ignoring
        
        boolean res=str1.equalsIgnoreCase(str2);
        System.out.println("str1 and str2 are  equal or not byy egnoring small and uppercase:"+res);
        
        //equal or not
        
        
        boolean res1=str1.equals(str2);
        System.out.println("str1 and str2 are  equal or not byy egnoring small and uppercase:"+res1);
        
        
        boolean res3=str1.contains(str2);
        System.out.println("str1 and str2 :"+res3); 
      
		}

}
