package firstperson3d;

import processing.core.PApplet;

public class GameManager
{
	private PApplet p;
	private WorldManager world;
	
	void draw()
	{
		world.draw();
	}
	
	void keyPressed()
	{
		world.keyPressed();
	}
	
	void keyReleased()
	{
		world.keyReleased();
	}
	
	GameManager(PApplet p)
	{
		this.p = p;
		world = new WorldManager(p);
	}
}
