package githubproject;

import java.security.SecureRandom;

public class Generator 
{
    public static String generate(int length) 
    {
        SecureRandom rand = new SecureRandom();
        StringBuilder strBuilder = new StringBuilder();
        
        char c;
        int charValue;
        String password;
        

        for (int i = 0; i < length; i++) 
        {
            charValue = rand.nextInt(94) + 33;
            c = (char)charValue;
            strBuilder.append(c);
        }
        
        return password = strBuilder.toString();
    }
}