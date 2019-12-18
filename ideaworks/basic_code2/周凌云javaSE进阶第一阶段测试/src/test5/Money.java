package test5;
/*
定义钞票类（Money）
        属性：
        面值(faceValue  int类型 )
        真假(flag  bolean类型)
*/

public class Money {
    private int faceValue;
    private boolean flag=true;

    public Money() {
    }

    public Money(int faceValue, boolean flag) {
        this.faceValue = faceValue;
        this.flag = flag;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
