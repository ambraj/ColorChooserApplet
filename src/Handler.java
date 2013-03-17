import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Handler extends MouseAdapter implements MouseMotionListener
{
	Point start;
	Point end;
	@Override
	public void mousePressed(MouseEvent e)
	{
		
		Canvas cnv = (Canvas)e.getSource();
		ColorChooserApplet aplt = (ColorChooserApplet)cnv.getParent();
		aplt.clrCanvas.setBackground(cnv.getBackground());
	}
	
	
	
	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		super.mouseReleased(e);
	}



	@Override
	public void mouseDragged(MouseEvent e)
	{
		
		ColorChooserApplet aplt = (ColorChooserApplet)e.getSource();
		Graphics grp = aplt.getGraphics();
		//grp.drawLine(start.x, start.y, end.x, end.y);
		end = e.getPoint();
		//start = end;
		grp.drawLine(start.x, start.y, end.x, end.y);
	}

	
}
