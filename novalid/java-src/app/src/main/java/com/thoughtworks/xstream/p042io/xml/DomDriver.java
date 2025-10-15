package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.converters.reflection.ObjectAccessException;
import com.thoughtworks.xstream.core.JVM;
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
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes7.dex */
public class DomDriver extends AbstractXmlDriver {
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$javax$xml$parsers$DocumentBuilderFactory;
    public DocumentBuilderFactory documentBuilderFactory;
    public final String encoding;

    public DomDriver() {
        this(null);
    }

    public DomDriver(String str) {
        this(str, new XmlFriendlyNameCoder());
    }

    public DomDriver(String str, NameCoder nameCoder) {
        super(nameCoder);
        this.encoding = str;
    }

    public DomDriver(String str, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(str, (NameCoder) xmlFriendlyReplacer);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        return createReader(new InputSource(reader));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        return createReader(new InputSource(inputStream));
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) {
        return createReader(new InputSource(url.toExternalForm()));
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) {
        return createReader(new InputSource(file.toURI().toASCIIString()));
    }

    public final HierarchicalStreamReader createReader(InputSource inputSource) throws ParserConfigurationException {
        try {
            if (this.documentBuilderFactory == null) {
                synchronized (this) {
                    try {
                        if (this.documentBuilderFactory == null) {
                            this.documentBuilderFactory = createDocumentBuilderFactory();
                        }
                    } finally {
                    }
                }
            }
            DocumentBuilder documentBuilderNewDocumentBuilder = this.documentBuilderFactory.newDocumentBuilder();
            String str = this.encoding;
            if (str != null) {
                inputSource.setEncoding(str);
            }
            return new DomReader(documentBuilderNewDocumentBuilder.parse(inputSource), getNameCoder());
        } catch (IOException e) {
            throw new StreamException(e);
        } catch (FactoryConfigurationError e2) {
            throw new StreamException(e2);
        } catch (ParserConfigurationException e3) {
            throw new StreamException(e3);
        } catch (SAXException e4) {
            throw new StreamException(e4);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(Writer writer) {
        return new PrettyPrintWriter(writer, getNameCoder());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(OutputStream outputStream) {
        try {
            return createWriter(this.encoding != null ? new OutputStreamWriter(outputStream, this.encoding) : new OutputStreamWriter(outputStream));
        } catch (UnsupportedEncodingException e) {
            throw new StreamException(e);
        }
    }

    public DocumentBuilderFactory createDocumentBuilderFactory() throws Throwable {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        if (JVM.isVersion(5)) {
            try {
                Class clsClass$ = class$javax$xml$parsers$DocumentBuilderFactory;
                if (clsClass$ == null) {
                    clsClass$ = class$("javax.xml.parsers.DocumentBuilderFactory");
                    class$javax$xml$parsers$DocumentBuilderFactory = clsClass$;
                }
                Class clsClass$2 = class$java$lang$String;
                if (clsClass$2 == null) {
                    clsClass$2 = class$("java.lang.String");
                    class$java$lang$String = clsClass$2;
                }
                clsClass$.getMethod("setFeature", clsClass$2, Boolean.TYPE).invoke(documentBuilderFactoryNewInstance, "http://apache.org/xml/features/disallow-doctype-decl", Boolean.TRUE);
            } catch (IllegalAccessException e) {
                throw new ObjectAccessException("Cannot set feature of DocumentBuilderFactory.", e);
            } catch (NoSuchMethodException unused) {
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (JVM.isVersion(6) || ((cause instanceof ParserConfigurationException) && cause.getMessage().indexOf("disallow-doctype-decl") < 0)) {
                    throw new StreamException(cause);
                }
            }
        }
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        return documentBuilderFactoryNewInstance;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
