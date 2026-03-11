import java.util.Scanner;

class Book{
    String author;
    String title;
    String pages;
    boolean isRead;

    Book(String author,String title,String pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.isRead = false;
    }

    void display(){
        System.out.println("===Book Details===");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Status: " + (isRead ? "Read" : "Unread"));
        System.out.println("==================");
    }

    boolean hasTitle (String inputTitle){
        return title.equalsIgnoreCase(inputTitle);
    }
}

class BookManagement{
    public static void main(String args[]){
        
        Book[] books = new Book[100];

        int countBooks = 0;

        boolean running = true;
        while (running){
        System.out.println("========================");
        System.out.println("|  Library Management  |");
        System.out.println("========================");
        System.out.println();
        System.out.println("Which Operation Do you want to Perform?");
        System.out.println();
        System.out.println("1 = Add New Book.");
        System.out.println("2 = View All Books.");
        System.out.println("3 = Search Book by Title.");
        System.out.println("4 = Delete Book.");
        System.out.println("5 = Count total Books.");
        System.out.println("6 = Mark Book as Read/Unread.");
        System.out.println("7 = View all Read books");
        System.out.println("8 = View all UnRead books");
        System.out.println("9 = Exit");
        System.out.println();
        System.out.println("Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Choice: " + choice);
        System.out.println();

       
        switch(choice){
            //add new book
            case 1 : 
            System.out.println("===Add New Book in Library===");
            System.out.println();
                if (countBooks < books.length){
                    System.out.println("Author: ");
                    String author = sc.nextLine();

                     System.out.println("Title: ");
                    String title = sc.nextLine();
                    
                    System.out.println("Pages: ");
                    String pages = sc.nextLine();
                    
                    books[countBooks] = new Book(author,title,pages);
                    countBooks++;

                    System.out.println("New book Added");
                    
                }else{

                    System.out.println("Library is full");
                }

                
                 break;

            

            //View all books
            case 2 : {
                System.out.println("===Available Books===");
                System.out.println();
                for (int i = 0; i < countBooks; i++){
                    books[i].display();
                    System.out.println();
                }
                break;
            }


            //Search by book title
            case 3 : {

                System.out.println("Enter Title to Search Book: ");
                String title = sc.nextLine();
                System.out.println();

                boolean found = false;

                for (int i = 0; i < countBooks; i++){
                    if(books[i].hasTitle(title)){
                        books[i].display();
                        found = true;
                    }
                }
                 if(!found){
                        System.out.println("This Book is not Available.");
                    }
                break;
            }

            //Del book
             case 4 : {
                System.out.println("This feature is not implemented yet.");
                break;
            }

            //count total books
            case 5  : {
                System.out.println("Total Books in Library: " + countBooks);
                break;
            }

            //Mark Book as Read/Unread

            case 6 : {
                System.out.println("Which Book do you want to Read: ");
                String book = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < countBooks; i++){
                    if (books[i].hasTitle(book)){
                        books[i].isRead = true; 
                        books[i].display();
                        System.out.println("You Read this book.");
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("This book is not available in this library.");
                }
                break;
            }
            

            case 7 : {
                
                System.out.println("list of read books.");
                
                for (int i = 0; i < countBooks ; i++){
                    if (books[i].isRead){
                        books[i].display();
                    }
                }

                
                break;
            }
            case 8 : {
                
                System.out.println("list of unread books.");
                
                for (int i = 0; i < countBooks ; i++){
                    if (!books[i].isRead){
                        books[i].display();
                    }
                }

                
                break;
            }
            case 9 : {
                
                System.out.println("Comeback Later.");
                running = false;
                break;
            }
        }
        sc.close();
      }
    }
}