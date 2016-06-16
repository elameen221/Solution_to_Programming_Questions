
public class duplicatesremover {

 
 public static void main(String[] args) {
  
    int[] a = {1,3,7,7,8,9,9,9,10};

    removeDuplicates(a);

 }

 private static void removeDuplicates(int[] a) {
  
    // counter "i" is iterating the array, counter j indicates a position where unique element found so far has  to be placed. 
    // we start comparing of our adjacent elements from 1 i.e compare 1st and 0th elements, 2nd and 1st elements and so on. 
    // you can modify the code such that,compare 0th element with 1st, 1st element with 2nd and so on. 

    int i = 1, j = 0;

    // i increments every time.
    for(; i < a.length; i++) {

   //j increments only when adjacent pairs are not equal.
        if(a[i] != a[i-1]) {

         a[++j] = a[i];
        }

  }
  
  // print the array to console.
  for(i = 0; i <= j; i++) {
        System.out.print(a[i] +" ");   
   
  }
  
 }

}



