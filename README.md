# Java Inventory Management

Simple inventory management system developed in Java. This console application allows basic operations for managing products in stock.

## Features

* Add new products with unique ID
* Prevent duplicate product IDs
* Remove products from inventory
* Update product prices
* List all products
* Basic validation for existing/non-existing IDs

## Technologies

* Java
* Object-Oriented Programming (OOP)
* ArrayList (Collections Framework)

## Project Structure

```
src/
 ├── application/
 │    └── Program.java
 └── inventory/
      └── Product.java
```

## How It Works

The application stores products in memory using a list. Each product contains:

* ID
* Name
* Price

The user interacts through a menu in the terminal.

## How to Run

1. Clone the repository

```
git clone https://github.com/your-username/java-inventory-management.git
```

2. Access the project folder

```
cd java-inventory-management
```

3. Compile

```
javac application/Program.java
```

4. Run

```
java application.Program
```

## Example Menu

```
1. Add a new product
2. Remove a product from stock
3. Update a product's price
4. List all products
5. Exit
```

## Improvements (Future Work)

* Add product quantity
* Persist data (file or database)
* Improve input validation
* Create GUI or REST API

## Author

Richard Bryan
