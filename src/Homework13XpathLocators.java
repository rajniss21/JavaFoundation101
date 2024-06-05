public class Homework13XpathLocators {
    public static void main(String[] args) {
        /*
        Homework #13 - Xpath locators

        Instructions:
        Create Xpath locators for the following web elements on https://qa.koel.app/ (Koel webpage)
        1. email address field
        2. submit button
        3. logout button
        4. Search field
        5. Favorites list(located on the homepage in Playlist block )
    ==============================================================
        Remember to check your locators to meet the following criteria:
        1. It must be unique
        2. it should be short (avoid absolute paths and long locators)
        3. Do not use any plugins to generate locators for you. The whole point of this HW is to practice finding locators by yourself
    */

        String emailFieldLocator = "//input[@type='email']";
        String submitButtonLocator = "//button[@type='submit']";
        String logoutButtonLocator = "//a[@title='Log student out']";
        String searchFieldLocator = "//input[@type='search']";
        String favoritesLocator = "//li[@class='playlist favorites']";

        System.out.println("Locator for email is: " + emailFieldLocator);
        System.out.println("Locator for submit button is: " + submitButtonLocator);
        System.out.println("Locator for logout button is: " + logoutButtonLocator);
        System.out.println("Locator for search field is: " + searchFieldLocator);
        System.out.println("Locator for favorites is: " + favoritesLocator);
    }


}

