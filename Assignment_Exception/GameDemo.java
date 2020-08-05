/*
Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
*/

abstract class Game {
	abstract void play();
}

class Football extends Game {
	void play() {
		System.out.println("play Football");
	}
}

class Cricket extends Game {
	void play() {
		System.out.println("play cricket");
	}
}

class Tennis extends Game {
	void play() {
		System.out.println("play Tennis");
	}
}

public class GameDemo
{
	public static void main(String args[])
	{
		Game[] g = { new Football(), new Cricket(), new Tennis()};
		try {
			for(int i = 0; i < g.length; i++) {
				g[i].play();
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}




















