import java.lang.constant.Constable;

public class Abstract {
    private int i;
    private float f;
    private String name;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Abstract(int i, float f, String name){
        this.i = i;
        this.f = f;
        this.name = name;
    }

    public Abstract(int i, float f){
        this.i = i;
        this.f = f;
        this.name = "Default";
    }

    public Abstract(int i ){
        this.i = i;
        this.f = 10.5f;
        this.name = this.name = "Default";
    }
    public String getName(){
        return this.name;
    }
}


