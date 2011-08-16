package chatai;

import java.util.HashMap;
import java.util.Map;

public interface Writable 
{
	public String getText();
	public int getUseCount();
	public boolean isCapitalizable();
	//returns next Writable object for a sentence. Null if sentence stops or
	//there is no next word.
	public Writable getHeuristicNext(Map<String, Writable> writables);
	public char getHeuristicEndPunctuation();
}
