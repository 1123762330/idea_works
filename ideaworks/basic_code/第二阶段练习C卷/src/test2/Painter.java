package test2;

public class Painter {
    private  String name;

    public Painter() {
    }

    public Painter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void draw(Pen p){
        p.getPrice();
        p.getColor();
        if(p instanceof WriteAction){
            WriteAction w=(WriteAction) p;
            w.write();
            System.out.println("画家"+getName()+"正在绘画");
        }

    }

}
