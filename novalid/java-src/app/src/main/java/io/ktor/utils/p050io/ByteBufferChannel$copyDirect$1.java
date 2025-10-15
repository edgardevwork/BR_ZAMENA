package io.ktor.utils.p050io;

import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.recyclerview.widget.FastScroller;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
@DebugMetadata(m7119c = "io.ktor.utils.io.ByteBufferChannel", m7120f = "ByteBufferChannel.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m7122l = {FastScroller.HIDE_DELAY_AFTER_DRAGGING_MS, 1271, AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD}, m7123m = "copyDirect$ktor_io", m7124n = {"this", "src", "joined", "copied", "this_$iv", "current$iv", "capacity$iv", "state", "dstBuffer", "$this$copyDirect_u24lambda_u2475", "limit", "autoFlush", "before$iv", "this", "src", "joined", "copied", "limit", "autoFlush", "this", "src", "joined", "copied", "limit", "autoFlush"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
/* loaded from: classes5.dex */
public final class ByteBufferChannel$copyDirect$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$copyDirect$1(ByteBufferChannel byteBufferChannel, Continuation<? super ByteBufferChannel$copyDirect$1> continuation) {
        super(continuation);
        this.this$0 = byteBufferChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copyDirect$ktor_io(null, 0L, null, this);
    }
}
