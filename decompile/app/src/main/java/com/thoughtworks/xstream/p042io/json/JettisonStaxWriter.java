package com.thoughtworks.xstream.p042io.json;

import com.thoughtworks.xstream.core.JVM;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.xml.QNameMap;
import com.thoughtworks.xstream.p042io.xml.StaxWriter;
import com.thoughtworks.xstream.p042io.xml.XmlFriendlyReplacer;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.codehaus.jettison.AbstractXMLStreamWriter;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;

/* loaded from: classes8.dex */
public class JettisonStaxWriter extends StaxWriter {
    public static /* synthetic */ Class class$java$util$Collection;
    public static /* synthetic */ Class class$java$util$Map;
    public final MappedNamespaceConvention convention;
    public final List stack;

    public JettisonStaxWriter(QNameMap qNameMap, XMLStreamWriter xMLStreamWriter, boolean z, boolean z2, NameCoder nameCoder, MappedNamespaceConvention mappedNamespaceConvention) throws XMLStreamException {
        super(qNameMap, xMLStreamWriter, z, z2, nameCoder);
        this.stack = new ArrayList();
        this.convention = mappedNamespaceConvention;
    }

    public JettisonStaxWriter(QNameMap qNameMap, XMLStreamWriter xMLStreamWriter, boolean z, boolean z2, XmlFriendlyReplacer xmlFriendlyReplacer, MappedNamespaceConvention mappedNamespaceConvention) throws XMLStreamException {
        this(qNameMap, xMLStreamWriter, z, z2, (NameCoder) xmlFriendlyReplacer, mappedNamespaceConvention);
    }

    public JettisonStaxWriter(QNameMap qNameMap, XMLStreamWriter xMLStreamWriter, boolean z, boolean z2, MappedNamespaceConvention mappedNamespaceConvention) throws XMLStreamException {
        super(qNameMap, xMLStreamWriter, z, z2);
        this.stack = new ArrayList();
        this.convention = mappedNamespaceConvention;
    }

    public JettisonStaxWriter(QNameMap qNameMap, XMLStreamWriter xMLStreamWriter, MappedNamespaceConvention mappedNamespaceConvention) throws XMLStreamException {
        super(qNameMap, xMLStreamWriter);
        this.stack = new ArrayList();
        this.convention = mappedNamespaceConvention;
    }

    public JettisonStaxWriter(QNameMap qNameMap, XMLStreamWriter xMLStreamWriter, NameCoder nameCoder, MappedNamespaceConvention mappedNamespaceConvention) throws XMLStreamException {
        super(qNameMap, xMLStreamWriter, nameCoder);
        this.stack = new ArrayList();
        this.convention = mappedNamespaceConvention;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    @Override // com.thoughtworks.xstream.p042io.AbstractWriter, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startNode(String str, Class cls) throws Throwable {
        AbstractXMLStreamWriter xMLStreamWriter = getXMLStreamWriter();
        String str2 = "";
        if (cls != null && (xMLStreamWriter instanceof AbstractXMLStreamWriter)) {
            Class clsClass$ = class$java$util$Collection;
            if (clsClass$ == null) {
                clsClass$ = class$("java.util.Collection");
                class$java$util$Collection = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                QName qName = getQNameMap().getQName(encodeNode(str));
                String strCreateKey = this.convention.createKey(qName.getPrefix(), qName.getNamespaceURI(), qName.getLocalPart());
                if (JVM.is15()) {
                    str2 = strCreateKey;
                } else {
                    ArrayList serializedAsArrays = xMLStreamWriter.getSerializedAsArrays();
                    if (!serializedAsArrays.contains(strCreateKey)) {
                        serializedAsArrays.add(strCreateKey);
                    }
                }
            } else {
                Class clsClass$2 = class$java$util$Map;
                if (clsClass$2 == null) {
                    clsClass$2 = class$("java.util.Map");
                    class$java$util$Map = clsClass$2;
                }
                if (clsClass$2.isAssignableFrom(cls) || cls.isArray()) {
                }
            }
        }
        this.stack.add(str2);
        super.startNode(str);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxWriter, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void startNode(String str) throws Throwable {
        startNode(str, null);
    }

    @Override // com.thoughtworks.xstream.p042io.xml.StaxWriter, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void endNode() {
        String str = (String) this.stack.remove(r0.size() - 1);
        if (str.length() == 0) {
            super.endNode();
            return;
        }
        ArrayList serializedAsArrays = getXMLStreamWriter().getSerializedAsArrays();
        serializedAsArrays.add(str);
        super.endNode();
        serializedAsArrays.remove(str);
    }
}
