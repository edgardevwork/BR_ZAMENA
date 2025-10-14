package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes6.dex */
public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    @Override // com.fasterxml.jackson.databind.util.Converter
    public abstract OUT convert(IN in);

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getInputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getOutputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(1);
    }

    public JavaType _findConverterType(TypeFactory typeFactory) {
        JavaType javaTypeFindSuperType = typeFactory.constructType(getClass()).findSuperType(Converter.class);
        if (javaTypeFindSuperType != null && javaTypeFindSuperType.containedTypeCount() >= 2) {
            return javaTypeFindSuperType;
        }
        throw new IllegalStateException("Cannot find OUT type parameter for Converter of type " + getClass().getName());
    }
}
