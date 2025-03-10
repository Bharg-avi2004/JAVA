public class ConvertNumberInteString {
    public static void main(String[] args) {
        int intVal = 123;
        String str1 = String.valueOf(intVal);
        double doubleVal = 123.456;
        String str2 = String.valueOf(doubleVal);
        System.out.println(str2);  
        long longVal = 1234567890L;
        String str3 = String.valueOf(longVal);
        System.out.println(str3);  
        float floatVal = 123.456f;
        String str4 = String.valueOf(floatVal);
        System.out.println(str4);  
      }
    
}
