package advanced.controller;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.NyanCat;
import info.gridworld.actor.Rock;
import info.gridworld.actor.UFO;

public class ActorRunner
{

	public static void main(String[] args)
	{
		ActorWorld World = new ActorWorld();
//		World.add(new UFO());
		World.add(new NyanCat());
		World.show();
	}

}
