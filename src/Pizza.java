public class Pizza {
    private int price;
    private Boolean veg;
    private int basePizzaPrice;
    private int extraCheesePrice=100;
    private int extraToppingsAddedPrice=150;
    private int backPack=20;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
    //if boolean is false,then it is non-veg
    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;

        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraChesse(){
        isExtraCheeseAdded=true;

        this.price+=extraCheesePrice;

    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;

        this.price+=extraToppingsAddedPrice;


    }
    public void takeAway(){
        isOptedForTakeAway=true;

        this.price+=backPack;
    }
    public void getBill(){
        String bill="";

        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+="Extra Toppings added:"+extraToppingsAddedPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+="takeaway added:"+backPack+"\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);

    }
}
