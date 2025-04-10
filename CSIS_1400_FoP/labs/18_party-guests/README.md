# Lab Party Guests

## Overview
This lab implements a Party Guests program based on the provided activity diagram. The program:
- Reads in a certain number of guests from the user
- Prints the party list
- Selects a random guest who cannot come
- Prints the updated party list

## Implementation Details
Follow the activity diagram which includes these key steps:
1. Declare and initialize local variables
   - `numberOfGuests` is set to 4 by default
   - `input` for reading user input from keyboard
   - `rand` for generating random numbers
   - `guestList` as an ArrayList of type String
2. Inform user that we'll read in number of guests
3. Declare and initialize a control variable
4. Use a loop to:
   - Read in guest names
   - Add guests to the guest list
   - Increment control variable
   - Continue until all guests have been entered
5. Print the guest list
6. Select and remove a random guest
   - Inform user that this guest won't come
   - Remove guest from the list
7. Print the updated guest list

## Sample Output
```
Please enter 4 guests:
guest1: Dan
guest2: Ben
guest3: Ron
guest4: Tim
Guest list: [Dan, Ben, Ron, Tim]
Dan can't come
Updated guest list: [Ben, Ron, Tim]
```

## Notes
- Pay close attention to the comments in the code as they provide additional information regarding specific actions.
- The activity diagram shows the complete program flow to follow during implementation.


