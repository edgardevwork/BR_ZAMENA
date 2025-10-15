package com.fasterxml.jackson.core.sym;

/* loaded from: classes7.dex */
public final class Name3 extends Name {

    /* renamed from: q1 */
    public final int f636q1;

    /* renamed from: q2 */
    public final int f637q2;

    /* renamed from: q3 */
    public final int f638q3;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    public Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.f636q1 = i2;
        this.f637q2 = i3;
        this.f638q3 = i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return this.f636q1 == i && this.f637q2 == i2 && this.f638q3 == i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f636q1 && iArr[1] == this.f637q2 && iArr[2] == this.f638q3;
    }
}
