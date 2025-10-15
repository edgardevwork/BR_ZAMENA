package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.ByteConverter;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.core.StringCodec;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class EncodedByteArrayConverter implements Converter, SingleValueConverter {
    public static final ByteConverter byteConverter = new ByteConverter();
    public final StringCodec codec;

    public EncodedByteArrayConverter() {
        this(JVM.getBase64Codec());
    }

    public EncodedByteArrayConverter(StringCodec stringCodec) {
        this.codec = stringCodec;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls.isArray() && cls.getComponentType().equals(Byte.TYPE);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        hierarchicalStreamWriter.setValue(toString(obj));
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        String value = hierarchicalStreamReader.getValue();
        if (!hierarchicalStreamReader.hasMoreChildren()) {
            return fromString(value);
        }
        return unmarshalIndividualByteElements(hierarchicalStreamReader, unmarshallingContext);
    }

    public final Object unmarshalIndividualByteElements(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        ArrayList arrayList = new ArrayList();
        do {
            hierarchicalStreamReader.moveDown();
            arrayList.add(byteConverter.fromString(hierarchicalStreamReader.getValue()));
            hierarchicalStreamReader.moveUp();
        } while (hierarchicalStreamReader.hasMoreChildren());
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Byte) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return this.codec.encode((byte[]) obj);
    }

    @Override // com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return this.codec.decode(str);
    }
}
