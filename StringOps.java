public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string = "Hello my FRienD mY nAme is";
     System.out.println(capVowelsLowRest(string));
    }

    public static String capVowelsLowRest (String string) {
        String str = "";
        String str1 ="";
        char c;
        for (int i = 0 ; i < string.length(); i++){
            c = string.charAt(i);
			if ( 90 >= c && c >= 65)
			c=(char) (c+32);
            str = str +c ;
        }
         for (int j = 0 ; j < str.length(); j++){
             c = str.charAt(j);
			if ( c == 97 || c == 101 || c == 105 || c ==111 || c == 117){
			c=(char) (c - 32);
            str1 = str1 +c ;
         }
         else 
         str1 = str1 +c ;
         }
        return str1;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
