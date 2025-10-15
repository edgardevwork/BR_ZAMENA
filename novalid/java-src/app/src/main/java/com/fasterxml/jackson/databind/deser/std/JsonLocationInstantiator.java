package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.p022io.ContentReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* loaded from: classes8.dex */
public class JsonLocationInstantiator extends ValueInstantiator.Base {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public boolean canCreateFromObjectWith() {
        return true;
    }

    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType javaTypeConstructType = deserializationConfig.constructType(Integer.TYPE);
        JavaType javaTypeConstructType2 = deserializationConfig.constructType(Long.TYPE);
        return new SettableBeanProperty[]{creatorProp("sourceRef", deserializationConfig.constructType(Object.class), 0), creatorProp("byteOffset", javaTypeConstructType2, 1), creatorProp("charOffset", javaTypeConstructType2, 2), creatorProp("lineNr", javaTypeConstructType, 3), creatorProp("columnNr", javaTypeConstructType, 4)};
    }

    public static CreatorProperty creatorProp(String str, JavaType javaType, int i) {
        return CreatorProperty.construct(PropertyName.construct(str), javaType, null, null, null, null, i, null, PropertyMetadata.STD_REQUIRED);
    }

    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(ContentReference.rawReference(objArr[0]), _long(objArr[1]), _long(objArr[2]), _int(objArr[3]), _int(objArr[4]));
    }

    public static final long _long(Object obj) {
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    public static final int _int(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }
}
