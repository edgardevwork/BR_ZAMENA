package io.ktor.client.plugins.logging;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoggedContent.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J'\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\b\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001cH\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0005H\u0016J/\u0010\u001f\u001a\u00020 \"\b\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001c2\b\u0010!\u001a\u0004\u0018\u0001H\u0019H\u0016¢\u0006\u0002\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m7105d2 = {"Lio/ktor/client/plugins/logging/LoggedContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "originalContent", "Lio/ktor/http/content/OutgoingContent;", "channel", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteReadChannel;)V", "contentLength", "", "getContentLength", "()Ljava/lang/Long;", "Ljava/lang/Long;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "status", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "getProperty", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lio/ktor/util/AttributeKey;", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "readFrom", "setProperty", "", "value", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class LoggedContent extends OutgoingContent.ReadChannelContent {

    @NotNull
    public final ByteReadChannel channel;

    @Nullable
    public final Long contentLength;

    @Nullable
    public final ContentType contentType;

    @NotNull
    public final Headers headers;

    @NotNull
    public final OutgoingContent originalContent;

    @Nullable
    public final HttpStatusCode status;

    public LoggedContent(@NotNull OutgoingContent originalContent, @NotNull ByteReadChannel channel) {
        Intrinsics.checkNotNullParameter(originalContent, "originalContent");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.originalContent = originalContent;
        this.channel = channel;
        this.contentType = originalContent.getContentType();
        this.contentLength = originalContent.getContentLength();
        this.status = originalContent.getStatus();
        this.headers = originalContent.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public <T> T getProperty(@NotNull AttributeKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.originalContent.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(@NotNull AttributeKey<T> key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.originalContent.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    @NotNull
    /* renamed from: readFrom, reason: from getter */
    public ByteReadChannel getChannel() {
        return this.channel;
    }
}
