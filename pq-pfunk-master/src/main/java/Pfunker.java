public abstract class Pfunker {
	
	private String name;

	public Pfunker(String name) {
		this.name = name;
	}

	public String getName() {
        return name;
    }

	public abstract String accomplishTask(String task);


}