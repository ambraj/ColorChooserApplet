import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseListener;


public class ColorChooserApplet extends Applet implements AdjustmentListener
{
	Scrollbar [] arrColors = new Scrollbar[3];
	Canvas cnvPicker = new Canvas();
	Canvas clrCanvas = new Canvas();
	
	public ColorChooserApplet()
	{
		setLayout(null);
		cnvPicker.setBounds(0, 0, 300, 200);
		//cnvColors.setBackground(Color.blue);
		add(cnvPicker);
		
		for(int iTmp = 0,yPos = 230; iTmp < 3; iTmp++, yPos+=40)
		{
			arrColors[iTmp] = new Scrollbar(Scrollbar.HORIZONTAL);
			arrColors[iTmp].setMinimum(0);
			arrColors[iTmp].setMaximum(255);
			arrColors[iTmp].setBounds(20, yPos, 150, 20);
			add(arrColors[iTmp]);
			arrColors[iTmp].addAdjustmentListener(this);
		}
		
		/*clrCanvas.setBounds(400, 50, 200, 200);
		clrCanvas.setBackground(Color.GRAY);
		add(clrCanvas);
		clrCanvas.addMouseListener(new Handler());*/
	}
	

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int red = arrColors[0].getValue();
		int green = arrColors[1].getValue();
		int blue = arrColors[2].getValue();
		
		cnvPicker.setBackground(new Color(red,green,blue));
	}
	
	
}

















