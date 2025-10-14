package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.DataHolder;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.core.util.ObjectIdDictionary;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class TreeMarshaller implements MarshallingContext {
    public ConverterLookup converterLookup;
    public DataHolder dataHolder;
    public Mapper mapper;
    public ObjectIdDictionary parentObjects = new ObjectIdDictionary();
    public HierarchicalStreamWriter writer;

    public TreeMarshaller(HierarchicalStreamWriter hierarchicalStreamWriter, ConverterLookup converterLookup, Mapper mapper) {
        this.writer = hierarchicalStreamWriter;
        this.converterLookup = converterLookup;
        this.mapper = mapper;
    }

    @Override // com.thoughtworks.xstream.converters.MarshallingContext
    public void convertAnother(Object obj) {
        convertAnother(obj, null);
    }

    @Override // com.thoughtworks.xstream.converters.MarshallingContext
    public void convertAnother(Object obj, Converter converter) {
        if (converter == null) {
            converter = this.converterLookup.lookupConverterForType(obj.getClass());
        } else if (!converter.canConvert(obj.getClass())) {
            ConversionException conversionException = new ConversionException("Explicit selected converter cannot handle item");
            conversionException.add("item-type", obj.getClass().getName());
            conversionException.add("converter-type", converter.getClass().getName());
            throw conversionException;
        }
        convert(obj, converter);
    }

    public void convert(Object obj, Converter converter) {
        if (this.parentObjects.containsId(obj)) {
            CircularReferenceException circularReferenceException = new CircularReferenceException("Recursive reference to parent object");
            circularReferenceException.add("item-type", obj.getClass().getName());
            circularReferenceException.add("converter-type", converter.getClass().getName());
            throw circularReferenceException;
        }
        this.parentObjects.associateId(obj, "");
        converter.marshal(obj, this.writer, this);
        this.parentObjects.removeId(obj);
    }

    public void start(Object obj, DataHolder dataHolder) {
        this.dataHolder = dataHolder;
        if (obj == null) {
            this.writer.startNode(this.mapper.serializedClass(null));
            this.writer.endNode();
        } else {
            ExtendedHierarchicalStreamWriterHelper.startNode(this.writer, this.mapper.serializedClass(obj.getClass()), obj.getClass());
            convertAnother(obj);
            this.writer.endNode();
        }
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

    public final void lazilyCreateDataHolder() {
        if (this.dataHolder == null) {
            this.dataHolder = new MapBackedDataHolder();
        }
    }

    public Mapper getMapper() {
        return this.mapper;
    }

    /* loaded from: classes7.dex */
    public static class CircularReferenceException extends ConversionException {
        public CircularReferenceException(String str) {
            super(str);
        }
    }
}
