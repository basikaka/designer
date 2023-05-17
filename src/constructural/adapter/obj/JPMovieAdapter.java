package constructural.adapter.obj;

import constructural.adapter.Player;
import constructural.adapter.Translator;
import constructural.adapter.clazz.JPMmovieAdapter;

public class JPMovieAdapter implements Player {

    private Player target;
    private Translator translator;

    public JPMovieAdapter(Player player, Translator translator){
        this.target = player;
        this.translator = translator;
    }

    @Override
    public String play() {
        String play = target.play();
        String content = translator.translator(play);
        System.out.println("日文翻译为：" + content);
        return play;
    }
}
