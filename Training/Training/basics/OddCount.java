package basics;


import java.util.ArrayList;
public class OddCount {

  public static int oddCount(int n) {
    ArrayList<Integer> oddNum = new ArrayList<>();

    for (int i = 1; i < n; i ++) {
      if(i%2!=0){
       oddNum.add(i);
      }
    }

    return oddNum.size(); 
  }

}
//Given a number n, return the number of positive odd numbers below n, EASY!
//Examples (Input -> Output)
//
//7  -> 3 (because odd numbers below 7 are [1, 3, 5])
//15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
//
//Expect large Inputs!
