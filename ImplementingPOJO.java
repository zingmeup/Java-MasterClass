package packageabc;

class Volume{
    private int length, width, height;

    public Volume(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return height;
    }

    public int getHeight() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "length: "+this.length+"\n"+
                "width: "+this.width+"\n"+
                "height: "+this.height+"\n";
    }
}

public class ImplementingPOJO {
    public static void main(String[] args) {
        Volume volume=new Volume(10,10,5);
        System.out.println(volume);
        System.out.println("width: "+volume.getWidth());
        System.out.println("Height: "+volume.getHeight());
        System.out.println("Lemgth: "+volume.getLength());
        System.out.println("volume= "+(volume.getHeight()*volume.getLength()*volume.getWidth()));
    }
}
