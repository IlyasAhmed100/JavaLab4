import javax.lang.model.util.ElementKindVisitor9;

public class ColourGrid{
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        
        if ((x <= 2 && y == 1) || (x == 1 && y <= 2)) {
            System.out.println("Red");
        }

        else if ((x == 1 && y >= 3) || (x <= 2 && y == 3) || (x == 1 && y == 3)) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
        

    }
}