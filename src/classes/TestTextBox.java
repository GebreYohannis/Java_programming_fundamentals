package classes;

public class TestTextBox {
    public static void doTest() {
        // UP-Casting(Casting Child/Sub/Derived
        // class to Parent/Super/Base class) which is legal and allowed
//        In a nutshell Upcasting mean casting an object to one of its supertypes
        UIControl control = new TextBox();
        control.disable();
        control.enable();
        show(control);
        TextBox textBox = new TextBox();
        textBox.setText("Hello TextBox");
        System.out.println(textBox);
        show(textBox);
//        Down-Casting (Casting Parent/Super/Base 
//        class to Child/Sub/Derived class) which is illegal to do it
//        TextBox box =  new UIControl(true);
//        In a nutshell Down-casting mean casting an object to one of its subtypes
    }

    public static void show(UIControl control){
        if(control instanceof  TextBox){
            var textBox = (TextBox) control;
            textBox.setText("Hello world");
        }
        System.out.println(control);
    }
}