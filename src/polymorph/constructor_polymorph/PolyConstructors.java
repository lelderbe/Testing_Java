package polymorph.constructor_polymorph;

/**
 * Created by user on 06.05.2017.
 */

//If you call a dynamically-bound method inside a constructor, the overridden definition for
//that method is used.
// ???
class Glyph {
    /*private*/ void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    protected int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
class Glyph3 extends RoundGlyph {
    public Glyph3(int r) {
        super(r);
        System.out.println("Glyph3 constructor");
    }

    @Override
    void draw() {
        System.out.println("Glyph3.draw(), radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        System.out.println();
        new Glyph();
        System.out.println();
        new Glyph3(5);
    }
}
