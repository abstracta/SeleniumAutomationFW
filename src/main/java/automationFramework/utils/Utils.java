package automationFramework.utils;

public class Utils {

    public static String applyDefaultIfMissing(String variable, String defaultValue) {
        if (variable == null) {
            variable = defaultValue;
            System.out.println("Default " + defaultValue + " execution was applied since was not provided");
        }

        return variable;
    }
}

