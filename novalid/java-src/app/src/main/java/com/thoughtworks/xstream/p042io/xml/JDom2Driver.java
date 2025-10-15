package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.AbstractDriver;
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
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/* loaded from: classes8.dex */
public class JDom2Driver extends AbstractDriver {
    public JDom2Driver() {
        super(new XmlFriendlyNameCoder());
    }

    public JDom2Driver(NameCoder nameCoder) {
        super(nameCoder);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            return new JDom2Reader(createBuilder().build(reader), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        try {
            return new JDom2Reader(createBuilder().build(inputStream), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) {
        try {
            return new JDom2Reader(createBuilder().build(url), getNameCoder());
        } catch (JDOMException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) {
        try {
            return new JDom2Reader(createBuilder().build(file), getNameCoder());
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
