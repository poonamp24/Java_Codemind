interface Drawable {
    void Draw();
}

class Rect implements Drawable {
    public void Draw() {

        System.out.println("Drawing Rectngle");
    }
}

class Circle implements Drawable {
    public void Draw() {
        System.out.println("Drawing Circle");
    }
}

class TestInterface {
    public static void main(String args[]) {
        Drawable d = new Circle();
        d.Draw();
        d = new Rect();
        d.Draw();
    }
}