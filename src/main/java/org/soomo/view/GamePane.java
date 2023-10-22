package org.soomo.view;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.soomo.controller.GameStart;
import org.soomo.model.Ball;
import org.soomo.model.Brick;
import org.soomo.model.Paddle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GamePane class is a JavaFX Pane representing the game area.
 */
public class GamePane extends Pane {
    private List<Brick> bricks; // A list to hold the current set of Brick objects
    private Paddle paddle; // Paddle object to control by the user
    private Ball ball; // Ball object that will bounce off walls and paddle
    private Label lifeLabel; // Label to show heart symbols

    public GamePane() {
        bricks = new ArrayList<>();
        initLifeIndicator();
        initBallAndPaddle();
        Image backgroundImage =
                new Image(Objects.requireNonNull(getClass().getResourceAsStream("/backgrounds/background.gif")));

        BackgroundImage background =
                new BackgroundImage(
                        backgroundImage,
                        BackgroundRepeat.NO_REPEAT, // Or BackgroundRepeat.NO_REPEAT
                        BackgroundRepeat.NO_REPEAT, // Or BackgroundRepeat.NO_REPEAT
                        BackgroundPosition.DEFAULT,
                        new BackgroundSize(
                                BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));

        setBackground(new Background(background));
    }


    public Paddle getPaddle() {
        return paddle;
    }

    public Ball getBall() {
        return ball;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    /**
     * Updates the pane with a new set of bricks.
     *
     * @param brickList The new list of Brick objects.
     */
    public void setBricks(List<Brick> brickList) {
        this.bricks.clear();
        this.bricks = brickList;
        getChildren().addAll(brickList);
    }

    /**
     * Clears all game elements from the pane.
     */
    public void clear() {
        getChildren().clear();
    }

    // Initialize life indicator
    public void initLifeIndicator() {
        // Create a new Label that will be updated later with the number of hearts.
        lifeLabel = new Label("❤❤❤"); // Three hearts to start the game
        lifeLabel.setTextFill(Color.RED);
        lifeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        HBox lifeContainer = new HBox();
        lifeContainer.getChildren().add(lifeLabel);

        // Position the lifeContainer in the upper-left corner of the GamePane.
        lifeContainer.setLayoutX(GameStart.SCENE_WIDTH * 0.90);
        lifeContainer.setLayoutY(GameStart.SCENE_HEIGHT * 0.95);

        // Add the lifeContainer to the GamePane, so it becomes visible.
        getChildren().add(lifeContainer);
    }

    /**
     * Initializes the ball and paddle and adds them to the game pane.
     */
    private void initBallAndPaddle() {
        // Initialize ball and paddle
        this.ball = new Ball();
        this.paddle = new Paddle();

        getChildren().addAll(ball, paddle);
    }

    public void updateLifeIndicator(int remainingLives) {
        lifeLabel.setText("❤".repeat(Math.max(0, remainingLives))
        );
    }
}
