package org.apache.ivy.plugins.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.osgi.core.OSGiManifestParser;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorParser;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Message;

/* loaded from: classes8.dex */
public final class ModuleDescriptorParserRegistry extends AbstractModuleDescriptorParser {
    public static final ModuleDescriptorParserRegistry INSTANCE = new ModuleDescriptorParserRegistry();
    public List<ModuleDescriptorParser> parsers;

    public static ModuleDescriptorParserRegistry getInstance() {
        return INSTANCE;
    }

    public ModuleDescriptorParserRegistry() {
        LinkedList linkedList = new LinkedList();
        this.parsers = linkedList;
        linkedList.add(PomModuleDescriptorParser.getInstance());
        this.parsers.add(OSGiManifestParser.getInstance());
        this.parsers.add(XmlModuleDescriptorParser.getInstance());
    }

    public void addParser(ModuleDescriptorParser moduleDescriptorParser) {
        this.parsers.add(0, moduleDescriptorParser);
    }

    public ModuleDescriptorParser[] getParsers() {
        List<ModuleDescriptorParser> list = this.parsers;
        return (ModuleDescriptorParser[]) list.toArray(new ModuleDescriptorParser[list.size()]);
    }

    public ModuleDescriptorParser getParser(Resource resource) {
        for (ModuleDescriptorParser moduleDescriptorParser : this.parsers) {
            if (moduleDescriptorParser.accept(resource)) {
                return moduleDescriptorParser;
            }
        }
        return null;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, Resource resource, boolean z) throws IOException, ParseException {
        ModuleDescriptorParser parser = getParser(resource);
        if (parser == null) {
            Message.warn("no module descriptor parser found for " + resource);
            return null;
        }
        return parser.parseDescriptor(parserSettings, url, resource, z);
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public boolean accept(Resource resource) {
        return getParser(resource) != null;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public void toIvyFile(InputStream inputStream, Resource resource, File file, ModuleDescriptor moduleDescriptor) throws IOException, ParseException {
        ModuleDescriptorParser parser = getParser(resource);
        if (parser == null) {
            Message.warn("no module descriptor parser found for " + resource);
            return;
        }
        parser.toIvyFile(inputStream, resource, file, moduleDescriptor);
    }
}
