/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electionstatistics;

/**
 *
 * @author ratil
 */import java.util.Scanner;
public class ElectionStatistics {
 public static void main(String[] args) {
     
     Scanner scanner = new Scanner (System.in);
 //Accepting input from the first party
 System.out.print("Enter name for the first party");
 String party1= scanner.nextLine();
 System.out.print("Enter votes receieved >>");
 int votes1= Integer.parseInt(scanner.nextLine());
     
  // Accepting input from the second party
scanner.nextLine(); // Consume newline left-over
System.out.print("Enter name for second party >> ");
String party2 = scanner.nextLine();
System.out.print("Enter votes received >> ");
int votes2 = scanner.nextInt();

  // Accepting input from the third party
scanner.nextLine(); // Consume newline left-over
System.out.print("Enter name for third party >> ");
String party3 = scanner.nextLine();
System.out.print("Enter votes received >> ");
int votes3 = scanner.nextInt();
    

// Calculating the total votes
int totalVotes = votes1 + votes2 + votes3;
// Calculating and displaying the percentage of votes each party received
double percent1 = (double) votes1 / totalVotes * 100;
double percent2 = (double) votes2 / totalVotes * 100;
double percent3 = (double) votes3 / totalVotes * 100;
System.out.println("The " + party1 + " got " + percent1 + " percent of the vote");
System.out.println("The " + party2 + " got " + percent2 + " percent of the vote");
System.out.println("The " + party3 + " got " + percent3 + " percent of the vote");
}
}
