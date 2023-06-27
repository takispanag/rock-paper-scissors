# Rock-Paper-Scissors Game

The Rock-Paper-Scissors Game is a simple console-based game where two players compete against each other by choosing one
of three possible moves: rock, paper, or scissors. The game is played for a fixed number of rounds,
and the winner is determined based on the rules of the game.

## Rules

The rules of the Rock-Paper-Scissors game are as follows:

- Scissors beats Paper
- Rock beats Scissors
- Paper beats Rock
- If both players choose the same move, the round is counted as a tie.

## Implementation

The implementation of the Rock-Paper-Scissors game is done in Java programming language. It consists of two players:
Player A and Player B. Player A always chooses the move "Paper," while Player B chooses a move randomly.

The game runs for 100 rounds, and at the end of the game, the program displays the number of games won by Player A,
Player B, and the number of ties.

## How to Run the Game

To run the Rock-Paper-Scissors game, follow these steps:

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Build the project using Maven (```mvn clean package```) or your IDE.
4. Run `Main.main()` to start the game.

Upon running the game, the program will simulate 100 rounds of the game, displaying the results at the end.

## Documentation

This project includes extensive documentation using JavaDoc comments. The documentation provides detailed information
about the classes, methods, and parameters used in the implementation.

To view the JavaDoc documentation:

1. Package the project (`mvn clean package`)
2. Open `target/site/apidocs/index.html` using any web browser to access the JavaDoc documentation.

## How to run Unit Tests

The game logic is accompanied by unit tests implemented using the JUnit and Mockito frameworks. The tests ensure that
the game's logic is working correctly and producing the expected outcomes for different scenarios. To run the tests,
follow these steps:

1. Open the project in your Java IDE.
2. Run the test classes located in the `src/test/java` directory (`mvn test`).

## Code Coverage

Code coverage reports provide insights into the amount of code being exercised by the unit tests. This project utilizes
JaCoCo, a popular code coverage tool, to generate code coverage reports.

To view the code coverage reports, open the following file in your web browser after running the tests `target/site/jacoco/index.html`.

The code coverage report will provide information on which parts of the code are covered by the unit tests.

## Advantages and Disadvantages of my implementation

Advantages of this implementation:

- Simple and concise code structure.
- Easy to understand and maintain.
- Follows the object-oriented principles by encapsulating game logic in classes and using enums for moves and outcomes.
- Unit tests provide confidence in the correctness of the game logic.
- Interface usage to make refactoring easier if needed. For example RockPaperScissorsGame constructor takes 2 players
that are instances of ```Player``` interface, so that we can easily swap ```PlayerA``` that always chooses ```Paper``` to
```PlayerB``` if we want both players to have random choices.

Disadvantages of this implementation:

- The game is played in a console-based environment, which might not provide an interactive or visually appealing experience.
- The number of rounds to run could be an input from the command line, but as indicated in the exercise the round number
is fixed to 100. If we decide to make it a cli app, minimal refactoring will be needed.
- The implementation only includes two players with ```PlayerA``` having a fixed strategy (always selecting Paper), 
limiting the variety of gameplay.