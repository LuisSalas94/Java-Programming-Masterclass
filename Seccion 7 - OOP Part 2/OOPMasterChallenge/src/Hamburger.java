public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double additon1Price;

    private String addition2Name;
    private double additon2Price;

    private String addition3Name;
    private double additon3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.additon1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.additon2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.additon3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hambugerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll" +
                                    " price is " + this.price);
        if(this.additon1Price != null){
            hambugerPrice += this.additon1Price;
            System.out.println("Added " + this.additon1Price + " for an extra " + this.additon1Price);
        }

        if(this.additon2Price != null){
            hambugerPrice += this.additon2Price;
            System.out.println("Added " + this.additon2Price + " for an extra " + this.additon2Price);
        }

        if(this.additon3Price != null){
            hambugerPrice += this.additon3Price;
            System.out.println("Added " + this.additon3Price + " for an extra " + this.additon3Price);
        }

        if(this.addition4Price != null){
            hambugerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Price + " for an extra " + this.addition4Price);
        }
        return  hambugerPrice;
    }

}
