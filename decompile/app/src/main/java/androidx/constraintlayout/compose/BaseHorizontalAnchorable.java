package androidx.constraintlayout.compose;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.http.LinkHeader;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintScopeCommon.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B'\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H&J+\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7105d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", FirebaseAnalytics.Param.INDEX, "", "(Ljava/util/List;I)V", "getConstraintReference", "Landroidx/constraintlayout/core/state/ConstraintReference;", "state", "linkTo", LinkHeader.Parameters.Anchor, "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "margin", "Landroidx/compose/ui/unit/Dp;", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    public final int index;

    @NotNull
    public final List<Function1<State, Unit>> tasks;

    @NotNull
    public abstract ConstraintReference getConstraintReference(@NotNull State state);

    public BaseHorizontalAnchorable(@NotNull List<Function1<State, Unit>> tasks, int i) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.tasks = tasks;
        this.index = i;
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo13921linkToVpY3zN4(@NotNull final ConstraintLayoutBaseScope.HorizontalAnchor anchor, final float margin, final float goneMargin) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.BaseHorizontalAnchorable$linkTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                ConstraintReference constraintReference = this.this$0.getConstraintReference(state);
                BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = anchor;
                AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions()[baseHorizontalAnchorable.index][horizontalAnchor.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor.getId$compose_release()).margin(C2046Dp.m13664boximpl(margin)).marginGone(C2046Dp.m13664boximpl(goneMargin));
            }
        });
    }
}
