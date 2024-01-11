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
        String string = "Hello my FRien";
        char c = 'l' ;
     System.out.println(allIndexOf(string , c));
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
       boolean wasSpace = false;
       String stringUse = string;
        stringUse = noSpaces(stringUse);
        String str = "";
        char c = stringUse.charAt(0);
        if(c >= 65 && c <= 90)
        {
            c = (char)(c + 32);
            str = str +c;
        }
        else 
            str = str + c;
        for(int i = 1 ; i <= (stringUse.length()-1); i++){
            c = stringUse.charAt(i);
            while (c == 32){
              i++ ;
            c = stringUse.charAt(i) ;
             wasSpace = true;
            }
             

          if (c >= 65 && c<=90 && wasSpace == true)
                 str = str +c;
        else  if (c >= 97 && c<=122 && wasSpace == true){
               c =(char) (c - 32);
                 str = str +c;
                       }
        else if (c >= 97 && c<=122 && wasSpace == false)
             str = str +c;
        else if (c >= 65 && c<=90 && wasSpace == false){
             c =(char) (c + 32);
                str = str +c;
                  }
       wasSpace= false;
         
        }
        return str;
    }
    //new function for delete spaces from start of the string
    public static String noSpaces (String string){
        String str = "";
        int counter = 0;
        char c = string.charAt(counter);
        while (c == 32) {
            counter++;
         c = string.charAt(counter);
        }
        int l = (int)(string.length());
        str = string.substring( counter, l );
        return str;
    }
    //new function for counting spaces.
    /*public static int howManySpaces (String string){
        String str = "";
        int counter = 0;
        char c = string.charAt(counter);
        while (c == 32) {
            counter++;
         c = string.charAt(counter);
        }
        int l = (int)(string.length())-1;
        str = string.substring( counter, l );
        return counter;
    }*/
    
    public static int[] allIndexOf (String string, char chr) {
        int counter = 0; 
        char current = string.charAt(0);
        int  length= string.length()-1;
        for(int i = 0; i <= length; i++ ){
            current = string.charAt(i);
            if (chr  == current)
                counter++;
            else;
        }
        int count= 0 ;
        int [] array = new int[counter];
        for(int j = 0; j <= length; j++ ){
            current = string.charAt(j);
            if (chr  == current)
            {
                array[count] = j;
                count ++;
            }
               
         }
    return  array;
}
}