import java.util.List;

public class PokeMon {
    private List<PokeMon> doubleAtt;
    private List<PokeMon> doubleDen;
    private List<PokeMon> halfAtt;
    private List<PokeMon> halfDen;
    private List<PokeMon> invalidAtt;
    private List<PokeMon> invalidDen;
    private String shuxing;

    public String getShuxing() {
        return shuxing;
    }

    public void setShuxing(String shuxing) {
        this.shuxing = shuxing;
    }

    public List<PokeMon> getInvalidAtt() {
        return invalidAtt;
    }

    public void setInvalidAtt(List<PokeMon> invalidAtt) {
        this.invalidAtt = invalidAtt;
    }

    public List<PokeMon> getInvalidDen() {
        return invalidDen;
    }

    public void setInvalidDen(List<PokeMon> invalidDen) {
        this.invalidDen = invalidDen;
    }

    public List<PokeMon> getDoubleAtt() {
        return doubleAtt;
    }

    public void setDoubleAtt(List<PokeMon> doubleAtt) {
        this.doubleAtt = doubleAtt;
    }

    public List<PokeMon> getDoubleDen() {
        return doubleDen;
    }

    public void setDoubleDen(List<PokeMon> doubleDen) {
        this.doubleDen = doubleDen;
    }

    public List<PokeMon> getHalfAtt() {
        return halfAtt;
    }

    public void setHalfAtt(List<PokeMon> halfAtt) {
        this.halfAtt = halfAtt;
    }

    public List<PokeMon> getHalfDen() {
        return halfDen;
    }

    public void setHalfDen(List<PokeMon> halfDen) {
        this.halfDen = halfDen;
    }

}
