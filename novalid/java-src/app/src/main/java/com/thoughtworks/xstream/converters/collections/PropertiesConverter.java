package com.thoughtworks.xstream.converters.collections;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.core.util.Fields;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public class PropertiesConverter implements Converter {
    public static /* synthetic */ Class class$java$util$Properties;
    public final boolean sort;

    public PropertiesConverter() {
        this(false);
    }

    public PropertiesConverter(boolean z) {
        this.sort = z;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$util$Properties;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.Properties");
            class$java$util$Properties = clsClass$;
        }
        return clsClass$ == cls;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Properties properties;
        Properties properties2 = (Properties) obj;
        for (Map.Entry entry : (this.sort ? new TreeMap(properties2) : properties2).entrySet()) {
            hierarchicalStreamWriter.startNode("property");
            hierarchicalStreamWriter.addAttribute("name", entry.getKey().toString());
            hierarchicalStreamWriter.addAttribute("value", entry.getValue().toString());
            hierarchicalStreamWriter.endNode();
        }
        if (Reflections.defaultsField == null || (properties = (Properties) Fields.read(Reflections.defaultsField, properties2)) == null) {
            return;
        }
        hierarchicalStreamWriter.startNode(RemoteConfigComponent.DEFAULTS_FILE_NAME);
        marshal(properties, hierarchicalStreamWriter, marshallingContext);
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        Properties properties = new Properties();
        Properties properties2 = null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            if (hierarchicalStreamReader.getNodeName().equals(RemoteConfigComponent.DEFAULTS_FILE_NAME)) {
                properties2 = (Properties) unmarshal(hierarchicalStreamReader, unmarshallingContext);
            } else {
                properties.setProperty(hierarchicalStreamReader.getAttribute("name"), hierarchicalStreamReader.getAttribute("value"));
            }
            hierarchicalStreamReader.moveUp();
        }
        if (properties2 == null) {
            return properties;
        }
        Properties properties3 = new Properties(properties2);
        properties3.putAll(properties);
        return properties3;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Field defaultsField;

        static {
            Class clsClass$ = PropertiesConverter.class$java$util$Properties;
            if (clsClass$ == null) {
                clsClass$ = PropertiesConverter.class$("java.util.Properties");
                PropertiesConverter.class$java$util$Properties = clsClass$;
            }
            Class clsClass$2 = PropertiesConverter.class$java$util$Properties;
            if (clsClass$2 == null) {
                clsClass$2 = PropertiesConverter.class$("java.util.Properties");
                PropertiesConverter.class$java$util$Properties = clsClass$2;
            }
            defaultsField = Fields.locate(clsClass$, clsClass$2, false);
        }
    }
}
