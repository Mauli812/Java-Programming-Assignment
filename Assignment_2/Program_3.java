import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

// Student class
class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Program_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using ArrayList
        ArrayList<Student> list = new ArrayList<>();

        // Using HashMap
        HashMap<Integer, Student> hmap = new HashMap<>();

        // Using TreeMap
        TreeMap<Integer, Student> tmap = new TreeMap<>();

        int choice;

        do {
            System.out.println("\n---- CRUD MENU ----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // CREATE
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Student Name: ");
                    String name = sc.next();

                    Student s = new Student(id, name);

                    // Add to ArrayList
                    list.add(s);

                    // Add to HashMap
                    hmap.put(id, s);

                    // Add to TreeMap
                    tmap.put(id, s);

                    System.out.println("Student Added Successfully");
                    break;

                // READ
                case 2:
                    System.out.println("\nArrayList Data:");
                    for (Student st : list) {
                        System.out.println(st.id + " " + st.name);
                    }

                    System.out.println("\nHashMap Data:");
                    for (Student st : hmap.values()) {
                        System.out.println(st.id + " " + st.name);
                    }

                    System.out.println("\nTreeMap Data (Sorted by ID):");
                    for (Student st : tmap.values()) {
                        System.out.println(st.id + " " + st.name);
                    }
                    break;

                // UPDATE
                case 3:
                    System.out.print("Enter ID to Update: ");
                    int uid = sc.nextInt();

                    if (hmap.containsKey(uid)) {

                        System.out.print("Enter New Name: ");
                        String newName = sc.next();

                        Student updatedStudent =
                                new Student(uid, newName);

                        // Update HashMap & TreeMap
                        hmap.put(uid, updatedStudent);
                        tmap.put(uid, updatedStudent);

                        // Update ArrayList
                        for (Student st : list) {
                            if (st.id == uid) {
                                st.name = newName;
                            }
                        }

                        System.out.println("Student Updated");
                    } else {
                        System.out.println("Student Not Found");
                    }
                    break;

                // DELETE
                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int did = sc.nextInt();

                    hmap.remove(did);
                    tmap.remove(did);

                    // Remove from ArrayList
                    list.removeIf(st -> st.id == did);

                    System.out.println("Student Deleted");
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}