package toto;

import dessin.Cercle;
import dessin.Rectangle;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class TotoPane extends BorderPane{

    public static BorderPane createPane() {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(createCanvas());
        borderPane.setTop(createToolBar());
        return borderPane;
    }

    private static Canvas createCanvas() {
        Canvas canvas = new Canvas(400,400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Cercle cercle1 = new Cercle(new Point2D(200.0,200.0),100,Color.BLUE);
        cercle1.dessineToi(gc);

        Cercle cercle2 = new Cercle(new Point2D(160.0,150.0),20,Color.RED);
        cercle2.dessineToi(gc);

        Cercle cercle3 = new Cercle(new Point2D(240.0,150.0),20,Color.YELLOW);
        cercle3.dessineToi(gc);

        Rectangle rectangle = new Rectangle(new Point2D(150.0,220.0),100,40);
        rectangle.dessineToi(gc);

        return canvas;
    }

    private static ToolBar createToolBar() {
        ToolBar toolBar = new ToolBar(new Button("Tête"),new Button("Oeil 1"),new Button("Oeil 2"),new Button("Bouche"));
        return toolBar;
    }

}
