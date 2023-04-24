class Mobile {
    String name;
    int battery;
    int version;
    String brand;
    public static void main(String[] args){
    Mobile m1= new Mobile();
    Mobile m2= new Mobile();
    m1.name="Samsung A20";
    m1.battery=4000;
    m1.version=11;
    m1.brand="Samsung";
    m2.name="Iphone 14Pro Max";
    m2.battery=6000;
    m2.version=15;
    m2.brand="Iphone";
    System.out.println("First Mobile:");
    System.out.println("Name:"+m1.name);
    System.out.println("Battery Capacity:"+m1.battery);
    System.out.println("Version:"+m1.version);
    System.out.println("Brand:"+m1.brand);
    System.out.println("\n");
    System.out.println("Second Mobile");
    System.out.println("Name:"+m2.name);
    System.out.println("Battery Capacity:"+m2.battery);
    System.out.println("Version:"+m2.version);
    System.out.println("Brand:"+m2.brand);
    }
    }
   
    
    
    
    
    
    
    