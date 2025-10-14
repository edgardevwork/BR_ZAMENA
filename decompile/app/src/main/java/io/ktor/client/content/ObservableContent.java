package io.ktor.client.content;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.utils.ByteChannelUtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.p050io.ByteChannelCtorKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.WriterScope;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ObservableContent.kt */
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012F\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010J'\u0010$\u001a\u0004\u0018\u0001H%\"\b\b\u0000\u0010%*\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'H\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0012H\u0016J/\u0010*\u001a\u00020\u000e\"\b\b\u0000\u0010%*\u00020\u000f2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H%0'2\b\u0010+\u001a\u0004\u0018\u0001H%H\u0016¢\u0006\u0002\u0010,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eRS\u0010\u0006\u001aB\b\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, m7105d2 = {"Lio/ktor/client/content/ObservableContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "delegate", "Lio/ktor/http/content/OutgoingContent;", "callContext", "Lkotlin/coroutines/CoroutineContext;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytesSentTotal", "contentLength", "Lkotlin/coroutines/Continuation;", "", "", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)V", "content", "Lio/ktor/utils/io/ByteReadChannel;", "getContent$annotations", "()V", "getContentLength", "()Ljava/lang/Long;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lkotlin/jvm/functions/Function3;", "status", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "getProperty", ExifInterface.GPS_DIRECTION_TRUE, "key", "Lio/ktor/util/AttributeKey;", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "readFrom", "setProperty", "value", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ObservableContent extends OutgoingContent.ReadChannelContent {

    @NotNull
    public final CoroutineContext callContext;

    @NotNull
    public final ByteReadChannel content;

    @NotNull
    public final OutgoingContent delegate;

    @NotNull
    public final Function3<Long, Long, Continuation<? super Unit>, Object> listener;

    public static /* synthetic */ void getContent$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ObservableContent(@NotNull OutgoingContent delegate, @NotNull CoroutineContext callContext, @NotNull Function3<? super Long, ? super Long, ? super Continuation<? super Unit>, ? extends Object> listener) {
        ByteReadChannel channel;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegate = delegate;
        this.callContext = callContext;
        this.listener = listener;
        if (delegate instanceof OutgoingContent.ByteArrayContent) {
            channel = ByteChannelCtorKt.ByteReadChannel(((OutgoingContent.ByteArrayContent) delegate).getBytes());
        } else {
            if (delegate instanceof OutgoingContent.ProtocolUpgrade) {
                throw new UnsupportedContentTypeException(delegate);
            }
            if (delegate instanceof OutgoingContent.NoContent) {
                channel = ByteReadChannel.INSTANCE.getEmpty();
            } else if (delegate instanceof OutgoingContent.ReadChannelContent) {
                channel = ((OutgoingContent.ReadChannelContent) delegate).getChannel();
            } else if (delegate instanceof OutgoingContent.WriteChannelContent) {
                channel = CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, callContext, true, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new ObservableContent$content$1(this, null)).getChannel();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.content = channel;
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public ContentType getContentType() {
        return this.delegate.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public Long getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public HttpStatusCode getStatus() {
        return this.delegate.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public Headers getHeaders() {
        return this.delegate.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    @Nullable
    public <T> T getProperty(@NotNull AttributeKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.delegate.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(@NotNull AttributeKey<T> key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.delegate.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    @NotNull
    /* renamed from: readFrom */
    public ByteReadChannel getChannel() {
        return ByteChannelUtilsKt.observable(this.content, this.callContext, getContentLength(), this.listener);
    }
}
