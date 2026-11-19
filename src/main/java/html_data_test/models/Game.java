package html_data_test.models;

public class Game {

    private int game_id;
    private String title;
    private String genre;
    private int release_year;

    public Game(int game_id, String title, String genre, int release_year){
        this.game_id=game_id;
        this.title=title;
        this.genre=genre;
        this.release_year=release_year;
    }

    public int getGameId() {
        return game_id;
    }
    public void setGameId(int game_id) {
        this.game_id = game_id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return release_year;
    }
    public void setReleaseYear(int release_year) {
        this.release_year = release_year;
    }
}
