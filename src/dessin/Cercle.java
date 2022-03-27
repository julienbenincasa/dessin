package dessin;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class Cercle extends ObjetGraphique {

    private Circle cercle;

    public Cercle() {
        super();
    }

    public Cercle(Point2D centre,int rayon) {
        super();
        this.cercle = new Circle(centre.getX(),centre.getY(),rayon);
    }

    public Cercle(Point2D centre, int rayon, Color couleur) {
        super(couleur);
        this.cercle = new Circle(centre.getX(),centre.getY(),rayon);
    }

    public void dessineToi(GraphicsContext gc) {
        gc.arc(cercle.getCenterX(),cercle.getCenterY(),
                cercle.getCenterX()-cercle.getRadius(),
                cercle.getCenterY()-cercle.getRadius(),
                360.0,cercle.getRadius());
        gc.setFill(this.getCouleur());
        gc.fillArc(cercle.getCenterX()- cercle.getRadius(),cercle.getCenterY()- cercle.getRadius(),
                cercle.getRadius()*2,
                cercle.getRadius()*2,
                90.0,
                360.0,
                ArcType.OPEN);
    }

    public boolean contient(int x, int y) {
        return this.cercle.contains(x,y);
    }
}