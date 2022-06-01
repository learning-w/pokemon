public enum Illustrated {
    /**
    一般系
     */
    YIBAN("一般"),

    /**
    火系
    */
    HUO("火"),

    /**
    水系
    */
    SHUI("水"),

    /**
     电系
     */
    DIAN("电"),

    /**
     草系
     */
    CAO("草"),

    /**
     冰系
     */
    BING("冰"),

    /**
     格斗系
     */
    GEDOU("格斗"),

    /**
     毒系
     */
    DU("毒"),

    /**
     地面系
     */
    DIMIAN("地面"),

    /**
     飞行系
     */
    FEIXING("飞行"),

    /**
     超能力系
     */
    CHAONENGLI("超能力"),

    /**
     虫系
     */
    CHONG("虫"),

    /**
     岩石系
     */
    YANSHI("岩石"),

    /**
     幽灵系
     */
    YOULING("幽灵"),

    /**
     龙系
     */
    LOONG("龙"),

    /**
     恶系
     */
    EE("恶"),

    /**
     钢系
     */
    GANG("钢"),

    /**
     妖精系
     */
    YAOJING("妖精");


    private String shuxing;

    Illustrated(String shuxing){
        this.shuxing = shuxing;
    }
    public String getShuxing(){
        return this.shuxing;
    }
}
