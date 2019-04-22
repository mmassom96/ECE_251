public class League {
    private String name;
    private int    teamCount;
    private Team[] teams;
    
    int[][] gamesPlayed = new int[8][8];
    
    public String getName() { return(name); }
    public Team[] getTeams() { return(teams); }
    public void   setName(String aName) { name = aName; }

    public League(String aName) {
        name = aName;
        teamCount = 0;
        teams = new Team[8]; //This does not actually make any Team objects
    }

    //This is the toString method that specifies the appearance of the League
    public String toString() {
        return("The " + name + " league with " + teamCount + " teams.");
    }
    
    
    //This method adds a new team to the league
    public int addTeam(Team aTeam) {
    if (teamCount < 8) {
        teams[teamCount++] = aTeam;
        return teamCount;
    }
    return -1;
} 
 
//This method prints out all of the teams
    public void showTeams() {
    for(int i=0; i<teamCount; i++)
        System.out.println(teams[i].toString());
} 

    
    /******************   For LeagueTester1       *******************************/

//Record Win and Loss
public void recordWinAndLoss(Team winner, Team loser) {
    winner.setWins(winner.getWins() + 1);
    loser.setLosses(loser.getLosses() + 1);
} 
//Record a Tie game
public void recordTie(Team teamA, Team teamB) {
    teamA.setTies(teamA.getTies() + 1);
    teamB.setTies(teamB.getTies() + 1);
}



//Find the team with the given name.  If none exists, return null
public Team teamWithName(String aName) {
    for(int i=0; i<teamCount; i++) {
        if (teams[i].getName().equals(aName))
        return teams[i];
    }
    return null;
} 


//Record Win and Loss
public void recordWinAndLoss(String winner, String loser) {
    Team winningTeam, losingTeam; 
    if ((winningTeam = this.teamWithName(winner)) == null) {
        System.out.println("Invalid Team name: " + winner);
        return;
    }
    if ((losingTeam = this.teamWithName(loser)) == null) {
        System.out.println("Invalid Team name: " + loser);
        return;
    }
    recordWinAndLoss(winningTeam, losingTeam);
    
    for(int r = 0; r<8; r++) {
    	for (int c = 0; c<8; c++) {
    		if ((winner == teams[r].getName()) && (loser == teams[c].getName())) {
    			gamesPlayed[r][c]++;
    			gamesPlayed[c][r]++;
    		}
    	}
    }
    
}

//Record a Tie game
public void recordTie(String teamAName, String teamBName) {
    Team teamA, teamB;

    if ((teamA = this.teamWithName(teamAName)) == null) {
        System.out.println("Invalid Team name: " + teamAName);
        return;
    }
    if ((teamB = this.teamWithName(teamBName)) == null) {
        System.out.println("Invalid Team name: " + teamBName);
        return;
    }
    recordTie(teamA, teamB);
   
    for(int r = 0; r<8; r++) {
    	for (int c = 0; c<8; c++) {
    		if ((teamAName == teams[r].getName()) && (teamBName == teams[c].getName())) {
    			gamesPlayed[r][c]++;
    			gamesPlayed[c][r]++;
    		}
    	}
    }
}


//Return the total number of games played in the League
public int totalGamesPlayed() {
    int  total=0;
    for (int i=0; i<teamCount; i++)
        total += teams[i].gamesPlayed();
    return total/2;
} 
//Return the team with the most points
public Team firstPlaceTeam() {
    Team best;
    if (teamCount == 0)
        return null;//If there are no teams, then no team is in first place
    best = teams[0];
    for (int i=1; i<teamCount; i++) {
        if (best.totalPoints() < teams[i].totalPoints())
           best = teams[i];
    }
    return best;
}

//Return the team with the least points
public Team lastPlaceTeam() {
    Team worst;
    if (teamCount == 0)
        return null;//If there are no teams, then no team is in last place
    worst = teams[0];
    for (int i=1; i<teamCount; i++) {
        if (worst.totalPoints() > teams[i].totalPoints())
            worst = teams[i];
    }
    return worst;
}

//Return the team who has played the most games
public Team teamMostPlayed() {
	Team mostPlayed;
	mostPlayed = teams[0];
	for(int i = 1; i < 8; i++)
		if(teams[i].gamesPlayed() > teams[i-1].gamesPlayed()) {
			mostPlayed = teams[i];
		}
	return mostPlayed;
}

//Find the teams that are undefeated
public Team[] undefeatedTeams() {
	Team[] undefeated = new Team[1];
	int j = 0;
	for(int i = 0; i < 8; i++) {
		if (teams[i].getLosses() == 0) {
			undefeated[j] = teams[i];
			j++;
		}
	}
	return undefeated;
}

public int indexOf(Team t) {
	for (int i=0; i < teams.length; i++) {
		if (teams[i] == t)
			return i;
	}
	return -1;
}

public void showTable() {
	System.out.println("	0	1	2	3	4	5	6	7 ");
	System.out.println("	------------------------------------------------------------");
	for (int row = 0; row<8; row++) {
		System.out.print(row + "   |   ");
		for (int col = 0; col < 8; col++) {
			System.out.print(gamesPlayed[row][col] + "   |   ");
		}
		System.out.println("\n	------------------------------------------------------------");
	}
	for (int i = 0; i < 8; i++)
		System.out.println(i + " = " + teams[i].getName());
}

public boolean havePlayedTogether(String teamA, String teamB) {
	boolean played = false;
	for(int r = 0; r<8; r++) {
    	for (int c = 0; c<8; c++) {
    		if ((teamA == teams[r].getName()) && (teamB == teams[c].getName())) {
    			if (gamesPlayed[r][c] > 0)
    				played = true;
    		}
    	}
	}
	
	return played;
}

}

