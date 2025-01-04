package BAIHOC.BaiHoc1.Colection.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Mapof {
    public static void main(String[] args) {
        Map <Integer, String> Students = Map.of(1001, "John", 1002, "David", 1003, "Peter");
        // Students.put(1004, "JonhSon");
        Map.Entry <Integer, String> student_one = Map.entry(2501, "TimPer");
        Map.Entry <Integer, String> student_two = Map.entry(2502, "Alaba");
        Map.Entry <Integer, String> student_three = Map.entry(2503, "Arnord");

        Map <Integer, String> StudentOth = Map.ofEntries(student_one, student_two, student_three);
        StudentOth.forEach((stdcode, name)->{
            System.out.println("StudentCode: "+stdcode+", Name: "+name);
        });
        Students.forEach((stdcode, name)->{
            System.out.println("StudentCode: "+stdcode+", Name: "+name);
        });
        System.out.println(Students);

        Map<String, Integer> products = Map.of("Apples", 50, "Bananas", 30);
   List<String> productDetails = products.entrySet()
                                         .stream()
                                         .map(entry -> entry.getKey() + ": " + entry.getValue())
                                         .toList();

    productDetails.forEach(System.out::println);

    double diemtrungbinh = (8 + 7 + 9 + 9 + (6.5*2) + (7*3) )  / 9;
    System.out.println("Diem trung binh cua Nguyen Ngoc Diep la: "+diemtrungbinh*1.f);
        }
}
