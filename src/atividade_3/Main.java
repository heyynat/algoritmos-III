package atividade_3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("Bob", 22, "Engineering");

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Course: " + student2.getCourse());
    }
}
