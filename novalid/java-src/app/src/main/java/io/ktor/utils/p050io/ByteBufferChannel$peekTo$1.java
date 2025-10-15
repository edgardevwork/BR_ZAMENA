package io.ktor.utils.p050io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0}, m7122l = {2374}, m7123m = "peekTo-lBXzO7A$suspendImpl", m7124n = {"bytesCopied"}, m7125s = {"L$0"})
/* loaded from: classes5.dex */
public final class ByteBufferChannel$peekTo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$peekTo$1(ByteBufferChannel byteBufferChannel, Continuation<? super ByteBufferChannel$peekTo$1> continuation) {
        super(continuation);
        this.this$0 = byteBufferChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteBufferChannel.m15410peekTolBXzO7A$suspendImpl(this.this$0, null, 0L, 0L, 0L, 0L, this);
    }
}
