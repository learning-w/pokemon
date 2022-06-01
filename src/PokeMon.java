import java.util.List;

public enum PokeMon {
    /**
     * 一般系
     */
    YIBAN("无","格斗","岩石","钢","幽灵","幽灵"),

    /**
     * 火系
     */
    HUO("草,冰,虫,钢","水,地面,岩石","火,水,岩石,龙","火,草,冰,虫,钢,妖精","无","无"),

    /**
     * 水系
     */
    SHUI("火,地面,岩石","电,草","水,草,龙","火,水,冰,钢","无","无"),

    /**
     * 电系
     */
    DIAN("水,飞行","地面","电,草,龙","电,飞行,钢","地面","无"),

    /**
     * 草系
     */
    CAO("水,地面,岩石","火,冰,毒,飞行,虫","火，草，毒，飞行，虫，龙，钢","水,地面,岩石","无","无"),

    /**
     * 冰系
     */
    BING("草,地面,飞行,龙","火,格斗,岩石,钢","火,水,冰,钢","冰","无","无"),

    /**
     * 格斗系
     */
    GEDOU("一般,冰,岩石,恶,钢","飞行,超能力,妖精","","","",""),

    /**
     * 毒系
     */
    DU("","","","","",""),

    /**
     * 地面系
     */
    DIMIAN("","","","","",""),

    /**
     * 飞行系
     */
    FEIXING("","","","","",""),

    /**
     * 超能系
     */
    CHAONENG("","","","","",""),

    /**
     * 虫系
     */
    CHONG("","","","","",""),

    /**
     * 岩石系
     */
    YANSHI("","","","","",""),

    /**
     * 幽灵系
     */
    YOULING("","","","","",""),

    /**
     * 龙系
     */
    LOONG("","","","","",""),

    /**
     * 恶系
     */
    EE("","","","","",""),

    /**
     * 钢系
     */
    GANG("","","","","",""),

    /**
     * 妖精系
     */
    YAOJING("","","","","","");
    private String doubleAtt;
    private String doubleDen;
    private String halfAtt;
    private String halfden;
    private String invalidAtt;
    private String invalidDen;

    PokeMon(String doubleAtt,String doubleDen,String halfAtt,String halfden,String invalidAtt,String invalidDen)
    {
        this.doubleAtt = doubleAtt;
        this.doubleDen = doubleAtt;
        this.halfAtt = halfAtt;
        this.halfden = halfden;
        this.invalidAtt = invalidAtt;
        this.invalidDen = invalidDen;

    }
    public String getDoubleAtt() {
        return doubleAtt;
    }

    public String getDoubleDen() {
        return doubleDen;
    }

    public String getHalfAtt() {
        return halfAtt;
    }

    public String getHalfden() {
        return halfden;
    }

    public String getInvalidAtt() {
        return invalidAtt;
    }

    public String getInvalidDen() {
        return invalidDen;
    }
}
