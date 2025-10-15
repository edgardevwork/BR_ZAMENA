package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class AbstractReferenceUnmarshaller extends TreeUnmarshaller {
    public static final Object NULL = new Object();
    public FastStack parentStack;
    public Map values;

    public abstract Object getCurrentReferenceKey();

    public abstract Object getReferenceKey(String str);

    public AbstractReferenceUnmarshaller(Object obj, HierarchicalStreamReader hierarchicalStreamReader, ConverterLookup converterLookup, Mapper mapper) {
        super(obj, hierarchicalStreamReader, converterLookup, mapper);
        this.values = new HashMap();
        this.parentStack = new FastStack(16);
    }

    @Override // com.thoughtworks.xstream.core.TreeUnmarshaller
    public Object convert(Object obj, Class cls, Converter converter) {
        Object objPeek;
        if (this.parentStack.size() > 0 && (objPeek = this.parentStack.peek()) != null && !this.values.containsKey(objPeek)) {
            this.values.put(objPeek, obj);
        }
        String strAliasForSystemAttribute = getMapper().aliasForSystemAttribute("reference");
        String attribute = strAliasForSystemAttribute == null ? null : this.reader.getAttribute(strAliasForSystemAttribute);
        boolean zIsReferenceable = getMapper().isReferenceable(cls);
        if (attribute != null) {
            Object obj2 = zIsReferenceable ? this.values.get(getReferenceKey(attribute)) : null;
            if (obj2 == null) {
                ConversionException conversionException = new ConversionException("Invalid reference");
                conversionException.add("reference", attribute);
                conversionException.add("referenced-type", cls.getName());
                conversionException.add("referenceable", Boolean.toString(zIsReferenceable));
                throw conversionException;
            }
            if (obj2 == NULL) {
                return null;
            }
            return obj2;
        }
        if (!zIsReferenceable) {
            return super.convert(obj, cls, converter);
        }
        Object currentReferenceKey = getCurrentReferenceKey();
        this.parentStack.push(currentReferenceKey);
        try {
            Object objConvert = super.convert(obj, cls, converter);
            if (currentReferenceKey != null) {
                this.values.put(currentReferenceKey, objConvert == null ? NULL : objConvert);
            }
            this.parentStack.popSilently();
            return objConvert;
        } catch (Throwable th) {
            if (currentReferenceKey != null) {
                this.values.put(currentReferenceKey, NULL);
            }
            this.parentStack.popSilently();
            throw th;
        }
    }
}
