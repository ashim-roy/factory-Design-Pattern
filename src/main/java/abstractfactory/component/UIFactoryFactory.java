package abstractfactory.component;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(String platform){
        if(platform.equals("android")){
            return new AndroidFactory();

        } else if (platform.equals("ios")) {
            return new IosFactory();
        }
        return null;
    }
}
