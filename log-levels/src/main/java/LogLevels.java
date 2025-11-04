public class LogLevels {

    public static String message(String logLine) {
        String msg = logLine.substring(logLine.indexOf(": ") + 1).trim();
        System.out.println(msg);

        return msg;
    }

    public static String logLevel(String logLine) {
        String level = logLine.substring(logLine.indexOf('[') + 1, logLine.indexOf(']'));

        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
