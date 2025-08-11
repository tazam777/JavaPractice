package project2;

public abstract class Vehicle {


    private float price;
    private int year;
    private String brand;
    private String color;


  


   public void setPrice(float price)
   {
    this.price=price;
   }

    public float getPrice()
    {
        return price;

    }




    public void setYear(int year)
    {
     this.year=year;
    }
 
     public int getYear()
     {
         return year;
 
     }
    

     public void setBrand(String brand)
     {
      this.brand=brand;
     }
  
      public String getBrand()
      {
          return brand;
  
      }



      public void setColor(String color)
      {
       this.color=color;
      }
   
       public String getColor()
       {
           return color ;
   
       }

       public Vehicle(String brand,String color,int year,float price)
       {
        this.brand=brand;
        this.color=color;
        this.year=year;
        this.price=price;
       }


       public abstract void dispDetails();
       public abstract void importVehicles();







}
