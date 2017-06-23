package Vehicle;

abstract class Vehicle
{
   private String make, model;


   Vehicle(String make, String model)
   {
      this.make = make;
      this.model = model;

   }

   String getMake()
   {
      return make;
   }

   String getModel()
   {
      return model;
   }


   abstract void move();
}