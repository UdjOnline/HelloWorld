package l26_abstraction;

abstract class TV {
    protected int soundValue = 100;

    abstract void enable();
    abstract void disable();
    abstract void nextChannel();
    abstract void previousChannel();
    abstract void soundUp();
    abstract void soundDown();

    public void mute() {
        while (this.soundValue > 0) {
            this.soundDown();
        }
    }
}

class HuaweiTV854 extends TV {
    @Override
    void enable() {System.out.println("TV HuaweiTV954 enable");}
    @Override
    void disable() {System.out.println("TV HuaweiTV954 disable");}
    @Override
    void nextChannel() {System.out.println("TV HuaweiTV954 nextChannel");}
    @Override
    void previousChannel() {System.out.println("TV HuaweiTV954 previousChannel");}
    @Override
    void soundUp() {System.out.println("TV HuaweiTV954 soundUp");}
    void soundDown() {
        this.soundValue = this.soundValue -10;
        this.soundValue = Math.max(this.soundValue, 0);
        System.out.println("TV HuaweiTV954 soundDown " + this.soundValue);}
}

class SamsungTV3214 extends TV {
    @Override
    void enable() {System.out.println("TV SamsungTV3214 enable");}
    @Override
    void disable() {System.out.println("TV SamsungTV3214 disable");}
    @Override
    void nextChannel() {System.out.println("TV SamsungTV3214 nextChannel");}
    @Override
    void previousChannel() {System.out.println("TV SamsungTV3214 previousChannel");}
    @Override
    void soundUp() {System.out.println("TV SamsungTV3214 soundUp");}
    void soundDown() {
        this.soundValue = this.soundValue -10;
        this.soundValue = Math.max(this.soundValue, 0);
        System.out.println("TV SamsungTV3214 soundDown " + this.soundValue);}
}

class MyFlat {
    public static void main(String[] args) {
        TV samsung = new SamsungTV3214();
        TV huawei = new HuaweiTV854();
        // TV tv = new TV(); //fail - не будет работать

        huawei.enable();
        huawei.nextChannel();
        huawei.previousChannel();
        huawei.soundUp();
        huawei.soundDown();
        huawei.nextChannel();
        huawei.mute();
        huawei.disable();

        samsung.enable();
        samsung.nextChannel();
        samsung.previousChannel();
        samsung.soundUp();
        samsung.soundDown();
        samsung.nextChannel();
        samsung.mute();
        samsung.disable();
    }
}