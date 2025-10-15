package com.fasterxml.jackson.core.sym;

/* loaded from: classes7.dex */
public final class Name1 extends Name {
    public static final Name1 EMPTY = new Name1("", 0, 0);

    /* renamed from: q */
    public final int f633q;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return false;
    }

    public Name1(String str, int i, int i2) {
        super(str, i);
        this.f633q = i2;
    }

    public static Name1 getEmptyName() {
        return EMPTY;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return i == this.f633q;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.f633q && i2 == 0;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.f633q;
    }
}
