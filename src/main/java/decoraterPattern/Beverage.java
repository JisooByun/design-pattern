package decoraterPattern;

public abstract class Beverage {
    public String description = "제목없음";
    public Size size;
    public String getDescription(){
        return description;
    };
    public abstract double cost();
    public void setSize(Size size){
        this.size = size;
    }
    public Size getString(){
        return this.size;
    }
}
