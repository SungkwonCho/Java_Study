public interface Observerble {
	
	public abstract void RegisterObserver(Observer observer);
	public abstract void RemoveObserver(Observer observer);
	public abstract void NotifyObserver();
}
