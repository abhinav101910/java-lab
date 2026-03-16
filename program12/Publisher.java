import java.util.Scanner;
class PublisherInfo {
String publisherName;
void getPublisher(Scanner sc) {
System.out.print("Enter publisher name: ");
publisherName = sc.nextLine();
}
void displayPublisher() {
System.out.println("Publisher: " + publisherName);
}
}
class Book extends PublisherInfo {
String title;
String author;
double price;
void getBook(Scanner sc) {
System.out.print("Enter book title: ");
title = sc.nextLine();
System.out.print("Enter author name: ");
author = sc.nextLine();
System.out.print("Enter price: ");
price = sc.nextDouble();
sc.nextLine();
}
void displayBook() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Price: " + price);
}
}
class Literature extends Book {
void getData(Scanner sc) {
getPublisher(sc);
getBook(sc);
}
void displayData() {
System.out.println("\nCategory: Literature");
displayBook();
displayPublisher();
}
}
class Fiction extends Book {
void getData(Scanner sc) {
getPublisher(sc);
getBook(sc);
}
void displayData() {
System.out.println("\nCategory: Fiction");
displayBook();
displayPublisher();
}
}

public class Publisher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Category:");
        System.out.println("1. Literature");
        System.out.println("2. Fiction");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            Literature l = new Literature();
            l.getData(sc);
            l.displayData();
        } else if (choice == 2) {
            Fiction f = new Fiction();
            f.getData(sc);
            f.displayData();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
