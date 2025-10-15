package io.ktor.utils.p050io.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p050io.bits.Memory;
import io.ktor.utils.p050io.core.internal.ChunkBuffer;
import io.ktor.utils.p050io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Output.kt */
@Metadata(m7104d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0013\n\u0002\u0010\u0014\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a*\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00192\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001a2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001c2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001d2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a&\u0010\u0010\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u001e2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u001a[\u0010\u001f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072<\u0010 \u001a8\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0!H\u0082\b\u001a\u0082\u0001\u0010\u001f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010&\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2`\u0010 \u001a\\\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b()\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0'H\u0082\bø\u0001\u0001\u001ac\u0010*\u001a\u00020\u000b*\u00020\u00032\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072<\u0010 \u001a8\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0!H\u0082\b\u001a$\u0010,\u001a\u00020\u000b*\u00020\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020.0-H\u0080\bø\u0001\u0002\u001a.\u0010/\u001a\u00020\u000b*\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00072\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070-H\u0080\bø\u0001\u0002\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00061"}, m7105d2 = {"append", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lio/ktor/utils/io/core/Output;", "csq", "", TtmlNode.START, "", "end", "", "fill", "", ScriptTagPayloadReader.KEY_TIMES, "", "value", "", "writeFully", "src", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, CacheFileMetadataIndex.COLUMN_LENGTH, "writeFully-UAd2zVI", "(Lio/ktor/utils/io/core/Output;Ljava/nio/ByteBuffer;II)V", "(Lio/ktor/utils/io/core/Output;Ljava/nio/ByteBuffer;JJ)V", "Lio/ktor/utils/io/core/Buffer;", "", "", "", "", "", "", "writeFullyBytesTemplate", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "currentOffset", CatchStreamerKeys.COUNT_KEY, "initialOffset", "Lkotlin/Function4;", FirebaseAnalytics.Param.DESTINATION, "destinationOffset", "writeFullyTemplate", "componentSize", "writeWhile", "Lkotlin/Function1;", "", "writeWhileSize", "initialSize", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOutput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Output.kt\nio/ktor/utils/io/core/OutputKt\n+ 2 Buffer.kt\nio/ktor/utils/io/core/Buffer\n*L\n1#1,576:1\n527#1,4:577\n488#1,4:581\n531#1:585\n532#1,4:587\n492#1,6:591\n537#1:597\n565#1,4:598\n507#1,6:602\n569#1:608\n570#1,4:610\n513#1,7:614\n575#1:621\n565#1,4:622\n507#1,6:626\n569#1:632\n570#1,4:634\n513#1,7:638\n575#1:645\n565#1,4:646\n507#1,6:650\n569#1:656\n570#1,4:658\n513#1,7:662\n575#1:669\n565#1,4:670\n507#1,6:674\n569#1:680\n570#1,4:682\n513#1,7:686\n575#1:693\n565#1,4:694\n507#1,6:698\n569#1:704\n570#1,4:706\n513#1,7:710\n575#1:717\n527#1,4:718\n488#1,4:722\n531#1:726\n532#1,4:728\n492#1,6:732\n537#1:738\n545#1,4:740\n488#1,4:744\n549#1:748\n550#1,5:750\n492#1,6:755\n556#1:761\n488#1,4:762\n492#1,6:767\n488#1,4:773\n492#1,6:778\n488#1,4:784\n492#1,6:789\n507#1,6:795\n513#1,7:802\n74#2:586\n74#2:609\n74#2:633\n74#2:657\n74#2:681\n74#2:705\n74#2:727\n69#2:739\n74#2:749\n74#2:766\n74#2:777\n74#2:788\n74#2:801\n*S KotlinDebug\n*F\n+ 1 Output.kt\nio/ktor/utils/io/core/OutputKt\n*L\n411#1:577,4\n411#1:581,4\n411#1:585\n411#1:587,4\n411#1:591,6\n411#1:597\n418#1:598,4\n418#1:602,6\n418#1:608\n418#1:610,4\n418#1:614,7\n418#1:621\n425#1:622,4\n425#1:626,6\n425#1:632\n425#1:634,4\n425#1:638,7\n425#1:645\n432#1:646,4\n432#1:650,6\n432#1:656\n432#1:658,4\n432#1:662,7\n432#1:669\n439#1:670,4\n439#1:674,6\n439#1:680\n439#1:682,4\n439#1:686,7\n439#1:693\n446#1:694,4\n446#1:698,6\n446#1:704\n446#1:706,4\n446#1:710,7\n446#1:717\n453#1:718,4\n453#1:722,4\n453#1:726\n453#1:728,4\n453#1:732,6\n453#1:738\n465#1:740,4\n465#1:744,4\n465#1:748\n465#1:750,5\n465#1:755,6\n465#1:761\n473#1:762,4\n473#1:767,6\n530#1:773,4\n530#1:778,6\n548#1:784,4\n548#1:789,6\n568#1:795,6\n568#1:802,7\n411#1:586\n418#1:609\n425#1:633\n432#1:657\n439#1:681\n446#1:705\n453#1:727\n452#1:739\n465#1:749\n474#1:766\n531#1:777\n549#1:788\n569#1:801\n*E\n"})
/* loaded from: classes5.dex */
public final class OutputKt {
    public static /* synthetic */ Appendable append$default(Output output, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return append(output, charSequence, i, i2);
    }

    @NotNull
    public static final Appendable append(@NotNull Output output, @NotNull CharSequence csq, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(csq, "csq");
        return output.append(csq, i, i2);
    }

    public static /* synthetic */ Appendable append$default(Output output, char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return append(output, cArr, i, i2);
    }

    @NotNull
    public static final Appendable append(@NotNull Output output, @NotNull char[] csq, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(csq, "csq");
        return output.append(csq, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        writeFully(output, bArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length - i;
        }
        writeFully(output, sArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = iArr.length - i;
        }
        writeFully(output, iArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length - i;
        }
        writeFully(output, jArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length - i;
        }
        writeFully(output, fArr, i, i2);
    }

    public static /* synthetic */ void writeFully$default(Output output, double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length - i;
        }
        writeFully(output, dArr, i, i2);
    }

    /* renamed from: writeFully-UAd2zVI */
    public static final void m15639writeFullyUAd2zVI(@NotNull Output writeFully, @NotNull ByteBuffer src, int i, int i2) {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(src, "src");
        m15640writeFullyUAd2zVI(writeFully, src, i, i2);
    }

    public static /* synthetic */ void fill$default(Output output, long j, byte b, int i, Object obj) {
        if ((i & 2) != 0) {
            b = 0;
        }
        fill(output, j, b);
    }

    public static final void writeWhile(@NotNull Output output, @NotNull Function1<? super Buffer, Boolean> block) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (block.invoke(chunkBufferPrepareWriteHead).booleanValue()) {
            try {
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }

    public static /* synthetic */ void writeWhileSize$default(Output output, int i, Function1 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i, null);
        while (true) {
            try {
                int iIntValue = ((Number) block.invoke(chunkBufferPrepareWriteHead)).intValue();
                if (iIntValue <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, iIntValue, chunkBufferPrepareWriteHead);
                }
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }

    public static final void writeWhileSize(@NotNull Output output, int i, @NotNull Function1<? super Buffer, Integer> block) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i, null);
        while (true) {
            try {
                int iIntValue = block.invoke(chunkBufferPrepareWriteHead).intValue();
                if (iIntValue <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, iIntValue, chunkBufferPrepareWriteHead);
                }
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull byte[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                if (i2 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull short[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 2, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                int i3 = i2 * 2;
                if (i3 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull int[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                int i3 = i2 * 4;
                if (i3 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull long[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                int i3 = i2 * 8;
                if (i3 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull float[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 4, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully((Buffer) chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                int i3 = i2 * 4;
                if (i3 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull double[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 8, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully(chunkBufferPrepareWriteHead, src, i, iMin);
                i += iMin;
                i2 -= iMin;
                int i3 = i2 * 8;
                if (i3 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i3, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFully(@NotNull Output output, @NotNull Buffer src, int i) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                BufferPrimitivesKt.writeFully(chunkBufferPrepareWriteHead, src, iMin);
                i -= iMin;
                if (i <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static /* synthetic */ void writeFully$default(Output output, Buffer buffer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = buffer.getWritePosition() - buffer.getReadPosition();
        }
        writeFully(output, buffer, i);
    }

    /* renamed from: writeFully-UAd2zVI */
    public static final void m15640writeFullyUAd2zVI(@NotNull Output writeFully, @NotNull ByteBuffer src, long j, long j2) {
        Intrinsics.checkNotNullParameter(writeFully, "$this$writeFully");
        Intrinsics.checkNotNullParameter(src, "src");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(writeFully, 1, null);
        long j3 = j;
        long j4 = j2;
        while (true) {
            try {
                long jMin = Math.min(j4, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                Memory.m15425copyToJT6ljtQ(src, chunkBufferPrepareWriteHead.getMemory(), j3, jMin, chunkBufferPrepareWriteHead.getWritePosition());
                chunkBufferPrepareWriteHead.commitWritten((int) jMin);
                long j5 = j3 + jMin;
                j4 -= jMin;
                if (j4 <= 0) {
                    return;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(writeFully, 1, chunkBufferPrepareWriteHead);
                j3 = j5;
            } finally {
                writeFully.afterHeadWrite();
            }
        }
    }

    public static final void fill(@NotNull Output output, long j, byte b) {
        Intrinsics.checkNotNullParameter(output, "<this>");
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        long j2 = 0;
        while (true) {
            try {
                int iMin = (int) Math.min(chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition(), j - j2);
                BufferCompatibilityKt.fill((Buffer) chunkBufferPrepareWriteHead, iMin, b);
                j2 += iMin;
                if (j2 >= j) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    public static final void writeFullyBytesTemplate(Output output, int i, int i2, Function3<? super Buffer, ? super Integer, ? super Integer, Unit> function3) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                int iMin = Math.min(i2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                function3.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i), Integer.valueOf(iMin));
                i += iMin;
                i2 -= iMin;
                if (i2 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }

    public static final void writeFullyBytesTemplate(Output output, long j, long j2, Function4<? super Memory, ? super Long, ? super Long, ? super Long, Unit> function4) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        while (true) {
            try {
                long jMin = Math.min(j2, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                function4.invoke(Memory.m15422boximpl(chunkBufferPrepareWriteHead.getMemory()), Long.valueOf(chunkBufferPrepareWriteHead.getWritePosition()), Long.valueOf(j), Long.valueOf(jMin));
                chunkBufferPrepareWriteHead.commitWritten((int) jMin);
                j += jMin;
                j2 -= jMin;
                if (j2 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, chunkBufferPrepareWriteHead);
                }
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }

    public static final void writeFullyTemplate(Output output, int i, int i2, int i3, Function3<? super Buffer, ? super Integer, ? super Integer, Unit> function3) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i, null);
        while (true) {
            try {
                int iMin = Math.min(i3, chunkBufferPrepareWriteHead.getLimit() - chunkBufferPrepareWriteHead.getWritePosition());
                function3.invoke(chunkBufferPrepareWriteHead, Integer.valueOf(i2), Integer.valueOf(iMin));
                i2 += iMin;
                i3 -= iMin;
                int i4 = i3 * i;
                if (i4 <= 0) {
                    return;
                } else {
                    chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i4, chunkBufferPrepareWriteHead);
                }
            } finally {
                InlineMarker.finallyStart(1);
                output.afterHeadWrite();
                InlineMarker.finallyEnd(1);
            }
        }
    }
}
