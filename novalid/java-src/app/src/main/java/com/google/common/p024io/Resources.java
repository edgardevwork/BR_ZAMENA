package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public final class Resources {
    public static ByteSource asByteSource(URL url) {
        return new UrlByteSource(url);
    }

    /* loaded from: classes6.dex */
    public static final class UrlByteSource extends ByteSource {
        public final URL url;

        public UrlByteSource(URL url) {
            this.url = (URL) Preconditions.checkNotNull(url);
        }

        @Override // com.google.common.p024io.ByteSource
        public InputStream openStream() throws IOException {
            return this.url.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.url + ")";
        }
    }

    public static CharSource asCharSource(URL url, Charset charset) {
        return asByteSource(url).asCharSource(charset);
    }

    public static byte[] toByteArray(URL url) throws IOException {
        return asByteSource(url).read();
    }

    public static String toString(URL url, Charset charset) throws IOException {
        return asCharSource(url, charset).read();
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readLines(URL url, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
        return (T) asCharSource(url, charset).readLines(lineProcessor);
    }

    public static List<String> readLines(URL url, Charset charset) throws IOException {
        return (List) readLines(url, charset, new LineProcessor<List<String>>() { // from class: com.google.common.io.Resources.1
            public final List<String> result = Lists.newArrayList();

            @Override // com.google.common.p024io.LineProcessor
            public boolean processLine(String line) {
                this.result.add(line);
                return true;
            }

            @Override // com.google.common.p024io.LineProcessor
            public List<String> getResult() {
                return this.result;
            }
        });
    }

    public static void copy(URL from, OutputStream to) throws Throwable {
        asByteSource(from).copyTo(to);
    }

    @CanIgnoreReturnValue
    public static URL getResource(String resourceName) {
        URL resource = ((ClassLoader) MoreObjects.firstNonNull(Thread.currentThread().getContextClassLoader(), Resources.class.getClassLoader())).getResource(resourceName);
        Preconditions.checkArgument(resource != null, "resource %s not found.", resourceName);
        return resource;
    }

    @CanIgnoreReturnValue
    public static URL getResource(Class<?> contextClass, String resourceName) {
        URL resource = contextClass.getResource(resourceName);
        Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", resourceName, contextClass.getName());
        return resource;
    }
}
