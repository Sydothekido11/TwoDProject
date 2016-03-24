package twod.view;

import twod.controller.KpopController;
import javax.swing.*;



public class TwoDFrame extends JFrame
{
	
	private KpopController baseController;
	private TwoDPanel basePanel;

	public TwoDFrame(KpopController baseController)
	{
		
		this.baseController = baseController;
		basePanel = new TwoDPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
