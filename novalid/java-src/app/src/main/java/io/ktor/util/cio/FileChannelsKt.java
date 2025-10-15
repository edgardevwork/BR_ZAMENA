package io.ktor.util.cio;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.ByteWriteChannel;
import io.ktor.utils.p050io.CoroutinesKt;
import io.ktor.utils.p050io.ReaderScope;
import io.ktor.utils.p050io.WriterScope;
import io.ktor.utils.p050io.core.CloseableJVMKt;
import io.ktor.utils.p050io.jvm.nio.WritingKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileChannels.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, m7105d2 = {"readChannel", "Lio/ktor/utils/io/ByteReadChannel;", "Ljava/io/File;", TtmlNode.START, "", "endInclusive", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "writeChannel", "Lio/ktor/utils/io/ByteWriteChannel;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class FileChannelsKt {
    public static /* synthetic */ ByteReadChannel readChannel$default(File file, long j, long j2, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return readChannel(file, j3, j4, coroutineContext);
    }

    /* compiled from: FileChannels.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.cio.FileChannelsKt$readChannel$1", m7120f = "FileChannels.kt", m7121i = {0, 0, 1, 1}, m7122l = {44, 63}, m7123m = "invokeSuspend", m7124n = {"$this$use$iv", "closed$iv", "$this$use$iv", "closed$iv"}, m7125s = {"L$0", "I$0", "L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$readChannel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,100:1\n1#2:101\n8#3,4:102\n22#3,4:106\n12#3,9:110\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$readChannel$1\n*L\n36#1:102,4\n36#1:106,4\n36#1:110,9\n*E\n"})
    /* renamed from: io.ktor.util.cio.FileChannelsKt$readChannel$1 */
    public static final class C103651 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ long $endInclusive;
        public final /* synthetic */ long $fileLength;
        public final /* synthetic */ long $start;
        public final /* synthetic */ File $this_readChannel;
        public int I$0;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103651(long j, long j2, long j3, File file, Continuation<? super C103651> continuation) {
            super(2, continuation);
            this.$start = j;
            this.$endInclusive = j2;
            this.$fileLength = j3;
            this.$this_readChannel = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103651 c103651 = new C103651(this.$start, this.$endInclusive, this.$fileLength, this.$this_readChannel, continuation);
            c103651.L$0 = obj;
            return c103651;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriterScope writerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103651) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Closeable closeable;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                long j = this.$start;
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(("start position shouldn't be negative but it is " + j).toString());
                }
                long j2 = this.$endInclusive;
                long j3 = this.$fileLength;
                if (!(j2 <= j3 - 1)) {
                    throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j3 + ", endInclusive = " + j2).toString());
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.$this_readChannel, "r");
                long j4 = this.$start;
                final long j5 = this.$endInclusive;
                try {
                    final FileChannel channel = randomAccessFile.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel, "file.channel");
                    if (j4 > 0) {
                        channel.position(j4);
                    }
                    if (j5 == -1) {
                        ByteWriteChannel channel2 = writerScope.getChannel();
                        FileChannelsKt$readChannel$1$3$1 fileChannelsKt$readChannel$1$3$1 = new FileChannelsKt$readChannel$1$3$1(writerScope, channel, null);
                        this.L$0 = randomAccessFile;
                        this.I$0 = 0;
                        this.label = 1;
                        if (channel2.writeSuspendSession(fileChannelsKt$readChannel$1$3$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        final Ref.LongRef longRef = new Ref.LongRef();
                        longRef.element = j4;
                        ByteWriteChannel channel3 = writerScope.getChannel();
                        Function1<ByteBuffer, Boolean> function1 = new Function1<ByteBuffer, Boolean>() { // from class: io.ktor.util.cio.FileChannelsKt$readChannel$1$3$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull ByteBuffer buffer) throws IOException {
                                int i2;
                                Intrinsics.checkNotNullParameter(buffer, "buffer");
                                long j6 = (j5 - longRef.element) + 1;
                                if (j6 < buffer.remaining()) {
                                    int iLimit = buffer.limit();
                                    buffer.limit(buffer.position() + ((int) j6));
                                    i2 = channel.read(buffer);
                                    buffer.limit(iLimit);
                                } else {
                                    i2 = channel.read(buffer);
                                }
                                if (i2 > 0) {
                                    longRef.element += i2;
                                }
                                return Boolean.valueOf(i2 != -1 && longRef.element <= j5);
                            }
                        };
                        this.L$0 = randomAccessFile;
                        this.I$0 = 0;
                        this.label = 2;
                        if (channel3.writeWhile(function1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    closeable = randomAccessFile;
                } catch (Throwable th) {
                    th = th;
                    closeable = randomAccessFile;
                    closeable.close();
                    throw th;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        closeable.close();
                    } catch (Throwable th3) {
                        CloseableJVMKt.addSuppressedInternal(th, th3);
                    }
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            closeable.close();
            return unit;
        }
    }

    @NotNull
    public static final ByteReadChannel readChannel(@NotNull File file, long j, long j2, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.writer(CoroutineScopeKt.CoroutineScope(coroutineContext), new CoroutineName("file-reader").plus(coroutineContext), false, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new C103651(j, j2, file.length(), file, null)).getChannel();
    }

    /* compiled from: FileChannels.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", m7120f = "FileChannels.kt", m7121i = {0, 0, 0}, m7122l = {96}, m7123m = "invokeSuspend", m7124n = {"$this$use$iv", PomReader.PomProfileElement.FILE, "closed$iv"}, m7125s = {"L$0", "L$1", "I$0"})
    @SourceDebugExtension({"SMAP\nFileChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$writeChannel$1\n+ 2 Closeable.kt\nio/ktor/utils/io/core/CloseableKt\n*L\n1#1,100:1\n8#2,4:101\n22#2,4:105\n12#2,9:109\n*S KotlinDebug\n*F\n+ 1 FileChannels.kt\nio/ktor/util/cio/FileChannelsKt$writeChannel$1\n*L\n95#1:101,4\n95#1:105,4\n95#1:109,9\n*E\n"})
    /* renamed from: io.ktor.util.cio.FileChannelsKt$writeChannel$1 */
    public static final class C103661 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ File $this_writeChannel;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103661(File file, Continuation<? super C103661> continuation) {
            super(2, continuation);
            this.$this_writeChannel = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C103661 c103661 = new C103661(this.$this_writeChannel, continuation);
            c103661.L$0 = obj;
            return c103661;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ReaderScope readerScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C103661) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            RandomAccessFile randomAccessFile;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ReaderScope readerScope = (ReaderScope) this.L$0;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.$this_writeChannel, "rw");
                    ByteReadChannel channel = readerScope.getChannel();
                    FileChannel channel2 = randomAccessFile2.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel2, "file.channel");
                    this.L$0 = randomAccessFile2;
                    this.L$1 = randomAccessFile2;
                    this.I$0 = 0;
                    this.label = 1;
                    obj = WritingKt.copyTo$default(channel, channel2, 0L, this, 2, (Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    randomAccessFile = randomAccessFile2;
                    r1 = randomAccessFile2;
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    randomAccessFile = (RandomAccessFile) this.L$1;
                    Closeable closeable = (Closeable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r1 = closeable;
                }
                randomAccessFile.setLength(((Number) obj).longValue());
                Unit unit = Unit.INSTANCE;
                r1.close();
                return unit;
            } catch (Throwable th) {
                try {
                    r1.close();
                } catch (Throwable th2) {
                    CloseableJVMKt.addSuppressedInternal(th, th2);
                }
                throw th;
            }
        }
    }

    public static /* synthetic */ ByteWriteChannel writeChannel$default(File file, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return writeChannel(file, coroutineContext);
    }

    @NotNull
    public static final ByteWriteChannel writeChannel(@NotNull File file, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.reader((CoroutineScope) GlobalScope.INSTANCE, new CoroutineName("file-writer").plus(coroutineContext), true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new C103661(file, null)).getChannel();
    }
}
