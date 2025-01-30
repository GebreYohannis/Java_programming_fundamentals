package classes;

public class CheckBox extends UIControl{
    @Override
    public void draw() {
        System.out.println("Drawing a CheckBox");
    }

    public  CheckBox(){
        super(true);
    }
    public CheckBox(boolean enabled) {
        super(enabled);
    }
}
