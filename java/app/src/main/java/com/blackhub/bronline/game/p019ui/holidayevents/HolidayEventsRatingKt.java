package com.blackhub.bronline.game.p019ui.holidayevents;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.rating.CommonRatingModel;
import com.blackhub.bronline.game.p019ui.widget.block.rating.CommonRatingBlockKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsRating.kt */
/* loaded from: classes3.dex */
public final class HolidayEventsRatingKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HolidayEventsRating(final int i, @NotNull final List<CommonRatingModel> ratingList, @Nullable final Bitmap bitmap, @NotNull final Function0<Unit> onRefreshClick, @NotNull final Function1<? super CommonRatingModel, Unit> onItemClick, @Nullable Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(ratingList, "ratingList");
        Intrinsics.checkNotNullParameter(onRefreshClick, "onRefreshClick");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-497640982);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-497640982, i2, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRating (HolidayEventsRating.kt:20)");
        }
        int i3 = i2 << 3;
        CommonRatingBlockKt.CommonRatingBlock(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6)), i, ratingList, bitmap, false, onItemClick, onRefreshClick, composerStartRestartGroup, (i3 & 458752) | (i3 & 112) | 29184 | ((i2 << 9) & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRatingKt.HolidayEventsRating.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    HolidayEventsRatingKt.HolidayEventsRating(i, ratingList, bitmap, onRefreshClick, onItemClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void HolidayEventsRatingPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-300353317);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300353317, i, -1, "com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRatingPreview (HolidayEventsRating.kt:34)");
            }
            HolidayEventsRating(111, CollectionsKt__CollectionsKt.emptyList(), null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRatingKt.HolidayEventsRatingPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CommonRatingModel, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRatingKt.HolidayEventsRatingPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonRatingModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonRatingModel commonRatingModel) {
                    invoke2(commonRatingModel);
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 28086);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.holidayevents.HolidayEventsRatingKt.HolidayEventsRatingPreview.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    HolidayEventsRatingKt.HolidayEventsRatingPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

