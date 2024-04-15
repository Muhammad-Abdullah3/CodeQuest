
import java.util.Scanner;
class Candidate {
    String name;
    String place;
    int votes;

    // Constructor
    public Candidate(String name, String place) {
        this.name = name;
        this.place = place;
        this.votes = 0;
    }

    // Method to get candidate details
    public static int getCandidateDetails(Scanner scanner, Candidate[] candidates) {
        int numCandidates = 0;
        System.out.print("Enter the number of candidates : ");
        while (true) {
            if (scanner.hasNextInt()) {
                numCandidates = scanner.nextInt();
                if (numCandidates > 0 && numCandidates <= 5) {
                    break;
                } else {
                    System.out.print("Wrong!. Please enter a number greater than 1 and less than 5 : ");
                }
            } else {
                System.out.print("Please enter a number(int) to make a choice : ");
            }
        }

        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numCandidates; i++) {
            System.out.print("Enter the name of Candidate " + (i + 1) + " : ");
            String name = scanner.nextLine();
            System.out.print("Enter the place of Candidate " + (i + 1) + " : ");
            String place = scanner.nextLine();
            candidates[i] = new Candidate(name, place);
        }
        return numCandidates;
    }
}
class VoterDetail {
    static final int Max_Voters = 100;

    // Method to get number of voters
    public static int getNumberOfVoters(Scanner scanner) {
        int numVoters;
        System.out.print("Enter the number of voters : ");
        while (true) {
            if (scanner.hasNextInt()) {
                numVoters = scanner.nextInt();
                if (numVoters > 0 && numVoters <= Max_Voters) {
                    return numVoters;
                } else {
                    System.out.print("Please enter a number between 1 and " + Max_Voters + " : ");
                }
            } else {
                System.out.print("Please enter a valid integer : ");
            }
        }
    }
}

class MenuChoice {
    // Method to get menu choice
    public static int getMenuChoice(Scanner scanner) {
        System.out.println("\n\t\t----- Voting System Menu-----\n");
        System.out.println("press 1 for Vote:");
        System.out.println("Press 2 for Display Result: ");
        System.out.println("press 3 for exit: ");
        System.out.print("\n\n\t\tMake a choice : ");

        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if (choice > 0 && choice <= 3) {
                    return choice;
                } else {
                    System.out.print("\n\t\tYou are entering a wrong number for choice. Please enter number from 1 to 3 to select the choice : ");
                }
            } else {
                System.out.print("\n\t\tPlease enter a number(int) to make a choice : ");
            }
        }
    }
}

class Result {
    // Method to process votes and display result
    public void processVotes(Scanner scanner, Candidate[] candidates, int numCandidates, int numVoters) {
        int[] votes = new int[numCandidates];
        for (int i = 0; i < numVoters; i++) {
            System.out.print("Enter the vote for Voter " + (i + 1) + " : ");
            int vote = scanner.nextInt();
            if (vote > 0 && vote <= numCandidates) {
                votes[vote - 1]++;
            } else {
                System.out.println("Invalid vote. Please enter a number between 1 and " + numCandidates + " : ");
                i--; // Prompt again for the same voter
            }
        }

        System.out.println("\n----- Voting Result -----\n");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("Candidate " + (i + 1) + " : " + candidates[i].name + " (" + candidates[i].place + ") - " + votes[i] + " votes");
        }
    }
}
public class MidLong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Candidate[] candidates = new Candidate[5];
        int numCandidates = Candidate.getCandidateDetails(scanner, candidates);
        int numVoters = VoterDetail.getNumberOfVoters(scanner);
        Result result = new Result();

        int choice;
        while (true) {
            choice= MenuChoice.getMenuChoice(scanner);
            if (choice == 1) {
                result.processVotes(scanner, candidates, numCandidates, numVoters);
            } else if (choice == 2) {
                System.out.println("Displaying result...");
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 3 : ");}
            }
 }
}
