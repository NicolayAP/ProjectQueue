package controller;

import models.Game;
import models.Player;
import view.View;

import java.util.Queue;


public class QueueMain {
    private View view;
    private Game game;
    private Player player;


    public QueueMain() {
        view = new View();
        game = new Game();
        player = new Player();
    }

    public void chooseDifficulty() throws InterruptedException {
        int opDifficulty =view.enterInt("Enter the level of difficulty: \n1.Easy \n2.Medium \n3.Hard \n4.Salir");
        switch (opDifficulty) {
            case 1:
                Queue<String> easyMode = game.getEasy();
                easyMode.offer("Hello");
                easyMode.offer("World");
                easyMode.offer("Goodbye");
                startGameEasy();
                break;
            case 2:
                Queue<String> mediumMode = game.getMedium();
                mediumMode.offer("Programming");
                mediumMode.offer("Computer");
                mediumMode.offer("Cellphone");
                startGameMedium();
                break;
            case 3:
                Queue<String> hardMode = game.getHardcore();
                hardMode.offer("Java");
                hardMode.offer("ArrayIndexOutOfBoundsException");
                hardMode.offer("NullPointerExceptions");
                startGameHard();
                break;
            case 4:
                view.showMessage("Thank you for playing!");
                System.exit(0);
                break;
        }
    }

    public void showQueueEasy() {
        for (String word : game.getEasy()) {
            view.showMessage(word);
        }
    }

    public void showQueueMedium() {
        for (String word : game.getMedium()) {
            view.showMessage(word);
        }
    }

    public void showQueueHard() {
        for (String word : game.getHardcore()) {
            view.showMessage(word);
        }
    }

    public void startGameMedium() throws InterruptedException {
        view.showMessage("Welcome to the game of Queue...\nEnter the word following the order of the Queue");
        showQueueMedium();

        int scoreMedium = player.getScore();
        while (!game.getMedium().isEmpty()) {
            view.showMessage("**********************");
            String word =view.enterString("Enter the word: " + game.getMedium().peek() + " because is the fist input");
            view.showMessage("**********************");


            if (game.getMedium().peek().toLowerCase().equals(word)) {
                view.showMessage("Correct");
                scoreMedium += 10;
                view.showMessage("Score +10");
                Thread.sleep(1000);
                view.showMessage("Score current: " + scoreMedium + "\n");
                game.getMedium().poll();

            } else {
                scoreMedium -= 5;
                view.showMessage("Score -5");
                view.showMessage("Incorrect, Retry");
                view.showMessage("Score current: " + scoreMedium + "\n");

            }
        }
        view.showMessage("Score total: " + scoreMedium + "\n");
        if (scoreMedium <= 0) {
            view.showMessage("Game over, the score is very low");
        } else
            view.showMessage("You WIN");

    }

    public void startGameEasy() throws InterruptedException {
        view.showMessage("Welcome to the game of Queue...\nEnter the word following the order of the Queue");
        showQueueEasy();

        int scoreEasy = player.getScore();
        while (!game.getEasy().isEmpty()) {
            view.showMessage("**********************");
            String word = view.enterString("Enter the word: " + game.getEasy().peek() + " because is the fist input");
            view.showMessage("**********************");


            if (game.getEasy().peek().toLowerCase().equals(word)) {
                view.showMessage("Correct");
                scoreEasy += 10;
                view.showMessage("Score +10");
                Thread.sleep(1000);
                view.showMessage("Score current: " + scoreEasy + "\n");
                game.getEasy().poll();

            } else {
                scoreEasy -= 5;
                view.showMessage("Score -5");
                view.showMessage("Incorrect, Retry");
                view.showMessage("Score current: " + scoreEasy + "\n");

            }
        }
        view.showMessage("Score total: " + scoreEasy + "\n");
        if (scoreEasy <= 0) {
            view.showMessage("Game over, the score is very low");
        } else
            view.showMessage("You WIN");

    }

    public void startGameHard() throws InterruptedException {
        view.showMessage("Welcome to the game of Queue...\nEnter the word following the order of the Queue");
        showQueueHard();

        int scoreHard = player.getScore();
        while (!game.getHardcore().isEmpty()) {
            view.showMessage("**********************");
            String word = view.enterString("Enter the word: " + game.getHardcore().peek() + " because is the fist input");
            view.showMessage("**********************");


            if (game.getHardcore().peek().toLowerCase().equals(word)) {
                view.showMessage("Correct");
                scoreHard += 10;
                view.showMessage("Score +10");
                Thread.sleep(1000);
                view.showMessage("Score current: " + scoreHard + "\n");
                game.getHardcore().poll();

            } else {
                scoreHard -= 5;
                view.showMessage("Score -5");
                view.showMessage("Incorrect, Retry");
                view.showMessage("Score current: " + scoreHard + "\n");

            }
        }
        view.showMessage("Score total: " + scoreHard + "\n");
        if (scoreHard <= 0) {
            view.showMessage("Game over, the score is very low");
        } else
            view.showMessage("You WIN");

    }

    public static void main(String[] args) throws InterruptedException {
        QueueMain queueMain = new QueueMain();
        queueMain.chooseDifficulty();

    }
    }
