package com.blackhub.bronline.game.p019ui.donate;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.blackhub.bronline.game.core.viewmodel.JNIActivityViewModel;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollSilverThumbCarouselKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.billingclient.model.product.Product;

/* compiled from: DonateDepositCoinsRustoreUi.kt */
@SourceDebugExtension({"SMAP\nDonateDepositCoinsRustoreUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonateDepositCoinsRustoreUi.kt\ncom/blackhub/bronline/game/ui/donate/DonateDepositCoinsRustoreUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,102:1\n1116#2,6:103\n*S KotlinDebug\n*F\n+ 1 DonateDepositCoinsRustoreUi.kt\ncom/blackhub/bronline/game/ui/donate/DonateDepositCoinsRustoreUiKt\n*L\n39#1:103,6\n*E\n"})
/* loaded from: classes3.dex */
public final class DonateDepositCoinsRustoreUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DonateDepositCoinsRustoreUi(@NotNull final JNIActivityViewModel viewModel, @NotNull final Function1<? super Product, Unit> onClick, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1473402174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1473402174, i, -1, "com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUi (DonateDepositCoinsRustoreUi.kt:32)");
        }
        List list = (List) FlowExtKt.collectAsStateWithLifecycle(viewModel.getRustoreProductDetailsState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 8, 7).getValue();
        composerStartRestartGroup.startReplaceableGroup(534008726);
        boolean z = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onClick)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<Product, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateDepositCoinsRustoreUi$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Product product) {
                    invoke2(product);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Product product) {
                    Intrinsics.checkNotNullParameter(product, "product");
                    onClick.invoke(product);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        DonateRustoreDepositCoinsContent(null, list, (Function1) objRememberedValue, composerStartRestartGroup, 64, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt.DonateDepositCoinsRustoreUi.2
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

                public final void invoke(@Nullable Composer composer2, int i2) {
                    DonateDepositCoinsRustoreUiKt.DonateDepositCoinsRustoreUi(viewModel, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DonateRustoreDepositCoinsContent(@Nullable Modifier modifier, @NotNull final List<RustoreProductDetailsItem> list, @NotNull final Function1<? super Product, Unit> onClick, @Nullable Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2056211242);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2056211242, i, -1, "com.blackhub.bronline.game.ui.donate.DonateRustoreDepositCoinsContent (DonateDepositCoinsRustoreUi.kt:48)");
        }
        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
        final Modifier modifier3 = modifier2;
        SurfaceKt.m9876SurfaceT9BRK9s(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), 7, null), null, Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1644881563, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt.DonateRustoreDepositCoinsContent.1
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
            public final void invoke(@Nullable Composer composer2, int i3) {
                if ((i3 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1644881563, i3, -1, "com.blackhub.bronline.game.ui.donate.DonateRustoreDepositCoinsContent.<anonymous> (DonateDepositCoinsRustoreUi.kt:58)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    LazyListState lazyListState = lazyListStateRememberLazyListState;
                    final List<RustoreProductDetailsItem> list2 = list;
                    final Function1<Product, Unit> function1 = onClick;
                    composer2.startReplaceableGroup(-483455358);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String upperCase = StringResources_androidKt.stringResource(R.string.donate_bc_packages, composer2, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextKt.m10024Text4IGK_g(upperCase, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10ssp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composer2, 12582918, 122), composer2, 0, 0, 65532);
                    LazyDslKt.LazyRow(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateRustoreDepositCoinsContent$1$1$1
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
                        public final void invoke2(@NotNull LazyListScope LazyRow) {
                            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                            final List<RustoreProductDetailsItem> list3 = list2;
                            final Function1<Product, Unit> function12 = function1;
                            final C5543x3a3b03be c5543x3a3b03be = new Function1() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateRustoreDepositCoinsContent$1$1$1$invoke$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                @Nullable
                                public final Void invoke(RustoreProductDetailsItem rustoreProductDetailsItem) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((RustoreProductDetailsItem) obj);
                                }
                            };
                            LazyRow.items(list3.size(), null, new Function1<Integer, Object>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateRustoreDepositCoinsContent$1$1$1$invoke$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                @Nullable
                                public final Object invoke(int i4) {
                                    return c5543x3a3b03be.invoke(list3.get(i4));
                                }
                            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateRustoreDepositCoinsContent$1$1$1$invoke$$inlined$items$default$4
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
                                public final void invoke(@NotNull LazyItemScope lazyItemScope, int i4, @Nullable Composer composer3, int i5) {
                                    int i6;
                                    if ((i5 & 14) == 0) {
                                        i6 = (composer3.changed(lazyItemScope) ? 4 : 2) | i5;
                                    } else {
                                        i6 = i5;
                                    }
                                    if ((i5 & 112) == 0) {
                                        i6 |= composer3.changed(i4) ? 32 : 16;
                                    }
                                    if ((i6 & 731) == 146 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                    }
                                    final RustoreProductDetailsItem rustoreProductDetailsItem = (RustoreProductDetailsItem) list3.get(i4);
                                    String title = rustoreProductDetailsItem.getModel().getTitle();
                                    String buttonText = rustoreProductDetailsItem.getModel().getButtonText();
                                    String imageUri = rustoreProductDetailsItem.getModel().getImageUri();
                                    int oldPrice = rustoreProductDetailsItem.getModel().getOldPrice();
                                    int actualPrice = rustoreProductDetailsItem.getModel().getActualPrice();
                                    boolean zIsDoublePrice = rustoreProductDetailsItem.getModel().isDoublePrice();
                                    String valueOfSale = rustoreProductDetailsItem.getModel().getValueOfSale();
                                    final Function1 function13 = function12;
                                    DonateDepositCoinsItemKt.DonateDepositCoinsItem(title, buttonText, imageUri, oldPrice, actualPrice, zIsDoublePrice, valueOfSale, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt$DonateRustoreDepositCoinsContent$1$1$1$1$1
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
                                            function13.invoke(rustoreProductDetailsItem.getProduct());
                                        }
                                    }, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                        }
                    }, composer2, 6, 254);
                    ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._15sdp, composer2, 6)), 0.9f), lazyListState, 0.0f, 0.0f, null, null, composer2, 0, 60);
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
        }), composerStartRestartGroup, 12583296, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.donate.DonateDepositCoinsRustoreUiKt.DonateRustoreDepositCoinsContent.2
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

                public final void invoke(@Nullable Composer composer2, int i3) {
                    DonateDepositCoinsRustoreUiKt.DonateRustoreDepositCoinsContent(modifier3, list, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}

