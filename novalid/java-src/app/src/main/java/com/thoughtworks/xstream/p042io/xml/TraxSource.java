package com.thoughtworks.xstream.p042io.xml;

import androidx.core.graphics.drawable.IconCompat;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

/* loaded from: classes5.dex */
public class TraxSource extends SAXSource {
    public static final String XSTREAM_FEATURE = "http://com.thoughtworks.xstream/XStreamSource/feature";
    public List source;
    public XMLReader xmlReader;
    public XStream xstream;

    public TraxSource() {
        super(new InputSource());
        this.xmlReader = null;
        this.xstream = null;
        this.source = null;
    }

    public TraxSource(Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        super(new InputSource());
        this.xmlReader = null;
        this.xstream = null;
        this.source = null;
        setSource(obj);
    }

    public TraxSource(Object obj, XStream xStream) throws SAXNotRecognizedException, SAXNotSupportedException {
        super(new InputSource());
        this.xmlReader = null;
        this.xstream = null;
        this.source = null;
        setSource(obj);
        setXStream(xStream);
    }

    public TraxSource(List list) throws SAXNotRecognizedException, SAXNotSupportedException {
        super(new InputSource());
        this.xmlReader = null;
        this.xstream = null;
        this.source = null;
        setSourceAsList(list);
    }

    public TraxSource(List list, XStream xStream) throws SAXNotRecognizedException, SAXNotSupportedException {
        super(new InputSource());
        this.xmlReader = null;
        this.xstream = null;
        this.source = null;
        setSourceAsList(list);
        setXStream(xStream);
    }

    @Override // javax.xml.transform.sax.SAXSource
    public void setInputSource(InputSource inputSource) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.xml.transform.sax.SAXSource
    public void setXMLReader(XMLReader xMLReader) throws SAXNotRecognizedException, SAXNotSupportedException {
        createXMLReader(xMLReader);
    }

    @Override // javax.xml.transform.sax.SAXSource
    public XMLReader getXMLReader() throws SAXNotRecognizedException, SAXNotSupportedException {
        if (this.xmlReader == null) {
            createXMLReader(null);
        }
        return this.xmlReader;
    }

    public void setXStream(XStream xStream) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (xStream == null) {
            throw new IllegalArgumentException("xstream");
        }
        this.xstream = xStream;
        configureXMLReader();
    }

    public void setSource(Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (obj == null) {
            throw new IllegalArgumentException(IconCompat.EXTRA_OBJ);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        setSourceAsList(arrayList);
    }

    public void setSourceAsList(List list) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(IFramePlayerOptions.Builder.LIST);
        }
        this.source = list;
        configureXMLReader();
    }

    public final void createXMLReader(XMLReader xMLReader) throws SAXNotRecognizedException, SAXNotSupportedException {
        XMLFilter xMLFilter;
        if (xMLReader == null) {
            this.xmlReader = new SaxWriter();
        } else if (xMLReader instanceof XMLFilter) {
            XMLReader parent = xMLReader;
            while (true) {
                xMLFilter = (XMLFilter) parent;
                if (!(xMLFilter.getParent() instanceof XMLFilter)) {
                    break;
                } else {
                    parent = xMLFilter.getParent();
                }
            }
            if (!(xMLFilter.getParent() instanceof SaxWriter)) {
                xMLFilter.setParent(new SaxWriter());
            }
            this.xmlReader = xMLReader;
        } else {
            throw new UnsupportedOperationException();
        }
        configureXMLReader();
    }

    public final void configureXMLReader() throws SAXNotRecognizedException, SAXNotSupportedException {
        XMLReader xMLReader = this.xmlReader;
        if (xMLReader != null) {
            try {
                XStream xStream = this.xstream;
                if (xStream != null) {
                    xMLReader.setProperty(SaxWriter.CONFIGURED_XSTREAM_PROPERTY, xStream);
                }
                List list = this.source;
                if (list != null) {
                    this.xmlReader.setProperty(SaxWriter.SOURCE_OBJECT_LIST_PROPERTY, list);
                }
            } catch (SAXException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }
}
