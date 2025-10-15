package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BringIntoViewRequester.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "requester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeRequester", "onAttach", "onDetach", "updateRequester", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,197:1\n728#2,2:198\n735#2,2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n168#1:198,2\n175#1:200,2\n*E\n"})
/* loaded from: classes3.dex */
public final class BringIntoViewRequesterNode extends BringIntoViewChildNode {
    public static final int $stable = 8;

    @NotNull
    private BringIntoViewRequester requester;

    public BringIntoViewRequesterNode(@NotNull BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    public final void updateRequester(@NotNull BringIntoViewRequester requester) {
        disposeRequester();
        if (requester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) requester).getModifiers().add(this);
        }
        this.requester = requester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            Intrinsics.checkNotNull(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    @Nullable
    public final Object bringIntoView(@Nullable Rect rect, @NotNull Continuation<? super Unit> continuation) {
        Object objBringChildIntoView;
        BringIntoViewParent parent = getParent();
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        return (layoutCoordinates != null && (objBringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterNode.bringIntoView.2
            public final /* synthetic */ BringIntoViewRequesterNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07762(BringIntoViewRequesterNode this) {
                super(0);
                bringIntoViewRequesterNode = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Rect invoke() {
                Rect rect2 = rect;
                if (rect2 != null) {
                    return rect2;
                }
                LayoutCoordinates layoutCoordinates2 = bringIntoViewRequesterNode.getLayoutCoordinates();
                if (layoutCoordinates2 != null) {
                    return SizeKt.m11189toRectuvyYCjk(IntSizeKt.m13846toSizeozmzZPI(layoutCoordinates2.mo12617getSizeYbymL2g()));
                }
                return null;
            }
        }, continuation)) == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objBringChildIntoView : Unit.INSTANCE;
    }

    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterNode$bringIntoView$2 */
    public static final class C07762 extends Lambda implements Function0<Rect> {
        public final /* synthetic */ BringIntoViewRequesterNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07762(BringIntoViewRequesterNode this) {
            super(0);
            bringIntoViewRequesterNode = this;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Rect invoke() {
            Rect rect2 = rect;
            if (rect2 != null) {
                return rect2;
            }
            LayoutCoordinates layoutCoordinates2 = bringIntoViewRequesterNode.getLayoutCoordinates();
            if (layoutCoordinates2 != null) {
                return SizeKt.m11189toRectuvyYCjk(IntSizeKt.m13846toSizeozmzZPI(layoutCoordinates2.mo12617getSizeYbymL2g()));
            }
            return null;
        }
    }
}
