public class GradeReaction {
    public static void main(String[] args) {
        String grade = "B";
        String reaction = reactToGrade(grade);
        System.out.println(reaction);
    }

    public static String reactToGrade(String grade) {
        String reaction;
        switch (grade) {
            case "A":
                reaction = "Amazing work!";
                break;
            case "B":
                reaction = "Great job!";
                break;
            case "C":
                reaction = "Nice! You passed!";
                break;
            case "D":
                reaction = "Oh no! Better luck next time";
                break;
            case "F":
                reaction = "Oof, not the best grade :(";
                break;
            default:
                reaction = "Invalid grade";
                break;
        }
        return reaction;
    }
}
