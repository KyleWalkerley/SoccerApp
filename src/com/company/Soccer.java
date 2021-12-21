package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Soccer {

    public static void main(String[] args) {
        // pass the path to the file as a parameter
        File file = new File("C:\\Users\\kyle_\\OneDrive\\Desktop\\Code Collage\\Java IntelliJ\\SoccerApp\\src\\com\\company\\SoccerApp.txt");
        Scanner sc = null;
        String match, team1, team2, left, right;
        int score1, score2;
        String [] sides, l1, l2;

//        Map<String, Integer> scoreboard = new TreeMap<String, Integer>();

        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> scoreboard = new HashMap<String, Integer>();

        while (sc.hasNextLine()) {
            match = sc.nextLine();
            sides = match.split(",");

            l1 = sides[0].split(" ");
            team1 = l1[0];
            score1 = Integer.parseInt(l1[1]);
            l2 = sides[1].split(" ");
            team2 = l2[0];
            score2 = Integer.parseInt(l2[1]);


            int team1Points;
            int team2Points;

//            if (score1 > score2){
//                team1Points = 3;
//                team2Points = 0;
//            }else if (score1 < score2){
//                team1Points = 0;
//                team2Points = 3;
//            }else{
//                team1Points = 1;
//                team2Points = 1;
//            }



//            System.out.println(team1);
//            System.out.println(score1);
//            System.out.println(team2);
//            System.out.println(score2);
            if (!scoreboard.containsKey(team1)) { // if the team already exists
                scoreboard.put(team1, 0); // Team's first match - so  league score
            }

            if (!scoreboard.containsKey(team2)) ;
            { // if the team already exists
                scoreboard.put(team2, 0); // Team's first match - so  league score
            }

            // update the scoreboard
            if (score1 > score2) {
                scoreboard.put(team1, scoreboard.get(team1) + 3);
            } else if ((score2 > score1)) {
                scoreboard.put(team2, scoreboard.get(team2) + 3);
            } else { // a draw
                scoreboard.put(team1, scoreboard.get(team1) + 1);
                scoreboard.put(team2, scoreboard.get(team2) + 1);
            }
        }
        System.out.println(scoreboard);
        }


    }
