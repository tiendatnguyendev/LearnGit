package BAIHOC.BaiHoc1.Colection.Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGradeManage {
    Map < String , Map < String , List <Integer> > > studentGrades;
    public StudentGradeManage () {
        studentGrades = new HashMap<>();
    }
    public void addStudent(String name, Map <String, List<Integer>> subject ){
        studentGrades.add(name, subject);
    }
}
