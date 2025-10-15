package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FrameType.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/websocket/FrameType;", "", "controlFrame", "", "opcode", "", "(Ljava/lang/String;IZI)V", "getControlFrame", "()Z", "getOpcode", "()I", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "Companion", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFrameType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n14166#2,14:51\n3133#2,11:65\n*S KotlinDebug\n*F\n+ 1 FrameType.kt\nio/ktor/websocket/FrameType\n*L\n39#1:51,14\n41#1:65,11\n*E\n"})
/* loaded from: classes5.dex */
public enum FrameType {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final FrameType[] byOpcodeArray;
    public static final int maxOpcode;
    public final boolean controlFrame;
    public final int opcode;

    FrameType(boolean z, int i) {
        this.controlFrame = z;
        this.opcode = i;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    static {
        FrameType frameType;
        FrameType[] frameTypeArrValues = values();
        if (frameTypeArrValues.length == 0) {
            frameType = null;
        } else {
            frameType = frameTypeArrValues[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(frameTypeArrValues);
            if (lastIndex != 0) {
                int i = frameType.opcode;
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    FrameType frameType2 = frameTypeArrValues[it.nextInt()];
                    int i2 = frameType2.opcode;
                    if (i < i2) {
                        frameType = frameType2;
                        i = i2;
                    }
                }
            }
        }
        Intrinsics.checkNotNull(frameType);
        int i3 = frameType.opcode;
        maxOpcode = i3;
        int i4 = i3 + 1;
        FrameType[] frameTypeArr = new FrameType[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            FrameType[] frameTypeArrValues2 = values();
            int length = frameTypeArrValues2.length;
            FrameType frameType3 = null;
            int i6 = 0;
            boolean z = false;
            while (true) {
                if (i6 >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    FrameType frameType4 = frameTypeArrValues2[i6];
                    if (frameType4.opcode == i5) {
                        if (z) {
                            break;
                        }
                        z = true;
                        frameType3 = frameType4;
                    }
                    i6++;
                }
            }
            frameType3 = null;
            frameTypeArr[i5] = frameType3;
        }
        byOpcodeArray = frameTypeArr;
    }

    /* compiled from: FrameType.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\u0086\u0002R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lio/ktor/websocket/FrameType$Companion;", "", "()V", "byOpcodeArray", "", "Lio/ktor/websocket/FrameType;", "[Lio/ktor/websocket/FrameType;", "maxOpcode", "", "get", "opcode", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final FrameType get(int opcode) {
            if (opcode < 0 || opcode > FrameType.maxOpcode) {
                return null;
            }
            return FrameType.byOpcodeArray[opcode];
        }
    }
}
