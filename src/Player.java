public class Player {
    private int score;
    private int stars;

    Player(){
        score=0;
        stars=0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getScore() {
        return score;
    }

    public int getStars() {
        return stars;
    }
}
