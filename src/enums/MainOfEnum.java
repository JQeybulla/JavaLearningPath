package enums;

public class MainOfEnum {

    public static void main(String[] args) {
        loopThroughEnum();
    }

    public static void enumInSwitchCase(Level myLevel){
        switch (myLevel){
            case LOW:
                System.out.println("LOW");
                break;
            case MEDIUM:
                System.out.println("MEDIUM");
                break;
            case HIGH:
                System.out.println("HIGH");
                break;
        }
    }

    public static void loopThroughEnum(){
        for(Level lvl : Level.values()){
            System.out.println(lvl);
        }
    }
}
