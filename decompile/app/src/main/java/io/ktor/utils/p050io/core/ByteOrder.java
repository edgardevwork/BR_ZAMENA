package io.ktor.utils.p050io.core;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BIG_ENDIAN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: ByteOrderJVM.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m7105d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "nioOrder", "Ljava/nio/ByteOrder;", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "getNioOrder", "()Ljava/nio/ByteOrder;", "BIG_ENDIAN", "LITTLE_ENDIAN", "Companion", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ByteOrder {
    public static final /* synthetic */ ByteOrder[] $VALUES;
    public static final ByteOrder BIG_ENDIAN;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ByteOrder LITTLE_ENDIAN;

    /* renamed from: native, reason: not valid java name */
    @NotNull
    public static final ByteOrder f11294native;

    @NotNull
    public final java.nio.ByteOrder nioOrder;

    public static final /* synthetic */ ByteOrder[] $values() {
        return new ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    public static ByteOrder valueOf(String str) {
        return (ByteOrder) Enum.valueOf(ByteOrder.class, str);
    }

    public static ByteOrder[] values() {
        return (ByteOrder[]) $VALUES.clone();
    }

    public ByteOrder(String str, int i, java.nio.ByteOrder byteOrder) {
        this.nioOrder = byteOrder;
    }

    @NotNull
    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }

    static {
        java.nio.ByteOrder BIG_ENDIAN2 = java.nio.ByteOrder.BIG_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(BIG_ENDIAN2, "BIG_ENDIAN");
        BIG_ENDIAN = new ByteOrder("BIG_ENDIAN", 0, BIG_ENDIAN2);
        java.nio.ByteOrder LITTLE_ENDIAN2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
        LITTLE_ENDIAN = new ByteOrder("LITTLE_ENDIAN", 1, LITTLE_ENDIAN2);
        $VALUES = $values();
        INSTANCE = new Companion(null);
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        Intrinsics.checkNotNullExpressionValue(byteOrderNativeOrder, "nativeOrder()");
        f11294native = ByteOrderJVMKt.orderOf(byteOrderNativeOrder);
    }

    /* compiled from: ByteOrderJVM.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lio/ktor/utils/io/core/ByteOrder$Companion;", "", "()V", PluginErrorDetails.Platform.NATIVE, "Lio/ktor/utils/io/core/ByteOrder;", "nativeOrder", "of", "nioOrder", "Ljava/nio/ByteOrder;", "ktor-io"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        /* renamed from: of */
        public final ByteOrder m7095of(@NotNull java.nio.ByteOrder nioOrder) {
            Intrinsics.checkNotNullParameter(nioOrder, "nioOrder");
            return ByteOrderJVMKt.orderOf(nioOrder);
        }

        @NotNull
        public final ByteOrder nativeOrder() {
            return ByteOrder.f11294native;
        }
    }
}
