package builder;

public class Config {
    int width = 0;
    int height = 0;
    boolean bold = false;
    String color = "#ccc";

    public Config(){}

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static class Builder{
        int width = 0;
        int height = 0;
        boolean bold = false;
        String color = "#ccc";

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder bold(boolean bold) {
            this.bold = bold;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Config build(){
            Config c = new Config();
            c.setBold(bold);
            c.setColor(color);
            c.setHeight(height);
            c.setWidth(width);
            return c;
        }
    }

    public static Builder builder(){
        return new Builder();
    }
}
