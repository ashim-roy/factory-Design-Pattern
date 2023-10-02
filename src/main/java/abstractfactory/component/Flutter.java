package abstractfactory.component;
public class Flutter {
    public void setTheme(){
        System.out.println("setting theme in both ios and Android...");
    }

    // i will need factory method for android and ios..
    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
