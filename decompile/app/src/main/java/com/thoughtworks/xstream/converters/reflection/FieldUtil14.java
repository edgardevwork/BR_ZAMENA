package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.reflection.FieldDictionary;
import java.lang.reflect.Field;

/* loaded from: classes8.dex */
public class FieldUtil14 implements FieldDictionary.FieldUtil {
    @Override // com.thoughtworks.xstream.converters.reflection.FieldDictionary.FieldUtil
    public boolean isSynthetic(Field field) {
        return false;
    }
}
