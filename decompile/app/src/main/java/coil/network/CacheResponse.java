package coil.network;

import coil.util.Utils;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CacheResponse.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006$"}, m7105d2 = {"Lcoil/network/CacheResponse;", "", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;)V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "cacheControl", "Lokhttp3/CacheControl;", "getCacheControl", "()Lokhttp3/CacheControl;", "cacheControl$delegate", "Lkotlin/Lazy;", "contentType", "Lokhttp3/MediaType;", "getContentType", "()Lokhttp3/MediaType;", "contentType$delegate", "isTls", "", "()Z", "receivedResponseAtMillis", "", "getReceivedResponseAtMillis", "()J", "responseHeaders", "Lokhttp3/Headers;", "getResponseHeaders", "()Lokhttp3/Headers;", "sentRequestAtMillis", "getSentRequestAtMillis", "writeTo", "", "sink", "Lokio/BufferedSink;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class CacheResponse {

    /* renamed from: cacheControl$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy cacheControl;

    /* renamed from: contentType$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy contentType;
    public final boolean isTls;
    public final long receivedResponseAtMillis;

    @NotNull
    public final Headers responseHeaders;
    public final long sentRequestAtMillis;

    @NotNull
    public final CacheControl getCacheControl() {
        return (CacheControl) this.cacheControl.getValue();
    }

    @Nullable
    public final MediaType getContentType() {
        return (MediaType) this.contentType.getValue();
    }

    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: isTls, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    @NotNull
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    public CacheResponse(@NotNull BufferedSource bufferedSource) throws NumberFormatException {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cacheControl = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CacheControl invoke() {
                return CacheControl.INSTANCE.parse(this.this$0.getResponseHeaders());
            }
        });
        this.contentType = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final MediaType invoke() {
                String str = this.this$0.getResponseHeaders().get("Content-Type");
                if (str != null) {
                    return MediaType.INSTANCE.parse(str);
                }
                return null;
            }
        });
        this.sentRequestAtMillis = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.receivedResponseAtMillis = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.isTls = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int i = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < i; i2++) {
            Utils.addUnsafeNonAscii(builder, bufferedSource.readUtf8LineStrict());
        }
        this.responseHeaders = builder.build();
    }

    public CacheResponse(@NotNull Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cacheControl = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CacheControl invoke() {
                return CacheControl.INSTANCE.parse(this.this$0.getResponseHeaders());
            }
        });
        this.contentType = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final MediaType invoke() {
                String str = this.this$0.getResponseHeaders().get("Content-Type");
                if (str != null) {
                    return MediaType.INSTANCE.parse(str);
                }
                return null;
            }
        });
        this.sentRequestAtMillis = response.sentRequestAtMillis();
        this.receivedResponseAtMillis = response.receivedResponseAtMillis();
        this.isTls = response.handshake() != null;
        this.responseHeaders = response.headers();
    }

    public final void writeTo(@NotNull BufferedSink sink) throws IOException {
        sink.writeDecimalLong(this.sentRequestAtMillis).writeByte(10);
        sink.writeDecimalLong(this.receivedResponseAtMillis).writeByte(10);
        sink.writeDecimalLong(this.isTls ? 1L : 0L).writeByte(10);
        sink.writeDecimalLong(this.responseHeaders.size()).writeByte(10);
        int size = this.responseHeaders.size();
        for (int i = 0; i < size; i++) {
            sink.writeUtf8(this.responseHeaders.name(i)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i)).writeByte(10);
        }
    }
}
