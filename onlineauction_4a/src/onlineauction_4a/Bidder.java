package onlineauction_4a;

class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    @Override
    public String toString() {
        return name;
    }

	@Override
	public void update1(String message) {
		// TODO Auto-generated method stub
		
	}
}