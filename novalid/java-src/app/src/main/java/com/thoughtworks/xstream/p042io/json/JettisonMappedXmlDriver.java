package com.thoughtworks.xstream.p042io.json;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.thoughtworks.xstream.p042io.AbstractDriver;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.xml.QNameMap;
import com.thoughtworks.xstream.p042io.xml.StaxReader;
import com.thoughtworks.xstream.p042io.xml.StaxWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import javax.xml.stream.XMLStreamException;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLInputFactory;
import org.codehaus.jettison.mapped.MappedXMLOutputFactory;

/* loaded from: classes8.dex */
public class JettisonMappedXmlDriver extends AbstractDriver {
    public final MappedNamespaceConvention convention;
    public final MappedXMLInputFactory mif;
    public final MappedXMLOutputFactory mof;
    public final boolean useSerializeAsArray;

    public JettisonMappedXmlDriver() {
        this(null);
    }

    public JettisonMappedXmlDriver(Configuration configuration) {
        this(configuration, true);
    }

    public JettisonMappedXmlDriver(Configuration configuration, boolean z) {
        configuration = configuration == null ? new Configuration() : configuration;
        this.mof = new MappedXMLOutputFactory(configuration);
        this.mif = new MappedXMLInputFactory(configuration);
        this.convention = new MappedNamespaceConvention(configuration);
        this.useSerializeAsArray = z;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            return new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(reader), getNameCoder());
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        try {
            return new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(inputStream), getNameCoder());
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) throws IOException {
        InputStream inputStreamOpenStream = null;
        try {
            try {
                try {
                    inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
                    StaxReader staxReader = new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(url.toExternalForm(), inputStreamOpenStream), getNameCoder());
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return staxReader;
                } catch (XMLStreamException e) {
                    throw new StreamException((Throwable) e);
                }
            } catch (IOException e2) {
                throw new StreamException(e2);
            }
        } catch (Throwable th) {
            if (inputStreamOpenStream != null) {
                try {
                    inputStreamOpenStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
            } catch (XMLStreamException e2) {
                e = e2;
            }
            try {
                StaxReader staxReader = new StaxReader(new QNameMap(), this.mif.createXMLStreamReader(file.toURI().toASCIIString(), fileInputStream), getNameCoder());
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
                return staxReader;
            } catch (XMLStreamException e3) {
                e = e3;
                throw new StreamException((Throwable) e);
            } catch (IOException e4) {
                e = e4;
                throw new StreamException(e);
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(Writer writer) {
        try {
            if (this.useSerializeAsArray) {
                return new JettisonStaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(writer), getNameCoder(), this.convention);
            }
            return new StaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(writer), getNameCoder());
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(OutputStream outputStream) {
        try {
            if (this.useSerializeAsArray) {
                return new JettisonStaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(outputStream), getNameCoder(), this.convention);
            }
            return new StaxWriter(new QNameMap(), this.mof.createXMLStreamWriter(outputStream), getNameCoder());
        } catch (XMLStreamException e) {
            throw new StreamException((Throwable) e);
        }
    }
}
