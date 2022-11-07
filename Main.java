import java.util.Scanner;

class Person {
    private String name;
    private int height;

    Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    String getName() {
        return name;
    }

    int getHeight() {
        return height;
    }
}

class Data {
    public static double average(Person[] persons) {
        double sum = 0.0;
        for (Person p : persons) {
            sum += p.getHeight();
        }
        if (persons.length > 0) {
            return sum / persons.length;
        } else {
            return 0;
        }
    }

    public static void sortTallToShort(Person[] persons) {
        Person tmp;
        for (int i = 1; i < persons.length; i++) {
            for (int j = 0; j < persons.length - i; j++) {
                if (persons[j].getHeight() < persons[j + 1].getHeight()) {
                    tmp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = tmp;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of persons: ");
        n = scan.nextInt();
        Person[] p = new Person[n];
        String name;
        int height;
        for (int i = 0; i < n; i++) {

            System.out.printf("Enter name of person%d: ", i + 1);
            name = scan.next();
            System.out.print("Enter height: ");
            height = scan.nextInt();
            p[i] = new Person(name, height);
        }
        double avg_height = Data.average(p);
        Data.sortTallToShort(p);
        System.out.printf("Average height is %.2f\n", avg_height);
        System.out.println("Persons from tallest to shortest are ");
        System.out.printf("%15s%15s\n", "Name", "Height(in cm)");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%15s%10d\n", p[i].getName(), p[i].getHeight());
        }
    }
}
