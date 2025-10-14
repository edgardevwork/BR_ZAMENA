package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.Placeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LookaheadScope.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\t\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000e\u001a\u00020\u0003*\u00020\u0003H'R\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates$annotations", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "coordinates", "localLookaheadPositionOf-dBAh8RU", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)J", "toLookaheadCoordinates", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface LookaheadScope {
    @ExperimentalComposeUiApi
    static /* synthetic */ void getLookaheadScopeCoordinates$annotations(Placeable.PlacementScope placementScope) {
    }

    @NotNull
    LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope placementScope);

    @ExperimentalComposeUiApi
    @NotNull
    LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates layoutCoordinates);

    @ExperimentalComposeUiApi
    /* renamed from: localLookaheadPositionOf-dBAh8RU, reason: not valid java name */
    default long m12628localLookaheadPositionOfdBAh8RU(@NotNull LayoutCoordinates layoutCoordinates, @NotNull LayoutCoordinates layoutCoordinates2) {
        return toLookaheadCoordinates(layoutCoordinates).mo12618localPositionOfR5De75A(toLookaheadCoordinates(layoutCoordinates2), Offset.INSTANCE.m11115getZeroF1C5BW0());
    }
}
