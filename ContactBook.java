import java.util.Scanner;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void display() {
        System.out.println("===Contact===");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }

    boolean hasName(String inputString) {
        return inputString.equalsIgnoreCase(name);
    }
}

class ContactBook {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Contact[] contacts = new Contact[50];
        int countContact = 0;

        System.out.println("======================");
        System.out.println("  Contact Management");
        System.out.println("======================");

        boolean running = true;

        while (running) {
            System.out.println("/===Menu===/");
            System.out.println("1 = Add New Contact");
            System.out.println("2 = View all Contacts");
            System.out.println("3 = Search by Name");
            System.out.println("4 = Delete Contact");
            System.out.println("5 = Count Total Contacts");
            System.out.println("6 = Exit");
            System.out.println();
            System.out.print("Enter Your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("Choice = " + choice);
            System.out.println();

            switch (choice) {
                case 1: // Add new contact
                    if (countContact < contacts.length) {
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Phone: ");
                        String phone = scanner.nextLine();

                        contacts[countContact] = new Contact(name, phone);
                        countContact++;
                        System.out.println("Added New");
                    } else {
                        System.out.println("Contact book is full. Cannot add more.");
                    }
                    break;

                case 2: // View all contacts
                    if (countContact == 0) {
                        System.out.println("No contacts to display.");
                    } else {

                        for (int i = 0; i < countContact; i++){
                            contacts[i].display();
                        }
                    }
                    break;

                case 3: // Search by name
                    System.out.print("Enter name to search: ");
                    String inputName = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < countContact; i++) {
                        if (contacts[i].hasName(inputName)) {
                            contacts[i].display();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No contact found with that name.");
                    }
                    break;

                case 4: // Delete contact (not implemented)
                    System.out.println("Delete feature not implemented yet.");
                    break;

                case 5: // Count total contacts
                    System.out.println("Total contacts: " + countContact);
                    break;

                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
        scanner.close();
    }
}
