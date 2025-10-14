package com.blackhub.bronline.game.p019ui.bpbanner.uiblock;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.attachment.ImageModel;
import com.blackhub.bronline.game.p019ui.widget.other.GradientSphereKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassRewardItem.kt */
@SourceDebugExtension({"SMAP\nBlackPassRewardItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassRewardItem.kt\ncom/blackhub/bronline/game/ui/bpbanner/uiblock/BlackPassRewardItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,127:1\n1116#2,6:128\n74#3:134\n78#4,2:135\n80#4:165\n84#4:209\n79#5,11:137\n79#5,11:171\n92#5:203\n92#5:208\n456#6,8:148\n464#6,3:162\n456#6,8:182\n464#6,3:196\n467#6,3:200\n467#6,3:205\n3737#7,6:156\n3737#7,6:190\n69#8,5:166\n74#8:199\n78#8:204\n81#9:210\n107#9,2:211\n*S KotlinDebug\n*F\n+ 1 BlackPassRewardItem.kt\ncom/blackhub/bronline/game/ui/bpbanner/uiblock/BlackPassRewardItemKt\n*L\n48#1:128,6\n50#1:134\n82#1:135,2\n82#1:165\n82#1:209\n82#1:137,11\n88#1:171,11\n88#1:203\n82#1:208\n82#1:148,8\n82#1:162,3\n88#1:182,8\n88#1:196,3\n88#1:200,3\n82#1:205,3\n82#1:156,6\n88#1:190,6\n88#1:166,5\n88#1:199\n88#1:204\n48#1:210\n48#1:211,2\n*E\n"})

public final class BlackPassRewardItemKt {
    public static final float BRUSH_ALPHA = 0.7f;

    public static final /* synthetic */ void access$BlackPassRewardItem$lambda$2(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassRewardItem(@NotNull final ImageModel imageModel, @Nullable Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(imageModel, "imageModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(701143327);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(imageModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(701143327, i2, -1, "com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItem (BlackPassRewardItem.kt:41)");
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))});
            float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-720355887);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(imageModel, new C49581(imageModel, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState, null), composerStartRestartGroup, (i2 & 14) | 64);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
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
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._70wdp, composerStartRestartGroup, 6));
            Alignment center2 = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            GradientSphereKt.GradientSphere(null, SideEnum.CENTER, listListOf, new Pair[0], 0.7f, fM14409dpToPx8Feqmps, composerStartRestartGroup, 28720, 1);
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(BlackPassRewardItem$lambda$1(mutableState), SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 56, 124);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m10024Text4IGK_g(imageModel.getName(), SizeKt.wrapContentHeight$default(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), null, false, 3, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14843montserratMediumCustomSpbl3sdaw(R.dimen._10wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, 196614, 26), composer2, 0, 0, 65532);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt.BlackPassRewardItem.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i3) {
                    BlackPassRewardItemKt.BlackPassRewardItem(imageModel, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* compiled from: BlackPassRewardItem.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt$BlackPassRewardItem$1", m7120f = "BlackPassRewardItem.kt", m7121i = {}, m7122l = {53}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt$BlackPassRewardItem$1 */
    public static final class C49581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ ImageModel $imageModel;
        public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49581(ImageModel imageModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super C49581> continuation) {
            super(2, continuation);
            this.$imageModel = imageModel;
            this.$context = context;
            this.$prizeImage$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C49581(this.$imageModel, this.$context, this.$prizeImage$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C49581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BlackPassRewardItem.kt */
        @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt$BlackPassRewardItem$1$1", m7120f = "BlackPassRewardItem.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
        /* renamed from: com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt$BlackPassRewardItem$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ ImageModel $imageModel;
            public final /* synthetic */ MutableState<Bitmap> $prizeImage$delegate;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ImageModel imageModel, Context context, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$imageModel = imageModel;
                this.$context = context;
                this.$prizeImage$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$imageModel, this.$context, this.$prizeImage$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Bitmap bitmapDrawableToBitmap;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$imageModel.getRender() != null) {
                    GameRender gameRender = GameRender.getInstance();
                    int type = this.$imageModel.getRender().getType();
                    int id = this.$imageModel.getRender().getId();
                    int modelId = this.$imageModel.getRender().getModelId();
                    int color = this.$imageModel.getRender().getColor();
                    int color2 = this.$imageModel.getRender().getColor();
                    float rotationX = this.$imageModel.getRender().getRotationX();
                    float rotationY = this.$imageModel.getRender().getRotationY();
                    float rotationZ = this.$imageModel.getRender().getRotationZ();
                    float zoom = this.$imageModel.getRender().getZoom();
                    final MutableState<Bitmap> mutableState = this.$prizeImage$delegate;
                    gameRender.RequestRender(type, id, modelId, color, color2, rotationX, rotationY, rotationZ, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt$BlackPassRewardItem$1$1$$ExternalSyntheticLambda0
                        @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                        public final void OnRenderComplete(int i, Bitmap bitmap) {
                            BlackPassRewardItemKt.access$BlackPassRewardItem$lambda$2(mutableState, bitmap);
                        }
                    });
                } else {
                    MutableState<Bitmap> mutableState2 = this.$prizeImage$delegate;
                    if (this.$imageModel.getImageName().length() > 0) {
                        bitmapDrawableToBitmap = BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$imageModel.getImageName(), this.$imageModel.getImageType(), 0.0f, 0.0f, 24, null);
                    } else {
                        bitmapDrawableToBitmap = BitmapUtilsKt.drawableToBitmap(this.$context, R.drawable.img_not_found);
                    }
                    BlackPassRewardItemKt.BlackPassRewardItem$lambda$2(mutableState2, bitmapDrawableToBitmap);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imageModel, this.$context, this.$prizeImage$delegate, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "BlackPassRewardItem")
    public static final void PreviewBlackPassRewardItem(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1652832573);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1652832573, i, -1, "com.blackhub.bronline.game.ui.bpbanner.uiblock.PreviewBlackPassRewardItem (BlackPassRewardItem.kt:120)");
            }
            BlackPassRewardItem(new ImageModel(0, null, null, "reward 1", null, 23, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.bpbanner.uiblock.BlackPassRewardItemKt.PreviewBlackPassRewardItem.1
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
                    BlackPassRewardItemKt.PreviewBlackPassRewardItem(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Bitmap BlackPassRewardItem$lambda$1(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void BlackPassRewardItem$lambda$2(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }
}

