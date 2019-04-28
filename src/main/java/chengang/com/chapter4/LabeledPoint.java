package chengang.com.chapter4;


import java.util.Objects;

public class LabeledPoint extends Point{
    private String label;

    public LabeledPoint(String label, double x, double y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    LabeledPoint() {
        super();
        this.label = "";
    }

    @Override
    public String toString() {
        return super.toString().replaceFirst("]", String.format(", label=%s]", this.label));
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        LabeledPoint other = (LabeledPoint) obj;
        return Objects.equals(other.label, this.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.label);
    }
}
