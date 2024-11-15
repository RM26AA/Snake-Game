# Snake Game

## Overview
This project is a classic Snake game implemented in Java using the Swing library for graphical elements. The player controls a growing snake, which moves around the board to consume food while avoiding collisions with its own body and the screen edges. The game tests the player’s reflexes and ability to navigate the snake without colliding.

## Features
- **Dynamic Snake Movement**: The snake grows longer each time it consumes food.
- **Randomized Food Placement**: Food appears at random positions, adding a challenge to navigation.
- **Collision Detection**: The game ends if the snake collides with the board boundaries or itself.
- **Configurable Board Size**: Board dimensions are set at initialization but can be adjusted.

## Technologies Used
- **Java**: Object-oriented programming for the game’s logic and state management.
- **Swing Framework**: Manages the graphical user interface, including the board, snake, and food items.
- **Event Handling**: Captures keyboard inputs to control the snake’s direction and manage game events.
- **Animation and Timers**: Uses a timer to create smooth, continuous movement for the snake.

## Files
- **App.java**: The entry point, initializing the game window and launching the `SnakeGame` class.
- **SnakeGame.java**: Contains the core game mechanics, including snake movement, food generation, collision detection, and rendering of the game board.

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository-name.git
2. Compile the Java files:
   ```bash
   javac App.java SnakeGame.java
3. Run the application:
   ```bash
   java App

## How to Play:
- Use the arrow keys to control the direction of the snake.
- Collect food to grow the snake and increase your score.
- Avoid colliding with the walls or the snake's own body, or the game will end.

## License:
This project is open-source and available under the MIT License.

## Author:
Romeo - A developer passionate about recreating classic games and enhancing programming skills through interactive projects.





















