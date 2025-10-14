package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes7.dex */
public final class OneofInfo {
    public final java.lang.reflect.Field caseField;

    /* renamed from: id */
    public final int f923id;
    public final java.lang.reflect.Field valueField;

    public OneofInfo(int id, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f923id = id;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public int getId() {
        return this.f923id;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
