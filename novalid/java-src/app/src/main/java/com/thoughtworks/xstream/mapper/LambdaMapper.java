package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.core.util.Types;
import com.thoughtworks.xstream.mapper.Mapper;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes8.dex */
public class LambdaMapper extends MapperWrapper {
    public LambdaMapper(Mapper mapper) {
        super(mapper);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) throws SecurityException {
        Class<?> cls2 = null;
        if (Types.isLambdaType(cls)) {
            if (Serializable.class.isAssignableFrom(cls)) {
                Class<?>[] interfaces = cls.getInterfaces();
                if (interfaces.length > 1) {
                    for (int i = 0; cls2 == null && i < interfaces.length; i++) {
                        Class<?> cls3 = interfaces[i];
                        Method[] methods = cls3.getMethods();
                        int length = methods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                Method method = methods[i2];
                                if (!method.isDefault() && !Modifier.isStatic(method.getModifiers())) {
                                    cls2 = cls3;
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    cls2 = interfaces[0];
                }
            } else {
                cls2 = Mapper.Null.class;
            }
        }
        if (cls2 != null) {
            cls = cls2;
        }
        return super.serializedClass(cls);
    }
}
