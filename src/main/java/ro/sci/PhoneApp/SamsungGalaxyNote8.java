package ro.sci.PhoneApp;

public class SamsungGalaxyNote8 extends Phone implements  Samsung {

    private String material;
    private String color;
    private long imei;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
