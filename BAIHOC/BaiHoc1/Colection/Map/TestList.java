package BAIHOC.BaiHoc1.Colection.Map;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        Integer [] Number = {2, 6, 7, 8, 19, 0};
        List <Integer> Numbers = new ArrayList<>(Number.length);
        System.out.println(Numbers);
        Numbers.sort((a,b)->a.compareTo(b));
        System.out.println(Numbers);
    }
}
