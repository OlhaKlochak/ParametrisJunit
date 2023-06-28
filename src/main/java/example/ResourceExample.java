package example;

import java.util.ResourceBundle;

public class ResourceExample {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("olha");
        System.out.println(resourceBundle.getString("name"));

    }
}
