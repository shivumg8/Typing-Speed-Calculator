package project1;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	static String[] words= {"Alligator","Lion","Panda","Camel","Dog","Deer","Snake","Fox","Sheep","Buffalo"};

		public static void main(String[] args) throws InterruptedException {
			System.out.println("3"); //user to know when to start typing//
			TimeUnit.SECONDS.sleep(1); //interval of 1 second (count down)//
			
			System.out.println("2");
			TimeUnit.SECONDS.sleep(1);
			
			System.out.println("1");
			TimeUnit.SECONDS.sleep(1);
			
			Random rand=new java.util.Random(); //to access randomly from the given string//
			for(int i=0;i<10;i++){ //to access each n every word  //
				System.out.print(words[rand.nextInt(9)] + " ");	//to print the words from given words//
				//ln is excluded in order to print the words in a single line//
			}
			System.out.println(); //to type the words in next line//
			
			double start=LocalTime.now().toNanoOfDay();  //start time as we begin to type// 
			try (Scanner input = new Scanner(System.in)) {
				String typedWords=input.nextLine(); //assigning the user defined words as typedWords//
				
				double end=LocalTime.now().toNanoOfDay();//end time after typing//
				double elapsedTime=end-start; //total time taken to type the given words//
				double seconds=elapsedTime/1000000000.0; // total time taken in seconds//
				int numChars=typedWords.length(); 
				int wpm=(int)((((double)numChars/5)/seconds)*60); //formula to calculate words per minute//
				
				System.out.println("your words per minute is " +wpm+"!"); //prints the time taken to type//
				System.out.println("Taken time is  " + seconds); //prints the time taken to type in seconds//
		
			}
					


		}

	

}
	
