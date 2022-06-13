package support.element;

import org.openqa.selenium.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendedWebElement<S extends WebElement> implements WebElement {
    private final WebElement webElement;

    public ExtendedWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public S requireDisplayed(boolean isDisplayed) {
        assertEquals(isDisplayed, webElement.isDisplayed());

        return getThis();
    }

    public S requireEnabled(boolean isEnabled) {
        assertEquals(isEnabled, webElement.isEnabled());

        return getThis();
    }

    public S requireSelected(boolean isSelected) {
        assertEquals(isSelected, webElement.isSelected());

        return getThis();
    }

    public S requireText(String expectedText) {
        assertEquals(expectedText, webElement.getText());

        return getThis();
    }

    public boolean hasText(String expectedText) {
        return expectedText.equals(getText());
    }

    @SuppressWarnings("unchecked")
    protected S getThis() {
        return (S) this;
    }

    @Override
    public void click() {
        webElement.click();
    }

    @Override
    public void submit() {
        webElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        webElement.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        webElement.clear();
    }

    @Override
    public String getTagName() {
        return webElement.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return webElement.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return webElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return webElement.isEnabled();
    }

    @Override
    public String getText() {
        return webElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return webElement.findElements(by)
                .stream()
                .map(ExtendedWebElement::new)
                .collect(Collectors.toList());
    }

    @Override
    public ExtendedWebElement<WebElement> findElement(By by) {
        return new ExtendedWebElement<>(webElement.findElement(by));
    }

    @Override
    public boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return webElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        return webElement.getSize();
    }

    @Override
    public Rectangle getRect() {
        return webElement.getRect();
    }

    @Override
    public String getCssValue(String propertyName) {
        return webElement.getCssValue(propertyName);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return webElement.getScreenshotAs(target);
    }
}
