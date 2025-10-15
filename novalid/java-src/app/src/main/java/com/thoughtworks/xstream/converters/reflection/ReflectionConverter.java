package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.mapper.Mapper;

/* loaded from: classes7.dex */
public class ReflectionConverter extends AbstractReflectionConverter {
    public Class type;

    public ReflectionConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper, reflectionProvider);
    }

    public ReflectionConverter(Mapper mapper, ReflectionProvider reflectionProvider, Class cls) {
        this(mapper, reflectionProvider);
        this.type = cls;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        Class cls2 = this.type;
        return ((cls2 != null && cls2 == cls) || (cls2 == null && cls != null)) && canAccess(cls);
    }
}
