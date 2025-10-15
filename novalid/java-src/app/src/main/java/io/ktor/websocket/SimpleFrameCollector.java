package io.ktor.websocket;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.util.NIOKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SimpleFrameCollector.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u0015\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lio/ktor/websocket/SimpleFrameCollector;", "", "()V", "buffer", "Ljava/nio/ByteBuffer;", "hasRemaining", "", "getHasRemaining", "()Z", "maskBuffer", "kotlin.jvm.PlatformType", "remaining", "", "handle", "", "bb", TtmlNode.START, CacheFileMetadataIndex.COLUMN_LENGTH, "take", "maskKey", "(Ljava/lang/Integer;)Ljava/nio/ByteBuffer;", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSimpleFrameCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFrameCollector.kt\nio/ktor/websocket/SimpleFrameCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleFrameCollector {

    @Nullable
    public ByteBuffer buffer;
    public final ByteBuffer maskBuffer = ByteBuffer.allocate(4);
    public int remaining;

    public final boolean getHasRemaining() {
        return this.remaining > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(int length, @NotNull ByteBuffer bb) {
        Intrinsics.checkNotNullParameter(bb, "bb");
        if (this.remaining != 0) {
            throw new IllegalStateException("remaining should be 0");
        }
        this.remaining = length;
        ByteBuffer byteBuffer = this.buffer;
        if (byteBuffer != null) {
            Intrinsics.checkNotNull(byteBuffer);
            if (byteBuffer.capacity() < length) {
                this.buffer = ByteBuffer.allocate(length);
            }
        }
        ByteBuffer byteBuffer2 = this.buffer;
        Intrinsics.checkNotNull(byteBuffer2);
        byteBuffer2.clear();
        handle(bb);
    }

    public final void handle(@NotNull ByteBuffer bb) {
        Intrinsics.checkNotNullParameter(bb, "bb");
        int i = this.remaining;
        ByteBuffer byteBuffer = this.buffer;
        Intrinsics.checkNotNull(byteBuffer);
        this.remaining = i - NIOKt.moveTo(bb, byteBuffer, this.remaining);
    }

    @NotNull
    public final ByteBuffer take(@Nullable Integer maskKey) {
        ByteBuffer byteBuffer = this.buffer;
        Intrinsics.checkNotNull(byteBuffer);
        byteBuffer.flip();
        ByteBuffer view = byteBuffer.slice();
        if (maskKey != null) {
            this.maskBuffer.clear();
            this.maskBuffer.asIntBuffer().put(maskKey.intValue());
            this.maskBuffer.clear();
            Intrinsics.checkNotNullExpressionValue(view, "view");
            ByteBuffer maskBuffer = this.maskBuffer;
            Intrinsics.checkNotNullExpressionValue(maskBuffer, "maskBuffer");
            UtilsKt.xor(view, maskBuffer);
        }
        this.buffer = null;
        ByteBuffer byteBufferAsReadOnlyBuffer = view.asReadOnlyBuffer();
        Intrinsics.checkNotNullExpressionValue(byteBufferAsReadOnlyBuffer, "buffer!!.run {\n        f….asReadOnlyBuffer()\n    }");
        return byteBufferAsReadOnlyBuffer;
    }
}
