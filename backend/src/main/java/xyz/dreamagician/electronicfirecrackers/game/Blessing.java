package xyz.dreamagician.electronicfirecrackers.game;

import org.springframework.util.Assert;

public class Blessing {
    private boolean visible;
    private String content;

    public Blessing() {
        visible = false;
        content = "";
    }

    public void show(String content) {
        Assert.notNull(content, "content cant not be null");
        this.visible = true;
        this.content = content;
    }

    public void hide() {
        this.visible = false;
        this.content = "";
    }

    public boolean isVisible() {
        return visible;
    }

    public String getContent() {
        return content;
    }
}
