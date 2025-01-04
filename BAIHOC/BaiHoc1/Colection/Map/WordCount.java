package BAIHOC.BaiHoc1.Colection.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String s = sc.nextLine();
            String [] words = s.toLowerCase().split("\\W+");// "\W+" là biểu thức chính quy, dùng tách chuỗi theo các kí tự không phải số hoặc chữ, + là lặp lại một hoặc nhiều lần.
            System.out.println(Arrays.toString(words));
            Map <String, Integer> wordCount =  new HashMap<>();
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            List < Map.Entry<String, Integer> > sortedWord = new ArrayList <>(wordCount.entrySet());
            sortedWord.sort((a, b)->b.getValue().compareTo(a.getValue()));
            System.out.println("Thong ke so lan xuat hien cac tu giam dan: ");
            for (Map.Entry <String, Integer> entry : sortedWord) {
                System.out.println(entry.getKey()+  ":" + entry.getValue());
            }
            sc.close();
    }
}
