public class Hahmo {
    private String name;
    private double length;
    private double weight;

    public Hahmo(){
        this("", 0, 0);
    }

    public Hahmo(String name, double length, double weight){
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    public double calcForm(){
        return this.weight/(this.length * this.length);
    }

    public String getForm(){
        double x = calcForm();

        if(x < 15.5 || x > 35){
            return "Jotain pielessä!";
        }else if( x >= 30 ){
            return "Taitavat lihakset painaa!";
        }else if( x >= 25){
             return "Elinvoimainen yksilö!";
        }
        
        return "Olet normaalipainoinen!";
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
