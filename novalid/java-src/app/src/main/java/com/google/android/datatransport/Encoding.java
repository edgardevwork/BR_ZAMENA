package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class Encoding {
    public final String name;

    /* renamed from: of */
    public static Encoding m1044of(@NonNull String str) {
        return new Encoding(str);
    }

    public String getName() {
        return this.name;
    }

    public Encoding(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.name = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
