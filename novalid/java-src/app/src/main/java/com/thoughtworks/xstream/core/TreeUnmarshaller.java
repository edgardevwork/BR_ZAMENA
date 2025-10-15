package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.ErrorReporter;
import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.core.util.HierarchicalStreams;
import com.thoughtworks.xstream.core.util.PrioritizedList;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.security.AbstractSecurityException;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class TreeUnmarshaller implements UnmarshallingContext {
    public ConverterLookup converterLookup;
    public DataHolder dataHolder;
    public Mapper mapper;
    public HierarchicalStreamReader reader;
    public Object root;
    public FastStack types = new FastStack(16);
    public final PrioritizedList validationList = new PrioritizedList();

    public TreeUnmarshaller(Object obj, HierarchicalStreamReader hierarchicalStreamReader, ConverterLookup converterLookup, Mapper mapper) {
        this.root = obj;
        this.reader = hierarchicalStreamReader;
        this.converterLookup = converterLookup;
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.UnmarshallingContext
    public Object convertAnother(Object obj, Class cls) {
        return convertAnother(obj, cls, null);
    }

    @Override // com.thoughtworks.xstream.converters.UnmarshallingContext
    public Object convertAnother(Object obj, Class cls, Converter converter) {
        Class clsDefaultImplementationOf = this.mapper.defaultImplementationOf(cls);
        if (converter == null) {
            converter = this.converterLookup.lookupConverterForType(clsDefaultImplementationOf);
        } else if (!converter.canConvert(clsDefaultImplementationOf)) {
            ConversionException conversionException = new ConversionException("Explicit selected converter cannot handle type");
            conversionException.add("item-type", clsDefaultImplementationOf.getName());
            conversionException.add("converter-type", converter.getClass().getName());
            throw conversionException;
        }
        return convert(obj, clsDefaultImplementationOf, converter);
    }

    public Object convert(Object obj, Class cls, Converter converter) {
        this.types.push(cls);
        try {
            try {
                try {
                    try {
                        return converter.unmarshal(this.reader, this);
                    } catch (AbstractSecurityException e) {
                        throw e;
                    }
                } catch (ConversionException e2) {
                    addInformationTo(e2, cls, converter, obj);
                    throw e2;
                }
            } catch (RuntimeException e3) {
                ConversionException conversionException = new ConversionException(e3);
                addInformationTo(conversionException, cls, converter, obj);
                throw conversionException;
            }
        } finally {
            this.types.popSilently();
        }
    }

    public final void addInformationTo(ErrorWriter errorWriter, Class cls, Converter converter, Object obj) {
        errorWriter.add("class", cls.getName());
        errorWriter.add("required-type", getRequiredType().getName());
        errorWriter.add("converter-type", converter.getClass().getName());
        if (converter instanceof ErrorReporter) {
            ((ErrorReporter) converter).appendErrors(errorWriter);
        }
        if (obj instanceof ErrorReporter) {
            ((ErrorReporter) obj).appendErrors(errorWriter);
        }
        this.reader.appendErrors(errorWriter);
    }

    @Override // com.thoughtworks.xstream.converters.UnmarshallingContext
    public void addCompletionCallback(Runnable runnable, int i) {
        this.validationList.add(runnable, i);
    }

    @Override // com.thoughtworks.xstream.converters.UnmarshallingContext
    public Object currentObject() {
        if (this.types.size() == 1) {
            return this.root;
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.converters.UnmarshallingContext
    public Class getRequiredType() {
        return (Class) this.types.peek();
    }

    @Override // com.thoughtworks.xstream.converters.DataHolder
    public Object get(Object obj) {
        DataHolder dataHolder = this.dataHolder;
        if (dataHolder != null) {
            return dataHolder.get(obj);
        }
        return null;
    }

    @Override // com.thoughtworks.xstream.converters.DataHolder
    public void put(Object obj, Object obj2) {
        lazilyCreateDataHolder();
        this.dataHolder.put(obj, obj2);
    }

    @Override // com.thoughtworks.xstream.converters.DataHolder
    public Iterator keys() {
        DataHolder dataHolder = this.dataHolder;
        return dataHolder != null ? dataHolder.keys() : Collections.EMPTY_MAP.keySet().iterator();
    }

    private void lazilyCreateDataHolder() {
        if (this.dataHolder == null) {
            this.dataHolder = new MapBackedDataHolder();
        }
    }

    public Object start(DataHolder dataHolder) {
        this.dataHolder = dataHolder;
        Object objConvertAnother = convertAnother(null, HierarchicalStreams.readClassType(this.reader, this.mapper));
        Iterator it = this.validationList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        return objConvertAnother;
    }

    public Mapper getMapper() {
        return this.mapper;
    }
}
