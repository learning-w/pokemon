
public enum PokeMon {
    /**
     * 一般系
     */
    YIBAN("一般","无","格斗","岩石","钢","幽灵","幽灵"),

    /**
     * 火系
     */
    HUO("火","草,冰,虫,钢","水,地面,岩石","火,水,岩石,龙","火,草,冰,虫,钢,妖精","无","无"),

    /**
     * 水系
     */
    SHUI("水","火,地面,岩石","电,草","水,草,龙","火,水,冰,钢","无","无"),

    /**
     * 电系
     */
    DIAN("电","水,飞行","地面","电,草,龙","电,飞行,钢","地面","无"),

    /**
     * 草系
     */
    CAO("草","水,地面,岩石","火,冰,毒,飞行,虫","火，草，毒，飞行，虫，龙，钢","水,地面,岩石","无","无"),

    /**
     * 冰系
     */
    BING("冰","草,地面,飞行,龙","火,格斗,岩石,钢","火,水,冰,钢","冰","无","无"),

    /**
     * 格斗系
     */
    GEDOU("格斗","一般,冰,岩石,恶,钢","飞行,超能力,妖精","毒,飞行,超能力,虫,妖精","虫,岩石,恶","幽灵","无"),

    /**
     * 毒系
     */
    DU("毒","草,妖精","地面,超能力","毒,地面,岩石,幽灵","草,格斗,毒,虫,妖精","钢","无"),

    /**
     * 地面系
     */
    DIMIAN("地面","火,电,毒,岩石,钢","毒,岩石","草,虫","水,草,冰","飞行","电"),

    /**
     * 飞行系
     */
    FEIXING("飞行","草,格斗,虫","电,冰,岩石","电,岩石,钢","草,格斗,虫","无","地面"),

    /**
     * 超能系
     */
    CHAONENG("超能","格斗,毒","虫,幽灵,恶","超能力,钢","格斗,超能力","恶","无"),

    /**
     * 虫系
     */
    CHONG("虫","草,超能力,恶","火,飞行,岩石","火,格斗,毒,飞行,幽灵,钢,妖精","草,格斗,地面","无","无"),

    /**
     * 岩石系
     */
    YANSHI("岩石","火,冰,飞行,虫","水,草,格斗,地面,钢","格斗,地面,钢","一般,火,毒,飞行","无","无"),

    /**
     * 幽灵系
     */
    YOULING("幽灵","超能力,幽灵","幽灵,恶","恶","毒,虫","一般","一般,格斗"),

    /**
     * 龙系
     */
    LOONG("龙","龙","冰,龙,妖精","钢","火,水,电,草","妖精","无"),

    /**
     * 恶系
     */
    EE("恶","超能力,幽灵","格斗,虫,妖精","格斗,恶,妖精","幽灵,恶","无","超能力"),

    /**
     * 钢系
     */
    GANG("钢","冰,岩石,妖精","火,格斗,地面","火,水,电,钢","一般,草,冰,飞行,超能力,虫,岩石,龙,钢,妖精","无","毒"),

    /**
     * 妖精系
     */
    YAOJING("妖精","格斗,恶,龙","毒,钢","火,毒,钢","格斗,虫,恶","无","龙");

    private String shuxing;
    private String doubleAtt;
    private String doubleDen;
    private String halfAtt;
    private String halfden;
    private String invalidAtt;
    private String invalidDen;

    public String getShuxing() {
        return shuxing;
    }

    PokeMon(String  shuxing, String doubleAtt, String doubleDen, String halfAtt, String halfden, String invalidAtt, String invalidDen)
    {
        this.shuxing = shuxing;
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
