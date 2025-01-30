package classes;

public abstract class UIControl {
    protected boolean enabled;

    public UIControl(boolean enabled){
        this.enabled = enabled;
        System.out.println("UIControl");
    }
    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public abstract void draw();
}
