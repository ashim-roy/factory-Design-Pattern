package abstractfactory.component;

import abstractfactory.component.button.Button;

public class Client {
    public static void main(String[] args) {
        // Create an instance of the Flutter class
        Flutter flutter = new Flutter();

        // Call the createUiFactory method on the Flutter instance
        UIFactory af = flutter.createUIFactory("ios");
        // i will call button
        Button b = af.createButton();  // creates android button
        b.changeSize();

    }
}
