package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	//variable containing the current selected nematode
	int current = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			//if we are on 0 and want to go left loop to the other end of the array
			if(current == 0)
			{
				current = Nematodes.size() - 1;
			}
			//moving the current 1 to the left 
			current--;
		}		

		if (keyCode == RIGHT)
		{
			//if we are on the last nematode in the list and want to go right loop back to the 0th element
			if(current == Nematodes.size() - 1)
			{
				current = 0;
			}
			//moving the current 1 to the right 
			current++;
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();	
		loadNematodes();			
	}
	

	public void loadNematodes()
	{
		//creating hte table and filling it with the nematode's data
		Table table = loadTable("nematodes.csv", "header");
		for (TableRow row:table.rows()) {
			Nematode nematode = new Nematode(row);
			Nematodes.add(nematode);
		}
	}

	//cfeating the array list
	ArrayList<Nematode> Nematodes = new ArrayList<Nematode>();
	
	public void draw()
	{	
		//getting the data of the current nematode
		background(0);
		Nematodes.get(current).render(this);
		
	}
}
