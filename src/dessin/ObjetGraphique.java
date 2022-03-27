package dessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class ObjetGraphique {

    private Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public ObjetGraphique() {
        this.couleur = Color.BLACK;
    }

    public ObjetGraphique(Color couleur) {
        this.couleur = couleur;
    }

    public abstract void dessineToi(GraphicsContext gc);

    public abstract boolean contient(int a, int b);
}
