package CampusExercise;

public class Light {
    public Light(String lightColor, boolean isOn) {
        this.lightColor = lightColor;
        this.isOn = isOn;
    }

    private String lightColor;
    private  boolean isOn = false;

    public void setLightColor(String lightColor){
        this.lightColor = lightColor;
    }

    public String getLightColor() {
        return lightColor;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
