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
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, m7105d2 = {"CraftTutorialDialog", "", "listOfScreens", "", "Lcom/blackhub/bronline/game/core/utils/attachment/tutorial/CommonTutorialTextsWithImage;", "onCloseClick", "Lkotlin/Function0;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CraftTutorialDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftTutorialDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftTutorialDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftTutorialDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,27:1\n1116#2,6:28\n*S KotlinDebug\n*F\n+ 1 CraftTutorialDialog.kt\ncom/blackhub/bronline/game/ui/craft/CraftTutorialDialogKt\n*L\n17#1:28,6\n*E\n"})
/* loaded from: classes2.dex */
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
