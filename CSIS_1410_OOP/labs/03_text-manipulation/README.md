Instruction

Open the Java project CS1410_LABS and add a new package called textManipulation.
Add a class called LabTextManipulation that includes the main method.

    Inside the main method, create a variable called parks and assign it an empty ArrayList of strings.
    Read in the names of national parks from the user until the user enters done (or DONE,
    or dOnE, .. )  Keep in mind that the names of some national parks consist of more than one word, for example, Mesa Verde.
    As you read in the national parks, add them to the list.
    When you are done reading in the user input, print an empty line to separate the user input from the rest of the output.
    At this point, the list should include all the parks entered by the user exactly as the user spelled them. The list should include no other elements. 
    Testing is an important part of software development.
    It is a best practice, to test early and often that the latest code you wrote works as expected.
    To test that your code works as expected, print the content of the list. Then run the code and enter some parks with goofy spelling as shown in the sample output.
    Verify that the program keeps printing the prompt until you entered dOnE (in any spelling). 
    Verify that the list includes all the parks with all the goofy spelling but nothing else (dOnE should not be part of the list)
    Once you are this far, delete the print statement that printed the list. It served its purpose and is no longer needed. 
    Next, call the method toFancyString. Pass the list of parks as an argument and assign the resulting value to a string variable called fancyString. Then print fancyString so you can see the results.
    Note that the method toFancyString doesn't exist yet. That's why you'll get a red squiggly line.
    No problem - we'll take care of that in a moment.
    Create a public static method called toFancyString. 
    It should have one parameter that is an ArrayList of strings named list, and the return type should be a string.
    To make the method compile, for now, return null. We'll change the implementation later.
    Run the code again.
    This time, it should no longer print the list elements. Instead, it should print null.

    Implement the method toFancyString.
    public static String toFancyString(ArrayList<String> list) 
    It should return a string that includes all list elements with updated spelling (see below) separated by a space, a vertical bar, and another space. 
    Here is the expected format of the returned string:
    {el_1} | {el_2} | . . . | {el_n}
    Where {el_1}, {el_2}, .. {el_n} are the list elements after all letters were converted to lower-case letter except for the first letters. The first letters need to be capitalized. (see expected output)
    Note that the separators are only between elements. There is no separator at the end nor at the beginning of the returned string.
    Also: if the list is empty, toFancyString should return an empty string.

    Hints
        We need to build a string based on the elements in the list. Since that string keeps changing as we add one element at a time, we should use class StringBuilder. 
        Why StringBuilder? StringBuilder objects can change, but String objects are immutable.
        Create a private helper method to update the spelling. 
        private static String updateSpelling(String text)
        It changes the text so that all letters are lowercase except for the first letters of each individual word.
        You don't have to create such a method, but it structures the code, and it makes it easier to test the individual parts of the required functionality.
        Class Character 

Links to an external site. includes two methods that might be helpful:
toLowerCase Links to an external site.and toUpperCase Links to an external site.  
