public class ArrayOps {
    public static void main(String[] args) {
     int [] array = {8, 7 ,3,3};
     int [] array1 = {0,1,2,8,};
     System.out.println(isSorted(array));
    }
    
    public static int findMissingInt (int [] array) {
        int length = (array.length);
        int [] arraycheck = new int[length+1];
        int missing = 1;
        for(int i=0 ; i<=length-1 ; i++){
            for(int j = 0 ; j <= length ; j++) {
        if (array[i] == j) 
        arraycheck[j]=j;
        else;
        }
    }
     for(int m=0 ; m<=length ; m++){
        if  (arraycheck[m] != m )
        missing=m;
        else;
    }        
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secmax = array[0];
          for(int i=0 ; i <= array.length-1 ; i++){
          if ((array[i] > secmax) && (array[i] > max )) {
            secmax = max;
            max = array [i];
          }
            else;
            if (array[i] > secmax && array[i] < max ) 
            secmax = array [i];
            else;
        }
        return secmax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean check = true;
         for(int i = 0 ; i < array1.length ; i++){
             check =false;
            int a = array1[i];
            for(int j = 0 ; j < array2.length ; j++) {
                int b = array2 [j] ;
                if (a == b)
                check = true;
                else;
            }
            if (check == false)
            return check;
        }
        return check;
    }

    public static boolean isSorted(int [] array) {
        boolean check = true;
        int a = array[0];
        int b = array[1];
        if (a > b){
          for(int i = 0 ; i < array.length-1 ; i++){
            a = array[i];
            b = array[i+1];
            if (b >= a){
                check = false;
                return check;
            }
            else;
                  }
        }
        if (b > a){
             for(int i = 0 ; i < array.length-1 ; i++){
              a = array[i];
            b = array[i+1];
            if (a >= b){
                check = false;
                return check;
            }
            else;
          }
        }
            return check;
    }

}
