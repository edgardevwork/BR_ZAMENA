package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintLayoutBaseScope.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m7105d2 = {"Landroidx/constraintlayout/compose/Visibility;", "", "solverValue", "", "(I)V", "getSolverValue$compose_release", "()I", "Companion", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class Visibility {
    public final int solverValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Visibility Visible = new Visibility(0);

    @NotNull
    public static final Visibility Invisible = new Visibility(4);

    @NotNull
    public static final Visibility Gone = new Visibility(8);

    public Visibility(int i) {
        this.solverValue = i;
    }

    /* renamed from: getSolverValue$compose_release, reason: from getter */
    public final int getSolverValue() {
        return this.solverValue;
    }

    /* compiled from: ConstraintLayoutBaseScope.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, m7105d2 = {"Landroidx/constraintlayout/compose/Visibility$Companion;", "", "()V", "Gone", "Landroidx/constraintlayout/compose/Visibility;", "getGone$annotations", "getGone", "()Landroidx/constraintlayout/compose/Visibility;", "Invisible", "getInvisible$annotations", "getInvisible", "Visible", "getVisible$annotations", "getVisible", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getGone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInvisible$annotations() {
        }

        @Stable
        public static /* synthetic */ void getVisible$annotations() {
        }

        public Companion() {
        }

        @NotNull
        public final Visibility getVisible() {
            return Visibility.Visible;
        }

        @NotNull
        public final Visibility getInvisible() {
            return Visibility.Invisible;
        }

        @NotNull
        public final Visibility getGone() {
            return Visibility.Gone;
        }
    }
}
