public enum Season {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);


    int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }
}
