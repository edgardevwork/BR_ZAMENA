package androidx.constraintlayout.core.widgets;

/* loaded from: classes4.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f221x;

    /* renamed from: y */
    public int f222y;

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f221x = i;
        this.f222y = i2;
        this.width = i3;
        this.height = i4;
    }

    public void grow(int i, int i2) {
        this.f221x -= i;
        this.f222y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        int i3 = this.f221x;
        int i4 = rectangle.f221x;
        return i3 >= i4 && i3 < i4 + rectangle.width && (i = this.f222y) >= (i2 = rectangle.f222y) && i < i2 + rectangle.height;
    }

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f221x;
        return i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f222y) && i2 < i3 + this.height;
    }

    public int getCenterX() {
        return (this.f221x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f222y + this.height) / 2;
    }
}
