package org.apache.commons.lang3.builder;

/* loaded from: classes5.dex */
public final class IDKey {

    /* renamed from: id */
    public final int f9904id;
    public final Object value;

    public IDKey(Object obj) {
        this.f9904id = System.identityHashCode(obj);
        this.value = obj;
    }

    public int hashCode() {
        return this.f9904id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IDKey)) {
            return false;
        }
        IDKey iDKey = (IDKey) obj;
        return this.f9904id == iDKey.f9904id && this.value == iDKey.value;
    }
}
