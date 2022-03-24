package modele.plateau;

import java.util.ArrayList;
import java.util.List;

public class Coffre  extends Ramassable {

	private List<Object> elements;
	public Coffre(List<Object> elem) {
		super();
		elements = new ArrayList<Object>();
		 for(int i=0;i<elem.size();i++)
		  {
			 elements.add(elem.get(i));
		  }
	}
}
