## Black Friday Deal Notification System
A Java application that demonstrates the implementation of Composite and Observer design patterns in an e-commerce scenario. 
The system allows products and categories to be organized hierarchically while notifying subscribed customers about special deals.

## Description
This project simulates a Black Friday sale system for an online store. 
It uses the Composite pattern to structure products and categories in a hierarchical manner, allowing both individual products and groups of products (categories) to be treated uniformly. 
Additionally, the Observer pattern is implemented to notify customers about special deals, with the option to unsubscribe from notifications.

- Composite Pattern: Organizes products (Product) and categories (Category) into a tree structure via a shared abstract class (ProductComponent).
  Categories can contain products or other categories.
- Observer Pattern: Customers (Customers) can subscribe or unsubscribe to receive deal notifications.
  The system (BlackFridayDeals) sends alerts to all subscribed customers when a new deal is available.

## Features
- Create individual products and categories.
- Nest categories within categories (e.g., Electronics inside Black Friday Deals).
- Display the complete hierarchy of products and categories.
- Register and unsubscribe customers from notifications.
- Notify all subscribed customers about new deals.

## Structure
- ProductComponent (Abstract Class): Base class for all products and categories.
  Defines common operations (add, getName, getPrice, display) with default exceptions for unsupported operations.
- Product (Leaf): Represents an individual product with a name and price.
- Category (Composite): Represents a category that can contain products or subcategories. Implements add and display methods.
- Customers: Represents a customer with a subscription status. Handles notifications and unsubscription.
- BlackFridayDeals: Manages the list of subscribed customers and sends deal notifications.












## Example Output - 
```
===========================================================
Category: Black Friday Deals

Category: Electronics
Product: Laptop - $999.99
Product: Smartphone - $799.99

Category: Clothing
Product: Sweater - $49.99
Product: Jeans - $59.99
 
Dear Alice, New deal available! 50% off all electronics!
Dear Bob, New deal available! 50% off all electronics!
Customer Makayla is not subscribed to deal notifications.
===========================================================
```
