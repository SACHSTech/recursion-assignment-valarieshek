package recursionAssignment;
import java.io.*;

public class Recursion{
  
  //Problem Set1: count8
  public static int count8(int N){
    int Num8;
    int intCount = 0;
    if(N > 1){
      Num8 = N%10;
      if(Num8 == 8){
        intCount = intCount +1;
      }
      N = (N-Num8)/10;
      return intCount + count8(N);
    }else{
    }return 0;
  }
  
    
  
    //Problem Set2: pairStar (final/complete)
    //base code
    public static String pairStar(String word) {
    if ( word == null ) 
    return word;
    return tailReverse(word, ""); 
    }
    //recursion code
    public static String tailReverse(String word, String res) {
     //res = word bank
 	  if(word.equals("") )     
     	// null is no String; "" is empty String
     	return res;
 	  else if (word.length() == 1) {
     res = res + word.charAt(0);
     return res;
 	  }else
   	  if (word.charAt(0) == word.charAt(1)){
   		 	res = res + word.charAt(0)+"*";
      	return tailReverse(word.substring(1, word.length()),res);
       }else{
       res  = res + word.charAt(0);
       return tailReverse(word.substring(1, word.length()),res);
       }
  }

  //Problem Set3: stringClean (finish/complete)
  public static String stringClean(String word){
    if ( word == null ) 
    return word;
    return Reverse(word, ""); 
    }
    //recursion code
    public static String Reverse(String word, String res) {
     //res = word bank
 	    if(word.equals("") )     
     	// null is no String; "" is empty String
      	return res;
 	    else if (word.length() == 1) {
      res = res + word.charAt(0);
       return res;
 	    }else
   	    if (word.charAt(0) == word.charAt(1)){
      	  return Reverse(word.substring(1, word.length()),res);
         }else{
          res  = res + word.charAt(0);
          return Reverse(word.substring(1, word.length()),res);
       }
  }

/*
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    
    
    //Problem Set1: count8
    int N;
    N = Integer.parseInt(keyboard.readLine());
    System.out.println(Recursion.count8(N));
    
    //Problem Set2: pairStar
    String wordIn;
    wordIn = keyboard.readLine();
    System.out.println(Recursion.pairStar(wordIn));


    //Problem Set3: stringClean
    String wordIn;
    wordIn = keyboard.readLine();
    System.out.println(Recursion.stringClean(wordIn));

  }*/
}
