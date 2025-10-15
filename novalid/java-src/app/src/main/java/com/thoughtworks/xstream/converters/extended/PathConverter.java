package com.thoughtworks.xstream.converters.extended;

import com.fasterxml.jackson.databind.ext.Java7HandlersImpl$$ExternalSyntheticApiModelOutline0;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/* loaded from: classes7.dex */
public class PathConverter extends AbstractSingleValueConverter {
    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && Java7HandlersImpl$$ExternalSyntheticApiModelOutline0.m1024m().isAssignableFrom(cls);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Path fromString(String str) {
        try {
            try {
                URI uri = new URI(str);
                if (uri.getScheme() != null && uri.getScheme().length() != 1) {
                    return Paths.get(uri);
                }
                char c = File.separatorChar;
                return Paths.get(c != '/' ? str.replace('/', c) : str, new String[0]);
            } catch (URISyntaxException unused) {
                return Paths.get(str, new String[0]);
            }
        } catch (InvalidPathException e) {
            throw new ConversionException(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        Path pathM1025m = NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(obj);
        if (pathM1025m.getFileSystem() == FileSystems.getDefault()) {
            String string = pathM1025m.toString();
            char c = File.separatorChar;
            return c != '/' ? string.replace(c, '/') : string;
        }
        return pathM1025m.toUri().toString();
    }
}
