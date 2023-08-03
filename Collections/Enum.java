package Collections;

public class Enum {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        //public static and final
        //since it is final you cannot create child enums
        //type is Week
        Week(){
            System.out.println("Constructor called for "+this);
        }
        //this is not public or protected, only private or default
        //Why? we dont want to create new objects this is not enums concept, thats why
    }
    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        // for(Week day:Week.values()){
        //     System.out.println(day);
        // }
        System.out.println(week.ordinal());
    }
}
