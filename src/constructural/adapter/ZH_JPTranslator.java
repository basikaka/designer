package constructural.adapter;

public class ZH_JPTranslator implements Translator {
    @Override
    public String translator(String content) {
        if(content == "你好") {
            return  "空尼几哇";
        } else if (content == "什么"){
            return  "纳尼";
        } else {
           return "******";
        }
    }
}
