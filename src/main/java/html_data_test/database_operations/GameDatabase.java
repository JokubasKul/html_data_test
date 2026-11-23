package html_data_test.database_operations;

import html_data_test.models.Game;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class GameDatabase {

    public List<Game> getAllGames() throws SQLException{

        List<Game> games = new ArrayList<>();

        String sql = "SELECT * FROM games";

        try (Connection connection = DatabaseConnection.connect();
             PreparedStatement statement = connection.prepareStatement(sql)){

            try(ResultSet result = statement.executeQuery()){
                while(result.next()){
                    Game game = new Game(
                            result.getInt("game_id"),
                            result.getString("title"),
                            result.getString("genre"),
                            result.getInt("release_year")
                    );
                    games.add(game);
                }
            }
        }
        return games;
    }

    public List<Game> getGame(int game_id) throws SQLException{

        List<Game> games = new ArrayList<>();

        String sql = "SELECT * FROM games WHERE game_id = ?";

        try(Connection connection = DatabaseConnection.connect();
        PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setInt(1, game_id);

            try(ResultSet result = statement.executeQuery()){

                while(result.next()){
                    Game game = new Game(
                            result.getInt("game_id"),
                            result.getString("title"),
                            result.getString("genre"),
                            result.getInt("release_year")
                    );

                    games.add(game);
                }
            }
        }
        return games;
    }

}
