import java.util.Scanner;

public class MidLong3 {
    static final int Max_Candidates = 5;
    static final int Max_Voters = 100;

    static class Candidate {
        String name;
        String place;
        int votes;

        Candidate(String name, String place) {
            this.name = name;
            this.place = place;
            this.votes = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t^^|*|^^");
        System.out.println("\t\t^^|   WELCOME TO              |^^");
        System.out.println("\t\t^^|   E-Voting System         |^^");
        System.out.println("\t\t^^|*|^^");
        scanner.nextLine();
        clearScreen();

        Candidate[] candidates = new Candidate[Max_Candidates];
        int numCandidates;
        System.out.print("\n\t\tEnter the number of candidates : ");
        while (true) {
            numCandidates = scanner.nextInt();
            if (numCandidates > 0 && numCandidates <= Max_Candidates) {
                break;
            } else {
                System.out.print("\n\t\tYou are entering a wrong number. Please enter a number greater than 1 and less than 5 : ");
            }
        }
        scanner.nextLine();
        for (int i = 0; i < numCandidates; i++) {
            System.out.print("\n\t\tEnter the name of Candidate " + (i + 1) + " : ");
            String name = scanner.nextLine();
            System.out.print("\t\tEnter the place of Candidate " + (i + 1) + " : ");
            String place = scanner.nextLine();
            candidates[i] = new Candidate(name, place);
        }

        int numVoters;
        System.out.print("\n\t\tEnter the number of voters : ");
        while (true) {
            numVoters = scanner.nextInt();
            if (numVoters > 0 && numVoters <= Max_Voters) {
                break;
            } else {
                System.out.print("\n\t\tYou are entering a wrong number. Please enter a number from 1 to 100 : ");
            }
        }
        scanner.nextLine();
        boolean[] hasVoted = new boolean[Max_Voters];

        int result;
        do {
            result = getMenuChoice(scanner);
            switch (result) {
                case 1:
                    vote(candidates, numCandidates, numVoters, hasVoted, scanner);
                    break;
                case 2:
                    displayResults(candidates, numCandidates);
                    break;
                case 3:
                    System.out.println("\n\t\t........ Exit the Program ........");
                    break;
                default:
                    System.out.println("\n\t\tEntered choice is not in our Choice list, so please enter a number from 1 to 3.");
            }
        } while (result != 3);
    }

    static void clearScreen() {
        // Clearing screen logic
    }

    static int getMenuChoice(Scanner scanner) {
        System.out.println("\n\t\t----- Voting System Menu-----");
        System.out.println("\t\t| 1. Vote                   |");
        System.out.println("\t\t| 2. Display Results        |");
        System.out.println("\t\t| 3. Exit                   |");
        System.out.println("\t\t-----------------------------");
        int choice;
        System.out.print("\n\n\t\tMake a choice : ");
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice > 0 && choice <= 3) {
                    break;
                } else {
                    System.out.print("\n\t\tYou are entering a wrong number for choice. Please enter a number from 1 to 3 to select the choice : ");
                }
            } else {
                System.out.print("\n\t\tPlease enter a number(int) to make a choice : ");
                scanner.next();
            }
        }
        return choice;
    }

    static void vote(Candidate[] candidates, int numCandidates, int numVoters, boolean[] hasVoted, Scanner scanner) {
        System.out.print("\n\t\tEnter Voter Id : ");
        int voterId;
        while (true) {
            voterId = scanner.nextInt();
            if (voterId > 0 && voterId <= numVoters) {
                break;
            } else {
                System.out.print("\n\t\tYou are entering a wrong number. Please enter a number greater than 0 and less than or equal to the number of Voters : ");
            }
        }

        if (hasVoted[voterId - 1]) {
            System.out.println("\n\n\t\t__\n" +
                    "\t\t                              \n" +
                    "\t\t  YOU HAVE ALREADY VOTED...  \n" +
                    "\t\t__\n");
            return;
        }

        System.out.println("\n\t\tCandidates list : ");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("\t\t" + (i + 1) + ") " + candidates[i].name + " (" + candidates[i].place + " ).");
        }

        int candidateId;
        System.out.print("\n\t\tEnter number to choose the candidate for vote : ");
        while (true) {
            candidateId = scanner.nextInt();
            if (candidateId > 0 && candidateId <= numCandidates) {
                break;
            } else {
                System.out.print("\n\t\tYou are entering a wrong number. Please enter a number greater than 0 and less than or equal to the number of candidates : ");
            }
        }

        System.out.println();
        candidates[candidateId - 1].votes++;

        System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^");
        System.out.println("\t\t^                  ^");
        System.out.println("\t\t^  VOTE RECORDED!  ^");
        System.out.println("\t\t^                  ^");
        System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^");

        hasVoted[voterId - 1] = true;
    }

    static void displayResults(Candidate[] candidates, int numCandidates) {
        System.out.println("\n\t\t~Voting Results");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("\n\t\t Votes of CANDIDATE " + candidates[i].name + " ( " + candidates[i].place + " ) are : " + candidates[i].votes);
        }
        System.out.println("\n\t\t_");
    }
}