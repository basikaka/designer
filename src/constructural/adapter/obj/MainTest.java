package constructural.adapter.obj;

import constructural.adapter.MoviePlayer;
import constructural.adapter.Player;
import constructural.adapter.Translator;
import constructural.adapter.ZH_JPTranslator;
import constructural.adapter.obj.JPMovieAdapter;

public class MainTest {
    public static void main(String[] args) {
        Player moviePlayer = new MoviePlayer();
        Translator translator = new ZH_JPTranslator();

        JPMovieAdapter adapter = new JPMovieAdapter(moviePlayer, translator);

        adapter.play();
    }
}
