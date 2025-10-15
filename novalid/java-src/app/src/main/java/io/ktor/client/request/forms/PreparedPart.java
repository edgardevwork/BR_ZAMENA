package io.ktor.client.request.forms;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.core.Input;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FormDataContent.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m7105d2 = {"Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "", "size", "", "([BLjava/lang/Long;)V", "getHeaders", "()[B", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "ChannelPart", "InputPart", "Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart$InputPart;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class PreparedPart {

    @NotNull
    public final byte[] headers;

    @Nullable
    public final Long size;

    public /* synthetic */ PreparedPart(byte[] bArr, Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, l);
    }

    public PreparedPart(byte[] bArr, Long l) {
        this.headers = bArr;
        this.size = l;
    }

    @NotNull
    public final byte[] getHeaders() {
        return this.headers;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    /* compiled from: FormDataContent.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/request/forms/PreparedPart$InputPart;", "Lio/ktor/client/request/forms/PreparedPart;", "headers", "", "provider", "Lkotlin/Function0;", "Lio/ktor/utils/io/core/Input;", "size", "", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class InputPart extends PreparedPart {

        @NotNull
        public final Function0<Input> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public InputPart(@NotNull byte[] headers, @NotNull Function0<? extends Input> provider, @Nullable Long l) {
            super(headers, l, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        @NotNull
        public final Function0<Input> getProvider() {
            return this.provider;
        }
    }

    /* compiled from: FormDataContent.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart;", "headers", "", "provider", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "size", "", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* loaded from: classes7.dex */
    public static final class ChannelPart extends PreparedPart {

        @NotNull
        public final Function0<ByteReadChannel> provider;

        @NotNull
        public final Function0<ByteReadChannel> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChannelPart(@NotNull byte[] headers, @NotNull Function0<? extends ByteReadChannel> provider, @Nullable Long l) {
            super(headers, l, null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }
    }
}
