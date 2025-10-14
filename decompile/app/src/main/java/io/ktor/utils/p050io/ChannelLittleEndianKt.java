package io.ktor.utils.p050io;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.utils.p050io.core.ByteOrder;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelLittleEndian.kt */
@Metadata(m7104d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\r\u001a\u00020\f*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a<\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\u0002H\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00150\u0017¢\u0006\u0002\b\u0018H\u0081\bø\u0001\u0001¢\u0006\u0002\u0010\u0019\u001a<\u0010\u001a\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\u00020\u00022\u0006\u0010\u001b\u001a\u0002H\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00150\u0017¢\u0006\u0002\b\u0018H\u0081\bø\u0001\u0001¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001a\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\u00020\u001d2\u0006\u0010\u001b\u001a\u0002H\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00150\u0017¢\u0006\u0002\b\u0018H\u0082\b¢\u0006\u0002\u0010\u001e\u001a%\u0010\u001f\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%\u001a\u001d\u0010&\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010'\u001a%\u0010(\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)\u001a\u001d\u0010*\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010+\u001a%\u0010,\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-\u001a\u001d\u0010.\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010/\u001a%\u00100\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u00101\u001a\u001d\u00102\u001a\u00020 *\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u00103\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00064"}, m7105d2 = {"readDouble", "", "Lio/ktor/utils/io/ByteReadChannel;", "byteOrder", "Lio/ktor/utils/io/core/ByteOrder;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDoubleLittleEndian", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFloat", "", "readFloatLittleEndian", "readInt", "", "readIntLittleEndian", "readLong", "", "readLongLittleEndian", "readShort", "", "readShortLittleEndian", "reverseIfNeeded", ExifInterface.GPS_DIRECTION_TRUE, "reverseBlock", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lio/ktor/utils/io/core/ByteOrder;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toLittleEndian", "value", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeDouble", "", "(Lio/ktor/utils/io/ByteWriteChannel;DLio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeDoubleLittleEndian", "(Lio/ktor/utils/io/ByteWriteChannel;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFloat", "(Lio/ktor/utils/io/ByteWriteChannel;FLio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeFloatLittleEndian", "(Lio/ktor/utils/io/ByteWriteChannel;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeInt", "(Lio/ktor/utils/io/ByteWriteChannel;ILio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeIntLittleEndian", "(Lio/ktor/utils/io/ByteWriteChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLong", "(Lio/ktor/utils/io/ByteWriteChannel;JLio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeLongLittleEndian", "(Lio/ktor/utils/io/ByteWriteChannel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeShort", "(Lio/ktor/utils/io/ByteWriteChannel;SLio/ktor/utils/io/core/ByteOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeShortLittleEndian", "(Lio/ktor/utils/io/ByteWriteChannel;SLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt\n+ 2 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,98:1\n93#1,3:99\n93#1,3:103\n93#1,3:107\n93#1,3:111\n93#1,3:121\n87#1:131\n87#1:133\n87#1:135\n87#1:137\n87#1:145\n93#1,3:153\n93#1,3:157\n93#1,3:161\n93#1,3:165\n93#1,3:175\n89#1:185\n89#1:187\n89#1:189\n89#1:191\n89#1:199\n9#2:102\n15#2:106\n21#2:110\n30#2:114\n29#2:115\n28#2,5:116\n41#2:124\n40#2:125\n39#2,5:126\n9#2:132\n15#2:134\n21#2:136\n30#2:138\n29#2:139\n28#2,5:140\n41#2:146\n40#2:147\n39#2,5:148\n9#2:156\n15#2:160\n21#2:164\n30#2:168\n29#2:169\n28#2,5:170\n41#2:178\n40#2:179\n39#2,5:180\n9#2:186\n15#2:188\n21#2:190\n30#2:192\n29#2:193\n28#2,5:194\n41#2:200\n40#2:201\n39#2,5:202\n*S KotlinDebug\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt\n*L\n7#1:99,3\n11#1:103,3\n15#1:107,3\n19#1:111,3\n23#1:121,3\n27#1:131\n31#1:133\n35#1:135\n39#1:137\n43#1:145\n47#1:153,3\n51#1:157,3\n55#1:161,3\n59#1:165,3\n63#1:175,3\n67#1:185\n71#1:187\n75#1:189\n79#1:191\n83#1:199\n7#1:102\n11#1:106\n15#1:110\n19#1:114\n19#1:115\n19#1:116,5\n23#1:124\n23#1:125\n23#1:126,5\n27#1:132\n31#1:134\n35#1:136\n39#1:138\n39#1:139\n39#1:140,5\n43#1:146\n43#1:147\n43#1:148,5\n47#1:156\n51#1:160\n55#1:164\n59#1:168\n59#1:169\n59#1:170,5\n63#1:178\n63#1:179\n63#1:180,5\n67#1:186\n71#1:188\n75#1:190\n79#1:192\n79#1:193\n79#1:194,5\n83#1:200\n83#1:201\n83#1:202,5\n*E\n"})
/* loaded from: classes8.dex */
public final class ChannelLittleEndianKt {

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ByteOrder.values().length];
            try {
                iArr[ByteOrder.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {0}, m7122l = {23}, m7123m = "readDouble", m7124n = {"byteOrder"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readDouble$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readDouble$1 */
    /* loaded from: classes7.dex */
    public static final class C104731 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104731(Continuation<? super C104731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readDouble(null, null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {}, m7122l = {43}, m7123m = "readDoubleLittleEndian", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readDoubleLittleEndian$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readDoubleLittleEndian$1 */
    /* loaded from: classes7.dex */
    public static final class C104741 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C104741(Continuation<? super C104741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readDoubleLittleEndian(null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {0}, m7122l = {19}, m7123m = "readFloat", m7124n = {"byteOrder"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readFloat$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readFloat$1 */
    /* loaded from: classes7.dex */
    public static final class C104751 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104751(Continuation<? super C104751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readFloat(null, null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {}, m7122l = {39}, m7123m = "readFloatLittleEndian", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readFloatLittleEndian$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readFloatLittleEndian$1 */
    /* loaded from: classes7.dex */
    public static final class C104761 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C104761(Continuation<? super C104761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readFloatLittleEndian(null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {0}, m7122l = {11}, m7123m = "readInt", m7124n = {"byteOrder"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readInt$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readInt$1 */
    /* loaded from: classes7.dex */
    public static final class C104771 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104771(Continuation<? super C104771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readInt(null, null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {}, m7122l = {31}, m7123m = "readIntLittleEndian", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readIntLittleEndian$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readIntLittleEndian$1 */
    /* loaded from: classes7.dex */
    public static final class C104781 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C104781(Continuation<? super C104781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readIntLittleEndian(null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {0}, m7122l = {15}, m7123m = "readLong", m7124n = {"byteOrder"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readLong$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readLong$1 */
    /* loaded from: classes7.dex */
    public static final class C104791 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104791(Continuation<? super C104791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readLong(null, null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {}, m7122l = {35}, m7123m = "readLongLittleEndian", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readLongLittleEndian$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readLongLittleEndian$1 */
    /* loaded from: classes7.dex */
    public static final class C104801 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C104801(Continuation<? super C104801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readLongLittleEndian(null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {0}, m7122l = {7}, m7123m = "readShort", m7124n = {"byteOrder"}, m7125s = {"L$0"})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readShort$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readShort$1 */
    /* loaded from: classes7.dex */
    public static final class C104811 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C104811(Continuation<? super C104811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readShort(null, null, this);
        }
    }

    /* compiled from: ChannelLittleEndian.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 176)
    @DebugMetadata(m7119c = "io.ktor.utils.io.ChannelLittleEndianKt", m7120f = "ChannelLittleEndian.kt", m7121i = {}, m7122l = {27}, m7123m = "readShortLittleEndian", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nChannelLittleEndian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelLittleEndian.kt\nio/ktor/utils/io/ChannelLittleEndianKt$readShortLittleEndian$1\n*L\n1#1,98:1\n*E\n"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readShortLittleEndian$1 */
    /* loaded from: classes7.dex */
    public static final class C104821 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C104821(Continuation<? super C104821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readShortLittleEndian(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readShort(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Short> continuation) throws Throwable {
        C104811 c104811;
        if (continuation instanceof C104811) {
            c104811 = (C104811) continuation;
            int i = c104811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104811.label = i - Integer.MIN_VALUE;
            } else {
                c104811 = new C104811(continuation);
            }
        }
        Object obj = c104811.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104811.L$0 = byteOrder;
            c104811.label = 1;
            obj = byteReadChannel.readShort(c104811);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteOrder = (ByteOrder) c104811.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Boxing.boxShort(Short.reverseBytes(((Number) obj).shortValue()));
    }

    public static final Object readShort$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, Continuation<? super Short> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readShort(continuation);
        InlineMarker.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Short.valueOf(Short.reverseBytes(((Number) obj).shortValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readInt(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        C104771 c104771;
        if (continuation instanceof C104771) {
            c104771 = (C104771) continuation;
            int i = c104771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104771.label = i - Integer.MIN_VALUE;
            } else {
                c104771 = new C104771(continuation);
            }
        }
        Object obj = c104771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104771.L$0 = byteOrder;
            c104771.label = 1;
            obj = byteReadChannel.readInt(c104771);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteOrder = (ByteOrder) c104771.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Boxing.boxInt(Integer.reverseBytes(((Number) obj).intValue()));
    }

    public static final Object readInt$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, Continuation<? super Integer> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readInt(continuation);
        InlineMarker.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Integer.valueOf(Integer.reverseBytes(((Number) obj).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readLong(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C104791 c104791;
        if (continuation instanceof C104791) {
            c104791 = (C104791) continuation;
            int i = c104791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104791.label = i - Integer.MIN_VALUE;
            } else {
                c104791 = new C104791(continuation);
            }
        }
        Object obj = c104791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104791.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104791.L$0 = byteOrder;
            c104791.label = 1;
            obj = byteReadChannel.readLong(c104791);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteOrder = (ByteOrder) c104791.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Boxing.boxLong(Long.reverseBytes(((Number) obj).longValue()));
    }

    public static final Object readLong$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, Continuation<? super Long> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readLong(continuation);
        InlineMarker.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Long.valueOf(Long.reverseBytes(((Number) obj).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFloat(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Float> continuation) throws Throwable {
        C104751 c104751;
        if (continuation instanceof C104751) {
            c104751 = (C104751) continuation;
            int i = c104751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104751.label = i - Integer.MIN_VALUE;
            } else {
                c104751 = new C104751(continuation);
            }
        }
        Object obj = c104751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104751.L$0 = byteOrder;
            c104751.label = 1;
            obj = byteReadChannel.readFloat(c104751);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteOrder = (ByteOrder) c104751.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Boxing.boxFloat(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    public static final Object readFloat$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, Continuation<? super Float> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readFloat(continuation);
        InlineMarker.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Float.valueOf(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readDouble(@NotNull ByteReadChannel byteReadChannel, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Double> continuation) throws Throwable {
        C104731 c104731;
        if (continuation instanceof C104731) {
            c104731 = (C104731) continuation;
            int i = c104731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104731.label = i - Integer.MIN_VALUE;
            } else {
                c104731 = new C104731(continuation);
            }
        }
        Object obj = c104731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104731.L$0 = byteOrder;
            c104731.label = 1;
            obj = byteReadChannel.readDouble(c104731);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteOrder = (ByteOrder) c104731.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Boxing.boxDouble(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    public static final Object readDouble$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, Continuation<? super Double> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readDouble(continuation);
        InlineMarker.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Double.valueOf(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readShortLittleEndian(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Short> continuation) throws Throwable {
        C104821 c104821;
        if (continuation instanceof C104821) {
            c104821 = (C104821) continuation;
            int i = c104821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104821.label = i - Integer.MIN_VALUE;
            } else {
                c104821 = new C104821(continuation);
            }
        }
        Object obj = c104821.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104821.label = 1;
            obj = byteReadChannel.readShort(c104821);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxShort(Short.reverseBytes(((Number) obj).shortValue()));
    }

    public static final Object readShortLittleEndian$$forInline(ByteReadChannel byteReadChannel, Continuation<? super Short> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readShort(continuation);
        InlineMarker.mark(1);
        return Short.valueOf(Short.reverseBytes(((Number) obj).shortValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readIntLittleEndian(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Integer> continuation) throws Throwable {
        C104781 c104781;
        if (continuation instanceof C104781) {
            c104781 = (C104781) continuation;
            int i = c104781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104781.label = i - Integer.MIN_VALUE;
            } else {
                c104781 = new C104781(continuation);
            }
        }
        Object obj = c104781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104781.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104781.label = 1;
            obj = byteReadChannel.readInt(c104781);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(Integer.reverseBytes(((Number) obj).intValue()));
    }

    public static final Object readIntLittleEndian$$forInline(ByteReadChannel byteReadChannel, Continuation<? super Integer> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readInt(continuation);
        InlineMarker.mark(1);
        return Integer.valueOf(Integer.reverseBytes(((Number) obj).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readLongLittleEndian(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Long> continuation) throws Throwable {
        C104801 c104801;
        if (continuation instanceof C104801) {
            c104801 = (C104801) continuation;
            int i = c104801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104801.label = i - Integer.MIN_VALUE;
            } else {
                c104801 = new C104801(continuation);
            }
        }
        Object obj = c104801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104801.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104801.label = 1;
            obj = byteReadChannel.readLong(c104801);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxLong(Long.reverseBytes(((Number) obj).longValue()));
    }

    public static final Object readLongLittleEndian$$forInline(ByteReadChannel byteReadChannel, Continuation<? super Long> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readLong(continuation);
        InlineMarker.mark(1);
        return Long.valueOf(Long.reverseBytes(((Number) obj).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readFloatLittleEndian(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Float> continuation) throws Throwable {
        C104761 c104761;
        if (continuation instanceof C104761) {
            c104761 = (C104761) continuation;
            int i = c104761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104761.label = i - Integer.MIN_VALUE;
            } else {
                c104761 = new C104761(continuation);
            }
        }
        Object obj = c104761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104761.label = 1;
            obj = byteReadChannel.readFloat(c104761);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxFloat(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    public static final Object readFloatLittleEndian$$forInline(ByteReadChannel byteReadChannel, Continuation<? super Float> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readFloat(continuation);
        InlineMarker.mark(1);
        return Float.valueOf(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readDoubleLittleEndian(@NotNull ByteReadChannel byteReadChannel, @NotNull Continuation<? super Double> continuation) throws Throwable {
        C104741 c104741;
        if (continuation instanceof C104741) {
            c104741 = (C104741) continuation;
            int i = c104741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c104741.label = i - Integer.MIN_VALUE;
            } else {
                c104741 = new C104741(continuation);
            }
        }
        Object obj = c104741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c104741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c104741.label = 1;
            obj = byteReadChannel.readDouble(c104741);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxDouble(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    public static final Object readDoubleLittleEndian$$forInline(ByteReadChannel byteReadChannel, Continuation<? super Double> continuation) {
        InlineMarker.mark(0);
        Object obj = byteReadChannel.readDouble(continuation);
        InlineMarker.mark(1);
        return Double.valueOf(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    @PublishedApi
    public static final <T> T toLittleEndian(@NotNull ByteReadChannel byteReadChannel, T t, @NotNull Function1<? super T, ? extends T> reverseBlock) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(reverseBlock, "reverseBlock");
        return reverseBlock.invoke(t);
    }

    public static final <T> T toLittleEndian(ByteWriteChannel byteWriteChannel, T t, Function1<? super T, ? extends T> function1) {
        return function1.invoke(t);
    }

    @PublishedApi
    public static final <T> T reverseIfNeeded(T t, @NotNull ByteOrder byteOrder, @NotNull Function1<? super T, ? extends T> reverseBlock) {
        Intrinsics.checkNotNullParameter(byteOrder, "byteOrder");
        Intrinsics.checkNotNullParameter(reverseBlock, "reverseBlock");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? t : reverseBlock.invoke(t);
    }

    @Nullable
    public static final Object writeShort(@NotNull ByteWriteChannel byteWriteChannel, short s, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            s = Short.reverseBytes(s);
        }
        Object objWriteShort = byteWriteChannel.writeShort(s, continuation);
        return objWriteShort == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteShort : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeInt(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            i = Integer.reverseBytes(i);
        }
        Object objWriteInt = byteWriteChannel.writeInt(i, continuation);
        return objWriteInt == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteInt : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeLong(@NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            j = Long.reverseBytes(j);
        }
        Object objWriteLong = byteWriteChannel.writeLong(j, continuation);
        return objWriteLong == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteLong : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeFloat(@NotNull ByteWriteChannel byteWriteChannel, float f, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            f = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f)));
        }
        Object objWriteFloat = byteWriteChannel.writeFloat(f, continuation);
        return objWriteFloat == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFloat : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeDouble(@NotNull ByteWriteChannel byteWriteChannel, double d, @NotNull ByteOrder byteOrder, @NotNull Continuation<? super Unit> continuation) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            d = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d)));
        }
        Object objWriteDouble = byteWriteChannel.writeDouble(d, continuation);
        return objWriteDouble == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteDouble : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeShortLittleEndian(@NotNull ByteWriteChannel byteWriteChannel, short s, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteShort = byteWriteChannel.writeShort(Short.reverseBytes(s), continuation);
        return objWriteShort == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteShort : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeIntLittleEndian(@NotNull ByteWriteChannel byteWriteChannel, int i, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteInt = byteWriteChannel.writeInt(Integer.reverseBytes(i), continuation);
        return objWriteInt == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteInt : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeLongLittleEndian(@NotNull ByteWriteChannel byteWriteChannel, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteLong = byteWriteChannel.writeLong(Long.reverseBytes(j), continuation);
        return objWriteLong == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteLong : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeFloatLittleEndian(@NotNull ByteWriteChannel byteWriteChannel, float f, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteFloat = byteWriteChannel.writeFloat(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f))), continuation);
        return objWriteFloat == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteFloat : Unit.INSTANCE;
    }

    @Nullable
    public static final Object writeDoubleLittleEndian(@NotNull ByteWriteChannel byteWriteChannel, double d, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteDouble = byteWriteChannel.writeDouble(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d))), continuation);
        return objWriteDouble == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteDouble : Unit.INSTANCE;
    }
}
