package stoyanov.venislav.btripweb.configuration;

import org.example.configuration.IConfiguration;

import java.awt.*;
import java.math.RoundingMode;
import java.util.Optional;

public class Configuration implements IConfiguration {

    private Color color;
    @Override
    public Font getFont() {
        return new Font("Arial", Font.ITALIC, 27);
    }

    @Override
    public Color getFontColor() {
        return this.color;
    }

    public void setFontColor(Color color) {
        this.color = color;
    }

    @Override
    public long getDailyMoneyWithoutHotel() {
        return 20L;
    }

    @Override
    public long getDailyMoneyWithHotel() {
        return 40L;
    }

    @Override
    public int getNumberOfDaysInOneOrder() {
        return 8;
    }

    @Override
    public int getScale() {
        return 2;
    }

    @Override
    public RoundingMode getRoundingMode() {
        return RoundingMode.HALF_UP;
    }

    @Override
    public Optional<String> orderImgResourcePath() {
        return Optional.of("img/order.png");
    }

    @Override
    public Optional<String> additionalDaysImgResourcePath() {
        return Optional.of("img/order-days.png");
    }

    @Override
    public Optional<String> travelImgResourcePath() {
        return Optional.of("img/travel.png");
    }
}
