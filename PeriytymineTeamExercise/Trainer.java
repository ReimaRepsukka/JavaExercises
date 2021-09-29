public class Trainer extends TeamMember {

    private String education;

    public Trainer(String name, String education) {
        super(name);
        this.education = education;
    }

    @Override
    public String getMemberinfo() {
        return "Name:" + this.getName() + " Education:" + this.education;
    }
    
}
