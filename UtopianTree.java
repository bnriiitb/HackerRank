import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findHeight(n));
        }
    }
    public static int findHeight(int N){
        if(N==0)
            return 1;
        else if(N%2==0)
            return findHeight(N-1)+1;
        else
            return findHeight(N-1)*2;
    }
}
