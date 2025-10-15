package org.apache.ivy.osgi.p063p2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class P2CompositeParser implements XMLInputParser {
    public Set<String> childLocations = new LinkedHashSet();

    public Set<String> getChildLocations() {
        return this.childLocations;
    }

    @Override // org.apache.ivy.osgi.p063p2.XMLInputParser
    public void parse(InputStream inputStream) throws SAXException, IOException, ParseException {
        RepositoryHandler repositoryHandler = new RepositoryHandler();
        try {
            XMLHelper.parse(inputStream, (URL) null, repositoryHandler, (LexicalHandler) null);
            this.childLocations.addAll(repositoryHandler.childLocations);
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public static class RepositoryHandler extends DelegatingHandler {
        public static final String REPOSITORY = "repository";
        public List<String> childLocations;

        public RepositoryHandler() {
            super("repository");
            this.childLocations = Collections.emptyList();
            addChild(new ChildrenHandler(), new DelegatingHandler.ChildElementHandler<ChildrenHandler>() { // from class: org.apache.ivy.osgi.p2.P2CompositeParser.RepositoryHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ChildrenHandler childrenHandler) {
                    RepositoryHandler.this.childLocations = childrenHandler.childLocations;
                }
            });
        }
    }

    public static class ChildrenHandler extends DelegatingHandler {
        public static final String CHILDREN = "children";
        public static final String SIZE = "size";
        public List<String> childLocations;

        public ChildrenHandler() {
            super(CHILDREN);
            addChild(new ChildHandler(), new DelegatingHandler.ChildElementHandler<ChildHandler>() { // from class: org.apache.ivy.osgi.p2.P2CompositeParser.ChildrenHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ChildHandler childHandler) {
                    ChildrenHandler.this.childLocations.add(childHandler.location);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.childLocations = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public static class ChildHandler extends DelegatingHandler {
        public static final String CHILD = "child";
        public static final String LOCATION = "location";
        public String location;

        public ChildHandler() {
            super(CHILD);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.location = attributes.getValue("location");
        }
    }
}
