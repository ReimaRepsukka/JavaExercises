//Same project already has a Player class so this is Playerx
public class Playerx {
   public String name;
   public int energy;

   public void takeHit(){
       this.energy -= 2;   
   }

   @Override
   public String toString() {
       return "Player name: " +this.name + "\nPlayer energy: "+ this.energy;
   }
}
