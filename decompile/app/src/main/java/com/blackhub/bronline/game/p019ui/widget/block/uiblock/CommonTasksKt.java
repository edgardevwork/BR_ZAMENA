package com.blackhub.bronline.game.p019ui.widget.block.uiblock;

import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskModel;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonTaskCategoryItemKt;
import com.blackhub.bronline.game.p019ui.widget.block.item.CommonTaskItemKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselDefaults;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselKt;
import com.bless.client.R;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonTasks.kt */
@Metadata(m7104d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\u001aà\u0001\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00030\u00152!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u0015H\u0007¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\u0011X\u008a\u0084\u0002"}, m7105d2 = {"HEIGHT_FILL_SCROLL_BAR", "", "CommonTasks", "", "specialTasksList", "", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "dailyTasksList", "selectedCategoryId", "", "seasonCurrencyBitmap", "Landroid/graphics/Bitmap;", "specialCategoryImageBitmap", "dailyCategoryImageBitmap", "seasonTimer", "", "isBp", "", "isTopTasksHaveNotification", "isBottomTasksHaveNotification", "onShowTaskDialog", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "task", "onSelectTaskCategory", "categoryId", "onTaskClick", "(Ljava/util/List;Ljava/util/List;BLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "CommonTasksPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "titleCategory", "", "isSelectedCategorySpecial", "isSelectedCategoryDaily"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCommonTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTasks.kt\ncom/blackhub/bronline/game/ui/widget/block/uiblock/CommonTasksKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,345:1\n1116#2,6:346\n1116#2,6:352\n1116#2,6:358\n1116#2,6:364\n1116#2,6:512\n1116#2,6:559\n68#3,6:370\n74#3:404\n67#3,7:476\n74#3:511\n78#3:522\n67#3,7:523\n74#3:558\n78#3:569\n68#3,6:575\n74#3:609\n78#3:692\n78#3:702\n79#4,11:376\n79#4,11:412\n79#4,11:447\n79#4,11:483\n92#4:521\n79#4,11:530\n92#4:568\n92#4:573\n79#4,11:581\n79#4,11:615\n92#4:647\n79#4,11:654\n92#4:686\n92#4:691\n92#4:696\n92#4:701\n456#5,8:387\n464#5,3:401\n456#5,8:423\n464#5,3:437\n456#5,8:458\n464#5,3:472\n456#5,8:494\n464#5,3:508\n467#5,3:518\n456#5,8:541\n464#5,3:555\n467#5,3:565\n467#5,3:570\n456#5,8:592\n464#5,3:606\n456#5,8:626\n464#5,3:640\n467#5,3:644\n456#5,8:665\n464#5,3:679\n467#5,3:683\n467#5,3:688\n467#5,3:693\n467#5,3:698\n3737#6,6:395\n3737#6,6:431\n3737#6,6:466\n3737#6,6:502\n3737#6,6:549\n3737#6,6:600\n3737#6,6:634\n3737#6,6:673\n86#7,7:405\n93#7:440\n88#7,5:610\n93#7:643\n97#7:648\n88#7,5:649\n93#7:682\n97#7:687\n97#7:697\n74#8,6:441\n80#8:475\n84#8:574\n81#9:703\n81#9:704\n81#9:705\n*S KotlinDebug\n*F\n+ 1 CommonTasks.kt\ncom/blackhub/bronline/game/ui/widget/block/uiblock/CommonTasksKt\n*L\n75#1:346,6\n85#1:352,6\n88#1:358,6\n107#1:364,6\n131#1:512,6\n159#1:559,6\n113#1:370,6\n113#1:404\n122#1:476,7\n122#1:511\n122#1:522\n150#1:523,7\n150#1:558\n150#1:569\n180#1:575,6\n180#1:609\n180#1:692\n113#1:702\n113#1:376,11\n120#1:412,11\n121#1:447,11\n122#1:483,11\n122#1:521\n150#1:530,11\n150#1:568\n121#1:573\n180#1:581,11\n184#1:615,11\n184#1:647\n219#1:654,11\n219#1:686\n180#1:691\n120#1:696\n113#1:701\n113#1:387,8\n113#1:401,3\n120#1:423,8\n120#1:437,3\n121#1:458,8\n121#1:472,3\n122#1:494,8\n122#1:508,3\n122#1:518,3\n150#1:541,8\n150#1:555,3\n150#1:565,3\n121#1:570,3\n180#1:592,8\n180#1:606,3\n184#1:626,8\n184#1:640,3\n184#1:644,3\n219#1:665,8\n219#1:679,3\n219#1:683,3\n180#1:688,3\n120#1:693,3\n113#1:698,3\n113#1:395,6\n120#1:431,6\n121#1:466,6\n122#1:502,6\n150#1:549,6\n180#1:600,6\n184#1:634,6\n219#1:673,6\n120#1:405,7\n120#1:440\n184#1:610,5\n184#1:643\n184#1:648\n219#1:649,5\n219#1:682\n219#1:687\n120#1:697\n121#1:441,6\n121#1:475\n121#1:574\n75#1:703\n85#1:704\n88#1:705\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonTasksKt {
    public static final float HEIGHT_FILL_SCROLL_BAR = 0.88f;

    /* compiled from: CommonTasks.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$3 */
    /* loaded from: classes7.dex */
    public static final class C63593 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Bitmap $dailyCategoryImageBitmap;
        public final /* synthetic */ List<CommonTaskModel> $dailyTasksList;
        public final /* synthetic */ boolean $isBottomTasksHaveNotification;
        public final /* synthetic */ boolean $isBp;
        public final /* synthetic */ boolean $isTopTasksHaveNotification;
        public final /* synthetic */ Function1<Byte, Unit> $onSelectTaskCategory;
        public final /* synthetic */ Function1<CommonTaskModel, Unit> $onShowTaskDialog;
        public final /* synthetic */ Function1<CommonTaskModel, Unit> $onTaskClick;
        public final /* synthetic */ Bitmap $seasonCurrencyBitmap;
        public final /* synthetic */ String $seasonTimer;
        public final /* synthetic */ byte $selectedCategoryId;
        public final /* synthetic */ Bitmap $specialCategoryImageBitmap;
        public final /* synthetic */ List<CommonTaskModel> $specialTasksList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C63593(List<CommonTaskModel> list, List<CommonTaskModel> list2, byte b, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, boolean z, boolean z2, boolean z3, Function1<? super CommonTaskModel, Unit> function1, Function1<? super Byte, Unit> function12, Function1<? super CommonTaskModel, Unit> function13, int i, int i2, int i3) {
            super(2);
            list = list;
            list = list2;
            b = b;
            bitmap = bitmap;
            bitmap = bitmap2;
            bitmap = bitmap3;
            str = str;
            z = z;
            z = z2;
            z = z3;
            function1 = function1;
            function1 = function12;
            function1 = function13;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CommonTasksKt.CommonTasks(list, list, b, bitmap, bitmap, bitmap, str, z, z, z, function1, function1, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: CommonTasks.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasksPreview$4 */
    /* loaded from: classes7.dex */
    public static final class C63634 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63634(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CommonTasksKt.CommonTasksPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CommonTasks(@NotNull final List<CommonTaskModel> specialTasksList, @NotNull final List<CommonTaskModel> dailyTasksList, byte b, @Nullable final Bitmap bitmap, @Nullable Bitmap bitmap2, @Nullable Bitmap bitmap3, @NotNull String seasonTimer, boolean z, boolean z2, boolean z3, @Nullable final Function1<? super CommonTaskModel, Unit> function1, @NotNull final Function1<? super Byte, Unit> onSelectTaskCategory, @NotNull final Function1<? super CommonTaskModel, Unit> onTaskClick, @Nullable Composer composer, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(specialTasksList, "specialTasksList");
        Intrinsics.checkNotNullParameter(dailyTasksList, "dailyTasksList");
        Intrinsics.checkNotNullParameter(seasonTimer, "seasonTimer");
        Intrinsics.checkNotNullParameter(onSelectTaskCategory, "onSelectTaskCategory");
        Intrinsics.checkNotNullParameter(onTaskClick, "onTaskClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1293234563);
        final boolean z4 = (i3 & 128) != 0 ? false : z;
        boolean z5 = (i3 & 256) != 0 ? false : z2;
        boolean z6 = (i3 & 512) != 0 ? false : z3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1293234563, i, i2, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasks (CommonTasks.kt:73)");
        }
        composerStartRestartGroup.startReplaceableGroup(-562240783);
        boolean z7 = (((29360128 & i) ^ 12582912) > 8388608 && composerStartRestartGroup.changed(z4)) || (i & 12582912) == 8388608;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z7 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$titleCategory$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf(z4 ? R.string.black_pass_tasks_weekly : R.string.holiday_events_category_task_special);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        State state = (State) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-562240517);
        int i4 = (i & 896) ^ 384;
        boolean z8 = (i4 > 256 && composerStartRestartGroup.changed(b)) || (i & 384) == 256;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(b == 0), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-562240389);
        boolean z9 = (i4 > 256 && composerStartRestartGroup.changed(b)) || (i & 384) == 256;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z9 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(b == 1), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue3 = mutableStateMutableStateOf$default;
        }
        MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        boolean z10 = z4;
        Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        Byte bValueOf = Byte.valueOf(b);
        composerStartRestartGroup.startReplaceableGroup(-562239843);
        boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new CommonTasksKt$CommonTasks$1$1(lazyListStateRememberLazyListState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(bValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, ((i >> 6) & 14) | 64);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._34wdp, composerStartRestartGroup, 6), 0.0f, 2, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._228wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.gray_bg, composerStartRestartGroup, 6), null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierZIndex = ZIndexModifierKt.zIndex(companion2, 1.0f);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierZIndex);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        String strStringResource = StringResources_androidKt.stringResource(CommonTasks$lambda$1(state), composerStartRestartGroup, 0);
        boolean zCommonTasks$lambda$3 = CommonTasks$lambda$3(mutableState);
        composerStartRestartGroup.startReplaceableGroup(922722278);
        int i5 = (i2 & 112) ^ 48;
        boolean z11 = (i5 > 32 && composerStartRestartGroup.changed(onSelectTaskCategory)) || (i2 & 48) == 32;
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (z11 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$1$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    onSelectTaskCategory.invoke((byte) 0);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CommonTaskCategoryItemKt.CommonTaskCategoryItem(R.dimen._120wdp, R.dimen._114wdp, strStringResource, zCommonTasks$lambda$3, bitmap2, R.color.yellow, seasonTimer, (Function0) objRememberedValue5, composerStartRestartGroup, (3670016 & i) | 229430, 0);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z5), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1798797825, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$1$1$2
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
                        ComposerKt.traceEventStart(-1798797825, i6, -1, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTasks.kt:135)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composer2, 6), (String) null, OffsetKt.m8083offsetVpY3zN4(SizeKt.m8172size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i >> 24) & 14) | 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        String strStringResource2 = StringResources_androidKt.stringResource(R.string.holiday_events_category_task_daily, composerStartRestartGroup, 6);
        boolean zCommonTasks$lambda$5 = CommonTasks$lambda$5(mutableState2);
        composerStartRestartGroup.startReplaceableGroup(922723631);
        boolean z12 = (i5 > 32 && composerStartRestartGroup.changed(onSelectTaskCategory)) || (i2 & 48) == 32;
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z12 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$1$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    onSelectTaskCategory.invoke((byte) 1);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CommonTaskCategoryItemKt.CommonTaskCategoryItem(R.dimen._120wdp, R.dimen._114wdp, strStringResource2, zCommonTasks$lambda$5, bitmap3, R.color.gray_blue, null, (Function0) objRememberedValue6, composerStartRestartGroup, 1802294, 0);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1524905240, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$1$2$2
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
                        ComposerKt.traceEventStart(-1524905240, i6, -1, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTasks.kt:163)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_alarm, composer2, 6), (String) null, OffsetKt.m8083offsetVpY3zN4(SizeKt.m8172size3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i >> 27) & 14) | 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Arrangement.Horizontal end = arrangement.getEnd();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(end, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor7);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, b == 0, (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$1
            @NotNull
            public final Integer invoke(int i6) {
                return Integer.valueOf(i6);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion3.getEnd(), false, null, 13, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$2
            @NotNull
            public final Integer invoke(int i6) {
                return Integer.valueOf(i6);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, companion3.getEnd(), false, null, 13, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1035266479, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i6) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1035266479, i6, -1, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTasks.kt:194)");
                }
                Modifier.Companion companion5 = Modifier.INSTANCE;
                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6);
                Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), fDimensionResource, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6));
                LazyListState lazyListState = lazyListStateRememberLazyListState;
                final List<CommonTaskModel> list = specialTasksList;
                final Bitmap bitmap4 = bitmap;
                final Function1<CommonTaskModel, Unit> function12 = function1;
                final Function1<CommonTaskModel, Unit> function13 = onTaskClick;
                LazyDslKt.LazyColumn(modifierM8126paddingqDBjuR0, lazyListState, null, false, horizontalOrVerticalM8032spacedBy0680j_4, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        final List<CommonTaskModel> list2 = list;
                        final Bitmap bitmap5 = bitmap4;
                        final Function1<CommonTaskModel, Unit> function14 = function12;
                        final Function1<CommonTaskModel, Unit> function15 = function13;
                        final C6349x88edc292 c6349x88edc292 = new Function1() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3$1$invoke$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final Void invoke(CommonTaskModel commonTaskModel) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((CommonTaskModel) obj);
                            }
                        };
                        LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3$1$invoke$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            @Nullable
                            public final Object invoke(int i7) {
                                return c6349x88edc292.invoke(list2.get(i7));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3$1$invoke$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i7, @Nullable Composer composer3, int i8) {
                                int i9;
                                if ((i8 & 14) == 0) {
                                    i9 = (composer3.changed(lazyItemScope) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i8 & 112) == 0) {
                                    i9 |= composer3.changed(i7) ? 32 : 16;
                                }
                                if ((i9 & 731) == 146 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632812321, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                }
                                final CommonTaskModel commonTaskModel = (CommonTaskModel) list2.get(i7);
                                Bitmap bitmap6 = bitmap5;
                                composer3.startReplaceableGroup(-1636703343);
                                boolean zChanged2 = composer3.changed(function14) | composer3.changed(commonTaskModel);
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    final Function1 function16 = function14;
                                    objRememberedValue7 = new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel2) {
                                            invoke2(commonTaskModel2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull CommonTaskModel it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Function1<CommonTaskModel, Unit> function17 = function16;
                                            if (function17 != null) {
                                                function17.invoke(commonTaskModel);
                                            }
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                Function1 function17 = (Function1) objRememberedValue7;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(-1636703257);
                                boolean zChanged3 = composer3.changed(function15) | composer3.changed(commonTaskModel);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    final Function1 function18 = function15;
                                    objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$1$3$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            function18.invoke(commonTaskModel);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                CommonTaskItemKt.CommonTaskItem(R.dimen._50wdp, commonTaskModel, bitmap6, function17, (Function0) objRememberedValue8, composer3, 518);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    }
                }, composer2, 0, 236);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 1600518, 18);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
        Arrangement.Horizontal start = arrangement.getStart();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(start, companion3.getTop(), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor8);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, b == 1, (Modifier) null, EnterExitTransitionKt.slideInHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$1
            @NotNull
            public final Integer invoke(int i6) {
                return Integer.valueOf(-i6);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, companion3.getStart(), false, null, 13, null)), EnterExitTransitionKt.slideOutHorizontally$default(null, new Function1<Integer, Integer>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$2
            @NotNull
            public final Integer invoke(int i6) {
                return Integer.valueOf(-i6);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, 1, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, companion3.getStart(), false, null, 13, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1591537018, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i6) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1591537018, i6, -1, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasks.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonTasks.kt:229)");
                }
                Modifier.Companion companion5 = Modifier.INSTANCE;
                float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6);
                Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), fDimensionResource, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6));
                LazyListState lazyListState = lazyListStateRememberLazyListState;
                final List<CommonTaskModel> list = dailyTasksList;
                final Bitmap bitmap4 = bitmap;
                final Function1<CommonTaskModel, Unit> function12 = function1;
                final Function1<CommonTaskModel, Unit> function13 = onTaskClick;
                LazyDslKt.LazyColumn(modifierM8126paddingqDBjuR0, lazyListState, null, false, horizontalOrVerticalM8032spacedBy0680j_4, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                        invoke2(lazyListScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        final List<CommonTaskModel> list2 = list;
                        final Bitmap bitmap5 = bitmap4;
                        final Function1<CommonTaskModel, Unit> function14 = function12;
                        final Function1<CommonTaskModel, Unit> function15 = function13;
                        final C6353x9c959613 c6353x9c959613 = new Function1() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3$1$invoke$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final Void invoke(CommonTaskModel commonTaskModel) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((CommonTaskModel) obj);
                            }
                        };
                        LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3$1$invoke$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            @Nullable
                            public final Object invoke(int i7) {
                                return c6353x9c959613.invoke(list2.get(i7));
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3$1$invoke$$inlined$items$default$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i7, @Nullable Composer composer3, int i8) {
                                int i9;
                                if ((i8 & 14) == 0) {
                                    i9 = (composer3.changed(lazyItemScope) ? 4 : 2) | i8;
                                } else {
                                    i9 = i8;
                                }
                                if ((i8 & 112) == 0) {
                                    i9 |= composer3.changed(i7) ? 32 : 16;
                                }
                                if ((i9 & 731) == 146 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632812321, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                }
                                final CommonTaskModel commonTaskModel = (CommonTaskModel) list2.get(i7);
                                Bitmap bitmap6 = bitmap5;
                                composer3.startReplaceableGroup(-1636701457);
                                boolean zChanged2 = composer3.changed(function14) | composer3.changed(commonTaskModel);
                                Object objRememberedValue7 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    final Function1 function16 = function14;
                                    objRememberedValue7 = new Function1<CommonTaskModel, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel2) {
                                            invoke2(commonTaskModel2);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull CommonTaskModel it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            Function1<CommonTaskModel, Unit> function17 = function16;
                                            if (function17 != null) {
                                                function17.invoke(commonTaskModel);
                                            }
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue7);
                                }
                                Function1 function17 = (Function1) objRememberedValue7;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(-1636701371);
                                boolean zChanged3 = composer3.changed(function15) | composer3.changed(commonTaskModel);
                                Object objRememberedValue8 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    final Function1 function18 = function15;
                                    objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasks$2$1$2$2$3$1$1$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            function18.invoke(commonTaskModel);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue8);
                                }
                                composer3.endReplaceableGroup();
                                CommonTaskItemKt.CommonTaskItem(R.dimen._50wdp, commonTaskModel, bitmap6, function17, (Function0) objRememberedValue8, composer3, 518);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                    }
                }, composer2, 0, 236);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 1600518, 18);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        CarouselKt.Carousel(lazyListStateRememberLazyListState, boxScopeInstance.align(SizeKt.fillMaxHeight(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6)), 0.88f), companion3.getCenterEnd()), 0.0f, 0.0f, CarouselDefaults.INSTANCE.colors(brushM11289horizontalGradient8A3gB4$default, null, brushM11289horizontalGradient8A3gB4$default2, null, composerStartRestartGroup, CpioConstants.C_ISBLK, 10), composerStartRestartGroup, 0, 12);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt.CommonTasks.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$changed1;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ Bitmap $dailyCategoryImageBitmap;
                public final /* synthetic */ List<CommonTaskModel> $dailyTasksList;
                public final /* synthetic */ boolean $isBottomTasksHaveNotification;
                public final /* synthetic */ boolean $isBp;
                public final /* synthetic */ boolean $isTopTasksHaveNotification;
                public final /* synthetic */ Function1<Byte, Unit> $onSelectTaskCategory;
                public final /* synthetic */ Function1<CommonTaskModel, Unit> $onShowTaskDialog;
                public final /* synthetic */ Function1<CommonTaskModel, Unit> $onTaskClick;
                public final /* synthetic */ Bitmap $seasonCurrencyBitmap;
                public final /* synthetic */ String $seasonTimer;
                public final /* synthetic */ byte $selectedCategoryId;
                public final /* synthetic */ Bitmap $specialCategoryImageBitmap;
                public final /* synthetic */ List<CommonTaskModel> $specialTasksList;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C63593(final List<CommonTaskModel> specialTasksList2, final List<CommonTaskModel> dailyTasksList2, byte b2, final Bitmap bitmap4, Bitmap bitmap22, Bitmap bitmap32, String seasonTimer2, boolean z102, boolean z52, boolean z62, final Function1<? super CommonTaskModel, Unit> function12, final Function1<? super Byte, Unit> onSelectTaskCategory2, final Function1<? super CommonTaskModel, Unit> onTaskClick2, int i6, int i22, int i32) {
                    super(2);
                    list = specialTasksList2;
                    list = dailyTasksList2;
                    b = b2;
                    bitmap = bitmap4;
                    bitmap = bitmap22;
                    bitmap = bitmap32;
                    str = seasonTimer2;
                    z = z102;
                    z = z52;
                    z = z62;
                    function1 = function12;
                    function1 = onSelectTaskCategory2;
                    function1 = onTaskClick2;
                    i = i6;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    CommonTasksKt.CommonTasks(list, list, b, bitmap, bitmap, bitmap, str, z, z, z, function1, function1, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* compiled from: CommonTasks.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasksPreview$1 */
    /* loaded from: classes7.dex */
    public static final class C63601 extends Lambda implements Function1<CommonTaskModel, Unit> {
        public static final C63601 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull CommonTaskModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
            invoke2(commonTaskModel);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CommonTasks.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasksPreview$2 */
    /* loaded from: classes7.dex */
    public static final class C63612 extends Lambda implements Function1<Byte, Unit> {
        public static final C63612 INSTANCE = ;

        public final void invoke(byte b) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Byte b) {
            invoke(b.byteValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CommonTasks.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskModel;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt$CommonTasksPreview$3 */
    /* loaded from: classes7.dex */
    public static final class C63623 extends Lambda implements Function1<CommonTaskModel, Unit> {
        public static final C63623 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull CommonTaskModel it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CommonTaskModel commonTaskModel) {
            invoke2(commonTaskModel);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CommonTasksPreview(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1048603290);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1048603290, i, -1, "com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksPreview (CommonTasks.kt:272)");
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{new CommonTaskModel(false, 0, 0, "special 1", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, CommonTaskState.COMPLETED_STATE, 0, 1479, null), new CommonTaskModel(false, 0, 0, "special 2", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 3", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 4", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "special 5", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null)});
            List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonTaskModel[]{new CommonTaskModel(false, 0, 0, "daily 1", new AnnotatedString("description", null, null, 6, null), 999, 9991239, null, null, CommonTaskState.STOP_STATE, 0, 1415, null), new CommonTaskModel(false, 0, 0, "daily 2", new AnnotatedString("description", null, null, 6, null), 999, 322, null, null, null, 0, 1927, null), new CommonTaskModel(false, 0, 0, "daily 3", new AnnotatedString("description", null, null, 6, null), 999, 228, null, null, null, 0, 1927, null), new CommonTaskModel(false, 0, 0, "daily 4", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null), new CommonTaskModel(false, 0, 0, "daily 5", new AnnotatedString("description", null, null, 6, null), 999, 0, null, null, null, 0, 1991, null)});
            String upperCase = "14 дн. 15ч.".toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            CommonTasks(listListOf, listListOf2, (byte) 1, null, null, null, upperCase, false, false, true, C63601.INSTANCE, C63612.INSTANCE, C63623.INSTANCE, composerStartRestartGroup, 805531008, 438, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.uiblock.CommonTasksKt.CommonTasksPreview.4
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C63634(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CommonTasksKt.CommonTasksPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final int CommonTasks$lambda$1(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean CommonTasks$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean CommonTasks$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
