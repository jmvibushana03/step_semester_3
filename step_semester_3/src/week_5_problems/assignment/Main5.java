package week_5_problems.assignment;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {

        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // First isEligible method
    static boolean isEligible(double cgpa) {

        return cgpa >= 7.5;
    }

    // Second isEligible method
    static boolean isEligible(double cgpa, int codingScore) {

        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Composite score
    double getScore() {

        return cgpa * 10 + codingScore;
    }

    // Sort in descending order
    public int compareTo(Candidate other) {

        return Double.compare(other.getScore(), this.getScore());
    }
}

public class Main5 {

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];

        int count = 0;

        for (int i = 0; i < candidates.length; i++) {

            if (Candidate.isEligible(candidates[i].cgpa) ||
                    Candidate.isEligible(candidates[i].cgpa,
                            candidates[i].codingScore)) {

                shortlisted[count] = candidates[i];
                count++;
            }
        }

        Candidate[] finalList = Arrays.copyOf(shortlisted, count);

        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result + (i + 1) + ". "
                    + finalList[i].name
                    + " (" + finalList[i].getScore() + ")";

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {

                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
