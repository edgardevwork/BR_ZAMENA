package org.apache.ivy.core.cache;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.parser.ParserSettings;

/* loaded from: classes7.dex */
public interface ModuleDescriptorProvider {
    ModuleDescriptor provideModule(ParserSettings parserSettings, File file, boolean z) throws IOException, ParseException;
}
