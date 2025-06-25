package nuisance;

/**
 * This class represents a Friend that extends the functionality of a Person
 *
 * @author Josh Sorensen
 */

public class Friend extends Person {
    private Hobby hobby;

    /**
     * Constructs a Friend with the specified name, age, and hobby
     *
     * @param name  the name of the friend
     * @param age   the age of the friend
     * @param hobby the hobby of a friend
     * @throws IllegalArgumentException if age is not in valid range [1, 150]
     */

    public Friend(String name, int age, Hobby hobby) throws IllegalArgumentException {
        super(name, age);
        this.hobby = hobby;
    }

    /**
     * Indicates that the friend is chilling
     * <br>
     * Ex: Ben is chilling
     *
     * @return a string that states the Friend is chilling
     */
    public String chill() {
        return getName() + " is chilling";
    }

    /**
     * Returns a grammatically correct string describing playing a hobby with friends
     *
     * @param friends array of friends
     * @return formatted string like "playing {hobby} with {friends}"
     */

    public String play(Friend[] friends) {
        StringBuilder playString = new StringBuilder();
        playString.append("playing ").append(this.hobby).append(" ");

        for (int i = 0; i < friends.length; i++) {
            String friendName = friends[i].getName();
            int lastFriendIndex = friends.length - 1;

            boolean oneOrMoreFriendsRemaining = Math.abs(i + 1 - friends.length) >= 1;
            boolean onlyTwoFriendsTotal = friends.length == 2;

            // add trailing comma to first friend in list only if there is one or more friend remaining
            if (oneOrMoreFriendsRemaining && !onlyTwoFriendsTotal) {
                friendName += ",";
            }

            if (i == 0) {
                playString.append("with ").append(friendName).append(" ");
            } else if (i != lastFriendIndex) {
                playString.append(friendName).append(" ");
            } else {
                playString.append("and ").append(friendName).append('.');
            }
        }

        return playString.toString();
    }

    /**
     * Returns a string describing the friend and their preferred hobby in {name}({age}) {hobby} format
     * <br>
     * Ex: Chloe(24) GAMES
     *
     * @return formatted string that describes the friend and their preferred hobby
     */

    @Override
    public String toString() {
        return super.toString() + " " + hobby;
    }
}
