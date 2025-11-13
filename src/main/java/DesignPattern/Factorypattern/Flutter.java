package DesignPattern.Factorypattern;

public class Flutter {

    void refreshUI(){
        System.out.println("Refreshing UI");
    }
    void setTheme(){
        System.out.println("Setting Theme");
    }
    UIFactory getUIFactoryForPlatform(SupportedPlatforms platforms){
     return UIFactoryFactory.getUIFactoryForPlatform(platforms);
    }
}
