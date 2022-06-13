package support.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.page.basic.WebPageBlock;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static support.util.TestingUtils.awaitUtils;

public class WebElementList<T extends ExtendedWebElement<T>> {
    private final WebElement listElement;
    private final By listItemLocator;
    private final Class<T> listItemClass;

    public WebElementList(WebPageBlock listElement, By listItemLocator, Class<T> listItemClass) {
        this.listElement = listElement.getWebElement();
        this.listItemLocator = listItemLocator;
        this.listItemClass = listItemClass;
    }

    public List<T> getElements() {
        return listElement.findElements(listItemLocator)
                .stream()
                .map(this::newInstance)
                .collect(Collectors.toList());
    }

    public boolean doesElementExist(Predicate<T> predicate) {
        return getElements().stream().anyMatch(predicate);
    }

    public int size() {
        return getElements().size();
    }

    public WebElementList<T> requireElementExists(Predicate<T> predicate) {
        awaitUtils().awaitConditionPass(() -> doesElementExist(predicate));

        return this;
    }

    public WebElementList<T> requireElementCount(int count) {
        awaitUtils().awaitConditionPass(() -> size() == count);

        return this;
    }

    private T newInstance(WebElement webElement) {
        T newInstance;

        try {
            newInstance = listItemClass.getDeclaredConstructor(WebElement.class).newInstance(webElement);
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return newInstance;
    }
}