package io.ktor.client.request.forms;

import io.ktor.utils.p050io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: formDsl.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m7105d2 = {"Lio/ktor/client/request/forms/ChannelProvider;", "", "size", "", "block", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "getBlock", "()Lkotlin/jvm/functions/Function0;", "getSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ChannelProvider {

    @NotNull
    public final Function0<ByteReadChannel> block;

    @Nullable
    public final Long size;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelProvider(@Nullable Long l, @NotNull Function0<? extends ByteReadChannel> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.size = l;
        this.block = block;
    }

    public /* synthetic */ ChannelProvider(Long l, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, function0);
    }

    @NotNull
    public final Function0<ByteReadChannel> getBlock() {
        return this.block;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }
}
