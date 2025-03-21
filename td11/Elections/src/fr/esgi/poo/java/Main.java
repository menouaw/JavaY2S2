package fr.esgi.poo.java;

import java.util.Random;

public class Main {
    private static final int MAX_CANDIDATES = 3;
    private static final int MAX_ELECTORS = 10;

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[MAX_CANDIDATES];
        Elector[] electors = new Elector[MAX_ELECTORS];

        candidates[0] = new Candidate("John");
        candidates[1] = new Candidate("Johnnas");
        candidates[2] = new Candidate("Johnnes");

        Random random = new Random();

        for (int i = 0; i < electors.length; i++) {
            electors[i] = new Elector();

            int randomNumber = random.nextInt(MAX_CANDIDATES);
            Candidate randomCandidate = candidates[randomNumber];
            electors[i].voteFor(randomCandidate);
        }

        for (Elector elector : electors) {
            System.out.println(elector.toString());
        }

        for (Candidate candidate : candidates) {
            System.out.println(candidate.toString());
        }


    }
}
