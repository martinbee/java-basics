public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, welcome to Bill's Burgers!");

    Burger plainBurger = new Burger("wheat", "beef", "plain", 2.00);

    plainBurger.addAddition("lettuce", 0.50, 1);
    plainBurger.addAddition("pickles", 0.50, 2);
    plainBurger.addAddition("tomatoes", 0.50, 3);
    plainBurger.addAddition("avocado", 1.50, 4);
    plainBurger.getBalance(plainBurger.getAdditions());

    DeluxeBurger deluxeBurger = new DeluxeBurger("white", "beef", "deluxe", 2.00);
    deluxeBurger.addAddition("Test", 1.00, 1);
    deluxeBurger.getBalance();

    HealthyBurger healthyBurger = new HealthyBurger("Turkey", "healthy", 3.00);
    healthyBurger.addAddition("lettuce", 0.50, 1);
    healthyBurger.addAddition("avocado", 1.50, 2);
    healthyBurger.addAddition("sprouts", 0.75, 3);
    healthyBurger.addAddition("tomatoes", 0.50, 4);
    healthyBurger.addAddition("hot sauce", 0.50, 5);
    healthyBurger.addAddition("protein powder", 0.50, 6);
    healthyBurger.getBalance();
  }
}

// The purpose of the application is to help a ficticious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
// Bills store.
// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger. Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the price (for the base
// burger and all the additions).
// This burger has a base price and the additions are all seperately priced.
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price.
//
// Also create two extra varieties of Hamburgers (classes) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
// The healthy burger can have a total of 6 items (Additions) in total.
// hint:  you probably want to process the 2 additional items in this new class, not the base class,
// since the 2 additions are only appropriate for this new class.
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand total for the
// burger
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals onto that.
