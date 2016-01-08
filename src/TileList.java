import java.util.*;
public class TileList{
	// post: constructs an empty tile list
	private ArrayList<Tile> a;
	public TileList(){
		ArrayList<Tile> a = new ArrayList<Tile>();
	}

	// post: searches through the list of tiles and returns a reference to the last tile for which (x, y) is inside the tile; returns null if (x, y) is not
	// inside any tile of the list; moves the found tile to the back of the list
	public Tile moveToBack(int x, int y){
		int n = -1;
		for(int i = 0; i < a.size(); i++){
			if(a.get(i).inside(x,y)){
				n = i;
			}
		}
		if(n == -1){
			return null;
		} else{
			a.add(a.get(n));
			a.remove(n);
			return a.get(n);
		}
	}
	// post: inserts t at the back of the list of tiles
	/**
	 * 
	 * @param nextTile
	 */
	public void insertBack(Tile nextTile){
		a.add(nextTile);
	}

	// post: returns the number of tiles in this list
	public int size(){
		return a.size();
	}

	// post: returns the Tile at the given index
	public Tile get(int index){
		return a.get(index);
	}

}