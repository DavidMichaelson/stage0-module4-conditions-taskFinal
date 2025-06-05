package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {

        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Wrong month number";
        };

        System.out.println(season);
}

    public static void main(String[] args) {
        SeasonDeterminer determiner = new SeasonDeterminer();
        determiner.tellTheSeason(0);
        determiner.tellTheSeason(3);
        determiner.tellTheSeason(6);
        determiner.tellTheSeason(9);
        determiner.tellTheSeason(12);
        determiner.tellTheSeason(13);
    }
}
