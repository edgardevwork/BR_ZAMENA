package org.apache.http.client.protocol;

import java.io.IOException;
import java.util.Locale;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.ParseException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.entity.DecompressingEntity;
import org.apache.http.client.entity.DeflateInputStreamFactory;
import org.apache.http.client.entity.GZIPInputStreamFactory;
import org.apache.http.client.entity.InputStreamFactory;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes5.dex */
public class ResponseContentEncoding implements HttpResponseInterceptor {
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";
    public final Lookup<InputStreamFactory> decoderRegistry;
    public final boolean ignoreUnknown;

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup, boolean z) {
        this.decoderRegistry = lookup == null ? RegistryBuilder.create().register("gzip", GZIPInputStreamFactory.getInstance()).register("x-gzip", GZIPInputStreamFactory.getInstance()).register(CompressorStreamFactory.DEFLATE, DeflateInputStreamFactory.getInstance()).build() : lookup;
        this.ignoreUnknown = z;
    }

    public ResponseContentEncoding(boolean z) {
        this(null, z);
    }

    public ResponseContentEncoding(Lookup<InputStreamFactory> lookup) {
        this(lookup, true);
    }

    public ResponseContentEncoding() {
        this((Lookup<InputStreamFactory>) null);
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, ParseException, IOException {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (!HttpClientContext.adapt(httpContext).getRequestConfig().isContentCompressionEnabled() || entity == null || entity.getContentLength() == 0 || (contentEncoding = entity.getContentEncoding()) == null) {
            return;
        }
        for (HeaderElement headerElement : contentEncoding.getElements()) {
            String lowerCase = headerElement.getName().toLowerCase(Locale.ROOT);
            InputStreamFactory inputStreamFactoryLookup = this.decoderRegistry.lookup(lowerCase);
            if (inputStreamFactoryLookup != null) {
                httpResponse.setEntity(new DecompressingEntity(httpResponse.getEntity(), inputStreamFactoryLookup));
                httpResponse.removeHeaders("Content-Length");
                httpResponse.removeHeaders("Content-Encoding");
                httpResponse.removeHeaders("Content-MD5");
            } else if (!HTTP.IDENTITY_CODING.equals(lowerCase) && !this.ignoreUnknown) {
                throw new HttpException("Unsupported Content-Encoding: " + headerElement.getName());
            }
        }
    }
}
