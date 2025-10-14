package com.blackhub.bronline.game.p019ui.interactionwithnpc;

import android.graphics.Bitmap;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
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
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcButtonModel;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcUiState;
import com.blackhub.bronline.game.gui.interactionwithnpc.InteractionWithNpcViewModel;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.ColoredRectangleKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselScrollState;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.SliderVerticalScrollerKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InteractionWithNpcGui.kt */
@SourceDebugExtension({"SMAP\nInteractionWithNpcGui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractionWithNpcGui.kt\ncom/blackhub/bronline/game/ui/interactionwithnpc/InteractionWithNpcGuiKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,421:1\n81#2,11:422\n1116#3,6:433\n1116#3,6:439\n1116#3,6:445\n1116#3,6:451\n69#4,5:457\n74#4:490\n78#4:495\n79#5,11:462\n92#5:494\n456#6,8:473\n464#6,3:487\n467#6,3:491\n3737#7,6:481\n81#8:496\n81#8:497\n107#8,2:498\n81#8:503\n107#8,2:504\n76#9:500\n109#9,2:501\n*S KotlinDebug\n*F\n+ 1 InteractionWithNpcGui.kt\ncom/blackhub/bronline/game/ui/interactionwithnpc/InteractionWithNpcGuiKt\n*L\n89#1:422,11\n138#1:433,6\n139#1:439,6\n140#1:445,6\n142#1:451,6\n365#1:457,5\n365#1:490\n365#1:495\n365#1:462,11\n365#1:494\n365#1:473,8\n365#1:487,3\n365#1:491,3\n365#1:481,6\n90#1:496\n138#1:497\n138#1:498,2\n140#1:503\n140#1:504,2\n139#1:500\n139#1:501,2\n*E\n"})
/* loaded from: classes3.dex */
public final class InteractionWithNpcGuiKt {
    public static final float BLOCK_HEIGHT = 0.4f;
    public static final float COLUMN_WIDTH = 0.65f;
    public static final float PERCENT_BRUSH = 0.3f;
    public static final int RENDER_OFFSET_X = 2;
    public static final int RENDER_OFFSET_Y = 25;
    public static final float RENDER_SCALE = 1.7f;
    public static final float ROW_HEIGHT = 0.5f;
    public static final float TEXT_WIDTH = 0.8f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void InteractionWithNpcGui(@Nullable Composer composer, final int i) {
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1233402315);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1233402315, i, -1, "com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGui (InteractionWithNpcGui.kt:86)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(InteractionWithNpcViewModel.class, current, null, null, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            InteractionWithNpcViewModel interactionWithNpcViewModel = (InteractionWithNpcViewModel) viewModel;
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(interactionWithNpcViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7);
            List<InteractionWithNpcButtonModel> buttonList = InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).getButtonList();
            CarouselScrollState carouselScrollStateRememberCarouselScrollState = ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1);
            boolean z = carouselScrollStateRememberCarouselScrollState.getMaxValue() != 0;
            if (InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).isNeedStartPosition()) {
                carouselScrollStateRememberCarouselScrollState.setValue(0);
                interactionWithNpcViewModel.clearScrollPosition();
            }
            composer2 = composerStartRestartGroup;
            InteractionWithNpcGUIContent(null, InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).getTextTitle(), StringExtensionKt.htmlTextToAnnotatedString(InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).getTextDesc()), InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).getTypingSpeed(), InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).isSkipText(), carouselScrollStateRememberCarouselScrollState, z, InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).getBitmap(), InteractionWithNpcGui$lambda$0(stateCollectAsStateWithLifecycle).isRender(), buttonList, new C57591(interactionWithNpcViewModel), composerStartRestartGroup, 1090519040, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt.InteractionWithNpcGui.2
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
                    InteractionWithNpcGuiKt.InteractionWithNpcGui(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: InteractionWithNpcGui.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGui$1 */

    public /* synthetic */ class C57591 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C57591(Object obj) {
            super(1, obj, InteractionWithNpcViewModel.class, "sendButtonClick", "sendButtonClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((InteractionWithNpcViewModel) this.receiver).sendButtonClick(i);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void InteractionWithNpcGUIContent(@Nullable Modifier modifier, @Nullable String str, @Nullable AnnotatedString annotatedString, final long j, final boolean z, @NotNull final CarouselScrollState scrollState, final boolean z2, @Nullable Bitmap bitmap, boolean z3, @Nullable final List<InteractionWithNpcButtonModel> list, @NotNull final Function1<? super Integer, Unit> onCLick, @Nullable Composer composer, final int i, final int i2, final int i3) {
        String strEmpty;
        int i4;
        AnnotatedString annotatedString2;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(onCLick, "onCLick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1635576089);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 2) != 0) {
            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i4 = i & (-113);
        } else {
            strEmpty = str;
            i4 = i;
        }
        if ((i3 & 4) != 0) {
            annotatedString2 = new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null);
            i4 &= -897;
        } else {
            annotatedString2 = annotatedString;
        }
        final Bitmap bitmap2 = (i3 & 128) != 0 ? null : bitmap;
        boolean z4 = (i3 & 256) != 0 ? false : z3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635576089, i4, i2, "com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGUIContent (InteractionWithNpcGui.kt:128)");
        }
        final Brush brushM11292linearGradientmHitzGk$default = Brush.Companion.m11292linearGradientmHitzGk$default(Brush.INSTANCE, new Pair[]{TuplesKt.m7112to(Float.valueOf(0.0f), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())), TuplesKt.m7112to(Float.valueOf(0.3f), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)))}, 0L, 0L, 0, 14, (Object) null);
        final float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._250sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
        final float fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-259028136);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-259028041);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotLongStateKt.mutableLongStateOf(j);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableLongState mutableLongState = (MutableLongState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-259027972);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-259027907);
        boolean z5 = ((((i & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(j)) || (i & 3072) == 2048) | ((((i & 896) ^ 384) > 256 && composerStartRestartGroup.changed(annotatedString2)) || (i & 384) == 256);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$1$1(j, annotatedString2, mutableState, mutableLongState, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(annotatedString2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, ((i4 >> 6) & 14) | 64);
        final Modifier modifier3 = modifier2;
        final String str2 = strEmpty;
        FakeDialogKt.m15089FakeDialog3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 663520933, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt.InteractionWithNpcGUIContent.2
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                int i6;
                int i7;
                int i8;
                int i9;
                final MutableLongState mutableLongState2;
                final MutableState<Boolean> mutableState3;
                MutableLongState mutableLongState3;
                MutableState<Boolean> mutableState4;
                Function1<Integer, Unit> function1;
                int i10;
                final MutableLongState mutableLongState4;
                final MutableState<Boolean> mutableState5;
                final MutableLongState mutableLongState5;
                final MutableState<Boolean> mutableState6;
                final MutableState<Boolean> mutableState7;
                final MutableLongState mutableLongState6;
                if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(663520933, i5, -1, "com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGUIContent.<anonymous> (InteractionWithNpcGui.kt:168)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    Brush brush = brushM11292linearGradientmHitzGk$default;
                    float f = fM14409dpToPx8Feqmps;
                    String str3 = str2;
                    CarouselScrollState carouselScrollState = scrollState;
                    boolean z6 = z2;
                    MutableState<AnnotatedString> mutableState8 = mutableState;
                    boolean z7 = z;
                    MutableState<Boolean> mutableState9 = mutableState2;
                    List<InteractionWithNpcButtonModel> list2 = list;
                    Function1<Integer, Unit> function12 = onCLick;
                    float f2 = fM14409dpToPx8Feqmps2;
                    MutableLongState mutableLongState7 = mutableLongState;
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0.0f, 1, null), 0.4f), brush, null, 0.0f, 6, null);
                    Alignment bottomEnd = companion2.getBottomEnd();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(bottomEnd, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    MutableState<Boolean> mutableState10 = mutableState9;
                    GradientSphereKt.GradientSphere(OffsetKt.m8083offsetVpY3zN4(SizeKt.fillMaxHeight(companion4, 0.4f), PrimitiveResources_androidKt.dimensionResource(R.dimen._minus60sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._100sdp, composer2, 6)), SideEnum.BOTTOM_RIGHT, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composer2, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), new Pair[0], 0.0f, f, composer2, 4144, 16);
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(companion4, 0.65f), 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, companion2.getStart(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    Function1<Integer, Unit> function13 = function12;
                    MutableLongState mutableLongState8 = mutableLongState7;
                    TextKt.m10024Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14794montserratBold15spOr12ssp1PwDTvk(ColorResources_androidKt.colorResource(R.color.orange, composer2, 6), 0, 0L, 0L, 0.0f, null, composer2, 1572864, 62), composer2, 0, 0, 65534);
                    ColoredRectangleKt.ColoredRectangle(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composer2, 6)), null, composer2, 0, 2);
                    Modifier modifierAlign = columnScopeInstance.align(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(companion4, 0.5f), 0.0f, 1, null), companion2.getEnd());
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Vertical top = companion2.getTop();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, top, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierAlign);
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
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m10025TextIbK3jfQ(InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$2(mutableState8), ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth(companion4, 0.8f), carouselScrollState, false, null, false, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14851montserratSemiBold13spOr10sspRHzUZ70(ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, 0L, 0.0f, null, composer2, ProfileVerifier.CompilationStatus.f342xf2722a21, 30), composer2, 0, 0, 131068);
                    Composer composer3 = composer2;
                    composer3.startReplaceableGroup(-1789641483);
                    if (z6) {
                        i7 = 6;
                        i6 = 1;
                        SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composer3, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer3, 6)), carouselScrollState, 0.0f, 0L, 0.0f, 0.0f, null, null, composer2, 0, SnappyCompressorOutputStream.FOUR_SIZE_BYTE_MARKER);
                    } else {
                        i6 = 1;
                        i7 = 6;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(columnScopeInstance.align(companion4, companion2.getEnd()), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composer3, i7), 0.0f, 11, null);
                    int i11 = R.dimen._18sdp;
                    Modifier modifierM8157defaultMinSizeVpY3zN4$default = SizeKt.m8157defaultMinSizeVpY3zN4$default(modifierM8127paddingqDBjuR0$default, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer3, i7), i6, null);
                    composer3.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8157defaultMinSizeVpY3zN4$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1789640576);
                    if (InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$8(mutableState10) || z7) {
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM8035spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m8035spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer3, i7));
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composer3.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8035spacedBy0680j_4, centerVertically, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer3.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-507772164);
                        if (list2 != null) {
                            for (final InteractionWithNpcButtonModel interactionWithNpcButtonModel : list2) {
                                int buttonId = interactionWithNpcButtonModel.getButtonId();
                                if (buttonId == 0) {
                                    i8 = i11;
                                    i9 = i7;
                                    MutableState<Boolean> mutableState11 = mutableState10;
                                    final Function1<Integer, Unit> function14 = function13;
                                    MutableLongState mutableLongState9 = mutableLongState8;
                                    composer2.startReplaceableGroup(236767625);
                                    composer2.startReplaceableGroup(236767708);
                                    boolean zChanged = composer2.changed(function14) | composer2.changed(interactionWithNpcButtonModel);
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        mutableLongState2 = mutableLongState9;
                                        mutableState3 = mutableState11;
                                        objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$2$1$1$1$2$1$1$1$1
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
                                                if (InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$8(mutableState3)) {
                                                    function14.invoke(Integer.valueOf(interactionWithNpcButtonModel.getButtonKey()));
                                                } else {
                                                    mutableLongState2.setLongValue(0L);
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    } else {
                                        mutableLongState2 = mutableLongState9;
                                        mutableState3 = mutableState11;
                                    }
                                    composer2.endReplaceableGroup();
                                    mutableLongState3 = mutableLongState2;
                                    mutableState4 = mutableState3;
                                    function1 = function14;
                                    i10 = 1;
                                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue5, ComposableLambdaKt.composableLambda(composer2, -926717397, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$2$1$1$1$2$1$1$2
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer4, int i12) {
                                            if ((i12 & 11) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-926717397, i12, -1, "com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGUIContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InteractionWithNpcGui.kt:261)");
                                                }
                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                InteractionWithNpcButtonModel interactionWithNpcButtonModel2 = interactionWithNpcButtonModel;
                                                composer4.startReplaceableGroup(693286680);
                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor7 = companion6.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion5);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor7);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer4);
                                                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion6.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion6.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                }
                                                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_skip, composer4, 6), (String) null, SizeKt.m8172size3ABfNKs(companion5, PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composer4, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                                                TextKt.m10024Text4IGK_g(interactionWithNpcButtonModel2.getButtonText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14792montserratBold13spOr10ssp67j0QOw(ColorResources_androidKt.colorResource(R.color.white, composer4, 6), 0, 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 14), composer4, 0, 0, 65534);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer2, 0, 3072, UnixStat.PERM_MASK);
                                    composer2.endReplaceableGroup();
                                    Unit unit = Unit.INSTANCE;
                                } else if (buttonId != i6) {
                                    if (buttonId == 2) {
                                        MutableState<Boolean> mutableState12 = mutableState10;
                                        final Function1<Integer, Unit> function15 = function13;
                                        MutableLongState mutableLongState10 = mutableLongState8;
                                        composer2.startReplaceableGroup(236771322);
                                        Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer2, 6));
                                        String buttonText = interactionWithNpcButtonModel.getButtonText();
                                        TextStyle textStyleM14809montserratBold9spOr7ssp67j0QOw = TypographyStyle.INSTANCE.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                                        Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_60, composer2, 6))}), 0L, f2, 0, 10, (Object) null);
                                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6));
                                        composer2.startReplaceableGroup(236772576);
                                        boolean zChanged2 = composer2.changed(function15) | composer2.changed(interactionWithNpcButtonModel);
                                        Object objRememberedValue6 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            mutableLongState5 = mutableLongState10;
                                            mutableState6 = mutableState12;
                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$2$1$1$1$2$1$1$4$1
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
                                                    if (InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$8(mutableState6)) {
                                                        function15.invoke(Integer.valueOf(interactionWithNpcButtonModel.getButtonKey()));
                                                    } else {
                                                        mutableLongState5.setLongValue(0L);
                                                    }
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue6);
                                        } else {
                                            mutableLongState5 = mutableLongState10;
                                            mutableState6 = mutableState12;
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, buttonText, textStyleM14809montserratBold9spOr7ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11293radialGradientP_VxKs$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue6, composer2, 0, 0, 0, 16764914);
                                        composer2.endReplaceableGroup();
                                        Unit unit2 = Unit.INSTANCE;
                                        mutableLongState3 = mutableLongState5;
                                        mutableState4 = mutableState6;
                                        function1 = function15;
                                    } else if (buttonId == 3) {
                                        composer3.startReplaceableGroup(236773127);
                                        Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composer3, i7), PrimitiveResources_androidKt.dimensionResource(i11, composer3, i7));
                                        String buttonText2 = interactionWithNpcButtonModel.getButtonText();
                                        TextStyle textStyleM14809montserratBold9spOr7ssp67j0QOw2 = TypographyStyle.INSTANCE.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer3, i7));
                                        composer3.startReplaceableGroup(236773958);
                                        final Function1<Integer, Unit> function16 = function13;
                                        boolean zChanged3 = composer3.changed(function16) | composer3.changed(interactionWithNpcButtonModel);
                                        Object objRememberedValue7 = composer2.rememberedValue();
                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            mutableState7 = mutableState10;
                                            mutableLongState6 = mutableLongState8;
                                            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$2$1$1$1$2$1$1$5$1
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
                                                    if (InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$8(mutableState7)) {
                                                        function16.invoke(Integer.valueOf(interactionWithNpcButtonModel.getButtonKey()));
                                                    } else {
                                                        mutableLongState6.setLongValue(0L);
                                                    }
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue7);
                                        } else {
                                            mutableState7 = mutableState10;
                                            mutableLongState6 = mutableLongState8;
                                        }
                                        composer2.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, buttonText2, textStyleM14809montserratBold9spOr7ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, 0L, f2, null, roundedCornerShapeM8392RoundedCornerShape0680j_42, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue7, composer2, 0, 0, 0, 16766962);
                                        composer2.endReplaceableGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        mutableLongState3 = mutableLongState6;
                                        mutableState4 = mutableState7;
                                        function1 = function16;
                                    } else {
                                        composer3.startReplaceableGroup(236774436);
                                        composer2.endReplaceableGroup();
                                        Unit unit4 = Unit.INSTANCE;
                                        i8 = i11;
                                        i10 = i6;
                                        i9 = i7;
                                        mutableState4 = mutableState10;
                                        function1 = function13;
                                        mutableLongState3 = mutableLongState8;
                                    }
                                    i10 = 1;
                                    i9 = 6;
                                    i8 = R.dimen._18sdp;
                                } else {
                                    MutableState<Boolean> mutableState13 = mutableState10;
                                    final Function1<Integer, Unit> function17 = function13;
                                    MutableLongState mutableLongState11 = mutableLongState8;
                                    composer2.startReplaceableGroup(236769503);
                                    Modifier modifierM8156defaultMinSizeVpY3zN43 = SizeKt.m8156defaultMinSizeVpY3zN4(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composer2, 6));
                                    String buttonText3 = interactionWithNpcButtonModel.getButtonText();
                                    TextStyle textStyleM14809montserratBold9spOr7ssp67j0QOw3 = TypographyStyle.INSTANCE.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                                    Brush brushM11293radialGradientP_VxKs$default2 = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer2, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_60, composer2, 6))}), 0L, f2, 0, 10, (Object) null);
                                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_43 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer2, 6));
                                    composer2.startReplaceableGroup(236770770);
                                    boolean zChanged4 = composer2.changed(function17) | composer2.changed(interactionWithNpcButtonModel);
                                    Object objRememberedValue8 = composer2.rememberedValue();
                                    if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        mutableLongState4 = mutableLongState11;
                                        mutableState5 = mutableState13;
                                        objRememberedValue8 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt$InteractionWithNpcGUIContent$2$1$1$1$2$1$1$3$1
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
                                                if (InteractionWithNpcGuiKt.InteractionWithNpcGUIContent$lambda$8(mutableState5)) {
                                                    function17.invoke(Integer.valueOf(interactionWithNpcButtonModel.getButtonKey()));
                                                } else {
                                                    mutableLongState4.setLongValue(0L);
                                                }
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue8);
                                    } else {
                                        mutableLongState4 = mutableLongState11;
                                        mutableState5 = mutableState13;
                                    }
                                    composer2.endReplaceableGroup();
                                    i8 = R.dimen._18sdp;
                                    i9 = 6;
                                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN43, null, buttonText3, textStyleM14809montserratBold9spOr7ssp67j0QOw3, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brushM11293radialGradientP_VxKs$default2, roundedCornerShapeM8392RoundedCornerShape0680j_43, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue8, composer2, 0, 0, 0, 16764914);
                                    composer2.endReplaceableGroup();
                                    Unit unit5 = Unit.INSTANCE;
                                    mutableLongState3 = mutableLongState4;
                                    mutableState4 = mutableState5;
                                    function1 = function17;
                                    i10 = 1;
                                }
                                composer3 = composer2;
                                mutableLongState8 = mutableLongState3;
                                mutableState10 = mutableState4;
                                i6 = i10;
                                function13 = function1;
                                i7 = i9;
                                i11 = i8;
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 384, 3);
        if (z4 && bitmap2 != null) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Alignment bottomStart = Alignment.INSTANCE.getBottomStart();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomStart, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.m7827Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap2), null, OffsetKt.m8083offsetVpY3zN4(ScaleKt.scale(SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.7f), ComposeExtensionKt.toHorizontalPercentDp(2, composerStartRestartGroup, 6), ComposeExtensionKt.toVerticalPercentSwDp(25, composerStartRestartGroup, 6)), null, ContentScale.INSTANCE.getFillHeight(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final String str3 = strEmpty;
            final AnnotatedString annotatedString3 = annotatedString2;
            final boolean z6 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt.InteractionWithNpcGUIContent.4
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

                public final void invoke(@Nullable Composer composer2, int i5) {
                    InteractionWithNpcGuiKt.InteractionWithNpcGUIContent(modifier4, str3, annotatedString3, j, z, scrollState, z2, bitmap2, z6, list, onCLick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    public static final void InteractionWithNpcGUIContent$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewInteractionWithNpcGUIContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-691927624);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-691927624, i, -1, "com.blackhub.bronline.game.ui.interactionwithnpc.PreviewInteractionWithNpcGUIContent (InteractionWithNpcGui.kt:388)");
            }
            InteractionWithNpcGUIContent(null, "Дмитрий \"Кровавый\" Козлов", new AnnotatedString("Я родился и вырос в этом городе, знаю каждый уголок, каждого крутого парня и каждого бандита. Я сам не раз попадал за решетку, но всегда находил выход из любой ситуации. Здесь жизнь не простая, на каждом шагу кто-то за тобой следит, но если ты крутой парень, то тебя боятся. Мы с товарищами контролируем весь район, все доходы и подпольные дела. Но есть один человек, который всегда стоит на нашем пути - это главарь местной мафии. Он не даёт нам спокойно зарабатывать, постоянно шлёт своих людей за нами. Но мы не сдаёмся и всегда находим выход из любой ситуации. Мы круче его и он это знает. Так что, если кто-то хочет нас остановить, то лучше подумайте дважды, потому что мы не такие простаки, как кажется на первый взгляд.", null, null, 6, null), 10L, false, new CarouselScrollState(0), true, null, false, CollectionsKt__CollectionsKt.listOf((Object[]) new InteractionWithNpcButtonModel[]{new InteractionWithNpcButtonModel("Пропустить", 0, 0), new InteractionWithNpcButtonModel("text", 1, 1), new InteractionWithNpcButtonModel("text", 2, 2), new InteractionWithNpcButtonModel("text", 3, 3)}), new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt.PreviewInteractionWithNpcGUIContent.1
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 1600944, 6, 385);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.interactionwithnpc.InteractionWithNpcGuiKt.PreviewInteractionWithNpcGUIContent.2
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
                    InteractionWithNpcGuiKt.PreviewInteractionWithNpcGUIContent(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final InteractionWithNpcUiState InteractionWithNpcGui$lambda$0(State<InteractionWithNpcUiState> state) {
        return state.getValue();
    }

    public static final AnnotatedString InteractionWithNpcGUIContent$lambda$2(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean InteractionWithNpcGUIContent$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

