package org.apache.ivy.plugins.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes6.dex */
public interface ModuleDescriptorParser {
    boolean accept(Resource resource);

    Artifact getMetadataArtifact(ModuleRevisionId moduleRevisionId, Resource resource);

    String getType();

    ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, Resource resource, boolean z) throws IOException, ParseException;

    ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, boolean z) throws IOException, ParseException;

    void toIvyFile(InputStream inputStream, Resource resource, File file, ModuleDescriptor moduleDescriptor) throws IOException, ParseException;
}
