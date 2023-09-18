package com.bptn.course.week4.friday;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    // Convert the list into a map with the student id as key
    public static Map<Integer, Student> convertStudentListToMap(List<Student> studentList)
    {
        Map<Integer, Student> studentMap = studentList.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));
        return studentMap;
    }
    
    public static void main(String[] args) {

        // Create a list of students
        List<Student> students = new ArrayList<>();
        
        //add student objects to this list
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 21));

        Map<Integer, Student> studentMap = convertStudentListToMap(students);
        
        // Print the map
        System.out.println("Students Map: "+ studentMap);
    }
}