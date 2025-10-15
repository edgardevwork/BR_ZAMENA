package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.awt.Color;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ColorConverter implements Converter {
    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && cls.getName().equals("java.awt.Color");
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Color color = (Color) obj;
        write("red", color.getRed(), hierarchicalStreamWriter);
        write("green", color.getGreen(), hierarchicalStreamWriter);
        write("blue", color.getBlue(), hierarchicalStreamWriter);
        write("alpha", color.getAlpha(), hierarchicalStreamWriter);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        HashMap map = new HashMap();
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            map.put(hierarchicalStreamReader.getNodeName(), Integer.valueOf(hierarchicalStreamReader.getValue()));
            hierarchicalStreamReader.moveUp();
        }
        return new Color(((Integer) map.get("red")).intValue(), ((Integer) map.get("green")).intValue(), ((Integer) map.get("blue")).intValue(), ((Integer) map.get("alpha")).intValue());
    }

    public final void write(String str, int i, HierarchicalStreamWriter hierarchicalStreamWriter) {
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, str, Integer.TYPE);
        hierarchicalStreamWriter.setValue(String.valueOf(i));
        hierarchicalStreamWriter.endNode();
    }
}
