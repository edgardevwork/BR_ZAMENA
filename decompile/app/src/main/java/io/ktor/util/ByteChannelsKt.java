package io.ktor.util;

import com.google.gson.internal.bind.TypeAdapters;
import io.ktor.utils.p050io.ByteChannel;
import io.ktor.utils.p050io.ByteChannelKt;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.StringsKt;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteChannels.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t*\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u001a\u0015\u0010\f\u001a\u00020\r*\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m7105d2 = {"CHUNK_BUFFER_SIZE", "", "copyToBoth", "", "Lio/ktor/utils/io/ByteReadChannel;", "first", "Lio/ktor/utils/io/ByteWriteChannel;", TypeAdapters.C786626.SECOND, "split", "Lkotlin/Pair;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "toByteArray", "", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class ByteChannelsKt {
    public static final long CHUNK_BUFFER_SIZE = 4096;

    /* compiled from: ByteChannels.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.ByteChannelsKt", m7120f = "ByteChannels.kt", m7121i = {}, m7122l = {89}, m7123m = "toByteArray", m7124n = {}, m7125s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$toByteArray$1 */
    /* loaded from: classes5.dex */
    public static final class C103431 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C103431(Continuation<? super C103431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelsKt.toByteArray(null, this);
        }
    }

    @NotNull
    public static final Pair<ByteReadChannel, ByteReadChannel> split(@NotNull ByteReadChannel byteReadChannel, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        final ByteChannel ByteChannel = ByteChannelKt.ByteChannel(true);
        final ByteChannel ByteChannel2 = ByteChannelKt.ByteChannel(true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C103411(byteReadChannel, ByteChannel, ByteChannel2, null), 3, null).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.util.ByteChannelsKt.split.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th == null) {
                    return;
                }
                ByteChannel.cancel(th);
                ByteChannel2.cancel(th);
            }
        });
        return TuplesKt.m7112to(ByteChannel, ByteChannel2);
    }

    /* compiled from: ByteChannels.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.ByteChannelsKt$split$1", m7120f = "ByteChannels.kt", m7121i = {0, 1, 1, 1}, m7122l = {25, 29}, m7123m = "invokeSuspend", m7124n = {"$this$launch", "$this$launch", "$this$use$iv", "closed$iv"}, m7125s = {"L$0", "L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$split$1\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n8#2,4:91\n22#2,4:95\n12#2,9:99\n1#3:108\n*S KotlinDebug\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$split$1\n*L\n25#1:91,4\n25#1:95,4\n25#1:99,9\n*E\n"})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1 */
    public static final class C103411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteChannel $first;
        public final /* synthetic */ ByteChannel $second;
        public final /* synthetic */ ByteReadChannel $this_split;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103411(ByteReadChannel byteReadChannel, ByteChannel byteChannel, ByteChannel byteChannel2, Continuation<? super C103411> continuation) {
            super(2, continuation);
            this.$this_split = byteReadChannel;
            this.$first = byteChannel;
            this.$second = byteChannel2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103411 c103411 = new C103411(this.$this_split, this.$first, this.$second, continuation);
            c103411.L$0 = obj;
            return c103411;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: all -> 0x0037, TryCatch #3 {all -> 0x0037, blocks: (B:30:0x00a1, B:19:0x0041, B:21:0x0049, B:24:0x005a, B:41:0x00b4, B:42:0x00b5, B:45:0x00c8, B:14:0x0031, B:39:0x00b2, B:38:0x00af, B:34:0x00a9), top: B:59:0x0031 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #3 {all -> 0x0037, blocks: (B:30:0x00a1, B:19:0x0041, B:21:0x0049, B:24:0x005a, B:41:0x00b4, B:42:0x00b5, B:45:0x00c8, B:14:0x0031, B:39:0x00b2, B:38:0x00af, B:34:0x00a9), top: B:59:0x0031 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009a -> B:29:0x009f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            Throwable th;
            Object remaining;
            Closeable closeable;
            Object objAwaitAll;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!this.$this_split.isClosedForRead()) {
                }
            } else if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    remaining = obj;
                    closeable = (Closeable) remaining;
                    ByteReadPacket byteReadPacket = (ByteReadPacket) closeable;
                    List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$1(this.$first, byteReadPacket, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$2(this.$second, byteReadPacket, null), 3, null)});
                    this.L$0 = coroutineScope;
                    this.L$1 = closeable;
                    this.I$0 = 0;
                    this.label = 2;
                    objAwaitAll = AwaitKt.awaitAll(listListOf, this);
                    if (objAwaitAll != coroutine_suspended) {
                    }
                } finally {
                    try {
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable2 = (Closeable) this.L$1;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objAwaitAll = obj;
                    closeable2.close();
                    coroutineScope = coroutineScope2;
                    if (!this.$this_split.isClosedForRead()) {
                        try {
                            ByteReadChannel byteReadChannel = this.$this_split;
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 1;
                            remaining = byteReadChannel.readRemaining(4096L, this);
                            if (remaining == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ByteReadPacket byteReadPacket2 = (ByteReadPacket) closeable;
                            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$1(this.$first, byteReadPacket2, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ByteChannelsKt$split$1$1$2(this.$second, byteReadPacket2, null), 3, null)});
                            this.L$0 = coroutineScope;
                            this.L$1 = closeable;
                            this.I$0 = 0;
                            this.label = 2;
                            objAwaitAll = AwaitKt.awaitAll(listListOf2, this);
                            if (objAwaitAll != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope2 = coroutineScope;
                            closeable2 = closeable;
                            closeable2.close();
                            coroutineScope = coroutineScope2;
                            if (!this.$this_split.isClosedForRead()) {
                                Throwable closedCause = this.$this_split.getClosedCause();
                                if (closedCause != null) {
                                    throw closedCause;
                                }
                                return Unit.INSTANCE;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable2 = closeable;
                            try {
                                closeable2.close();
                                throw th;
                            } finally {
                                throw th;
                            }
                        }
                        closeable = (Closeable) remaining;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable2.close();
                    throw th;
                }
            }
        }
    }

    /* compiled from: ByteChannels.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", m7120f = "ByteChannels.kt", m7121i = {1, 1, 1, 2, 2}, m7122l = {59, 61, 62}, m7123m = "invokeSuspend", m7124n = {"$this$use$iv", "it", "closed$iv", "$this$use$iv", "closed$iv"}, m7125s = {"L$0", "L$4", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nByteChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$copyToBoth$1\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n8#2,4:91\n22#2,4:95\n12#2,9:99\n1#3:108\n*S KotlinDebug\n*F\n+ 1 ByteChannels.kt\nio/ktor/util/ByteChannelsKt$copyToBoth$1\n*L\n59#1:91,4\n59#1:95,4\n59#1:99,9\n*E\n"})
    /* renamed from: io.ktor.util.ByteChannelsKt$copyToBoth$1 */
    public static final class C103391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ ByteWriteChannel $first;
        public final /* synthetic */ ByteWriteChannel $second;
        public final /* synthetic */ ByteReadChannel $this_copyToBoth;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103391(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Continuation<? super C103391> continuation) {
            super(2, continuation);
            this.$this_copyToBoth = byteReadChannel;
            this.$first = byteWriteChannel;
            this.$second = byteWriteChannel2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C103391(this.$this_copyToBoth, this.$first, this.$second, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x005d, TryCatch #6 {all -> 0x005d, blocks: (B:44:0x00e1, B:24:0x0063, B:26:0x006b, B:28:0x0073, B:30:0x007b, B:33:0x0092, B:53:0x00f1, B:54:0x00f2, B:57:0x0105, B:19:0x0059, B:51:0x00ef, B:50:0x00ec, B:47:0x00e7, B:34:0x009b, B:43:0x00d4), top: B:76:0x0059, inners: #0, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0105 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x005d, blocks: (B:44:0x00e1, B:24:0x0063, B:26:0x006b, B:28:0x0073, B:30:0x007b, B:33:0x0092, B:53:0x00f1, B:54:0x00f2, B:57:0x0105, B:19:0x0059, B:51:0x00ef, B:50:0x00ec, B:47:0x00e7, B:34:0x009b, B:43:0x00d4), top: B:76:0x0059, inners: #0, #3 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ce -> B:41:0x00d1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th;
            Closeable closeable;
            ByteWriteChannel byteWriteChannel;
            ByteWriteChannel byteWriteChannel2;
            ByteReadChannel byteReadChannel;
            ByteReadPacket byteReadPacket;
            int i;
            ByteReadPacket byteReadPacketCopy;
            ByteReadPacket byteReadPacketCopy2;
            Throwable closedCause;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = this.$this_copyToBoth.getClosedCause();
                if (closedCause != null) {
                }
                return Unit.INSTANCE;
            }
            if (i2 == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                    closeable = (Closeable) obj;
                    byteWriteChannel = this.$first;
                    byteWriteChannel2 = this.$second;
                    byteReadChannel = this.$this_copyToBoth;
                    byteReadPacket = (ByteReadPacket) closeable;
                    byteReadPacketCopy2 = byteReadPacket.copy();
                    this.L$0 = closeable;
                    this.L$1 = byteWriteChannel;
                    this.L$2 = byteWriteChannel2;
                    this.L$3 = byteReadChannel;
                    this.L$4 = byteReadPacket;
                    i = 0;
                    this.I$0 = 0;
                    this.label = 2;
                    if (byteWriteChannel.writePacket(byteReadPacketCopy2, this) == coroutine_suspended) {
                    }
                    byteReadPacketCopy = byteReadPacket.copy();
                    this.L$0 = closeable;
                    this.L$1 = byteWriteChannel;
                    this.L$2 = byteWriteChannel2;
                    this.L$3 = byteReadChannel;
                    this.L$4 = null;
                    this.I$0 = i;
                    this.label = 3;
                    if (byteWriteChannel2.writePacket(byteReadPacketCopy, this) == coroutine_suspended) {
                    }
                    Unit unit = Unit.INSTANCE;
                    closeable.close();
                    if (this.$this_copyToBoth.isClosedForRead()) {
                    }
                    closedCause = this.$this_copyToBoth.getClosedCause();
                    if (closedCause != null) {
                    }
                } finally {
                    try {
                        return Unit.INSTANCE;
                    } finally {
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 == 2) {
                int i3 = this.I$0;
                ByteReadPacket byteReadPacket2 = (ByteReadPacket) this.L$4;
                ByteReadChannel byteReadChannel2 = (ByteReadChannel) this.L$3;
                ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) this.L$2;
                ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) this.L$1;
                Closeable closeable2 = (Closeable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    byteReadPacket = byteReadPacket2;
                    byteWriteChannel2 = byteWriteChannel3;
                    closeable = closeable2;
                    i = i3;
                    byteReadChannel = byteReadChannel2;
                    byteWriteChannel = byteWriteChannel4;
                } catch (Throwable th2) {
                    th = th2;
                    byteReadChannel = byteReadChannel2;
                    byteWriteChannel2 = byteWriteChannel3;
                    byteWriteChannel = byteWriteChannel4;
                    closeable = closeable2;
                    byteReadChannel.cancel(th);
                    byteWriteChannel.close(th);
                    Boxing.boxBoolean(byteWriteChannel2.close(th));
                    closeable.close();
                    if (this.$this_copyToBoth.isClosedForRead()) {
                    }
                    closedCause = this.$this_copyToBoth.getClosedCause();
                    if (closedCause != null) {
                    }
                    return Unit.INSTANCE;
                }
                byteReadPacketCopy = byteReadPacket.copy();
                this.L$0 = closeable;
                this.L$1 = byteWriteChannel;
                this.L$2 = byteWriteChannel2;
                this.L$3 = byteReadChannel;
                this.L$4 = null;
                this.I$0 = i;
                this.label = 3;
                if (byteWriteChannel2.writePacket(byteReadPacketCopy, this) == coroutine_suspended) {
                }
                Unit unit2 = Unit.INSTANCE;
                closeable.close();
                if (this.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = this.$this_copyToBoth.getClosedCause();
                if (closedCause != null) {
                }
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteReadChannel = (ByteReadChannel) this.L$3;
            byteWriteChannel2 = (ByteWriteChannel) this.L$2;
            byteWriteChannel = (ByteWriteChannel) this.L$1;
            closeable = (Closeable) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    byteReadChannel.cancel(th);
                    byteWriteChannel.close(th);
                    Boxing.boxBoolean(byteWriteChannel2.close(th));
                    closeable.close();
                    if (this.$this_copyToBoth.isClosedForRead()) {
                    }
                    closedCause = this.$this_copyToBoth.getClosedCause();
                    if (closedCause != null) {
                    }
                    return Unit.INSTANCE;
                } finally {
                }
            }
            Unit unit22 = Unit.INSTANCE;
            closeable.close();
            if (this.$this_copyToBoth.isClosedForRead() && (!this.$first.isClosedForWrite() || !this.$second.isClosedForWrite())) {
                ByteReadChannel byteReadChannel3 = this.$this_copyToBoth;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                obj = byteReadChannel3.readRemaining(4096L, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeable = (Closeable) obj;
                byteWriteChannel = this.$first;
                byteWriteChannel2 = this.$second;
                byteReadChannel = this.$this_copyToBoth;
                byteReadPacket = (ByteReadPacket) closeable;
                byteReadPacketCopy2 = byteReadPacket.copy();
                this.L$0 = closeable;
                this.L$1 = byteWriteChannel;
                this.L$2 = byteWriteChannel2;
                this.L$3 = byteReadChannel;
                this.L$4 = byteReadPacket;
                i = 0;
                this.I$0 = 0;
                this.label = 2;
                if (byteWriteChannel.writePacket(byteReadPacketCopy2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadPacketCopy = byteReadPacket.copy();
                this.L$0 = closeable;
                this.L$1 = byteWriteChannel;
                this.L$2 = byteWriteChannel2;
                this.L$3 = byteReadChannel;
                this.L$4 = null;
                this.I$0 = i;
                this.label = 3;
                if (byteWriteChannel2.writePacket(byteReadPacketCopy, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Unit unit222 = Unit.INSTANCE;
                closeable.close();
                if (this.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = this.$this_copyToBoth.getClosedCause();
                if (closedCause != null) {
                }
                return Unit.INSTANCE;
            }
            closedCause = this.$this_copyToBoth.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            return Unit.INSTANCE;
        }
    }

    public static final void copyToBoth(@NotNull ByteReadChannel byteReadChannel, @NotNull final ByteWriteChannel first, @NotNull final ByteWriteChannel second) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new C103391(byteReadChannel, first, second, null), 2, null).invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: io.ktor.util.ByteChannelsKt.copyToBoth.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th == null) {
                    return;
                }
                first.close(th);
                second.close(th);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toByteArray(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super byte[]> continuation) throws Throwable {
        C103431 c103431;
        if (continuation instanceof C103431) {
            c103431 = (C103431) continuation;
            int i = c103431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103431.label = i - Integer.MIN_VALUE;
            } else {
                c103431 = new C103431(continuation);
            }
        }
        C103431 c1034312 = c103431;
        Object remaining$default = c1034312.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1034312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            c1034312.label = 1;
            remaining$default = ByteReadChannel.DefaultImpls.readRemaining$default(byteReadChannel, 0L, c1034312, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(remaining$default);
        }
        return StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null);
    }
}
