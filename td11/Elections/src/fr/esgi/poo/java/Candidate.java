package fr.esgi.poo.java;

public class Candidate {
    private String name;
    private int nbVotes;

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                "nbVotes='" + nbVotes + '\'' +
                '}';
    }

    public Candidate(String name) {
        this.name = name;
    }

    public void addNbVote() {
        nbVotes++;
    }
}
