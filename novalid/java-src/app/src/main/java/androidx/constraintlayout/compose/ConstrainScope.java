package androidx.constraintlayout.compose;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.fractions.Const;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstrainScope.kt */
@LayoutScopeMarker
@Stable
@Metadata(m7104d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J<\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020J2\u001d\u0010d\u001a\u0019\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020E0e¢\u0006\u0002\bgH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020b2\u0017\u0010d\u001a\u0013\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020E0C¢\u0006\u0002\bgH\u0002J\u0015\u0010k\u001a\u00020E2\u0006\u0010l\u001a\u00020DH\u0000¢\u0006\u0002\bmJ\u000e\u0010n\u001a\u00020E2\u0006\u0010o\u001a\u00020pJ\u000e\u0010n\u001a\u00020E2\u0006\u0010o\u001a\u00020qJ\u0018\u0010r\u001a\u00020E2\u0006\u0010s\u001a\u00020'2\b\b\u0003\u0010t\u001a\u00020\u000bJ\u000e\u0010u\u001a\u00020E2\u0006\u0010s\u001a\u00020'J\u0018\u0010v\u001a\u00020E2\u0006\u0010s\u001a\u00020'2\b\b\u0003\u0010t\u001a\u00020\u000bJ+\u0010w\u001a\u00020E2\u0006\u0010s\u001a\u00020'2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020Jø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010{J\u0006\u0010|\u001a\u00020EJ\u0006\u0010}\u001a\u00020EJ\u0006\u0010~\u001a\u00020EJ[\u0010\u007f\u001a\u00020E2\u0006\u0010H\u001a\u00020p2\u0006\u0010\u0015\u001a\u00020p2\t\b\u0002\u0010\u0080\u0001\u001a\u00020J2\t\b\u0002\u0010\u0081\u0001\u001a\u00020J2\t\b\u0002\u0010\u0082\u0001\u001a\u00020J2\t\b\u0002\u0010\u0083\u0001\u001a\u00020J2\b\b\u0003\u0010t\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J£\u0001\u0010\u007f\u001a\u00020E2\u0006\u0010?\u001a\u00020q2\u0006\u0010H\u001a\u00020p2\u0006\u0010\u0019\u001a\u00020q2\u0006\u0010\u0015\u001a\u00020p2\t\b\u0002\u0010\u0086\u0001\u001a\u00020J2\t\b\u0002\u0010\u0080\u0001\u001a\u00020J2\t\b\u0002\u0010\u0087\u0001\u001a\u00020J2\t\b\u0002\u0010\u0081\u0001\u001a\u00020J2\t\b\u0002\u0010\u0088\u0001\u001a\u00020J2\t\b\u0002\u0010\u0082\u0001\u001a\u00020J2\t\b\u0002\u0010\u0089\u0001\u001a\u00020J2\t\b\u0002\u0010\u0083\u0001\u001a\u00020J2\t\b\u0003\u0010\u008a\u0001\u001a\u00020\u000b2\t\b\u0003\u0010\u008b\u0001\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J[\u0010\u007f\u001a\u00020E2\u0006\u0010?\u001a\u00020q2\u0006\u0010\u0019\u001a\u00020q2\t\b\u0002\u0010\u0086\u0001\u001a\u00020J2\t\b\u0002\u0010\u0087\u0001\u001a\u00020J2\t\b\u0002\u0010\u0088\u0001\u001a\u00020J2\t\b\u0002\u0010\u0089\u0001\u001a\u00020J2\b\b\u0003\u0010t\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u008e\u0001J\u0007\u0010\u008f\u0001\u001a\u00020EJ\u0007\u0010\u0090\u0001\u001a\u00020ER\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R$\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R$\u0010-\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R$\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R$\u00103\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R$\u00106\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010\u0010R$\u00109\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R$\u0010<\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u0011\u0010?\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R&\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C0BX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0018R/\u0010K\u001a\u00020J2\u0006\u0010\n\u001a\u00020J@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R/\u0010O\u001a\u00020J2\u0006\u0010\n\u001a\u00020J@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bP\u0010\u000e\"\u0004\bQ\u0010\u0010R/\u0010R\u001a\u00020J2\u0006\u0010\n\u001a\u00020J@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u0010R$\u0010U\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R$\u0010Y\u001a\u00020X2\u0006\u0010\n\u001a\u00020X@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001e\"\u0004\b`\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0091\u0001"}, m7105d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "(Ljava/lang/Object;)V", "absoluteLeft", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getAbsoluteLeft", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "absoluteRight", "getAbsoluteRight", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "baseline", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "bottom", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getBottom", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "end", "getEnd", "Landroidx/constraintlayout/compose/Dimension;", "height", "getHeight", "()Landroidx/constraintlayout/compose/Dimension;", "setHeight", "(Landroidx/constraintlayout/compose/Dimension;)V", "horizontalChainWeight", "getHorizontalChainWeight", "setHorizontalChainWeight", "getId$compose_release", "()Ljava/lang/Object;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", TtmlNode.START, "getStart", "tasks", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "getTasks$compose_release", "()Ljava/util/List;", "top", "getTop", "Landroidx/compose/ui/unit/Dp;", "translationX", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "F", "translationY", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationZ", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "verticalChainWeight", "getVerticalChainWeight", "setVerticalChainWeight", "Landroidx/constraintlayout/compose/Visibility;", "visibility", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "width", "getWidth", "setWidth", "addFloatTransformFromDp", "", "dpValue", Const.FRACTION_CONTROL_CHANGE_RANK_OR_REPRIMAND, "Lkotlin/Function2;", "Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/ExtensionFunctionType;", "addFloatTransformFromDp-D5KLDUw", "(FLkotlin/jvm/functions/Function2;)Z", "addTransform", "applyTo", "state", "applyTo$compose_release", "centerAround", LinkHeader.Parameters.Anchor, "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "centerHorizontallyTo", "other", "bias", "centerTo", "centerVerticallyTo", "circular", "angle", "distance", "circular-wH6b6FI", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V", "clearConstraints", "clearHorizontal", "clearVertical", "linkTo", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "linkTo-8ZKsbrE", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "horizontalBias", "verticalBias", "linkTo-R7zmacU", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V", "resetDimensions", "resetTransforms", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ConstrainScope {

    @NotNull
    public final VerticalAnchorable absoluteLeft;

    @NotNull
    public final VerticalAnchorable absoluteRight;

    @FloatRange(from = 0.0d, m9to = 1.0d)
    public float alpha;

    @NotNull
    public final BaselineAnchorable baseline;

    @NotNull
    public final HorizontalAnchorable bottom;

    @NotNull
    public final VerticalAnchorable end;

    @NotNull
    public Dimension height;
    public float horizontalChainWeight;

    @NotNull
    public final Object id;

    @NotNull
    public final ConstrainedLayoutReference parent;
    public float pivotX;
    public float pivotY;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;

    @NotNull
    public final VerticalAnchorable start;

    @NotNull
    public final List<Function1<State, Unit>> tasks;

    @NotNull
    public final HorizontalAnchorable top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public float verticalChainWeight;

    @NotNull
    public Visibility visibility;

    @NotNull
    public Dimension width;

    public ConstrainScope(@NotNull Object id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = androidx.constraintlayout.core.state.State.PARENT;
        Intrinsics.checkNotNullExpressionValue(PARENT, "PARENT");
        this.parent = new ConstrainedLayoutReference(PARENT);
        this.start = new ConstraintVerticalAnchorable(id, -2, arrayList);
        this.absoluteLeft = new ConstraintVerticalAnchorable(id, 0, arrayList);
        this.top = new ConstraintHorizontalAnchorable(id, 0, arrayList);
        this.end = new ConstraintVerticalAnchorable(id, -1, arrayList);
        this.absoluteRight = new ConstraintVerticalAnchorable(id, 1, arrayList);
        this.bottom = new ConstraintHorizontalAnchorable(id, 1, arrayList);
        this.baseline = new ConstraintBaselineAnchorable(id, arrayList);
        Dimension.Companion companion = Dimension.INSTANCE;
        this.width = companion.getWrapContent();
        this.height = companion.getWrapContent();
        this.visibility = Visibility.INSTANCE.getVisible();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        float f = 0;
        this.translationX = C2046Dp.m13666constructorimpl(f);
        this.translationY = C2046Dp.m13666constructorimpl(f);
        this.translationZ = C2046Dp.m13666constructorimpl(f);
        this.pivotX = 0.5f;
        this.pivotY = 0.5f;
        this.horizontalChainWeight = Float.NaN;
        this.verticalChainWeight = Float.NaN;
    }

    @NotNull
    /* renamed from: getId$compose_release, reason: from getter */
    public final Object getId() {
        return this.id;
    }

    @NotNull
    public final List<Function1<State, Unit>> getTasks$compose_release() {
        return this.tasks;
    }

    public final void applyTo$compose_release(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
    }

    @NotNull
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    @NotNull
    public final VerticalAnchorable getStart() {
        return this.start;
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @NotNull
    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    @NotNull
    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    @NotNull
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    @NotNull
    public final BaselineAnchorable getBaseline() {
        return this.baseline;
    }

    @NotNull
    public final Dimension getWidth() {
        return this.width;
    }

    public final void setWidth(@NotNull final Dimension value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.width = value;
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$width$1
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
                state.constraints(this.this$0.getId()).width(((DimensionDescription) value).toSolverDimension$compose_release(state));
            }
        });
    }

    @NotNull
    public final Dimension getHeight() {
        return this.height;
    }

    public final void setHeight(@NotNull final Dimension value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.height = value;
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$height$1
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
                state.constraints(this.this$0.getId()).height(((DimensionDescription) value).toSolverDimension$compose_release(state));
            }
        });
    }

    @NotNull
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public final void setVisibility(@NotNull final Visibility value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.visibility = value;
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$1
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
                ConstraintReference constraintReferenceConstraints = state.constraints(this.this$0.getId());
                Visibility visibility = value;
                constraintReferenceConstraints.visibility(visibility.getSolverValue());
                if (Intrinsics.areEqual(visibility, Visibility.INSTANCE.getInvisible())) {
                    constraintReferenceConstraints.alpha(0.0f);
                }
            }
        });
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(final float f) {
        this.alpha = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                if (Intrinsics.areEqual(this.this$0.getVisibility(), Visibility.INSTANCE.getInvisible())) {
                    return;
                }
                addTransform.alpha(f);
            }
        });
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(final float f) {
        this.scaleX = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$scaleX$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.scaleX(f);
            }
        });
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(final float f) {
        this.scaleY = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$scaleY$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.scaleY(f);
            }
        });
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final void setRotationX(final float f) {
        this.rotationX = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$rotationX$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.rotationX(f);
            }
        });
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final void setRotationY(final float f) {
        this.rotationY = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$rotationY$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.rotationY(f);
            }
        });
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(final float f) {
        this.rotationZ = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$rotationZ$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.rotationZ(f);
            }
        });
    }

    /* renamed from: getTranslationX-D9Ej5fM, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: setTranslationX-0680j_4 */
    public final void m13936setTranslationX0680j_4(float f) {
        this.translationX = f;
        m13928addFloatTransformFromDpD5KLDUw(f, new Function2<ConstraintReference, Float, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$translationX$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference, Float f2) {
                invoke(constraintReference, f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ConstraintReference addFloatTransformFromDp, float f2) {
                Intrinsics.checkNotNullParameter(addFloatTransformFromDp, "$this$addFloatTransformFromDp");
                addFloatTransformFromDp.translationX(f2);
            }
        });
    }

    /* renamed from: getTranslationY-D9Ej5fM, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: setTranslationY-0680j_4 */
    public final void m13937setTranslationY0680j_4(float f) {
        this.translationY = f;
        m13928addFloatTransformFromDpD5KLDUw(f, new Function2<ConstraintReference, Float, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$translationY$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference, Float f2) {
                invoke(constraintReference, f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ConstraintReference addFloatTransformFromDp, float f2) {
                Intrinsics.checkNotNullParameter(addFloatTransformFromDp, "$this$addFloatTransformFromDp");
                addFloatTransformFromDp.translationY(f2);
            }
        });
    }

    /* renamed from: getTranslationZ-D9Ej5fM, reason: from getter */
    public final float getTranslationZ() {
        return this.translationZ;
    }

    /* renamed from: setTranslationZ-0680j_4 */
    public final void m13938setTranslationZ0680j_4(float f) {
        this.translationZ = f;
        m13928addFloatTransformFromDpD5KLDUw(f, new Function2<ConstraintReference, Float, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$translationZ$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference, Float f2) {
                invoke(constraintReference, f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ConstraintReference addFloatTransformFromDp, float f2) {
                Intrinsics.checkNotNullParameter(addFloatTransformFromDp, "$this$addFloatTransformFromDp");
                addFloatTransformFromDp.translationZ(f2);
            }
        });
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(final float f) {
        this.pivotX = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$pivotX$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.pivotX(f);
            }
        });
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(final float f) {
        this.pivotY = f;
        addTransform(new Function1<ConstraintReference, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$pivotY$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConstraintReference constraintReference) {
                invoke2(constraintReference);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ConstraintReference addTransform) {
                Intrinsics.checkNotNullParameter(addTransform, "$this$addTransform");
                addTransform.pivotY(f);
            }
        });
    }

    public final float getHorizontalChainWeight() {
        return this.horizontalChainWeight;
    }

    public final void setHorizontalChainWeight(final float f) {
        this.horizontalChainWeight = f;
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$horizontalChainWeight$1
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
                state.constraints(this.this$0.getId()).setHorizontalChainWeight(f);
            }
        });
    }

    public final float getVerticalChainWeight() {
        return this.verticalChainWeight;
    }

    public final void setVerticalChainWeight(final float f) {
        this.verticalChainWeight = f;
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$verticalChainWeight$1
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
                state.constraints(this.this$0.getId()).setVerticalChainWeight(f);
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$addTransform$1 */
    /* loaded from: classes4.dex */
    public static final class C20851 extends Lambda implements Function1<State, Unit> {
        public final /* synthetic */ Function1<ConstraintReference, Unit> $change;
        public final /* synthetic */ ConstrainScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20851(Function1<? super ConstraintReference, Unit> function1, ConstrainScope constrainScope) {
            super(1);
            function1 = function1;
            constrainScope = constrainScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            Function1<ConstraintReference, Unit> function1 = function1;
            ConstraintReference constraintReferenceConstraints = state.constraints(constrainScope.getId());
            Intrinsics.checkNotNullExpressionValue(constraintReferenceConstraints, "state.constraints(id)");
            function1.invoke(constraintReferenceConstraints);
        }
    }

    public final boolean addTransform(Function1<? super ConstraintReference, Unit> function1) {
        return this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.addTransform.1
            public final /* synthetic */ Function1<ConstraintReference, Unit> $change;
            public final /* synthetic */ ConstrainScope this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20851(Function1<? super ConstraintReference, Unit> function12, ConstrainScope this) {
                super(1);
                function1 = function12;
                constrainScope = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Function1<ConstraintReference, Unit> function12 = function1;
                ConstraintReference constraintReferenceConstraints = state.constraints(constrainScope.getId());
                Intrinsics.checkNotNullExpressionValue(constraintReferenceConstraints, "state.constraints(id)");
                function12.invoke(constraintReferenceConstraints);
            }
        });
    }

    /* renamed from: addFloatTransformFromDp-D5KLDUw */
    public final boolean m13928addFloatTransformFromDpD5KLDUw(final float dpValue, final Function2<? super ConstraintReference, ? super Float, Unit> function2) {
        return this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$addFloatTransformFromDp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                if (state == null) {
                    return;
                }
                Function2<ConstraintReference, Float, Unit> function22 = function2;
                ConstrainScope constrainScope = this;
                float f = dpValue;
                ConstraintReference constraintReferenceConstraints = state.constraints(constrainScope.getId());
                Intrinsics.checkNotNullExpressionValue(constraintReferenceConstraints, "state.constraints(id)");
                function22.invoke(constraintReferenceConstraints, Float.valueOf(state.convertDimension(C2046Dp.m13664boximpl(f))));
            }
        });
    }

    /* renamed from: linkTo-8ZKsbrE */
    public final void m13934linkTo8ZKsbrE(@NotNull ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, @NotNull ConstraintLayoutBaseScope.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, @FloatRange(from = 0.0d, m9to = 1.0d) final float bias) {
        Intrinsics.checkNotNullParameter(verticalAnchor, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start.mo13922linkToVpY3zN4(verticalAnchor, startMargin, startGoneMargin);
        this.end.mo13922linkToVpY3zN4(end, endMargin, endGoneMargin);
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$linkTo$1
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
                state.constraints(this.getId()).horizontalBias(state.getLayoutDirection() == LayoutDirection.Rtl ? 1 - bias : bias);
            }
        });
    }

    /* renamed from: linkTo-8ZKsbrE */
    public final void m13933linkTo8ZKsbrE(@NotNull ConstraintLayoutBaseScope.HorizontalAnchor top, @NotNull ConstraintLayoutBaseScope.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, @FloatRange(from = 0.0d, m9to = 1.0d) final float bias) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.top.mo13921linkToVpY3zN4(top, topMargin, topGoneMargin);
        this.bottom.mo13921linkToVpY3zN4(bottom, bottomMargin, bottomGoneMargin);
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$linkTo$2
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
                state.constraints(this.this$0.getId()).verticalBias(bias);
            }
        });
    }

    /* renamed from: linkTo-R7zmacU */
    public final void m13935linkToR7zmacU(@NotNull ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, @NotNull ConstraintLayoutBaseScope.HorizontalAnchor top, @NotNull ConstraintLayoutBaseScope.VerticalAnchor end, @NotNull ConstraintLayoutBaseScope.HorizontalAnchor bottom, float startMargin, float topMargin, float endMargin, float bottomMargin, float startGoneMargin, float topGoneMargin, float endGoneMargin, float bottomGoneMargin, @FloatRange(from = 0.0d, m9to = 1.0d) float horizontalBias, @FloatRange(from = 0.0d, m9to = 1.0d) float verticalBias) {
        Intrinsics.checkNotNullParameter(verticalAnchor, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        m13934linkTo8ZKsbrE(verticalAnchor, end, startMargin, endMargin, startGoneMargin, endGoneMargin, horizontalBias);
        m13933linkTo8ZKsbrE(top, bottom, topMargin, bottomMargin, topGoneMargin, bottomGoneMargin, verticalBias);
    }

    public final void centerTo(@NotNull ConstrainedLayoutReference other) {
        Intrinsics.checkNotNullParameter(other, "other");
        m13927linkToR7zmacU$default(this, other.getStart(), other.getTop(), other.getEnd(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
    }

    public static /* synthetic */ void centerHorizontallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerHorizontallyTo(constrainedLayoutReference, f);
    }

    public final void centerHorizontallyTo(@NotNull ConstrainedLayoutReference other, @FloatRange(from = 0.0d, m9to = 1.0d) float bias) {
        Intrinsics.checkNotNullParameter(other, "other");
        m13926linkTo8ZKsbrE$default(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (Object) null);
    }

    public static /* synthetic */ void centerVerticallyTo$default(ConstrainScope constrainScope, ConstrainedLayoutReference constrainedLayoutReference, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        constrainScope.centerVerticallyTo(constrainedLayoutReference, f);
    }

    public final void centerVerticallyTo(@NotNull ConstrainedLayoutReference other, @FloatRange(from = 0.0d, m9to = 1.0d) float bias) {
        Intrinsics.checkNotNullParameter(other, "other");
        m13925linkTo8ZKsbrE$default(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, (Object) null);
    }

    public final void centerAround(@NotNull ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor) {
        Intrinsics.checkNotNullParameter(verticalAnchor, "anchor");
        m13926linkTo8ZKsbrE$default(this, verticalAnchor, verticalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    public final void centerAround(@NotNull ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor) {
        Intrinsics.checkNotNullParameter(horizontalAnchor, "anchor");
        m13925linkTo8ZKsbrE$default(this, horizontalAnchor, horizontalAnchor, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
    }

    /* renamed from: circular-wH6b6FI */
    public final void m13929circularwH6b6FI(@NotNull final ConstrainedLayoutReference other, final float angle, final float distance) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope$circular$1
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
                state.constraints(this.this$0.getId()).circularConstraint(other.getId(), angle, state.convertDimension(C2046Dp.m13664boximpl(distance)));
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$clearHorizontal$1 */
    /* loaded from: classes4.dex */
    public static final class C20871 extends Lambda implements Function1<State, Unit> {
        public C20871() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            state.constraints(ConstrainScope.this.getId()).clearHorizontal();
        }
    }

    public final void clearHorizontal() {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.clearHorizontal.1
            public C20871() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                state.constraints(ConstrainScope.this.getId()).clearHorizontal();
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$clearVertical$1 */
    /* loaded from: classes4.dex */
    public static final class C20881 extends Lambda implements Function1<State, Unit> {
        public C20881() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            state.constraints(ConstrainScope.this.getId()).clearVertical();
        }
    }

    public final void clearVertical() {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.clearVertical.1
            public C20881() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                state.constraints(ConstrainScope.this.getId()).clearVertical();
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$clearConstraints$1 */
    /* loaded from: classes4.dex */
    public static final class C20861 extends Lambda implements Function1<State, Unit> {
        public C20861() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            state.constraints(ConstrainScope.this.getId()).clear();
        }
    }

    public final void clearConstraints() {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.clearConstraints.1
            public C20861() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                state.constraints(ConstrainScope.this.getId()).clear();
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$resetDimensions$1 */
    /* loaded from: classes4.dex */
    public static final class C20891 extends Lambda implements Function1<State, Unit> {
        public C20891() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            androidx.constraintlayout.core.state.Dimension solverDimension$compose_release = ((DimensionDescription) Dimension.INSTANCE.getWrapContent()).toSolverDimension$compose_release(state);
            state.constraints(ConstrainScope.this.getId()).width(solverDimension$compose_release).height(solverDimension$compose_release);
        }
    }

    public final void resetDimensions() {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.resetDimensions.1
            public C20891() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                androidx.constraintlayout.core.state.Dimension solverDimension$compose_release = ((DimensionDescription) Dimension.INSTANCE.getWrapContent()).toSolverDimension$compose_release(state);
                state.constraints(ConstrainScope.this.getId()).width(solverDimension$compose_release).height(solverDimension$compose_release);
            }
        });
    }

    /* compiled from: ConstrainScope.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m7105d2 = {"<anonymous>", "", "state", "Landroidx/constraintlayout/compose/State;"}, m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.ConstrainScope$resetTransforms$1 */
    /* loaded from: classes4.dex */
    public static final class C20901 extends Lambda implements Function1<State, Unit> {
        public C20901() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(State state) {
            invoke2(state);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            state.constraints(ConstrainScope.this.getId()).alpha(Float.NaN).scaleX(Float.NaN).scaleY(Float.NaN).rotationX(Float.NaN).rotationY(Float.NaN).rotationZ(Float.NaN).translationX(Float.NaN).translationY(Float.NaN).translationZ(Float.NaN).pivotX(Float.NaN).pivotY(Float.NaN);
        }
    }

    public final void resetTransforms() {
        this.tasks.add(new Function1<State, Unit>() { // from class: androidx.constraintlayout.compose.ConstrainScope.resetTransforms.1
            public C20901() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                state.constraints(ConstrainScope.this.getId()).alpha(Float.NaN).scaleX(Float.NaN).scaleY(Float.NaN).rotationX(Float.NaN).rotationY(Float.NaN).rotationZ(Float.NaN).translationX(Float.NaN).translationY(Float.NaN).translationZ(Float.NaN).pivotX(Float.NaN).pivotY(Float.NaN);
            }
        });
    }

    /* renamed from: linkTo-8ZKsbrE$default */
    public static /* synthetic */ void m13926linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        constrainScope.m13934linkTo8ZKsbrE(verticalAnchor, verticalAnchor2, (i & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : f, (i & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : f2, (i & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : f3, (i & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-8ZKsbrE$default */
    public static /* synthetic */ void m13925linkTo8ZKsbrE$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, int i, Object obj) {
        constrainScope.m13933linkTo8ZKsbrE(horizontalAnchor, horizontalAnchor2, (i & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : f, (i & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : f2, (i & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : f3, (i & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : f4, (i & 64) != 0 ? 0.5f : f5);
    }

    /* renamed from: linkTo-R7zmacU$default */
    public static /* synthetic */ void m13927linkToR7zmacU$default(ConstrainScope constrainScope, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, Object obj) {
        constrainScope.m13935linkToR7zmacU(verticalAnchor, horizontalAnchor, verticalAnchor2, horizontalAnchor2, (i & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : f, (i & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : f2, (i & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : f3, (i & 128) != 0 ? C2046Dp.m13666constructorimpl(0) : f4, (i & 256) != 0 ? C2046Dp.m13666constructorimpl(0) : f5, (i & 512) != 0 ? C2046Dp.m13666constructorimpl(0) : f6, (i & 1024) != 0 ? C2046Dp.m13666constructorimpl(0) : f7, (i & 2048) != 0 ? C2046Dp.m13666constructorimpl(0) : f8, (i & 4096) != 0 ? 0.5f : f9, (i & 8192) != 0 ? 0.5f : f10);
    }
}
