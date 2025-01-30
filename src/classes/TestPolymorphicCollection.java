package classes;

public class TestPolymorphicCollection {
    public static void doTest(){
        //        Polymorphic Collection
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for(var control: controls)
            control.draw();

    }
}
