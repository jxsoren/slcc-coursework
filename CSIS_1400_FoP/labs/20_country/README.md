# Lab Country

## Overview
This lab focuses on creating a simple Java program to represent countries and continents using proper object-oriented programming techniques, including enums, constructors, private fields, and getters.

## Files

### 1. `Continent.java`
- Create a public enum called `Continent` with constants for the 7 continents
- Follow Java naming conventions: enum constants should be capitalized
- Use underscores for multi-word continent names (e.g., `NORTH_AMERICA`)

Example:
```java
public enum Continent { 
    AFRICA, ANTARCTICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA 
}
```

### 2. `Country.java`
Create a class with:

**Fields:**
- A private final String called `name`
- A private final Continent called `continent`

**Constructor:**
- One constructor that takes two parameters
- Initialize the private fields with the parameter values

**Methods:**
- `getName()` - returns the value of the name field
- `getContinent()` - returns the value of the continent field
- `toString()` - replace the existing return null; with:
  ```java
  return String.format("%s (%s)", name, continent);
  ```

### 3. `CountryTest.java`
In the main method:
- Un-comment the three print statements
- Add the following code before the print statements:
  ```java
  Continent myContinent = Continent.NORTH_AMERICA;
  Country country1 = new Country("USA", myContinent);
  Country country2 = new Country("Austria", Continent.EUROPE);
  ```
- The code to print country1 and country2 is already provided

## Instructions
1. Implement each file according to the specifications
2. After each file is completed, compile and run to test your progress
3. The final output should display the country names and their continents in the format: "Name (Continent)"

## Expected Output
Running the program should show the Country objects properly formatted, displaying both the name and continent for USA and Austria.

