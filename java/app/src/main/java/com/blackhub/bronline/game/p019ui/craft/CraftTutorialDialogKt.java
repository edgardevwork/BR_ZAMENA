package com.blackhub.bronline.game.p019ui.craft;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.tutorial.CommonTutorialTextsWithImage;
import com.blackhub.bronline.game.p019ui.widget.block.tutorial.TutorialImageAndThreeTextsUiKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftTutorialDialog.kt */
@SourceDebugExtension({"SMAP\nCraftTutorialDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftTutorialDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftTutorialDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,27:1\n1116#2,6:28\n*S KotlinDebug\n*F\n+ 1 CraftTutorialDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftTutorialDialogKt\n*L\n17#1:28,6\n*E\n"})

public final class CraftTutorialDialogKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "было сделано в другой функции?")
    @Composable
    public static final void CraftTutorialDialog(@NotNull final List<CommonTutorialTextsWithImage> listOfScreens, @NotNull final Function0<Unit> onCloseClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(listOfScreens, "listOfScreens");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(980348184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(980348184, i, -1, "com.blackhub.bronline.game.ui.craft.CraftTutorialDialog (CraftTutorialDialog.kt:11)");
        }
        int size = listOfScreens.size();
        composerStartRestartGroup.startReplaceableGroup(86625570);
        boolean z = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onCloseClick)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftTutorialDialogKt$CraftTutorialDialog$1$1
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
                    onCloseClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        TutorialImageAndThreeTextsUiKt.TutorialWithImageAndThreeTextsUi(listOfScreens, size, (Function0) objRememberedValue, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftTutorialDialogKt.CraftTutorialDialog.2
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
                    CraftTutorialDialogKt.CraftTutorialDialog(listOfScreens, onCloseClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftTutorialDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1241000474);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241000474, i, -1, "com.blackhub.bronline.game.ui.craft.CraftTutorialDialogPreview (CraftTutorialDialog.kt:22)");
            }
            CraftTutorialDialog(CollectionsKt__CollectionsKt.emptyList(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftTutorialDialogKt.CraftTutorialDialogPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftTutorialDialogKt.CraftTutorialDialogPreview.2
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
                    CraftTutorialDialogKt.CraftTutorialDialogPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

