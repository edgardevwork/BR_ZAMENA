package com.blackhub.bronline.game.p019ui.widget.block.rating;

import android.graphics.Bitmap;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
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
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.RoomMasterTable;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.other.ColoredRectangleKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselDefaults;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayerBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonEventTopList.kt */
/* loaded from: classes3.dex */
public final class CommonEventTopListKt {
    public static final float BTN_BACK_PIVOT_FRACTION_X = 0.0f;
    public static final float BTN_BACK_PIVOT_FRACTION_Y = 0.0f;
    public static final float COLORED_RECTANGLE_WIDTH_PERCENT = 0.7f;
    public static final float COLOR_STOPS_END = 1.0f;
    public static final float COLOR_STOPS_START = 0.4f;
    public static final float GRADIENT_SPHERE_PLACE_ALPHA = 1.0f;
    public static final float GRADIENT_SPHERE_PLACE_HEIGHT_PERCENT = 0.01f;
    public static final float TITLE_LIST_LEVEL_WEIGHT_PERCENT = 0.35f;
    public static final float TITLE_LIST_NICKNAME_WEIGHT_PERCENT = 0.48f;
    public static final float TITLE_LIST_PLACE_WEIGHT_PERCENT = 0.3f;
    public static final float TITLE_LIST_REWARD_OR_SERVER_WEIGHT_PERCENT = 0.38f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CommonEventTopList(@Nullable Modifier modifier, boolean z, @NotNull final CommonEventTopListModel playerItem, @DrawableRes final int i, @NotNull final List<CommonEventTopListModel> playersListItem, @NotNull final AnnotatedString titleText, @NotNull final String rewardOrServerText, boolean z2, @StringRes int i2, boolean z3, @Nullable Bitmap bitmap, @Nullable List<String> list, @Nullable List<? extends List<AnnotatedString>> list2, @NotNull final Function0<Unit> onBackClick, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        Intrinsics.checkNotNullParameter(playerItem, "playerItem");
        Intrinsics.checkNotNullParameter(playersListItem, "playersListItem");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(rewardOrServerText, "rewardOrServerText");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(185811963);
        Modifier modifier2 = (i5 & 1) != 0 ? Modifier.INSTANCE : modifier;
        boolean z4 = (i5 & 2) != 0 ? false : z;
        boolean z5 = (i5 & 128) != 0 ? false : z2;
        int i6 = (i5 & 256) != 0 ? R.string.common_level : i2;
        boolean z6 = (i5 & 512) != 0 ? false : z3;
        Bitmap bitmap2 = (i5 & 1024) != 0 ? null : bitmap;
        List<String> list3 = (i5 & 2048) != 0 ? null : list;
        List<? extends List<AnnotatedString>> list4 = (i5 & 4096) != 0 ? null : list2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(185811963, i3, i4, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopList (CommonEventTopList.kt:92)");
        }
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        Brush.Companion companion = Brush.INSTANCE;
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11366getBlack0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composerStartRestartGroup, 3128, 116);
        final boolean z7 = z4;
        final boolean z8 = z5;
        final boolean z9 = z6;
        final List<String> list5 = list3;
        final int i7 = i6;
        final List<? extends List<AnnotatedString>> list6 = list4;
        FakeDialogKt.m15089FakeDialog3IgeMak(modifier2, ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1910227473, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt.CommonEventTopList.1
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

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i8) {
                boolean z10;
                String strStringResource;
                String str;
                if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1910227473, i8, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopList.<anonymous> (CommonEventTopList.kt:120)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Brush brush = brushM11297verticalGradient8A3gB4$default;
                    final Function0<Unit> function0 = onBackClick;
                    AnnotatedString annotatedString = titleText;
                    int i9 = i;
                    boolean z11 = z7;
                    final CommonEventTopListModel commonEventTopListModel = playerItem;
                    Brush brush2 = brushM11297verticalGradient8A3gB4$default2;
                    boolean z12 = z8;
                    boolean z13 = z9;
                    List<String> list7 = list5;
                    int i10 = i7;
                    String str2 = rewardOrServerText;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final List<List<AnnotatedString>> list8 = list6;
                    final List<CommonEventTopListModel> list9 = playersListItem;
                    composer2.startReplaceableGroup(693286680);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._350wdp, composer2, 6)), 0.0f, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign = boxScopeInstance.align(companion2, companion3.getTopStart());
                    long jTransformOrigin = TransformOriginKt.TransformOrigin(0.0f, 0.0f);
                    composer2.startReplaceableGroup(-687230924);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$1$1$1
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
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign, null, false, null, false, false, false, false, null, 0, jTransformOrigin, null, (Function0) objRememberedValue, ComposableSingletons$CommonEventTopListKt.INSTANCE.m15063getLambda1$app_siteRelease(), composer2, 0, 3072, 3070);
                    Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion3.getCenter());
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer2, 6));
                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer2, 6));
                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_42, centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8125paddingVpY3zN4$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer2, 6));
                    Alignment bottomCenter = companion3.getBottomCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8172size3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageKt.Image(PainterResources_androidKt.painterResource(i9, composer2, 0), (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    if (z11) {
                        composer2.startReplaceableGroup(1521647935);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_three_silhouettes, composer2, 6), (String) null, SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer2, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1521648429);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_one_silhouette, composer2, 6), (String) null, SizeKt.m8158height3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer2, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
                        composer2.endReplaceableGroup();
                    }
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(annotatedString, companion2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 48, 0, 131068);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(ClipKt.clip(companion2, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6))), ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composer2, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6)));
                    Alignment topCenter = companion3.getTopCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor6 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxHeight(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._235wdp, composer2, 6)), 0.01f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._98wdp, composer2, 6), 1, null);
                    SideEnum sideEnum = SideEnum.BOTTOM_CENTER;
                    Pair pairM7112to = TuplesKt.m7112to(Float.valueOf(0.4f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composer2, 6)));
                    Float fValueOf = Float.valueOf(1.0f);
                    Color.Companion companion5 = Color.INSTANCE;
                    GradientSphereKt.GradientSphere(modifierM8084offsetVpY3zN4$default, sideEnum, null, new Pair[]{pairM7112to, TuplesKt.m7112to(fValueOf, Color.m11330boximpl(companion5.m11375getTransparent0d7_KjU()))}, 1.0f, ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer2, 6), composer2, 0), composer2, 24624, 4);
                    ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion2, companion3.getBottomCenter()), 0.7f), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(companion5.m11375getTransparent0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange_80, composer2, 6)), Color.m11330boximpl(companion5.m11375getTransparent0d7_KjU())}), 0L, 0L, 0, 14, (Object) null), composer2, 0, 0);
                    TextKt.m10024Text4IGK_g(commonEventTopListModel.getPlayerPlace(), PaddingKt.m8123padding3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer2, 6)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14831montserratExtraBoldItalicCustomSp2884n0o(R.dimen._20wsp, 0L, 0, 0L, 0.0f, 0L, composer2, 1572870, 62), composer2, 0, 0, 65532);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierBackground$default = BackgroundKt.background$default(rowScopeInstance.align(ClipKt.clip(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, 6), 0.0f, 9, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6))), companion3.getBottom()), brush, null, 0.0f, 6, null);
                    Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor7 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor7);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierBackground$default2 = BackgroundKt.background$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6))), brush2, null, 0.0f, 6, null);
                    Alignment center = companion3.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor8 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierBackground$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor8);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRememberBoxMeasurePolicy4, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierM8126paddingqDBjuR0 = PaddingKt.m8126paddingqDBjuR0(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer2, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._24wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer2, 6));
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor9 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM8126paddingqDBjuR0);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor9);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRowMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                    }
                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    String str3 = list7 != null ? list7.get(0) : null;
                    composer2.startReplaceableGroup(1974855750);
                    String strStringResource2 = str3 == null ? StringResources_androidKt.stringResource(R.string.common_place, composer2, 6) : str3;
                    composer2.endReplaceableGroup();
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, companion2, 0.3f, false, 2, null);
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource2, modifierWeight$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._17wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 0, 0, 65532);
                    String str4 = list7 != null ? list7.get(1) : null;
                    composer2.startReplaceableGroup(1974856233);
                    String strStringResource3 = str4 == null ? StringResources_androidKt.stringResource(R.string.common_nickname, composer2, 6) : str4;
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(strStringResource3, RowScope.weight$default(rowScopeInstance, companion2, 0.48f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._17wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 0, 0, 65532);
                    String str5 = list7 != null ? list7.get(2) : null;
                    composer2.startReplaceableGroup(1974856742);
                    if (str5 == null) {
                        z10 = false;
                        strStringResource = StringResources_androidKt.stringResource(i10, composer2, 0);
                    } else {
                        z10 = false;
                        strStringResource = str5;
                    }
                    composer2.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(strStringResource, RowScope.weight$default(rowScopeInstance, companion2, 0.35f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._17wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 0, 0, 65532);
                    TextKt.m10024Text4IGK_g((list7 == null || (str = list7.get(3)) == null) ? str2 : str, RowScope.weight$default(rowScopeInstance, companion2, 0.38f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._17wsp, 0L, companion6.m13558getCentere0LSkKk(), 0L, 0.0f, null, composer2, 1572870, 58), composer2, 0, 0, 65532);
                    SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer2, 6)), composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor10 = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor10);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy4, companion4.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion4.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                        composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                        composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                    }
                    function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    LazyDslKt.LazyColumn(RowScope.weight$default(rowScopeInstance, PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer2, 6), 0.0f, 9, null), 1.0f, false, 2, null), lazyListState, null, false, arrangement.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer2, 6)), companion3.getCenterHorizontally(), null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1
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
                            List<List<AnnotatedString>> list10 = list8;
                            if (list10 == null || list10.isEmpty()) {
                                final List<CommonEventTopListModel> list11 = list9;
                                final CommonEventTopListModel commonEventTopListModel2 = commonEventTopListModel;
                                final C6312x3d115b93 c6312x3d115b93 = new Function1() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    @Nullable
                                    public final Void invoke(CommonEventTopListModel commonEventTopListModel3) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((CommonEventTopListModel) obj);
                                    }
                                };
                                LazyColumn.items(list11.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    @Nullable
                                    public final Object invoke(int i11) {
                                        return c6312x3d115b93.invoke(list11.get(i11));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$4
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
                                    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i11, @Nullable Composer composer3, int i12) {
                                        int i13;
                                        if ((i12 & 14) == 0) {
                                            i13 = (composer3.changed(lazyItemScope) ? 4 : 2) | i12;
                                        } else {
                                            i13 = i12;
                                        }
                                        if ((i12 & 112) == 0) {
                                            i13 |= composer3.changed(i11) ? 32 : 16;
                                        }
                                        if ((i13 & 731) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                        }
                                        CommonEventTopListItemKt.CommonEventTopListItem(null, (CommonEventTopListModel) list11.get(i11), null, commonEventTopListModel2.getPlayerPlace(), false, composer3, CpioConstants.C_ISBLK, 5);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return;
                            }
                            final List<List<AnnotatedString>> list12 = list8;
                            final CommonEventTopListModel commonEventTopListModel3 = commonEventTopListModel;
                            final C6316x3d115b97 c6316x3d115b97 = new Function1() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$5
                                @Override // kotlin.jvm.functions.Function1
                                @Nullable
                                public final Void invoke(List<? extends AnnotatedString> list13) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((List<? extends AnnotatedString>) obj);
                                }
                            };
                            LazyColumn.items(list12.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i11) {
                                    return c6316x3d115b97.invoke(list12.get(i11));
                                }
                            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$1$invoke$$inlined$items$default$8
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
                                public final void invoke(@NotNull LazyItemScope lazyItemScope, int i11, @Nullable Composer composer3, int i12) {
                                    int i13;
                                    if ((i12 & 14) == 0) {
                                        i13 = (composer3.changed(lazyItemScope) ? 4 : 2) | i12;
                                    } else {
                                        i13 = i12;
                                    }
                                    if ((i12 & 112) == 0) {
                                        i13 |= composer3.changed(i11) ? 32 : 16;
                                    }
                                    if ((i13 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    CommonEventTopListItemKt.CommonEventTopListItem(null, null, (List) list12.get(i11), commonEventTopListModel3.getPlayerPlace(), false, composer3, 25136, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 204);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z13), ComposableLambdaKt.composableLambda(composer2, 900171161, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt$CommonEventTopList$1$1$2$2$2
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i11) {
                            if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(900171161, i11, -1, "com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommonEventTopList.kt:354)");
                                }
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer3, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composer3, 6)), 0.0f, 1, null);
                                CarouselDefaults carouselDefaults = CarouselDefaults.INSTANCE;
                                Brush.Companion companion8 = Brush.INSTANCE;
                                CarouselKt.Carousel(lazyListState, modifierFillMaxHeight$default2, 0.0f, 0.0f, carouselDefaults.colors(Brush.Companion.m11289horizontalGradient8A3gB4$default(companion8, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composer3, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion8, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composer3, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composer3, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), null, composer3, CpioConstants.C_ISBLK, 10), composer3, 0, 12);
                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6)), composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1817573265);
                    if (!z12) {
                        CommonEventTopListItemKt.CommonEventTopListItem(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._11wdp, composer2, 6), 7, null), commonEventTopListModel, null, commonEventTopListModel.getPlayerPlace(), z13, composer2, 0, 4);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, (i3 & 14) | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final boolean z10 = z4;
            final boolean z11 = z5;
            final int i8 = i6;
            final boolean z12 = z6;
            final Bitmap bitmap3 = bitmap2;
            final List<String> list7 = list3;
            final List<? extends List<AnnotatedString>> list8 = list4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt.CommonEventTopList.2
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

                public final void invoke(@Nullable Composer composer2, int i9) {
                    CommonEventTopListKt.CommonEventTopList(modifier3, z10, playerItem, i, playersListItem, titleText, rewardOrServerText, z11, i8, z12, bitmap3, list7, list8, onBackClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewCommonEventTopList(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1539562644);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539562644, i, -1, "com.blackhub.bronline.game.ui.widget.block.rating.PreviewCommonEventTopList (CommonEventTopList.kt:399)");
            }
            composer2 = composerStartRestartGroup;
            CommonEventTopList(null, false, new CommonEventTopListModel("22", "Fedorovech_Kerelchenkodbabas", RoomMasterTable.DEFAULT_ID, "Уникальный\nавтомобиль", null, 16, null), R.drawable.ic_reward, CollectionsKt__CollectionsKt.listOf((Object[]) new CommonEventTopListModel[]{new CommonEventTopListModel("1", "Nick_Name", "44", "Уникальный\nавтомобиль", null, 16, null), new CommonEventTopListModel("2", "Fedorovech_Kerelchenkodbabas", "9999", "Уникальный\nавтомобиль", null, 16, null), new CommonEventTopListModel("3", "Nick_Name", "34", "Уникальный", null, 16, null), new CommonEventTopListModel("4", "Nick_Name", "24", "ARKHANGELSK", null, 16, null), new CommonEventTopListModel(YouTubePlayerBridge.ERROR_HTML_5_PLAYER, "Nick_Name", "22", "Уникальный\nавтомобиль", null, 16, null), new CommonEventTopListModel("6", "Nick_Name", "21", "Уникальный\nавтомобиль", null, 16, null), new CommonEventTopListModel("4", "Nick_Name", "24", "ARKHANGELSK", null, 16, null), new CommonEventTopListModel(YouTubePlayerBridge.ERROR_HTML_5_PLAYER, "Nick_Name", "22", "Уникальный\nавтомобиль", null, 16, null), new CommonEventTopListModel("6", "Nick_Name", "21", "Уникальный\nавтомобиль", null, 16, null)}), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.host_machine_top_list_top_in_level_in_game, composerStartRestartGroup, 6)), StringResources_androidKt.stringResource(R.string.common_prize, composerStartRestartGroup, 6), true, 0, true, null, CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Уровень", "Награда", "Очки", "Статус"}), null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt.PreviewCommonEventTopList.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 817892352, 3120, 5379);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.rating.CommonEventTopListKt.PreviewCommonEventTopList.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CommonEventTopListKt.PreviewCommonEventTopList(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

