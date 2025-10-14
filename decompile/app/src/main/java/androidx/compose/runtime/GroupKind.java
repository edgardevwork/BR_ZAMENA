package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/runtime/GroupKind;", "", "value", "", "constructor-impl", "(I)I", "isNode", "", "isNode-impl", "(I)Z", "isReusable", "isReusable-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes4.dex */
public final class GroupKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int Group = m10850constructorimpl(0);
    public static final int Node = m10850constructorimpl(1);
    public static final int ReusableNode = m10850constructorimpl(2);
    public final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m10849boximpl(int i) {
        return new GroupKind(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10850constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10851equalsimpl(int i, Object obj) {
        return (obj instanceof GroupKind) && i == ((GroupKind) obj).m10857unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10852equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10853hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10856toStringimpl(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m10851equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m10853hashCodeimpl(this.value);
    }

    public String toString() {
        return m10856toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10857unboximpl() {
        return this.value;
    }

    public /* synthetic */ GroupKind(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m10854isNodeimpl(int i) {
        return i != INSTANCE.m10858getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m10855isReusableimpl(int i) {
        return i != INSTANCE.m10859getNodeULZAiWs();
    }

    /* compiled from: Composer.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m7105d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", "Group", "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", "I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m10858getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m10859getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m10860getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }
    }
}
