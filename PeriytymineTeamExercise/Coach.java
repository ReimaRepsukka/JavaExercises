public class Coach extends TeamMember {
    
    private int experience;

    public Coach(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    @Override
    public String getMemberinfo() {
        return "Name:" + this.getName() + " Experience:" + this.experience + " years";
    }
    
}
