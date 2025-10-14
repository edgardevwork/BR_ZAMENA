package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes6.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    public static final boolean areWindowsFilePathsSupported;
    public static final long serialVersionUID = 1;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = fileArrListRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        areWindowsFilePathsSupported = z;
    }

    public NioPathDeserializer() {
        super((Class<?>) Java7HandlersImpl$$ExternalSyntheticApiModelOutline0.m1024m());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Path deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(deserializationContext.handleUnexpectedToken(Java7HandlersImpl$$ExternalSyntheticApiModelOutline0.m1024m(), jsonParser));
        }
        String text = jsonParser.getText();
        if (text.indexOf(58) < 0) {
            return Paths.get(text, new String[0]);
        }
        if (areWindowsFilePathsSupported && text.length() >= 2 && Character.isLetter(text.charAt(0)) && text.charAt(1) == ':') {
            return Paths.get(text, new String[0]);
        }
        try {
            URI uri = new URI(text);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(NioPathDeserializer$$ExternalSyntheticApiModelOutline3.m1028m()).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProviderM1029m = NioPathDeserializer$$ExternalSyntheticApiModelOutline4.m1029m(it.next());
                        if (fileSystemProviderM1029m.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProviderM1029m.getPath(uri);
                        }
                    }
                    return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(deserializationContext.handleInstantiationProblem(handledType(), text, e));
                } catch (Throwable th) {
                    th.addSuppressed(e);
                    return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(deserializationContext.handleInstantiationProblem(handledType(), text, th));
                }
            } catch (Throwable th2) {
                return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(deserializationContext.handleInstantiationProblem(handledType(), text, th2));
            }
        } catch (URISyntaxException e2) {
            return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(deserializationContext.handleInstantiationProblem(handledType(), text, e2));
        }
    }
}
