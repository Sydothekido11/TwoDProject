package twod.controller;

import twod.model.*;
import twod.view.TwoDFrame;
public class KpopController 
{
 
	private TwoDFrame baseFrame;
	private Kpop [][] myKpop;
 
 public KpopController()
 {
	 myKpop = new Kpop[3][3];
	 setupArray();
	 baseFrame = new TwoDFrame(this);
 }
 
 public void start()
 {
	 
 }
 
 private void setupArray()
 {
	for(int row = myKpop.length-1; row >= 0; row--)
	{
		for(int col 0; col < myKpop[0].length; col++)
		{
			myKpop[row][col] = new Kpop();
			if(col % 2 ==0)
			{
				myKpop[row][col].setNumberOfMembers(col + 5);
			}
			else
			{
				myKpop[row][col].setGroupName(Color.MAGENTA);
			}
		}
	}
 }
 
 public Kpop[][] getMyKpop()
 {
	 return myKpop;
 }
}
