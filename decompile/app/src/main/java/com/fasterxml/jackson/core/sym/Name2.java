package com.fasterxml.jackson.core.sym;

/* loaded from: classes7.dex */
public final class Name2 extends Name {

    /* renamed from: q1 */
    public final int f634q1;

    /* renamed from: q2 */
    public final int f635q2;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return false;
    }

    public Name2(String str, int i, int i2, int i3) {
        super(str, i);
        this.f634q1 = i2;
        this.f635q2 = i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.f634q1 && i2 == this.f635q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.f634q1 && iArr[1] == this.f635q2;
    }
}
