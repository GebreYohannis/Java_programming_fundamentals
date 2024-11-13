package DataTypes;

import java.awt.Point;
import java.util.Date;

public class ReferenceTypes {
    public ReferenceTypes() {
    }

    public void doOperation() {
        boolean age = true;
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 10;
        System.out.println(point2);
        point2.y = 29;
        System.out.println(point1);
    }
}
