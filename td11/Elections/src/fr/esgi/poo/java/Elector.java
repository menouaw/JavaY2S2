package fr.esgi.poo.java;

public class Elector {
    private int id;
    private Candidate voteFor;
    private static int c = 0;


    public Elector() {
        this.id = c++;
    }

    public void voteFor(Candidate candidate) {
        if (voteFor == null) {
            voteFor = candidate;
            candidate.addNbVote();
        }
    }

    @Override
    public String toString() {
        return "Elector{" +
                "id='" + id + '\'' +
                "voteFor=" + voteFor +
                '}';
    }
}
