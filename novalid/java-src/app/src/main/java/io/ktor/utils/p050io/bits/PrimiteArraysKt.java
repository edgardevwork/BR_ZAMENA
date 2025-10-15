package io.ktor.utils.p050io.bits;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: PrimiteArrays.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\f\u001a>\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001a>\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0014\u001a>\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a>\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0019\u001a>\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a>\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001e\u001a>\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\n\u001a>\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\f\u001a>\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\n\u001a>\u0010#\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\f\u001a>\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0013\u001a>\u0010%\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0014\u001a>\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0018\u001a>\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0019\u001a>\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001d\u001a>\u0010)\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m7105d2 = {"loadByteArray", "", "Lio/ktor/utils/io/bits/Memory;", TypedValues.CycleType.S_WAVE_OFFSET, "", FirebaseAnalytics.Param.DESTINATION, "", "destinationOffset", CatchStreamerKeys.COUNT_KEY, "loadByteArray-9zorpBc", "(Ljava/nio/ByteBuffer;I[BII)V", "", "(Ljava/nio/ByteBuffer;J[BII)V", "loadUByteArray", "Lkotlin/UByteArray;", "loadUByteArray-KqtU1YU", "loadUIntArray", "Lkotlin/UIntArray;", "loadUIntArray-EM3dPTA", "(Ljava/nio/ByteBuffer;I[III)V", "(Ljava/nio/ByteBuffer;J[III)V", "loadULongArray", "Lkotlin/ULongArray;", "loadULongArray-bNlDJKc", "(Ljava/nio/ByteBuffer;I[JII)V", "(Ljava/nio/ByteBuffer;J[JII)V", "loadUShortArray", "Lkotlin/UShortArray;", "loadUShortArray-m8CCUi4", "(Ljava/nio/ByteBuffer;I[SII)V", "(Ljava/nio/ByteBuffer;J[SII)V", "storeByteArray", "source", "sourceOffset", "storeByteArray-9zorpBc", "storeUByteArray", "storeUByteArray-KqtU1YU", "storeUIntArray", "storeUIntArray-EM3dPTA", "storeULongArray", "storeULongArray-bNlDJKc", "storeUShortArray", "storeUShortArray-m8CCUi4", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPrimiteArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n+ 2 MemoryFactoryJvm.kt\nio/ktor/utils/io/bits/MemoryFactoryJvmKt\n*L\n1#1,539:1\n282#1:548\n283#1,3:553\n282#1,4:556\n297#1:560\n298#1,3:565\n297#1,4:568\n17#2,4:540\n17#2,4:544\n17#2,4:549\n17#2,4:561\n*S KotlinDebug\n*F\n+ 1 PrimiteArrays.kt\nio/ktor/utils/io/bits/PrimiteArraysKt\n*L\n313#1:548\n313#1:553,3\n313#1:556,4\n327#1:560\n327#1:565,3\n327#1:568,4\n282#1:540,4\n297#1:544,4\n313#1:549,4\n327#1:561,4\n*E\n"})
/* loaded from: classes8.dex */
public final class PrimiteArraysKt {
    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15489loadByteArray9zorpBc$default(ByteBuffer loadByteArray, int i, byte[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = destination.length - i2;
        }
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15442copyTo9zorpBc(loadByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m15487loadByteArray9zorpBc(@NotNull ByteBuffer loadByteArray, int i, @NotNull byte[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15442copyTo9zorpBc(loadByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15490loadByteArray9zorpBc$default(ByteBuffer loadByteArray, long j, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = destination.length - i4;
        }
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15443copyTo9zorpBc(loadByteArray, destination, j, i2, i4);
    }

    /* renamed from: loadByteArray-9zorpBc, reason: not valid java name */
    public static final void m15488loadByteArray9zorpBc(@NotNull ByteBuffer loadByteArray, long j, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadByteArray, "$this$loadByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15443copyTo9zorpBc(loadByteArray, destination, j, i2, i);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m15493loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, int i, byte[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m15776getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15442copyTo9zorpBc(loadUByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m15491loadUByteArrayKqtU1YU(@NotNull ByteBuffer loadUByteArray, int i, @NotNull byte[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15442copyTo9zorpBc(loadUByteArray, destination, i, i3, i2);
    }

    /* renamed from: loadUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m15494loadUByteArrayKqtU1YU$default(ByteBuffer loadUByteArray, long j, byte[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UByteArray.m15776getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15443copyTo9zorpBc(loadUByteArray, destination, j, i2, i4);
    }

    /* renamed from: loadUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m15492loadUByteArrayKqtU1YU(@NotNull ByteBuffer loadUByteArray, long j, @NotNull byte[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUByteArray, "$this$loadUByteArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        MemoryJvmKt.m15443copyTo9zorpBc(loadUByteArray, destination, j, i2, i);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m15505loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, int i, short[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m16039getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15543loadShortArray9zorpBc(loadUShortArray, i, destination, i2, i3);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m15503loadUShortArraym8CCUi4(@NotNull ByteBuffer loadUShortArray, int i, @NotNull short[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15543loadShortArray9zorpBc(loadUShortArray, i, destination, i2, i3);
    }

    /* renamed from: loadUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m15506loadUShortArraym8CCUi4$default(ByteBuffer loadUShortArray, long j, short[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UShortArray.m16039getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15544loadShortArray9zorpBc(loadUShortArray, j, destination, i4, i2);
    }

    /* renamed from: loadUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m15504loadUShortArraym8CCUi4(@NotNull ByteBuffer loadUShortArray, long j, @NotNull short[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUShortArray, "$this$loadUShortArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15544loadShortArray9zorpBc(loadUShortArray, j, destination, i, i2);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m15497loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, int i, int[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m15855getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15535loadIntArray9zorpBc(loadUIntArray, i, destination, i2, i3);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m15495loadUIntArrayEM3dPTA(@NotNull ByteBuffer loadUIntArray, int i, @NotNull int[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15535loadIntArray9zorpBc(loadUIntArray, i, destination, i2, i3);
    }

    /* renamed from: loadUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m15498loadUIntArrayEM3dPTA$default(ByteBuffer loadUIntArray, long j, int[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UIntArray.m15855getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15536loadIntArray9zorpBc(loadUIntArray, j, destination, i4, i2);
    }

    /* renamed from: loadUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m15496loadUIntArrayEM3dPTA(@NotNull ByteBuffer loadUIntArray, long j, @NotNull int[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadUIntArray, "$this$loadUIntArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15536loadIntArray9zorpBc(loadUIntArray, j, destination, i, i2);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m15501loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, int i, long[] destination, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m15934getSizeimpl(destination) - i2;
        }
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15539loadLongArray9zorpBc(loadULongArray, i, destination, i2, i3);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m15499loadULongArraybNlDJKc(@NotNull ByteBuffer loadULongArray, int i, @NotNull long[] destination, int i2, int i3) {
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15539loadLongArray9zorpBc(loadULongArray, i, destination, i2, i3);
    }

    /* renamed from: loadULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m15502loadULongArraybNlDJKc$default(ByteBuffer loadULongArray, long j, long[] destination, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = ULongArray.m15934getSizeimpl(destination) - i4;
        }
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15540loadLongArray9zorpBc(loadULongArray, j, destination, i4, i2);
    }

    /* renamed from: loadULongArray-bNlDJKc, reason: not valid java name */
    public static final void m15500loadULongArraybNlDJKc(@NotNull ByteBuffer loadULongArray, long j, @NotNull long[] destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(loadULongArray, "$this$loadULongArray");
        Intrinsics.checkNotNullParameter(destination, "destination");
        PrimitiveArraysJvmKt.m15540loadLongArray9zorpBc(loadULongArray, j, destination, i, i2);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15509storeByteArray9zorpBc$default(ByteBuffer storeByteArray, int i, byte[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = source.length - i2;
        }
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeByteArray, 0, i3, i);
    }

    /* renamed from: storeByteArray-9zorpBc$default, reason: not valid java name */
    public static /* synthetic */ void m15510storeByteArray9zorpBc$default(ByteBuffer storeByteArray, long j, byte[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = source.length - i;
        }
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15425copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeByteArray, 0L, i2, j);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m15513storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, int i, byte[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UByteArray.m15776getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeUByteArray, 0, i3, i);
    }

    /* renamed from: storeUByteArray-KqtU1YU$default, reason: not valid java name */
    public static /* synthetic */ void m15514storeUByteArrayKqtU1YU$default(ByteBuffer storeUByteArray, long j, byte[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = UByteArray.m15776getSizeimpl(source) - i;
        }
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15425copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeUByteArray, 0L, i2, j);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m15525storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, int i, short[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UShortArray.m16039getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15563storeShortArray9zorpBc(storeUShortArray, i, source, i2, i3);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m15523storeUShortArraym8CCUi4(@NotNull ByteBuffer storeUShortArray, int i, @NotNull short[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15563storeShortArray9zorpBc(storeUShortArray, i, source, i2, i3);
    }

    /* renamed from: storeUShortArray-m8CCUi4$default, reason: not valid java name */
    public static /* synthetic */ void m15526storeUShortArraym8CCUi4$default(ByteBuffer storeUShortArray, long j, short[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UShortArray.m16039getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15564storeShortArray9zorpBc(storeUShortArray, j, source, i4, i2);
    }

    /* renamed from: storeUShortArray-m8CCUi4, reason: not valid java name */
    public static final void m15524storeUShortArraym8CCUi4(@NotNull ByteBuffer storeUShortArray, long j, @NotNull short[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUShortArray, "$this$storeUShortArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15564storeShortArray9zorpBc(storeUShortArray, j, source, i, i2);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m15517storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, int i, int[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = UIntArray.m15855getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15555storeIntArray9zorpBc(storeUIntArray, i, source, i2, i3);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m15515storeUIntArrayEM3dPTA(@NotNull ByteBuffer storeUIntArray, int i, @NotNull int[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15555storeIntArray9zorpBc(storeUIntArray, i, source, i2, i3);
    }

    /* renamed from: storeUIntArray-EM3dPTA$default, reason: not valid java name */
    public static /* synthetic */ void m15518storeUIntArrayEM3dPTA$default(ByteBuffer storeUIntArray, long j, int[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = UIntArray.m15855getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15556storeIntArray9zorpBc(storeUIntArray, j, source, i4, i2);
    }

    /* renamed from: storeUIntArray-EM3dPTA, reason: not valid java name */
    public static final void m15516storeUIntArrayEM3dPTA(@NotNull ByteBuffer storeUIntArray, long j, @NotNull int[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUIntArray, "$this$storeUIntArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15556storeIntArray9zorpBc(storeUIntArray, j, source, i, i2);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m15521storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, int i, long[] source, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = ULongArray.m15934getSizeimpl(source) - i2;
        }
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15559storeLongArray9zorpBc(storeULongArray, i, source, i2, i3);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m15519storeULongArraybNlDJKc(@NotNull ByteBuffer storeULongArray, int i, @NotNull long[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15559storeLongArray9zorpBc(storeULongArray, i, source, i2, i3);
    }

    /* renamed from: storeULongArray-bNlDJKc$default, reason: not valid java name */
    public static /* synthetic */ void m15522storeULongArraybNlDJKc$default(ByteBuffer storeULongArray, long j, long[] source, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = ULongArray.m15934getSizeimpl(source) - i4;
        }
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15560storeLongArray9zorpBc(storeULongArray, j, source, i4, i2);
    }

    /* renamed from: storeULongArray-bNlDJKc, reason: not valid java name */
    public static final void m15520storeULongArraybNlDJKc(@NotNull ByteBuffer storeULongArray, long j, @NotNull long[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeULongArray, "$this$storeULongArray");
        Intrinsics.checkNotNullParameter(source, "source");
        PrimitiveArraysJvmKt.m15560storeLongArray9zorpBc(storeULongArray, j, source, i, i2);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m15507storeByteArray9zorpBc(@NotNull ByteBuffer storeByteArray, int i, @NotNull byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeByteArray, 0, i3, i);
    }

    /* renamed from: storeByteArray-9zorpBc, reason: not valid java name */
    public static final void m15508storeByteArray9zorpBc(@NotNull ByteBuffer storeByteArray, long j, @NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeByteArray, "$this$storeByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15425copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeByteArray, 0L, i2, j);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m15511storeUByteArrayKqtU1YU(@NotNull ByteBuffer storeUByteArray, int i, @NotNull byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i2, i3).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15424copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeUByteArray, 0, i3, i);
    }

    /* renamed from: storeUByteArray-KqtU1YU, reason: not valid java name */
    public static final void m15512storeUByteArrayKqtU1YU(@NotNull ByteBuffer storeUByteArray, long j, @NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(storeUByteArray, "$this$storeUByteArray");
        Intrinsics.checkNotNullParameter(source, "source");
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        Memory.m15425copyToJT6ljtQ(Memory.m15423constructorimpl(byteBufferOrder), storeUByteArray, 0L, i2, j);
    }
}
