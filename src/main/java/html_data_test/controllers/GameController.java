package html_data_test.controllers;

import html_data_test.database_operations.GameDatabase;
import html_data_test.models.Game;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class GameController {

    private final GameDatabase gameDatabase;
    GameController(GameDatabase gameDatabase){
        this.gameDatabase=gameDatabase;
    }

    @GetMapping("/games")
    public String getAllGames(Model model) throws SQLException{

        List<Game> games = gameDatabase.getAllGames();

        model.addAttribute("games", games);

        return "games";
    }
}
