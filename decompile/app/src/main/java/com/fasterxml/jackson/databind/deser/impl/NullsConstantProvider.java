package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class NullsConstantProvider implements NullValueProvider, Serializable {
    public static final long serialVersionUID = 1;
    public final AccessPattern _access;
    public final Object _nullValue;
    public static final NullsConstantProvider SKIPPER = new NullsConstantProvider(null);
    public static final NullsConstantProvider NULLER = new NullsConstantProvider(null);

    public NullsConstantProvider(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
    }

    public static NullsConstantProvider skipper() {
        return SKIPPER;
    }

    public static NullsConstantProvider nuller() {
        return NULLER;
    }

    public static NullsConstantProvider forValue(Object obj) {
        if (obj == null) {
            return NULLER;
        }
        return new NullsConstantProvider(obj);
    }

    public static boolean isSkipper(NullValueProvider nullValueProvider) {
        return nullValueProvider == SKIPPER;
    }

    public static boolean isNuller(NullValueProvider nullValueProvider) {
        return nullValueProvider == NULLER;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return this._access;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this._nullValue;
    }
}
