package DesignPattern.Factorypattern;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platforms){
        if (platforms.equals(SupportedPlatforms.Android)){
            return new AndroidUIFactory();
        } else if (platforms.equals(SupportedPlatforms.Ios)) {
           return new IosUIFactory();
        }
        return null;
    }
}
