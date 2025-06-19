/**
 * @author Josh Sorensen
 * @class CSIS 1410
 * @assignment Inheritance | Polymorphism
 * @description This assignment is designed to get students repetitions using Polymorphism and Inheritance
 */

package phones;

import java.util.Random;

public class TestClient {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("Model 500", new Dimension(143, 208, 119), Voltage.V110);
        PushButtonPhone pushButtonPhone = new PushButtonPhone("Cortelco 2500", new Dimension(178, 228, 127), Voltage.DUAL);
        SmartPhone smartPhone1 = new SmartPhone("Pixel3", new Dimension(145.6, 68.2, 7.9), 128);
        SmartPhone smartPhone2 = new SmartPhone("iPhone8", new Dimension(138.4, 67.3, 7.3), 64);

        System.out.println("Various Phones:");
        System.out.println(rotaryPhone);
        System.out.println(pushButtonPhone);
        System.out.println(smartPhone1);
        System.out.println(smartPhone2);

        System.out.println();

        // Plug both phones in
        DeskPhone[] deskPhones = {rotaryPhone, pushButtonPhone};
        for (DeskPhone deskPhone : deskPhones) {
            deskPhone.plugIn();
        }

        // Randomly select one of the desk phones at runtime and unplug it.
        Random random = new Random();
        int randomIndex = random.nextInt(2);
        deskPhones[randomIndex].unplug();

        System.out.println("Array Elements:");
        Phone[] phones = {rotaryPhone, pushButtonPhone, smartPhone1, smartPhone2};
        for (Phone phone : phones) {
            System.out.println(phone);

            long phoneNumber = 8019574111L;
            String phoneCallResult = phone.call(phoneNumber);
            System.out.println(phoneCallResult);

            if (phone instanceof SmartPhone) {
                String browseWebResult = ((SmartPhone) phone).browse();
                String pictureResult = ((SmartPhone) phone).takePicture();
                System.out.println(browseWebResult);
                System.out.println(pictureResult);
            }

            System.out.println();
        }
    }
}
