package com.dsprep;


/*PROBLEM STATEMENT:
 * Andy wants to play a game with his little brother, Bob.
 *  The game starts with an array of distinct integers and the rules are as follows: Bob always plays first and the two players move in alternating turns.
 *  In a single move, a player chooses the maximum element currently present in the array and removes it as well as all the other elements to its right. 
 *  For example, if the starting array arr =[2,3,5,4,1], then it becomes arr=[2,3] after the first move because we remove the maximum element (i.e., 5) 
 *  and all elements to its right (i.e., 4 and 1). The modifications made to the array during each turn are permanent, so the next player continues the game with the remaining array.
 *  The first player who is unable to make a move loses the game. Andy and Bob play 'g' games. Given the initial array for each game, find and print the name of the winner on a new line. 
 *  If Andy wins, print ANDY; if Bob wins, print BOB. To continue the example above, in the next move Andy will remove 3. Bob will then remove 2 and win because there are no more integers to remove. 
 *  Function Description Complete the gamingArray function. It should return a string that represents the winner, either ANDY or BOB. gamingArray has the following parameter(s): arr: an array of integers Test cases: Test case1: 5 2 6 3 4 Test case2: 3 1 Test Result: ANDY BOB 
 *  For Example: Initial array: [5 2 6 3 4] In the first move, Bob removes 6 and all the elements to its right, resulting in Arr= [5,2] In the second move, Andy removes 5 and all the elements to its right, resulting in Arr = []: At this point,
 *  the array is empty and Bob cannot make any more moves. This means Andy wins, so we print ANDY on a new line.
 *  */

public class GGame {
	
	/*
	 * Flag is to determine the end point of the game. It is static so that the
	 * sate of the flag can be used throughout the process.
	 */
	
	public static boolean flag = true;
	
	/* private method to identify largest no in present array */
	
	private  int findLargest(int[] arr, int lastIndex) {
		
		int index = 0;
		
		
		if(arr.length > 1) {
			
			int max = arr[0];
			
			for (int i = 0; i < lastIndex; i++) {
				
				if( arr[i] > max) {
					 index = i;
					
				}
				
			}
			
			return index;
			
		}
		
		return 0;
		
	}
	
	/* Public method which internally calls private method which enters the game */
	
	public void play(int[] arr) {
		
		if(arr != null && arr.length != 0) {
		play(arr, false, false);
		return;
		
		}
		
		throw new IllegalArgumentException("Not a valid input. Array passed is: {} or NULL.");
		
	}
	
	
	private void play(int[] arr, boolean bStat, boolean aStat) {
		
		/*
		 * At entry point of the game both BOB and ANDY are in false State. If the length
		 * of the array passed contains only one integer, according to rule BOB has the
		 * only chance to move. If length of the array is > 1, there can be
		 * multiple passes. Whoever gets the chance to play, is in TRUE State._And it
		 * passes new array to the game with their current Status. Who ever is in TRUE
		 * state next move needs to be made by another opponent. At the end if Array
		 * contains only element, it decides the winner. Else it will again go through
		 * the game, until Flag becomes False.
		 */ 
		
		if(flag) {
		
		boolean bob = bStat; 
		boolean andy = aStat;
		
		
		if (arr.length == 1) {
			
			if(bob) {
				
				flag = false;
				System.out.println("ANDY");
				return;
			
			}
			if(andy) {
				
				flag = false;
				System.out.println("BOB");
				return;
				
			}
			if(!bob && !andy) {
				
				flag = false;
				System.out.println("BOB");
				return;
				
			}
			
		}
		
		if(arr.length > 1) {
			
			int indX = findLargest(arr, arr.length);
			
			// If largest element is in 0th index, current player wins the game.
			
			if(indX == 0) {
				
				if(bob) {
					
					flag = false;
					System.out.println("ANDY");
					return;
				
				}
				if(andy) {
					flag = false;
					System.out.println("BOB");
					return;
					
				}
				if(!bob && !andy) {
					flag = false;
					System.out.println("BOB");
					return;
					
				}
				
				
			}
			
				/*
				 * While largest element resides in between the array, it creates a new
				 * temporary array with Elements right to it's index, and pass it to another player.
				 */	
			
			int[] temp = new int[indX];
			
			for(int i = 0 ; i < indX; i++) {
				
				temp[i] = arr[i];
				
			}
			
			if(!bob && !andy) { 
				bob = true;
				play(temp, bob, andy);
				
			}
			if(bob && !andy) {
				bob = false;
				andy = true;
				play(temp, bob, andy);
			}
			if(!bob && andy) {
				bob = true;
				andy = false;
				play(temp, bob, andy);
			}
				
			
			
		}
		
	}
	
		return;
		
	}

}
