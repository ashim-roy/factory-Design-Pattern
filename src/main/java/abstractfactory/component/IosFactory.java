package abstractfactory.component;

import abstractfactory.component.button.IosButton;
import abstractfactory.component.menu.IosMenu;

public class IosFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}

