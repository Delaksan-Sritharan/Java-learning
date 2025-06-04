public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level obj = Level.MEDIUM;
        switch (obj) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // ---

        // This loop was moved inside the main method
        for (Level currentLevel : Level.values()) {
            System.out.println(currentLevel);
        }
    }
}