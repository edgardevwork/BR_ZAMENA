package io.ktor.utils.p050io.jvm.javaio;

import io.ktor.utils.p050io.ByteReadChannel;
import io.ktor.utils.p050io.pool.ByteArrayPoolKt;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Writing.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m7105d2 = {"copyTo", "", "Lio/ktor/utils/io/ByteReadChannel;", "out", "Ljava/io/OutputStream;", "limit", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/io/OutputStream;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Writing.kt\nio/ktor/utils/io/jvm/javaio/WritingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes5.dex */
public final class WritingKt {

    /* compiled from: Writing.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "io.ktor.utils.io.jvm.javaio.WritingKt", m7120f = "Writing.kt", m7121i = {0, 0, 0, 0, 0, 0}, m7122l = {22}, m7123m = "copyTo", m7124n = {"$this$copyTo", "out", "buffer", "limit", "copied", "bufferSize"}, m7125s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1 */
    /* loaded from: classes6.dex */
    public static final class C105101 extends ContinuationImpl {
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C105101(Continuation<? super C105101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WritingKt.copyTo(null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b7  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0092 -> B:100:0x0096). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(@NotNull ByteReadChannel byteReadChannel, @NotNull OutputStream outputStream, long j, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C105101 c105101;
        long length;
        long j2;
        byte[] bArr;
        C105101 c1051012;
        long j3;
        ByteReadChannel byteReadChannel2;
        OutputStream outputStream2;
        if (continuation instanceof C105101) {
            c105101 = (C105101) continuation;
            int i = c105101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c105101.label = i - Integer.MIN_VALUE;
            } else {
                c105101 = new C105101(continuation);
            }
        }
        Object obj = c105101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = c105101.label;
        try {
            if (r5 == 0) {
                ResultKt.throwOnFailure(obj);
                if (j < 0) {
                    throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                }
                byte[] bArrBorrow = ByteArrayPoolKt.getByteArrayPool().borrow();
                length = bArrBorrow.length;
                j2 = 0;
                bArr = bArrBorrow;
                c1051012 = c105101;
                j3 = j;
                byteReadChannel2 = byteReadChannel;
                outputStream2 = outputStream;
                if (j2 >= j3) {
                }
            } else {
                if (r5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = c105101.J$2;
                long j5 = c105101.J$1;
                long j6 = c105101.J$0;
                byte[] bArr2 = (byte[]) c105101.L$2;
                OutputStream outputStream3 = (OutputStream) c105101.L$1;
                ByteReadChannel byteReadChannel3 = (ByteReadChannel) c105101.L$0;
                ResultKt.throwOnFailure(obj);
                long j7 = j5;
                bArr = bArr2;
                c1051012 = c105101;
                outputStream2 = outputStream3;
                byteReadChannel2 = byteReadChannel3;
                long j8 = j4;
                try {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == -1) {
                        r5 = bArr;
                        j2 = j7;
                        Long lBoxLong = Boxing.boxLong(j2);
                        ByteArrayPoolKt.getByteArrayPool().recycle(r5);
                        return lBoxLong;
                    }
                    if (iIntValue > 0) {
                        outputStream2.write(bArr, 0, iIntValue);
                        long j9 = j6;
                        length = j8;
                        j2 = iIntValue + j7;
                        j3 = j9;
                    } else {
                        j3 = j6;
                        length = j8;
                        j2 = j7;
                    }
                    if (j2 >= j3) {
                        int iMin = (int) Math.min(j3 - j2, length);
                        c1051012.L$0 = byteReadChannel2;
                        c1051012.L$1 = outputStream2;
                        c1051012.L$2 = bArr;
                        c1051012.J$0 = j3;
                        c1051012.J$1 = j2;
                        c1051012.J$2 = length;
                        c1051012.label = 1;
                        Object available = byteReadChannel2.readAvailable(bArr, 0, iMin, c1051012);
                        if (available == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j7 = j2;
                        j8 = length;
                        j6 = j3;
                        obj = available;
                        int iIntValue2 = ((Number) obj).intValue();
                        if (iIntValue2 == -1) {
                        }
                    } else {
                        r5 = bArr;
                        Long lBoxLong2 = Boxing.boxLong(j2);
                        ByteArrayPoolKt.getByteArrayPool().recycle(r5);
                        return lBoxLong2;
                    }
                } catch (Throwable th) {
                    th = th;
                    r5 = bArr;
                    ByteArrayPoolKt.getByteArrayPool().recycle(r5);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, OutputStream outputStream, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, outputStream, j, continuation);
    }
}
