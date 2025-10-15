package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.SingleValueConverter;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.plaf.FontUIResource;

/* loaded from: classes6.dex */
public class FontConverter implements Converter {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public static /* synthetic */ Class class$java$util$Map;
    public static /* synthetic */ Class class$javax$swing$plaf$FontUIResource;
    public final Mapper mapper;
    public final SingleValueConverter textAttributeConverter;

    public FontConverter() {
        this(null);
    }

    public FontConverter(Mapper mapper) {
        this.mapper = mapper;
        if (mapper == null) {
            this.textAttributeConverter = null;
        } else {
            this.textAttributeConverter = new TextAttributeConverter();
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && (cls.getName().equals("java.awt.Font") || cls.getName().equals("javax.swing.plaf.FontUIResource"));
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        Class<?> clsClass$;
        Map attributes = ((Font) obj).getAttributes();
        Mapper mapper = this.mapper;
        if (mapper != null) {
            String strAliasForSystemAttribute = mapper.aliasForSystemAttribute("class");
            for (Map.Entry entry : attributes.entrySet()) {
                String string = this.textAttributeConverter.toString(entry.getKey());
                Object value = entry.getValue();
                if (value != null) {
                    clsClass$ = value.getClass();
                } else {
                    clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
                    if (clsClass$ == null) {
                        clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                        class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
                    }
                }
                ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, string, clsClass$);
                hierarchicalStreamWriter.addAttribute(strAliasForSystemAttribute, this.mapper.serializedClass(clsClass$));
                if (value != null) {
                    marshallingContext.convertAnother(value);
                }
                hierarchicalStreamWriter.endNode();
            }
            return;
        }
        hierarchicalStreamWriter.startNode("attributes");
        marshallingContext.convertAnother(attributes);
        hierarchicalStreamWriter.endNode();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        Map map;
        if (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            if (!hierarchicalStreamReader.getNodeName().equals("attributes")) {
                String strAliasForSystemAttribute = this.mapper.aliasForSystemAttribute("class");
                map = new HashMap();
                do {
                    if (!map.isEmpty()) {
                        hierarchicalStreamReader.moveDown();
                    }
                    Class clsRealClass = this.mapper.realClass(hierarchicalStreamReader.getAttribute(strAliasForSystemAttribute));
                    TextAttribute textAttribute = (TextAttribute) this.textAttributeConverter.fromString(hierarchicalStreamReader.getNodeName());
                    Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
                    if (clsClass$ == null) {
                        clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
                        class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
                    }
                    map.put(textAttribute, clsRealClass == clsClass$ ? null : unmarshallingContext.convertAnother(null, clsRealClass));
                    hierarchicalStreamReader.moveUp();
                } while (hierarchicalStreamReader.hasMoreChildren());
            } else {
                Class clsClass$2 = class$java$util$Map;
                if (clsClass$2 == null) {
                    clsClass$2 = class$("java.util.Map");
                    class$java$util$Map = clsClass$2;
                }
                map = (Map) unmarshallingContext.convertAnother(null, clsClass$2);
                hierarchicalStreamReader.moveUp();
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (!JVM.isVersion(6)) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    it.remove();
                }
            }
        }
        Font font = Font.getFont(map);
        Class requiredType = unmarshallingContext.getRequiredType();
        Class clsClass$3 = class$javax$swing$plaf$FontUIResource;
        if (clsClass$3 == null) {
            clsClass$3 = class$("javax.swing.plaf.FontUIResource");
            class$javax$swing$plaf$FontUIResource = clsClass$3;
        }
        return requiredType == clsClass$3 ? new FontUIResource(font) : font;
    }
}
