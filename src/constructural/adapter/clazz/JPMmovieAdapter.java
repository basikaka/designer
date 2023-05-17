package constructural.adapter.clazz;

import constructural.adapter.Player;
import constructural.adapter.ZH_JPTranslator;

public class JPMmovieAdapter extends ZH_JPTranslator implements Player {
    private Player target;

    public JPMmovieAdapter(Player player){
        this.target = player;
    }

    @Override
    public String play() {
        String play  = target.play();
        String content = translator(play);
        System.out.println("日文翻译： " + content);
        return play;
    }
}
