import java.util.*;

class Student {
    private String name;
    private int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return (double) sum / marks.length;
    }

    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }

    public void displayDetails() {
        System.out.println("\nStudent Name: "+name);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println("\nAverage: "+calculateAverage());
        System.out.println("Grade: "+assignGrade());
    }
}

public class Project {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.print("Enter marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);

        s.displayDetails();
    }
}