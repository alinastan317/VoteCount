/*
 * There are n citizens voting in this year's HackLand election. Each voter writes the name of their chosen candidate 
 * on a ballot and places it in a ballot box. The candidate with the highest number of votes wins the election; 
 * if two or more candidates have the same number of votes, then the tied candidates' names are ordered alphabetically 
 * and the last name wins.
 * Create an application that accepts the input format and returns a string representing the name of the winning candidate.
 * 
 * Input Format
 * The first line contains an integer, n, denoting the size of the votes array. Each line i of the n subsequent lines (where 0 ≤ i < n) of strings contains a citizen's vote in the form of a candidate's name.
 * 
 * Constraints
 * 1 ≤ n ≤ 104
 * 
 * Output Format
 * Your application must return a string denoting the name of the winner. This should be printed to stdout.
 */
package voting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alistan
 */
public class Voting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1st input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of participants : ");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
        }

        //Votes into array
        System.out.println("Please enter the votes for the " + input + " participants \n");

        Scanner s = new Scanner(System.in);
        String votesList[] = new String[Integer.parseInt(input)];
        int counter[] = new int[Integer.parseInt(input)];
        int max = 0;

        for (int i = 0; i < votesList.length; i++) {
            votesList[i] = s.nextLine();
        }

        /*
        for (int i = 0; i < votesList.length; i++) {
            System.out.println(votesList[i]);
        }*/
        //count how many repetitions
        for (int i = 0; i < votesList.length; i++) {
            for (int j = i; j < votesList.length; j++) {
                if (votesList[i].equals(votesList[j])) {
                    counter[i]++;
                    if (max < counter[i]) {
                        max = counter[i];
                    } // find max
                }
            }
        }

        List<String> winnersList = new ArrayList<>();
        for (int i = 0; i < votesList.length; i++) {
            if (max == counter[i]) {
                winnersList.add(votesList[i]);
            }
        }

        //System.out.println(winnersList);  
        winnersList.sort(String::compareToIgnoreCase);
        //System.out.println(winnersList);
        System.out.println(winnersList.get(winnersList.size()-1));

    }

}
