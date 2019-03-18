package checkersGamePOO;

import java.util.Collection;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

public class CheckersGameGUIData extends Observable implements Map{

	private Map<Object, Object> mapGUIData;
	
	public CheckersGameGUIData(Map<Object, Object> mapGUIData) {
		this.mapGUIData = mapGUIData;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		this.mapGUIData.clear();
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.containsValue(arg0);
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.entrySet();
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
//		setChanged();
//		notifyObservers();
		return this.mapGUIData.get(arg0);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.isEmpty();
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.keySet();
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.put(arg0, arg1);
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		this.mapGUIData.putAll(arg0);
		
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.remove(arg0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.size();
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
		return this.mapGUIData.values();
	}

}
