Instructions
Step 1:

    Download the starter project from Canvas and unzip it in a folder with the same name. 
    Import the extracted ( unzipped ) code files into Eclipse.
    You can do that by dragging the folder in the src folder of your lab project.
    Run DogApp to make sure that the file import worked as expected.
    At this point, the output should look like Step 1 Output  

Step 2:
Make the following modifications:

    Doc Comments:
    All public classes, constructors, and methods should have doc comments.
    Exceptions: no need to add a doc comment to the overridden toString methods. If you don't, the original doc comments that were specified in class Object are kept. Who should be listed as author? For classes, that were modified but not newly created by you, list "CSIS + yourName" Where youName is your actual name. Quotes should not be included.

    In class Dog:
    Add an overridden toString method. It should return a string of the following format:
    {name of the class}: {breed}
    Where {name of the class} is the name of the class and {breed} is the value of the field breed.
    E.g.: Dog: Terrier 
    Rather than hard-coding the name of the class, obtain it dynamically (at runtime). Here is how this can be done:
    Use getClass, a method of java.lang.Object. It returns the runtime class of the object.
    Then call the getSimpleName() method on the runtime class. Like this:  this.getClass().getSimpleName()
    This will return the type of the class, in our case Dog.
    Then use the plus operator to add a colon, a blank, and the breed.

    In class DogApp:
    Every time you create a new instance of a class add a statement that prints
    the newly created instance (see output below )   
    Hint: There is no need to call the toString method explicitly.
    Compile and run. 
    Your output should look like Step 2 Output.

Step 3:

    class DogApp:
    Still in DogApp at the end of the main method, do the following:
    Print the header  “Using an Array:”. This helps to make the code more clear and easier to read.
    Create an array of Dogs.
    Use a single code statement to initialize the array with myDog, mySledDog, and myCircusDog.
    Use a foreach loop to loop through all the dogs. In the body of the foreach loop do two things:
        print the current instance of the dog followed by a new line
        call the method actAsDog and pass the current instance of the dog as argumentCompile and run. 
    Compile and run. 
    Your output should look like Step 3 Output.

Step 4:

    Still in DogApp, check whether the current dog is-a SledDog.
    You can do that by using the instanceof operator
    E.g.: 
    if (object1 instanceof Type1) {
        //  do something
    }
    If the current dog happens to be a SledDog then call the method pullSled.
    Hint:
    In order to be able to access the method pullSled the Dog object still needs to be cast into a SledDog object. This cast is safe because we just checked the type of the Dog object with the instanceof operator.
    Once we have a SledDog the method pullSled can be called.
    Compile and run.
    Now your lab should be finished and your output should look like Step 4 Output
