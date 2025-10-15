package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public final class OneofInfo {
    public final java.lang.reflect.Field caseField;

    /* renamed from: id */
    public final int f278id;
    public final java.lang.reflect.Field valueField;

    public OneofInfo(int i, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f278id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public int getId() {
        return this.f278id;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
