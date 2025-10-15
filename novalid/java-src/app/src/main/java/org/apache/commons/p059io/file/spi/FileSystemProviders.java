package org.apache.commons.p059io.file.spi;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline0;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer$$ExternalSyntheticApiModelOutline4;
import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes6.dex */
public class FileSystemProviders {
    public static final FileSystemProviders INSTALLED = new FileSystemProviders(FileSystemProvider.installedProviders());
    public final List<FileSystemProvider> providers;

    public static FileSystemProvider getFileSystemProvider(Path path) {
        Objects.requireNonNull(path, "path");
        return NioPathDeserializer$$ExternalSyntheticApiModelOutline0.m1025m(path).getFileSystem().provider();
    }

    public static FileSystemProviders installed() {
        return INSTALLED;
    }

    public FileSystemProviders(List<FileSystemProvider> list) {
        this.providers = list;
    }

    public FileSystemProvider getFileSystemProvider(String str) {
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase(PomReader.PomProfileElement.FILE)) {
            return FileSystems.getDefault().provider();
        }
        List<FileSystemProvider> list = this.providers;
        if (list == null) {
            return null;
        }
        Iterator<FileSystemProvider> it = list.iterator();
        while (it.hasNext()) {
            FileSystemProvider fileSystemProviderM1029m = NioPathDeserializer$$ExternalSyntheticApiModelOutline4.m1029m(it.next());
            if (fileSystemProviderM1029m.getScheme().equalsIgnoreCase(str)) {
                return fileSystemProviderM1029m;
            }
        }
        return null;
    }

    public FileSystemProvider getFileSystemProvider(URI uri) {
        Objects.requireNonNull(uri, "uri");
        return getFileSystemProvider(uri.getScheme());
    }

    public FileSystemProvider getFileSystemProvider(URL url) {
        Objects.requireNonNull(url, "url");
        return getFileSystemProvider(url.getProtocol());
    }
}
