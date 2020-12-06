package recursionAssignment;
import java.io.*;

public class Recursion{
  
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
  
  /*public static String endX(String str){
    String strWord;
    String reverse;
    if(strWord.equals(" ")){
    return " ";
    }else{
    
    }return reverse(strWord.substring(1) + strWord.substring(0));

  }

  /*public static String stringClean(String str){

  }*/


  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int N;
    N = Integer.parseInt(keyboard.readLine());
    System.out.println(Recursion.count8(N));
  }
}
