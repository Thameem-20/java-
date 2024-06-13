import java.util.Scanner;  
public class UniqueChar   
{  
public static String findUniqueChar(String inputStr)  
{  
    // integer array for storing the frequency of characters  
    int arr[] = new int[256];   
      
    for(int j = 0; j < inputStr.length(); j++)  
    {  
        // count frequency of characters of the input string  
        char ch = inputStr.charAt(j);  
        arr[ch - 'a'] = arr[ch - 'a'] + 1;  
    }  
      
    String str = "";  
    for(int i = 0; i < 256; i++)  
    {  
        if(arr[i] == 1)  
        {  
        // creating the string that only contains the unique characters  
        str = str + ((char)(i + 'a'));  
        }  
    }  
      
    // returning the resultant string  
    return str;  
}  
      
    // main method  
public static void main(String argvs[])   
{  
    // Your code goes here  
    Scanner scn = new Scanner(System.in);  
    String str = scn.nextLine();  
      
    String s = findUniqueChar(str);  
    if(s.length() == 0)  
    {  
        System.out.println("There is no unique characters present in the string: '" + str + "'");      
    }  
    else  
    {  
       System.out.println("The unique characters present in the string: '" + str + "' are: ");   
       for(int i = 0; i < s.length(); i++)  
       {  
           System.out.print(s.charAt(i) + " ");  
       }  
    }
}
}
   