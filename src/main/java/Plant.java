public enum Plant {
    RADISHES, CLOVER, GRASS, VIOLETS;

    public static Plant getPlant(char plantString) {
        return switch (plantString) {
            case 'R' -> Plant.RADISHES;
            case 'C' -> Plant.CLOVER;
            case 'G' -> Plant.GRASS;
            case 'V' -> Plant.VIOLETS;
            default -> throw new IllegalStateException("Unexpected value: " + plantString);
        };
    }
}
