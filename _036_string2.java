/**
 * WAP
 * 1. create string using string lateral
 * 2. using character array
 * 3. using byte array
 * 4. copy data of 1 string into another string
 */



 public class _036_string2 {
 
     public static void main(String[] args) {
         String str1 = "hello world";
         System.out.println("String literal: "+ str1);
         
         char[] arr = { 'H', 'e', 'l', 'l', 'o' };
         String str2 = new String(arr);
         System.out.println("character array: "+ str2);
         
         byte[] arr1= {87,34,98,65,114};
         String str3 = new String(arr1);
         System.out.println("Byte array: "+ str3);
 
         String str4 = new String(str1);
         System.out.println("Copied String: " + str4);
         
 
     }
 
 }