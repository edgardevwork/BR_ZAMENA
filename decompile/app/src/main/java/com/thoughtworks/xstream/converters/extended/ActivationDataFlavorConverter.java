package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import javax.activation.ActivationDataFlavor;

/* loaded from: classes6.dex */
public class ActivationDataFlavorConverter implements Converter {
    public static /* synthetic */ Class class$java$lang$Class;
    public static /* synthetic */ Class class$javax$activation$ActivationDataFlavor;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$javax$activation$ActivationDataFlavor;
        if (clsClass$ == null) {
            clsClass$ = class$("javax.activation.ActivationDataFlavor");
            class$javax$activation$ActivationDataFlavor = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        ActivationDataFlavor activationDataFlavor = (ActivationDataFlavor) obj;
        String mimeType = activationDataFlavor.getMimeType();
        if (mimeType != null) {
            hierarchicalStreamWriter.startNode("mimeType");
            hierarchicalStreamWriter.setValue(mimeType);
            hierarchicalStreamWriter.endNode();
        }
        String humanPresentableName = activationDataFlavor.getHumanPresentableName();
        if (humanPresentableName != null) {
            hierarchicalStreamWriter.startNode("humanRepresentableName");
            hierarchicalStreamWriter.setValue(humanPresentableName);
            hierarchicalStreamWriter.endNode();
        }
        Class representationClass = activationDataFlavor.getRepresentationClass();
        if (representationClass != null) {
            hierarchicalStreamWriter.startNode("representationClass");
            marshallingContext.convertAnother(representationClass);
            hierarchicalStreamWriter.endNode();
        }
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws Throwable {
        ActivationDataFlavor activationDataFlavor;
        Class cls = null;
        String value = null;
        String value2 = null;
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            String nodeName = hierarchicalStreamReader.getNodeName();
            if (nodeName.equals("mimeType")) {
                value = hierarchicalStreamReader.getValue();
            } else if (nodeName.equals("humanRepresentableName")) {
                value2 = hierarchicalStreamReader.getValue();
            } else if (nodeName.equals("representationClass")) {
                Class clsClass$ = class$java$lang$Class;
                if (clsClass$ == null) {
                    clsClass$ = class$("java.lang.Class");
                    class$java$lang$Class = clsClass$;
                }
                cls = (Class) unmarshallingContext.convertAnother(null, clsClass$);
            } else {
                ConversionException conversionException = new ConversionException("Unknown child element");
                conversionException.add("element", hierarchicalStreamReader.getNodeName());
                throw conversionException;
            }
            hierarchicalStreamReader.moveUp();
        }
        try {
            if (cls == null) {
                activationDataFlavor = new ActivationDataFlavor(value, value2);
            } else if (value == null) {
                activationDataFlavor = new ActivationDataFlavor(cls, value2);
            } else {
                activationDataFlavor = new ActivationDataFlavor(cls, value, value2);
            }
            return activationDataFlavor;
        } catch (IllegalArgumentException e) {
            throw new ConversionException(e);
        } catch (NullPointerException e2) {
            throw new ConversionException(e2);
        }
    }
}
