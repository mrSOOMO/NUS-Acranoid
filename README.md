# Arkanoid Game

## Overview

This is a classic Arkanoid game built using JavaFX. The game features multiple levels, adjustable difficulty settings, and customizable ball speeds. Whether you're nostalgic for the original or just looking for a fun way to pass the time, this Arkanoid game has got you covered.

## Features

- Multiple levels with increasing difficulty
- Customizable ball speeds
- Difficulty settings: Easy, Normal, and Hard
- High Scores Screen
- Sound effects and background music
- Responsive design that works on various window sizes

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven (Optional)

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/mrSOOMO/NUS-Acranoid.git
    ```

2. Navigate into the directory:
    ```bash
    cd Arkanoid
    ```

    #### Prerequisites and Setup

    Make sure you have Java and JavaFX installed on your system.

    ##### Setting up VM Options

    For the application to run, you need to set the VM options. Navigate to your IDE's run configuration and set the VM options to:
    ```--module-path "C:\Program Files\JavaFX\javafx-sdk-17.0.8\lib" --add-modules javafx.controls,javafx.fxml,javafx.media```


3. Compile and run:

    ```bash
    javac -classpath PATH_TO_JAVAFX YourMainClass.java
    java -classpath PATH_TO_JAVAFX YourMainClass
    ```

   Or if you're using Maven:

    ```bash
    mvn clean install
    mvn javafx:run
    ```

## How to Play

- Use the left and right arrow keys to move the paddle.
- Break all the bricks to advance to the next level.

## Configuration

The game can be configured by modifying the `config.properties` and `levels.json` files located in the `src/main/resources` directory.

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.

## Acknowledgments

- Original Arkanoid game
- JavaFX community
