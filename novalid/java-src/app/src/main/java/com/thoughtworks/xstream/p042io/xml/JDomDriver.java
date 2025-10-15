package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/* loaded from: classes7.dex */
public class JDomDriver extends AbstractXmlDriver {
    public JDomDriver() {
        super(new XmlFriendlyNameCoder());
    }

    public JDomDriver(NameCoder nameCoder) {
        super(nameCoder);
    }

    public JDomDriver(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            return new JDomReader(createBuilder().build(reader), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        try {
            return new JDomReader(createBuilder().build(inputStream), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) {
        try {
            return new JDomReader(createBuilder().build(url), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) {
        try {
            return new JDomReader(createBuilder().build(file), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(Writer writer) {
        return new PrettyPrintWriter(writer, getNameCoder());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(OutputStream outputStream) {
        return new PrettyPrintWriter(new OutputStreamWriter(outputStream));
    }

    public SAXBuilder createBuilder() {
        SAXBuilder sAXBuilder = new SAXBuilder();
        sAXBuilder.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        return sAXBuilder;
    }
}
