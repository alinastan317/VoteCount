# VoteCount
/*
 * There are n citizens voting in this year's HackLand election. Each voter writes the name of their chosen candidate 
 * on a ballot and places it in a ballot box. The candidate with the highest number of votes wins the election; 
 * if two or more candidates have the same number of votes, then the tied candidates' names are ordered alphabetically 
 * and the last name wins.
 * Create an application that accepts the input format and returns a string representing the name of the winning candidate.
 * 
 * Input Format
 * The first line contains an integer, n, denoting the size of the votes array. Each line i of the n subsequent lines (where 0 ≤ i < n) 
 * of strings contains a citizen's vote in the form of a candidate's name.
 * 
 * Constraints
 * 1 ≤ n ≤ 104
 * 
 * Output Format
 * Your application must return a string denoting the name of the winner. This should be printed to stdout.
 */
 
Sample Input 1
==============
10
Alex
Michael
Harry
Dave
Michael
Victor
Harry
Alex
Mary
Mary

Sample Output 1
================
Michael

Explanation 1
=================
votes = {"Alex", "Michael", "Harry", "Dave", "Michael", "Victor", "Harry", "Alex", "Mary", "Mary"}
Alex, Harry, Michael, and Mary are all tied for the highest number of votes. Because Michael is alphabetically last, 
we return his name as the winner.


Sample Input 2
==============
10
Victor
Veronica
Ryan
Dave
Maria
Maria
Farah
Farah
Ryan
Veronica

Sample Out
=============
