package constructural.adapter.clazz;

import constructural.adapter.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {
        MoviePlayer moviePlayer = new MoviePlayer();
        JPMmovieAdapter adapter = new JPMmovieAdapter(moviePlayer);

        adapter.play();
    }
}
