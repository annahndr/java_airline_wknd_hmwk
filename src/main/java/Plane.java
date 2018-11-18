public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

//    returns type of plane (Boeing747, etc)
    public PlaneType getPlaneType(){
        return this.planeType;
    }

//    returns a plane's capacity
    public int getPlaneCapacity(){
        return this.planeType.getPlaneCapacity(); //refers to a method in the enum class
    }

    public int getPlaneTotalWeight(){
        return this.planeType.getPlaneTotalWeight();
    }

    //    how much weight does plane have for baggage?
    public int getBaggageCapacity(){
        return this.planeType.getPlaneTotalWeight() / 2;
    }

}
