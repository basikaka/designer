package constructural.adapter;

public class MoviePlayer implements Player{
    @Override
    public String play() {
        System.out.println("正在播放《漫长的季节》。");
         String content = "你好";
        System.out.println(content);
        return content;
    }
}
