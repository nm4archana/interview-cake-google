package topScores;

/*You created a game that is more popular than Angry Birds.
You rank players in the game from highest to lowest score. So far you're using an algorithm that sorts in 

O(nlgn) time, but players are complaining that their rankings aren't updated fast enough. You need a faster sorting algorithm.

Write a function that takes:

a list of unsorted_scores
the highest_possible_score in the game
and returns a sorted list of scores in less than 

O(nlgn) time.*/

public class TopScore {

	public int findMax(int[] A)
	{
		int max=A[0];
		
		for(int i=1;i<A.length;i++)
		{
			max=Math.max(max, A[i]);
		}
		return max;
	}
	
	public int[] topScore(int[] score)
	{
		int max=findMax(score);
		
		int[] count=new int[max+1];
		
		int[] output=new int[score.length];
		
		for(int i=0;i<score.length;i++)
		{
			count[score[i]]=count[score[i]]+1;
		}
		
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i-1]+count[i];
		}
		
		for(int i=0;i<score.length;i++)
		{
			output[count[score[i]]-1]=score[i];
			count[score[i]]=count[score[i]]-1;
			
		}
		
		return output;
	}
	
	public static void main(String[] args)
	{
		int[] scoreList={1, 4, 1, 2, 7, 5, 2};
		
		TopScore score=new TopScore();
		
		int[] output=score.topScore(scoreList);
		
		for(int i:output)
		{
			System.out.println(i);
		}
	}
	
}
