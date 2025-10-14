package com.blackhub.bronline.game.p019ui.widget.dialog;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardModel;
import com.blackhub.bronline.game.core.utils.attachment.reward.CommonRewardState;
import com.blackhub.bronline.game.gui.calendar.model.CalendarBonusRewardState;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonRewardDialog.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m7105d2 = {"CommonRewardDialog", "", "modifier", "Landroidx/compose/ui/Modifier;", "previewPrize", "Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;", "onButtonClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/core/utils/attachment/reward/CommonRewardModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CommonRewardDialogKt {

    /* compiled from: CommonRewardDialog.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CommonRewardState.values().length];
            try {
                iArr[CommonRewardState.NORM_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonRewardState.EPIC_AVAILABLE_NORW_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommonRewardState.NORM_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommonRewardState.EPIC_RECEIVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CalendarBonusRewardState.values().length];
            try {
                iArr2[CalendarBonusRewardState.AVAILABLE_NORM_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CalendarBonusRewardState.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonRewardDialog(@Nullable Modifier modifier, @NotNull final CommonRewardModel previewPrize, @NotNull final Function0<Unit> onButtonClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(previewPrize, "previewPrize");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(683304064);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(683304064, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.CommonRewardDialog (CommonRewardDialog.kt:20)");
        }
        final int i3 = 3;
        if (previewPrize.getMainRewardState() != CommonRewardState.NONE) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[previewPrize.getMainRewardState().ordinal()];
            if (i4 == 1 || i4 == 2) {
                i3 = 2;
            } else if (i4 != 3 && i4 != 4) {
                i3 = 1;
            }
        } else {
            int i5 = WhenMappings.$EnumSwitchMapping$1[previewPrize.getBonusRewardState().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                }
            }
        }
        FakeDialogKt.m15089FakeDialog3IgeMak(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_50, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1572970508, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.CommonRewardDialogKt.CommonRewardDialog.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i6) {
                if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1572970508, i6, -1, "com.blackhub.bronline.game.ui.widget.dialog.CommonRewardDialog.<anonymous> (CommonRewardDialog.kt:46)");
                    }
                    String rewardDescription = previewPrize.getRewardDescription();
                    CommonRewardModel commonRewardModel = previewPrize;
                    if (rewardDescription.length() == 0) {
                        rewardDescription = commonRewardModel.getRewardName();
                    }
                    String str = rewardDescription;
                    int i7 = i3;
                    CommonRarityEnum rarityState = previewPrize.getRarityState();
                    Bitmap image = previewPrize.getImage();
                    composer2.startReplaceableGroup(869773647);
                    boolean zChanged = composer2.changed(onButtonClick);
                    final Function0<Unit> function0 = onButtonClick;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.CommonRewardDialogKt$CommonRewardDialog$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    PreviewRewardDialogUiKt.PreviewRewardDialogUi(str, i7, rarityState, image, 0, (Function0) objRememberedValue, composer2, 4096, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.CommonRewardDialogKt.CommonRewardDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    CommonRewardDialogKt.CommonRewardDialog(modifier2, previewPrize, onButtonClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
