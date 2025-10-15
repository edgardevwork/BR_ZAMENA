package org.apache.ivy.osgi.p063p2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.xml.sax.Attributes;

/* loaded from: classes5.dex */
public class PropertiesParser {

    public static class PropertiesHandler extends DelegatingHandler {
        public static final String PROPERTIES = "properties";
        public static final String SIZE = "size";
        public Map<String, String> properties;

        public PropertiesHandler(String... strArr) {
            super("properties");
            final List listAsList = Arrays.asList(strArr);
            addChild(new PropertyHandler(), new DelegatingHandler.ChildElementHandler<PropertyHandler>() { // from class: org.apache.ivy.osgi.p2.PropertiesParser.PropertiesHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(PropertyHandler propertyHandler) {
                    if (listAsList.isEmpty() || listAsList.contains(propertyHandler.name)) {
                        PropertiesHandler.this.properties.put(propertyHandler.name, propertyHandler.value);
                    }
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.properties = new HashMap(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public static class PropertyHandler extends DelegatingHandler {
        public static final String NAME = "name";
        public static final String PROPERTY = "property";
        public static final String VALUE = "value";
        public String name;
        public String value;

        public PropertyHandler() {
            super("property");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.name = attributes.getValue("name");
            this.value = attributes.getValue("value");
        }
    }
}
