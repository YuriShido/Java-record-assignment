import java.util.Scanner;

public class DriverC {
	
	//method to print just object which pass as an argument
	 public static void printObject(Record song) {
		 System.out.println("Title : " + song.getTitle() + 
				 			" \nSinger : " + song.getSingerName() + 
				 			" \nLength : " + song.getRecLength() + 
				 			"\nRanking : " + song.getRecRank());
	 }
	//method to iterate through the array and find the index of record for the title
	 public static int findIndex(Record[] songs, String title) {
		 for(int i = 0; i < songs.length; i++) {
			if(songs[i].getTitle().equalsIgnoreCase(title)) {
				return i;
			} 
		 }
		 return -1;
	 }
	/*
	 * @return the index of record if we don't have it--> return -1
	 */
	
	//getAverage of langthRecord --> return average
	 public static double getLangthAvarage(Record[] songs ) {
		 double Sum = 0;
		 for(int i = 0; i < songs.length; i++) {
			 Sum += songs[i].getRecLength();
		 }
		return Sum / songs.length; 
	 }
		
	//getAverage of ranking --> return average caculate double
	 public static int getRankingAverage(Record[] songs) {
		 int sum = 0;
		 for(int i = 0; i < songs.length; i++) {
			 sum += songs[i].getRecRank();
		 }
		return sum / songs.length; 
	 }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// at least create 7 objects
		Record S1 = new Record("Crazy in love", "Beyonce",240, 1);
		Record S2 = new Record("Complicated", "Avril Lavigne", 180, 3);
		Record S3 = new Record("New Rule", "Dua Lipa", 260, 2);
		Record S4 = new Record("Shake it off", "Taylor Swift", 200, 4);
		Record S5 = new Record("Suger", "Maroon5", 380, 5);
		Record S6 = new Record("Just the way you are", "Bruno Mars", 400, 6);
		
		//create array and add these object to array
		Record[] songs= new Record[6];
		
		songs[0] = S1;
		songs[1] = S2;
		songs[2] = S3;
		songs[3] = S4;
		songs[4] = S5;
		songs[5] = S6;

		//Ask the user to enter the title of record
		System.out.println("Please enter the title of record.");
		// read the input 
		String Asktitle = input.nextLine();
		//findRecord
		int index = findIndex(songs, Asktitle);
		//print the record
		printObject(songs[index]);
			
		//print both average
		System.out.println("The avarage of length is " + getLangthAvarage(songs));
		System.out.println("The avarage of ranking is " + getRankingAverage(songs));
		
	}

}
//Ask the user enter the name of singer
