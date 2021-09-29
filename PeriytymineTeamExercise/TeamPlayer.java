public class TeamPlayer extends TeamMember{
    private String position;

    public TeamPlayer(String name, String position){
        super(name);
        this.position = position;
    }

    @Override
    public String getMemberinfo() {
        return "Name:" + this.getName() + " Position:" + this.position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
