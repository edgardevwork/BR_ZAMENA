package io.ktor.utils.p050io.core;

import java.nio.ByteOrder;
import kotlin.Metadata;

/* compiled from: ByteOrderJVM.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m7105d2 = {"orderOf", "Lio/ktor/utils/io/core/ByteOrder;", "nioOrder", "Ljava/nio/ByteOrder;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ByteOrderJVMKt {
    public static final ByteOrder orderOf(ByteOrder byteOrder) {
        return byteOrder == ByteOrder.BIG_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
    }
}
