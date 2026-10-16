public class Car {
   private String brand;
   private String model;
   private String reg_num;
   private int year_of_production;
   private int speed;

   public Car(String brand, String model, String reg_num, int year_of_production) {
     
      this.brand = brand;
      this.model = model;
      this.reg_num = reg_num;
      this.year_of_production = year_of_production;
      this.speed = 0;
      if( brand.isBlank() || model.isBlank() || reg_num.isBlank()){
         throw new IllegalArgumentException(" brand not given");
      }
      
        
   } //consturctor
   public String getbrand() {
      
      return brand;
   }

   public void setbrand(String brand){
      if(brand.isBlank()){
         this.brand =brand;
         throw new IllegalArgumentException("no brand name given can't register");
      }

   }

   public String getmodel() {
      return model;
   }

   public String getreg_num() {
      return reg_num;
   }

   public int getyear_of_production() {
      return year_of_production;
   }

   public int getspeed() {
      return speed;
   }

   public void faster(int speedincreese){
      if(speedincreese <= 0){
         throw new IllegalArgumentException("there is no negative speed only relative directional speed");

      }
      else{
         speed = speedincreese+speed;
      }
      

   }

   public void slower(int speeddecrese){
      if(speeddecrese <= 0){
         throw new IllegalArgumentException("there is no negative speed only relative directional speed");

      }

      if (speed - speeddecrese > speed){
         speed=0;
      }
      else{
         speed= speed-speeddecrese;
      }
      


   }

   public String toString(){
      return "brand: "+ brand + ", model: "+ model + ", regnum: "+ reg_num + ", yr of prod: "+ year_of_production; 

   }
}
