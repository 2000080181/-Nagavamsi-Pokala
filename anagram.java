import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Main {


    static boolean areAnagram(char[] str1, char[] str2)
    {

        int n1 = str1.length;
        int n2 = str2.length;


        if (n1 != n2)
            return false;


        Arrays.sort(str1);
        Arrays.sort(str2);
