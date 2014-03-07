import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class Bargraph extends JComponent {
	
	
	private int women;
	private int men;
	private float total;
	public Bargraph() {
		this.total = 0;
		this.men = 0;
		this.women = 0;
	}
	public Bargraph(int women, int men) {
		super();
		this.women = women;
		this.men = men;
	}
	public void UpdateValue(int women, int men) {
		this.women = women;
		this.men = men;
		this.total = this.women + this.men;
		System.out.println("Updatevalues ");
		this.invalidate();
		this.repaint();
	}
	@Override
	protected void paintComponent(Graphics g) {
	
		int w = getWidth();
		int h = getHeight();
		if (this.women > 0) {
			float percent = (women / total);
			float pixelValue = h * percent;
			int posX = (w / 2) - (h / 4);
			int posY = (int) (h - pixelValue);
				// paint women
			g.setColor(Color.RED);
			g.fillRect(posX, posY, w / 4, (int) pixelValue);
		} else {
			System.out.println("Women");
		}
		if (this.men == '1') {
			float percent = (men / total);
			float pixelValue = h * percent;
			int posX = (w / 2) - (h / 4);
			int posY = (int) (h - pixelValue);
				//paint men
			g.setColor(Color.BLUE);
			g.fillRect(posX-100, posY, w / 4, (int) pixelValue);
		} else {
			System.out.println("Men");
		}
		g.setColor(Color.BLACK);
		g.drawLine(0, 0 , w, 0);
		g.drawString("total "+ total+ " Sökande ",  0, 15);
		
		//paint Minline
		g.setColor(Color.BLACK);
		g.drawLine(0, h -1, w, h-1);
	}
	
	
}
	
	
	/*private int women;
	private int  men;
	private float total;
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	
	public void updateValues(int w, int m){
		women = w;
		men = m;
		
		total = women + men;
		float procentM = men/total;
		
		
		 
		total = women + men;
		float procentW = women/total;
		//women = Math.round(total*100);
		
		System.out.println(String.valueOf(procentW) + String.valueOf(procentM));
		
		this.repaint();
	}

	public void paint(Graphics g){
		int h = getHeight();
			g.setColor(Color.BLUE);
			g.fillRect(int , y, width, height);			
			g.setColor(Color.RED);
			g.fillRect(x, y, width, height);
	
	
	
	}
	
	
	//public void paint2(Graphics gt){
		//int r = getHeight();
		//gt.setColor(Color.RED);
		//
	//}
}

	

*/
