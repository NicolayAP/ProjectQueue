package models;

import java.util.LinkedList;
import java.util.Queue;

public class Game {

    private Queue<String> easy;
    private Queue<String> medium;
    private Queue<String> hardcore;

    public Game(){
        easy = new LinkedList<>();
        medium = new LinkedList<>();
        hardcore = new LinkedList<>();
    }

    public Queue<String> getEasy() {
        return easy;
    }

    public void setEasy(Queue<String> easy) {
        this.easy = easy;
    }

    public Queue<String> getMedium() {
        return medium;
    }

    public void setMedium(Queue<String> medium) {
        this.medium = medium;
    }

    public Queue<String> getHardcore() {
        return hardcore;
    }

    public void setHardcore(Queue<String> hardcore) {
        this.hardcore = hardcore;
    }
}
