package Webserver;

import Applicationserver.Highscore;
import Dataserver.HighscoreDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Xiong Zan Yi
 */
@Named(value = "highscoreController")
@SessionScoped
public class HighscoreController implements Serializable {
    private final List<Highscore> highscoreList;
    private final HighscoreDAO highscoreDAO = new HighscoreDAO();

    public HighscoreController() throws SQLException, ClassNotFoundException {
        this.highscoreList = highscoreDAO.getHighscoreList();
    }

    public List<Highscore> getHighscoreList() {
        return highscoreList;
    }  
}
