package dessin;

import javafx.geometry.Point2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends ObjetGraphique {

    private Rectangle2D rectangle;

    public Rectangle() {

    }

    public Rectangle(int x, int y, int largeur, int hauteur) {
        super();
        this.rectangle = new Rectangle2D(x,y,largeur,hauteur);
    }

    public Rectangle(Point2D p, int largeur, int hauteur) {
        super();
        this.rectangle = new Rectangle2D(p.getX(),p.getY(),largeur,hauteur);
    }

    public Rectangle(Point2D p, int largeur, int hauteur, Color c) {
        super(c);
        this.rectangle = new Rectangle2D(p.getX(),p.getY(),largeur,hauteur);
    }

    public void dessineToi(GraphicsContext gc) {
        gc.rect(rectangle.getMinX(), rectangle.getMinY(), rectangle.getWidth(), rectangle.getHeight());
        gc.setFill(this.getCouleur());
        gc.fillRect(rectangle.getMinX(), rectangle.getMinY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public boolean contient(int x, int y) {
        return rectangle.contains(x,y);
    }
}
