package com.lionssharewebdev;

class Car {
    String color;
    String make;
    String model;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public void printInfo () {
        System.out.println("The color of our car " + this.color);
        System.out.println("The make of our car is " + this.make);
        System.out.println("The model of our car is " + this.model);
    }
}

class House {
    int noOfBedrooms;
    int noOfBathrooms;
    double squareFeet;
    String color;
    boolean fence;

    public House (int noOfBedrooms, int noOfBathrooms, double squareFeet, String color, boolean fence){
        this.noOfBedrooms = noOfBedrooms;
        this.noOfBathrooms = noOfBathrooms;
        this.squareFeet = squareFeet;
        this.color = color;
        this.fence = fence;
    }

    public void printInfo () {
        System.out.println("No of bedrooms " + this.noOfBedrooms);
        System.out.println("No of bathrooms " + this.noOfBathrooms);
        System.out.println("The square footage is " + this.squareFeet);
        System.out.println("The color of our home is " + this.color);
        System.out.println("Has a fence "  + this.fence );
    }

}

class Book {
    String title;
    String author;
    int noOfPages;
    String version;

    public Book(String title, String author, int noOfPages, String version) {
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.version = version;
    }

    public void printInfo () {
        System.out.println("Book Title " + this.title);
        System.out.println("Book Author " + this.author);
        System.out.println("Number of book pages " + this.noOfPages);
        System.out.println("Version " + this.version);

    }
}



public class Main {

        public static void main(String[] args) {
	        Car adrienneCar = new Car("gold","Mercedes","E500");

	        adrienneCar.printInfo();

	        House adrienneHouse = new House(5,5,3000,"brick",true);

	        adrienneHouse.printInfo();

	        Book adrienneBook = new Book("Flowers In The Attic","VC Andrews",328,"2");

	        adrienneBook.printInfo();



    }
}
