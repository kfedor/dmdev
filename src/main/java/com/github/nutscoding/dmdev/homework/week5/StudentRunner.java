package com.github.nutscoding.dmdev.homework.week5;

import com.github.nutscoding.dmdev.homework.week5.comparator.FullNameComparator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class StudentRunner {

    public static void main(String[] args) {
        createMapByAverageMark();
        createSortedMapByFullName();
        createMapWithObject();
    }

    public static void createMapByAverageMark() {
        List<Student> students = createListOfStudents();
        Map<Integer, Double> map = students
                .stream()
                .filter(Student::hasMoreThanThreeMarks)
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.averagingDouble(Student::getStudentAverageMark)));
        System.out.println(map);
    }

    public static void createSortedMapByFullName() {
        List<Student> students = createListOfStudents();
        Map<Integer, List<StudentDTO>> map = students
                .stream()
                .sorted(new FullNameComparator())
                .collect(Collectors.groupingBy(
                        Student::getCourse,
                        Collectors.mapping(StudentDTO::new, Collectors.toList())));
        System.out.println(map);
    }

    public static void createMapWithObject() {
        List<Student> students = createListOfStudents();
        Map<Integer, Object> map = students
                .stream()
                .sorted(new FullNameComparator())
                .collect(Collectors.groupingBy(
                        Student::getCourse, Collectors.collectingAndThen(
                                Collectors.mapping(StudentDTO::new, Collectors.toList()),
                                studentsTask2 -> new StudentDTOObject(studentsTask2,
                                        students.stream()
                                                .filter(student -> studentsTask2.contains(new StudentDTO(student)))
                                                .collect(Collectors.averagingDouble(Student::getStudentAverageMark))
                                ))));
        System.out.println(map);
    }

    private static List<Student> createListOfStudents() {
        return Arrays.asList(
                new Student("Vasya", "Petrov", 3, Arrays.asList(5, 5, 5, 4, 5)),
                new Student("Petya", "Golovin", 1, Arrays.asList(4, 3, 5)),
                new Student("Nina", "Vasilyeva", 4, Arrays.asList(5, 2, 3, 4, 5, 3)),
                new Student("Dima", "Petrov", 3, Arrays.asList(4, 4, 4, 4, 5)),
                new Student("Katya", "Ivanova", 2, Arrays.asList(4, 3, 5, 4)),
                new Student("Sveta", "Svetikova", 5, Arrays.asList(3, 3)),
                new Student("Dima", "Dimov", 3, Arrays.asList(5, 5, 5, 4, 5)),
                new Student("Alex", "Vozchik", 1, Arrays.asList(4, 3, 5)),
                new Student("Lena", "Golovach", 4, Arrays.asList(3, 2, 3, 4, 3, 5)),
                new Student("Fiona", "Shrekova", 3, Arrays.asList(4, 4, 4, 4, 5)),
                new Student("Lev", "Tolstoy", 2, Arrays.asList(4, 2)),
                new Student("Kiparis", "Ivanov", 5, Arrays.asList(4, 3, 2, 4, 2, 5))
        );
    }
}