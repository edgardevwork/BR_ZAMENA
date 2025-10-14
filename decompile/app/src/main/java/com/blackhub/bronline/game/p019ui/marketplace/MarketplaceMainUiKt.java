package com.blackhub.bronline.game.p019ui.marketplace;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.focus.FocusChangedModifierKt;
import androidx.compose.p003ui.focus.FocusManager;
import androidx.compose.p003ui.focus.FocusState;
import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.CompositingStrategy;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProfileInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftFilterBlockKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceBottomSheetKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceHistoryListKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceHistoryPreviewBlockKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceLastPurchaseCardKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplacePaginatorKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceProductCardKt;
import com.blackhub.bronline.game.p019ui.marketplace.uiblock.MarketplaceTabBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.CarouselScrollState;
import com.blackhub.bronline.game.p019ui.widget.scroll.ScrollKt;
import com.blackhub.bronline.game.p019ui.widget.scroll.SliderVerticalScrollerKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceMainUi.kt */
@Metadata(m7104d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¬\u0005\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0001\u0010&\u001a\u00020\u00052\b\b\u0001\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00152\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0,2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0,2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0,2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\t042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\t042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\t042\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t042\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0,2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0,2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\t042!\u0010A\u001a\u001d\u0012\u0013\u0012\u00110B¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\t0,2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\t042\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0,2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\t04H\u0007¢\u0006\u0002\u0010K\u001a\r\u0010L\u001a\u00020\tH\u0007¢\u0006\u0002\u0010M\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006N²\u0006\n\u0010O\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010P\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020RX\u008a\u0084\u0002²\u0006\n\u0010S\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020\u0001X\u008a\u0084\u0002"}, m7105d2 = {"ALPHA", "", "DELAY", "", "DURATION", "", "GRADIENT_RADIUS", "SHADOW_ALPHA", "MarketplaceMainUi", "", "profileInfo", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;", "bottomSheetInfo", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;", "moneyText", "", "currentSortFilter", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;", "bgMarketplace", "Landroid/graphics/Bitmap;", "products", "", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "selectedProduct", "filterList", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "currentPage", "pagesToShow", "isHasVip", "", "isNeedToShowFilter", "isNeedToShowEmptyListLabel", "isHintsOpened", "isWithIndicationFilter", "isBottomSheetBlockVisible", "isScrollBarVisible", "filterColorList", "priceColorList", "filterColor", "hintsMargin", "selectedTab", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;", "tabs", "onClickDoneInPriceTextField", "Lkotlin/Function1;", "onClickDoneInCountTextField", "onClickConfirmSearch", "onClickSetPrice", "onPaginatorPageSelected", "onClickSetForceCount", "onClickLike", "onClickMinusButton", "Lkotlin/Function0;", "onClickPlusButton", "onClickRedButton", "onClickGreenButton", "onClickCheckBox", "onClickCardMainButton", "onClickHistoryProduct", "onClickSort", "onInfoClick", "onClickCloseInfo", "onClickFilterButton", "onResetFilterButtonClick", "onClickConfirmFilters", "onFilterCheckboxClick", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "Lkotlin/ParameterName;", "name", "filterCheckBox", "onPlusButtonClick", "onTabClick", "onClickCloseBottomSheet", "onClickToDonat", "onClickClose", "(Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;Landroid/graphics/Bitmap;Ljava/util/List;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;Ljava/util/List;ILjava/util/List;ZZZZZZZLjava/util/List;Ljava/util/List;IILcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;IIIII)V", "MarketplaceMainUiPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "isBottomSheetPainted", "isFocused", "screenWidth", "Landroidx/compose/ui/unit/Dp;", "alphaAnimated", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "isNeedToShowTimer", "alphaAnim", "offsetY", "animatedOffsetY"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceMainUi.kt\ncom/blackhub/bronline/game/ui/marketplace/MarketplaceMainUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1415:1\n1116#2,6:1416\n1116#2,3:1427\n1119#2,3:1433\n1116#2,6:1438\n1116#2,6:1445\n1116#2,6:1463\n1116#2,6:1469\n1116#2,6:1475\n1116#2,6:1481\n487#3,4:1422\n491#3,2:1430\n495#3:1436\n25#4:1426\n487#5:1432\n74#6:1437\n74#6:1444\n1549#7:1451\n1620#7,3:1452\n1549#7:1455\n1620#7,3:1456\n1549#7:1459\n1620#7,3:1460\n81#8:1487\n107#8,2:1488\n81#8:1490\n107#8,2:1491\n81#8:1493\n81#8:1494\n81#8:1495\n81#8:1496\n81#8:1497\n81#8:1498\n107#8,2:1499\n81#8:1501\n*S KotlinDebug\n*F\n+ 1 MarketplaceMainUi.kt\ncom/blackhub/bronline/game/ui/marketplace/MarketplaceMainUiKt\n*L\n184#1:1416,6\n187#1:1427,3\n187#1:1433,3\n190#1:1438,6\n193#1:1445,6\n246#1:1463,6\n260#1:1469,6\n266#1:1475,6\n276#1:1481,6\n187#1:1422,4\n187#1:1430,2\n187#1:1436\n187#1:1426\n187#1:1432\n188#1:1437\n191#1:1444\n200#1:1451\n200#1:1452,3\n206#1:1455\n206#1:1456,3\n212#1:1459\n212#1:1460,3\n184#1:1487\n184#1:1488,2\n190#1:1490\n190#1:1491,2\n193#1:1493\n224#1:1494\n230#1:1495\n246#1:1496\n252#1:1497\n260#1:1498\n260#1:1499,2\n261#1:1501\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceMainUiKt {
    public static final float ALPHA = 0.4f;
    public static final long DELAY = 300;
    public static final int DURATION = 300;
    public static final float GRADIENT_RADIUS = 180.0f;
    public static final float SHADOW_ALPHA = 0.3f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void MarketplaceMainUi(@NotNull final MarketplaceProfileInfo profileInfo, @NotNull final MarketplaceBottomSheetInfo bottomSheetInfo, @NotNull final String moneyText, @NotNull final MarketplaceSortFilter currentSortFilter, @Nullable final Bitmap bitmap, @NotNull final List<MarketplaceProduct> products, @NotNull final MarketplaceProduct selectedProduct, @NotNull final List<CraftCategoryFilter> filterList, final int i, @NotNull final List<Integer> pagesToShow, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, @NotNull final List<Integer> filterColorList, @NotNull final List<Integer> priceColorList, @ColorRes final int i2, @DimenRes final int i3, @NotNull final MarketplaceTab selectedTab, @NotNull final List<MarketplaceTab> tabs, @NotNull final Function1<? super String, Unit> onClickDoneInPriceTextField, @NotNull final Function1<? super String, Unit> onClickDoneInCountTextField, @NotNull final Function1<? super String, Unit> onClickConfirmSearch, @NotNull final Function1<? super String, Unit> onClickSetPrice, @NotNull final Function1<? super Integer, Unit> onPaginatorPageSelected, @NotNull final Function1<? super String, Unit> onClickSetForceCount, @NotNull final Function1<? super MarketplaceProduct, Unit> onClickLike, @NotNull final Function0<Unit> onClickMinusButton, @NotNull final Function0<Unit> onClickPlusButton, @NotNull final Function0<Unit> onClickRedButton, @NotNull final Function0<Unit> onClickGreenButton, @NotNull final Function0<Unit> onClickCheckBox, @NotNull final Function1<? super Integer, Unit> onClickCardMainButton, @NotNull final Function1<? super Integer, Unit> onClickHistoryProduct, @NotNull final Function0<Unit> onClickSort, @NotNull final Function0<Unit> onInfoClick, @NotNull final Function0<Unit> onClickCloseInfo, @NotNull final Function0<Unit> onClickFilterButton, @NotNull final Function0<Unit> onResetFilterButtonClick, @NotNull final Function0<Unit> onClickConfirmFilters, @NotNull final Function1<? super CraftItemCategoryFilter, Unit> onFilterCheckboxClick, @NotNull final Function0<Unit> onPlusButtonClick, @NotNull final Function1<? super Integer, Unit> onTabClick, @NotNull final Function0<Unit> onClickCloseBottomSheet, @NotNull final Function0<Unit> onClickToDonat, @NotNull final Function0<Unit> onClickClose, @Nullable Composer composer, final int i4, final int i5, final int i6, final int i7, final int i8) {
        float f;
        Object obj;
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        Intrinsics.checkNotNullParameter(bottomSheetInfo, "bottomSheetInfo");
        Intrinsics.checkNotNullParameter(moneyText, "moneyText");
        Intrinsics.checkNotNullParameter(currentSortFilter, "currentSortFilter");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(selectedProduct, "selectedProduct");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(pagesToShow, "pagesToShow");
        Intrinsics.checkNotNullParameter(filterColorList, "filterColorList");
        Intrinsics.checkNotNullParameter(priceColorList, "priceColorList");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onClickDoneInPriceTextField, "onClickDoneInPriceTextField");
        Intrinsics.checkNotNullParameter(onClickDoneInCountTextField, "onClickDoneInCountTextField");
        Intrinsics.checkNotNullParameter(onClickConfirmSearch, "onClickConfirmSearch");
        Intrinsics.checkNotNullParameter(onClickSetPrice, "onClickSetPrice");
        Intrinsics.checkNotNullParameter(onPaginatorPageSelected, "onPaginatorPageSelected");
        Intrinsics.checkNotNullParameter(onClickSetForceCount, "onClickSetForceCount");
        Intrinsics.checkNotNullParameter(onClickLike, "onClickLike");
        Intrinsics.checkNotNullParameter(onClickMinusButton, "onClickMinusButton");
        Intrinsics.checkNotNullParameter(onClickPlusButton, "onClickPlusButton");
        Intrinsics.checkNotNullParameter(onClickRedButton, "onClickRedButton");
        Intrinsics.checkNotNullParameter(onClickGreenButton, "onClickGreenButton");
        Intrinsics.checkNotNullParameter(onClickCheckBox, "onClickCheckBox");
        Intrinsics.checkNotNullParameter(onClickCardMainButton, "onClickCardMainButton");
        Intrinsics.checkNotNullParameter(onClickHistoryProduct, "onClickHistoryProduct");
        Intrinsics.checkNotNullParameter(onClickSort, "onClickSort");
        Intrinsics.checkNotNullParameter(onInfoClick, "onInfoClick");
        Intrinsics.checkNotNullParameter(onClickCloseInfo, "onClickCloseInfo");
        Intrinsics.checkNotNullParameter(onClickFilterButton, "onClickFilterButton");
        Intrinsics.checkNotNullParameter(onResetFilterButtonClick, "onResetFilterButtonClick");
        Intrinsics.checkNotNullParameter(onClickConfirmFilters, "onClickConfirmFilters");
        Intrinsics.checkNotNullParameter(onFilterCheckboxClick, "onFilterCheckboxClick");
        Intrinsics.checkNotNullParameter(onPlusButtonClick, "onPlusButtonClick");
        Intrinsics.checkNotNullParameter(onTabClick, "onTabClick");
        Intrinsics.checkNotNullParameter(onClickCloseBottomSheet, "onClickCloseBottomSheet");
        Intrinsics.checkNotNullParameter(onClickToDonat, "onClickToDonat");
        Intrinsics.checkNotNullParameter(onClickClose, "onClickClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-543800219);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-543800219, i4, i5, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi (MarketplaceMainUi.kt:181)");
        }
        final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$textField$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<String> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        composerStartRestartGroup.startReplaceableGroup(-695510578);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState2 = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        final String strStringResource = StringResources_androidKt.stringResource(R.string.marketplace_search_bar_hint, composerStartRestartGroup, 6);
        final CarouselScrollState carouselScrollStateRememberCarouselScrollState = ScrollKt.rememberCarouselScrollState(0, composerStartRestartGroup, 0, 1);
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        composerStartRestartGroup.startReplaceableGroup(-695510293);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        final Configuration configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        composerStartRestartGroup.startReplaceableGroup(-695510183);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<C2046Dp>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$screenWidth$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ C2046Dp invoke() {
                    return C2046Dp.m13664boximpl(m14996invokeD9Ej5fM());
                }

                /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
                public final float m14996invokeD9Ej5fM() {
                    return C2046Dp.m13666constructorimpl(configuration.screenWidthDp);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        State state = (State) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        Brush.Companion companion2 = Brush.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-695510001);
        List<Integer> titleIconColorList = selectedTab.getTitleIconColorList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(titleIconColorList, 10));
        Iterator<T> it = titleIconColorList.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, arrayList, 0.0f, 0.0f, 0, 14, (Object) null);
        Brush.Companion companion3 = Brush.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-695509854);
        List<Integer> list = priceColorList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it2.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion3, arrayList2, 0.0f, 0.0f, 0, 14, (Object) null);
        Brush.Companion companion4 = Brush.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-695509705);
        List<Integer> list2 = filterColorList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Color.m11330boximpl(ColorResources_androidKt.colorResource(((Number) it3.next()).intValue(), composerStartRestartGroup, 0)));
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Brush brushM11297verticalGradient8A3gB4$default3 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion4, arrayList3, 0.0f, 0.0f, 0, 14, (Object) null);
        Brush.Companion companion5 = Brush.INSTANCE;
        final Brush brushM11297verticalGradient8A3gB4$default4 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        float f2 = z6 ? 1.0f : 0.0f;
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, null, 6, null);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, tweenSpecTween$default, 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 48, 20);
        final State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z6 ? 0.0f : MarketplaceMainUi$lambda$7(state), AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 20);
        final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(-695508737);
        boolean zChanged = composerStartRestartGroup.changed(selectedTab);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$isNeedToShowTimer$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.valueOf(selectedProduct.getIsNeedToShowTimer(selectedTab.getTabValue()));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final State state2 = (State) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        final State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(z6 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearOutSlowInEasing(), 2, null), 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 20);
        composerStartRestartGroup.startReplaceableGroup(-695508298);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue6 == companion6.getEmpty()) {
            f = 0.0f;
            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        } else {
            f = 0.0f;
        }
        final MutableState mutableState4 = (MutableState) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        final State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(MarketplaceMainUi$lambda$17(mutableState4) > f ? MarketplaceMainUi$lambda$17(mutableState4) : 0.0f, null, 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 22);
        Boolean boolValueOf = Boolean.valueOf(z6);
        composerStartRestartGroup.startReplaceableGroup(-695508053);
        boolean z8 = (((458752 & i5) ^ ProfileVerifier.CompilationStatus.f342xf2722a21) > 131072 && composerStartRestartGroup.changed(z6)) || (i5 & ProfileVerifier.CompilationStatus.f342xf2722a21) == 131072;
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (z8 || objRememberedValue7 == companion6.getEmpty()) {
            objRememberedValue7 = new MarketplaceMainUiKt$MarketplaceMainUi$1$1(z6, mutableState4, mutableState2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, ((i5 >> 15) & 14) | 64);
        composerStartRestartGroup.startReplaceableGroup(-695507804);
        boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue8 == companion6.getEmpty()) {
            obj = null;
            objRememberedValue8 = new MarketplaceMainUiKt$MarketplaceMainUi$2$1(mutableState, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        } else {
            obj = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(selectedTab, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 72);
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj), null, ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -941085974, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUi.3
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
            public final void invoke(@Nullable Composer composer2, int i9) {
                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-941085974, i9, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous> (MarketplaceMainUi.kt:284)");
                    }
                    final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6);
                    final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer2, 6);
                    final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer2, 6);
                    final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer2, 6);
                    final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6);
                    final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._55wdp, composer2, 6);
                    final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer2, 6);
                    final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._200wdp, composer2, 6);
                    final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(i3, composer2, 0);
                    final Bitmap bitmap2 = bitmap;
                    final MarketplaceTab marketplaceTab = selectedTab;
                    final boolean z9 = z7;
                    final boolean z10 = z3;
                    final MutableState<String> mutableState5 = mutableState;
                    final Function0<Unit> function0 = onClickClose;
                    final Function0<Unit> function02 = onInfoClick;
                    final int i10 = i;
                    final List<Integer> list3 = pagesToShow;
                    final Function1<Integer, Unit> function1 = onPaginatorPageSelected;
                    final boolean z11 = z4;
                    final Function0<Unit> function03 = onClickSort;
                    final Function0<Unit> function04 = onClickFilterButton;
                    final boolean z12 = z5;
                    final List<MarketplaceTab> list4 = tabs;
                    final Function0<Unit> function05 = onPlusButtonClick;
                    final MarketplaceProfileInfo marketplaceProfileInfo = profileInfo;
                    final List<MarketplaceProduct> list5 = products;
                    final Function1<Integer, Unit> function12 = onClickHistoryProduct;
                    final MarketplaceProduct marketplaceProduct = selectedProduct;
                    final CarouselScrollState carouselScrollState = carouselScrollStateRememberCarouselScrollState;
                    final Function1<Integer, Unit> function13 = onClickCardMainButton;
                    final State<Boolean> state3 = state2;
                    final Function1<MarketplaceProduct, Unit> function14 = onClickLike;
                    final Brush brush = brushM11297verticalGradient8A3gB4$default;
                    final boolean z13 = z;
                    final MutableState<Boolean> mutableState6 = mutableState3;
                    final Function1<String, Unit> function15 = onClickConfirmSearch;
                    final FocusManager focusManager2 = focusManager;
                    final String str = strStringResource;
                    final String str2 = moneyText;
                    final Function0<Unit> function06 = onClickToDonat;
                    final Brush brush2 = brushM11297verticalGradient8A3gB4$default4;
                    final Function0<Unit> function07 = onClickCloseInfo;
                    final Brush brush3 = brushM11289horizontalGradient8A3gB4$default;
                    final MarketplaceSortFilter marketplaceSortFilter = currentSortFilter;
                    final Brush brush4 = brushM11297verticalGradient8A3gB4$default3;
                    final int i11 = i2;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final Function1<Integer, Unit> function16 = onTabClick;
                    final List<CraftCategoryFilter> list6 = filterList;
                    final boolean z14 = z2;
                    final Function0<Unit> function08 = onResetFilterButtonClick;
                    final Function0<Unit> function09 = onClickConfirmFilters;
                    final Function1<CraftItemCategoryFilter, Unit> function17 = onFilterCheckboxClick;
                    final MutableState<Boolean> mutableState7 = mutableState2;
                    final boolean z15 = z6;
                    final State<Float> state4 = stateAnimateFloatAsState2;
                    final State<Float> state5 = stateAnimateFloatAsState4;
                    final State<Float> state6 = stateAnimateFloatAsState3;
                    final MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = bottomSheetInfo;
                    final Brush brush5 = brushM11297verticalGradient8A3gB4$default2;
                    final Function1<String, Unit> function18 = onClickDoneInPriceTextField;
                    final Function1<String, Unit> function19 = onClickDoneInCountTextField;
                    final Function1<String, Unit> function110 = onClickSetPrice;
                    final Function1<String, Unit> function111 = onClickSetForceCount;
                    final Function0<Unit> function010 = onClickMinusButton;
                    final Function0<Unit> function011 = onClickPlusButton;
                    final Function0<Unit> function012 = onClickRedButton;
                    final Function0<Unit> function013 = onClickGreenButton;
                    final Function0<Unit> function014 = onClickCheckBox;
                    final Function0<Unit> function015 = onClickCloseBottomSheet;
                    final State<Float> state7 = stateAnimateFloatAsState;
                    final MutableState<Float> mutableState8 = mutableState4;
                    composer2.startReplaceableGroup(-270267587);
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    Composer.Companion companion8 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion8.getEmpty()) {
                        objRememberedValue9 = new Measurer();
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    final Measurer measurer = (Measurer) objRememberedValue9;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (objRememberedValue10 == companion8.getEmpty()) {
                        objRememberedValue10 = new ConstraintLayoutScope();
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue10;
                    composer2.startReplaceableGroup(-3687241);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (objRememberedValue11 == companion8.getEmpty()) {
                        objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue11, measurer, composer2, 4544);
                    MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                    final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                    final int i12 = 0;
                    LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion7, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$invoke$$inlined$ConstraintLayout$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                        }
                    }, 1, null), ComposableLambdaKt.composableLambda(composer2, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$invoke$$inlined$ConstraintLayout$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i13) {
                            ConstrainedLayoutReference constrainedLayoutReference;
                            ConstrainedLayoutReference constrainedLayoutReference2;
                            ConstraintLayoutScope constraintLayoutScope2;
                            int i14;
                            ConstrainedLayoutReference constrainedLayoutReference3;
                            ConstrainedLayoutReference constrainedLayoutReference4;
                            ConstrainedLayoutReference constrainedLayoutReference5;
                            ConstrainedLayoutReference constrainedLayoutReference6;
                            ConstrainedLayoutReference constrainedLayoutReference7;
                            Composer composer4;
                            int i15;
                            Composer composer5;
                            ConstrainedLayoutReference constrainedLayoutReference8;
                            ConstraintLayoutScope constraintLayoutScope3;
                            Modifier.Companion companion9;
                            ConstrainedLayoutReference constrainedLayoutReference9;
                            boolean z16;
                            C5798x9e44c2e6 c5798x9e44c2e6 = this;
                            if (((i13 & 11) ^ 2) != 0 || !composer3.getSkipping()) {
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                final ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs.component12();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent13 = constrainedLayoutReferencesCreateRefs.component13();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent14 = constrainedLayoutReferencesCreateRefs.component14();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent15 = constrainedLayoutReferencesCreateRefs.component15();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent16 = constrainedLayoutReferencesCreateRefs.component16();
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs2 = constraintLayoutScope4.createRefs();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent17 = constrainedLayoutReferencesCreateRefs2.component1();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent22 = constrainedLayoutReferencesCreateRefs2.component2();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent32 = constrainedLayoutReferencesCreateRefs2.component3();
                                ConstrainedLayoutReference constrainedLayoutReferenceComponent42 = constrainedLayoutReferencesCreateRefs2.component4();
                                final ConstrainedLayoutReference constrainedLayoutReferenceComponent52 = constrainedLayoutReferencesCreateRefs2.component5();
                                ContentScale crop = ContentScale.INSTANCE.getCrop();
                                Modifier.Companion companion10 = Modifier.INSTANCE;
                                ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null), null, crop, 0.0f, null, 0, composer3, 3128, 116);
                                int i16 = 0;
                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(constraintLayoutScope4.constrainAs(companion10, constrainedLayoutReferenceComponent42, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                    }
                                }), PrimitiveResources_androidKt.dimensionResource(R.dimen._660wdp, composer3, 6)), composer3, 0);
                                int tabValue = marketplaceTab.getTabValue();
                                if (tabValue != 1) {
                                    if (tabValue == 3) {
                                        composer3.startReplaceableGroup(673714402);
                                        composer3.startReplaceableGroup(673714484);
                                        boolean zChanged3 = composer3.changed(constrainedLayoutReferenceComponent2) | composer3.changed(fDimensionResource6) | composer3.changed(fDimensionResource7);
                                        Object objRememberedValue12 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            final float f3 = fDimensionResource6;
                                            final float f4 = fDimensionResource7;
                                            objRememberedValue12 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$4$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), f3, 0.0f, 4, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f4, 0.0f, 4, null);
                                                    Dimension.Companion companion11 = Dimension.INSTANCE;
                                                    constrainAs.setHeight(companion11.getFillToConstraints());
                                                    constrainAs.setWidth(companion11.getFillToConstraints());
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion10, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue12);
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion11.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierConstrainAs);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion11.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion11.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion11.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Boolean boolValueOf2 = Boolean.valueOf(!list5.isEmpty());
                                        final boolean z17 = z9;
                                        final List list7 = list5;
                                        final Function1 function112 = function12;
                                        final float f5 = fDimensionResource5;
                                        final MarketplaceProduct marketplaceProduct2 = marketplaceProduct;
                                        ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer3, 201697214, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer6, int i17) {
                                                if ((i17 & 11) != 2 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(201697214, i17, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:438)");
                                                    }
                                                    boolean z18 = z17;
                                                    List<MarketplaceProduct> list8 = list7;
                                                    final Function1<Integer, Unit> function113 = function112;
                                                    float f6 = f5;
                                                    MarketplaceProduct marketplaceProduct3 = marketplaceProduct2;
                                                    composer6.startReplaceableGroup(693286680);
                                                    Modifier.Companion companion12 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer6, 0);
                                                    composer6.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion13.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion12);
                                                    if (!(composer6.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer6.startReusableNode();
                                                    if (composer6.getInserting()) {
                                                        composer6.createNode(constructor2);
                                                    } else {
                                                        composer6.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer6);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion13.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion13.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion13.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                                    composer6.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion12, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer6, 6), 7, null);
                                                    composer6.startReplaceableGroup(-1350855254);
                                                    boolean zChanged4 = composer6.changed(function113);
                                                    Object objRememberedValue13 = composer6.rememberedValue();
                                                    if (zChanged4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue13 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$5$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                                                invoke(num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(int i18) {
                                                                function113.invoke(Integer.valueOf(i18));
                                                            }
                                                        };
                                                        composer6.updateRememberedValue(objRememberedValue13);
                                                    }
                                                    composer6.endReplaceableGroup();
                                                    MarketplaceHistoryListKt.MarketplaceHistoryList(modifierM8127paddingqDBjuR0$default, z18, list8, (Function1) objRememberedValue13, composer6, 512, 0);
                                                    MarketplaceHistoryPreviewBlockKt.MarketplaceHistoryPreviewBlock(PaddingKt.m8127paddingqDBjuR0$default(companion12, 0.0f, 0.0f, f6, 0.0f, 11, null), marketplaceProduct3, composer6, 64, 0);
                                                    composer6.endReplaceableGroup();
                                                    composer6.endNode();
                                                    composer6.endReplaceableGroup();
                                                    composer6.endReplaceableGroup();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        }), composer3, 48);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        Unit unit = Unit.INSTANCE;
                                        i14 = helpersHashCode;
                                        constrainedLayoutReference2 = constrainedLayoutReferenceComponent2;
                                        constrainedLayoutReference6 = constrainedLayoutReferenceComponent42;
                                        constraintLayoutScope2 = constraintLayoutScope4;
                                        constrainedLayoutReference = constrainedLayoutReferenceComponent1;
                                        composer4 = composer3;
                                        constrainedLayoutReference3 = constrainedLayoutReferenceComponent11;
                                        constrainedLayoutReference4 = constrainedLayoutReferenceComponent12;
                                        constrainedLayoutReference5 = constrainedLayoutReferenceComponent13;
                                        constrainedLayoutReference7 = constrainedLayoutReferenceComponent14;
                                    } else {
                                        composer3.startReplaceableGroup(673716080);
                                        composer3.startReplaceableGroup(673716162);
                                        boolean zChanged4 = composer3.changed(fDimensionResource8);
                                        Object objRememberedValue13 = composer3.rememberedValue();
                                        if (zChanged4 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            final float f6 = fDimensionResource8;
                                            objRememberedValue13 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$6$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f6, 0.0f, 4, null);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue13);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(constraintLayoutScope4.constrainAs(companion10, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue13), PrimitiveResources_androidKt.dimensionResource(R.dimen._660wdp, composer3, 6)), 0.0f, 1, null);
                                        composer3.startReplaceableGroup(733328855);
                                        Alignment.Companion companion12 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion12.getTopStart(), false, composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion13.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor2);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion13.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion13.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion13.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6), 5, null);
                                        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), 0.0f, 11, null);
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion10, carouselScrollState, false, null, false, 14, null);
                                        composer3.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion12.getStart(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor3 = companion13.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion13.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion13.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion13.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-1922955918);
                                        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, list5.size() - 1, 2);
                                        if (progressionLastElement >= 0) {
                                            final int i17 = 0;
                                            while (true) {
                                                final int i18 = i17 + 1;
                                                final MarketplaceProduct marketplaceProduct3 = (MarketplaceProduct) list5.get(i17);
                                                final MarketplaceProduct marketplaceProduct4 = (MarketplaceProduct) CollectionsKt___CollectionsKt.getOrNull(list5, i18);
                                                composer3.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, i16);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, i16);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor4 = companion14.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor4);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion14.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion14.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion14.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, Integer.valueOf(i16));
                                                composer3.startReplaceableGroup(2058660585);
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                boolean zMarketplaceMainUi$lambda$14 = MarketplaceMainUiKt.MarketplaceMainUi$lambda$14(state3);
                                                composer3.startReplaceableGroup(-1350852812);
                                                boolean zChanged5 = composer3.changed(function13) | composer3.changed(i17);
                                                Object objRememberedValue14 = composer3.rememberedValue();
                                                if (zChanged5 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                    final Function1 function113 = function13;
                                                    objRememberedValue14 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$7$1$1$1$1
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
                                                            function113.invoke(Integer.valueOf(i17));
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue14);
                                                }
                                                composer3.endReplaceableGroup();
                                                final Function1 function114 = function14;
                                                int i19 = i17;
                                                constrainedLayoutReference9 = constrainedLayoutReferenceComponent42;
                                                z16 = true;
                                                MarketplaceProductCardKt.MarketplaceProductCard(modifierM8127paddingqDBjuR0$default2, marketplaceProduct3, zMarketplaceMainUi$lambda$14, (Function0) objRememberedValue14, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$7$1$1$2
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
                                                        function114.invoke(marketplaceProduct3);
                                                    }
                                                }, composer3, 64, 0);
                                                composer3.startReplaceableGroup(-1922954724);
                                                if (marketplaceProduct4 != null) {
                                                    Modifier.Companion companion15 = Modifier.INSTANCE;
                                                    boolean zMarketplaceMainUi$lambda$142 = MarketplaceMainUiKt.MarketplaceMainUi$lambda$14(state3);
                                                    composer3.startReplaceableGroup(978014024);
                                                    boolean zChanged6 = composer3.changed(function13) | composer3.changed(i18);
                                                    Object objRememberedValue15 = composer3.rememberedValue();
                                                    if (zChanged6 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                        final Function1 function115 = function13;
                                                        objRememberedValue15 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$7$1$1$3$1$1
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
                                                                function115.invoke(Integer.valueOf(i18));
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue15);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    final Function1 function116 = function14;
                                                    MarketplaceProductCardKt.MarketplaceProductCard(companion15, marketplaceProduct4, zMarketplaceMainUi$lambda$142, (Function0) objRememberedValue15, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$7$1$1$3$2
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
                                                            function116.invoke(marketplaceProduct4);
                                                        }
                                                    }, composer3, 70, 0);
                                                    Unit unit2 = Unit.INSTANCE;
                                                }
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                composer3.endNode();
                                                composer3.endReplaceableGroup();
                                                composer3.endReplaceableGroup();
                                                if (i19 == progressionLastElement) {
                                                    break;
                                                }
                                                i17 = i19 + 2;
                                                constrainedLayoutReferenceComponent42 = constrainedLayoutReference9;
                                                i16 = 0;
                                            }
                                        } else {
                                            constrainedLayoutReference9 = constrainedLayoutReferenceComponent42;
                                            z16 = true;
                                        }
                                        composer3.endReplaceableGroup();
                                        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer3, 6)), composer3, 0);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        Boolean boolValueOf3 = Boolean.valueOf(z9);
                                        final float f7 = fDimensionResource7;
                                        final CarouselScrollState carouselScrollState2 = carouselScrollState;
                                        ComposeExtensionKt.IfTrue(boolValueOf3, ComposableLambdaKt.composableLambda(composer3, -1115326376, z16, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer6, int i20) {
                                                if ((i20 & 11) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1115326376, i20, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:527)");
                                                }
                                                ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope4;
                                                Modifier.Companion companion16 = Modifier.INSTANCE;
                                                ConstrainedLayoutReference constrainedLayoutReference10 = constrainedLayoutReferenceComponent32;
                                                composer6.startReplaceableGroup(1468812956);
                                                boolean zChanged7 = composer6.changed(constrainedLayoutReferenceComponent1) | composer6.changed(f7);
                                                final ConstrainedLayoutReference constrainedLayoutReference11 = constrainedLayoutReferenceComponent1;
                                                final float f8 = f7;
                                                Object objRememberedValue16 = composer6.rememberedValue();
                                                if (zChanged7 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue16 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$8$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                            invoke2(constrainScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference11.getEnd(), 0.0f, 0.0f, 6, null);
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference11.getTop(), f8, 0.0f, 4, null);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(objRememberedValue16);
                                                }
                                                composer6.endReplaceableGroup();
                                                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion16, constrainedLayoutReference10, (Function1) objRememberedValue16), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer6, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._110wdp, composer6, 6), 5, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer6, 6)), 0.0f, 1, null);
                                                float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer6, 6);
                                                SliderVerticalScrollerKt.m15108SliderVerticalScrollermcqpVzo(modifierFillMaxHeight$default2, carouselScrollState2, 0.0f, 0L, PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composer6, 6), fDimensionResource10, null, null, composer6, 0, 204);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer3, 48);
                                        Boolean boolValueOf4 = Boolean.valueOf(z10);
                                        final float f8 = fDimensionResource6;
                                        final ConstrainedLayoutReference constrainedLayoutReference10 = constrainedLayoutReference9;
                                        ComposeExtensionKt.IfTrue(boolValueOf4, ComposableLambdaKt.composableLambda(composer3, 1031130447, z16, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$9
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                invoke(composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer6, int i20) {
                                                if ((i20 & 11) == 2 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1031130447, i20, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:548)");
                                                }
                                                String strStringResource2 = StringResources_androidKt.stringResource(R.string.marketplace_empty_list_hint, composer6, 6);
                                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer6, 6), 0, 0L, 0.0f, null, null, composer6, 12582918, 124);
                                                ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope4;
                                                Modifier.Companion companion16 = Modifier.INSTANCE;
                                                ConstrainedLayoutReference constrainedLayoutReference11 = constrainedLayoutReferenceComponent52;
                                                composer6.startReplaceableGroup(1468814513);
                                                boolean zChanged7 = composer6.changed(constrainedLayoutReference10) | composer6.changed(f8);
                                                final ConstrainedLayoutReference constrainedLayoutReference12 = constrainedLayoutReference10;
                                                final float f9 = f8;
                                                Object objRememberedValue16 = composer6.rememberedValue();
                                                if (zChanged7 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue16 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$9$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                            invoke2(constrainScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference12.getStart(), 0.0f, 0.0f, 6, null);
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference12.getEnd(), 0.0f, 0.0f, 6, null);
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f9, 0.0f, 4, null);
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(objRememberedValue16);
                                                }
                                                composer6.endReplaceableGroup();
                                                TextKt.m10024Text4IGK_g(strStringResource2, constraintLayoutScope5.constrainAs(companion16, constrainedLayoutReference11, (Function1) objRememberedValue16), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer6, 0, 0, 65532);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), composer3, 48);
                                        composer3.endReplaceableGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        i14 = helpersHashCode;
                                        constrainedLayoutReference6 = constrainedLayoutReference10;
                                        constraintLayoutScope2 = constraintLayoutScope4;
                                        constrainedLayoutReference = constrainedLayoutReferenceComponent1;
                                        composer4 = composer3;
                                        constrainedLayoutReference3 = constrainedLayoutReferenceComponent11;
                                        constrainedLayoutReference4 = constrainedLayoutReferenceComponent12;
                                        constrainedLayoutReference5 = constrainedLayoutReferenceComponent13;
                                        constrainedLayoutReference7 = constrainedLayoutReferenceComponent14;
                                        constrainedLayoutReference2 = constrainedLayoutReferenceComponent2;
                                    }
                                    i15 = 6;
                                } else {
                                    composer3.startReplaceableGroup(673709266);
                                    composer3.startReplaceableGroup(673709348);
                                    boolean zChanged7 = composer3.changed(constrainedLayoutReferenceComponent2) | composer3.changed(fDimensionResource6) | composer3.changed(fDimensionResource7);
                                    Object objRememberedValue16 = composer3.rememberedValue();
                                    if (zChanged7 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                        final float f9 = fDimensionResource6;
                                        final float f10 = fDimensionResource7;
                                        objRememberedValue16 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                invoke2(constrainScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent2.getStart(), f9, 0.0f, 4, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f10, 0.0f, 4, null);
                                                Dimension.Companion companion16 = Dimension.INSTANCE;
                                                constrainAs.setHeight(companion16.getFillToConstraints());
                                                constrainAs.setWidth(companion16.getFillToConstraints());
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue16);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierConstrainAs2 = constraintLayoutScope4.constrainAs(companion10, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue16);
                                    composer3.startReplaceableGroup(733328855);
                                    Alignment.Companion companion16 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion16.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion17.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion17.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion17.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion17.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(-483455358);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion16.getStart(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor6 = companion17.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion10);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy2, companion17.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion17.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion17.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    composer3.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, companion16.getTop(), composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor7 = companion17.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRowMeasurePolicy2, companion17.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion17.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion17.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    Alignment.Horizontal centerHorizontally = companion16.getCenterHorizontally();
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap8 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor8 = companion17.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor8);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy3, companion17.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion17.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion17.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                        composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                        composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                                    }
                                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    String strStringResource2 = StringResources_androidKt.stringResource(R.string.marketplace_profile_all_goods_count, composer3, 6);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    constrainedLayoutReference = constrainedLayoutReferenceComponent1;
                                    constrainedLayoutReference2 = constrainedLayoutReferenceComponent2;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    i14 = helpersHashCode;
                                    constrainedLayoutReference3 = constrainedLayoutReferenceComponent11;
                                    constrainedLayoutReference4 = constrainedLayoutReferenceComponent12;
                                    constrainedLayoutReference5 = constrainedLayoutReferenceComponent13;
                                    constrainedLayoutReference6 = constrainedLayoutReferenceComponent42;
                                    constrainedLayoutReference7 = constrainedLayoutReferenceComponent14;
                                    TextKt.m10024Text4IGK_g(strStringResource2, PaddingKt.m8125paddingVpY3zN4$default(AlphaKt.alpha(companion10, 0.4f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer3, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65532);
                                    TextKt.m10024Text4IGK_g(marketplaceProfileInfo.getCountSoldProductsText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._44wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    Modifier modifierM8127paddingqDBjuR0$default4 = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._140wdp, composer3, 6), 0.0f, 11, null);
                                    Alignment.Horizontal centerHorizontally2 = companion16.getCenterHorizontally();
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap9 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor9 = companion17.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default4);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor9);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyColumnMeasurePolicy4, companion17.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion17.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion17.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                                        composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                                        composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                                    }
                                    function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_profile_all_money, composer3, 6), PaddingKt.m8125paddingVpY3zN4$default(AlphaKt.alpha(companion10, 0.4f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer3, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65532);
                                    c5798x9e44c2e6 = this;
                                    TextKt.m10024Text4IGK_g(marketplaceProfileInfo.getAllRevenueText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._44wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(1468805827);
                                    if (marketplaceProfileInfo.getBestMarketplaceProduct() != null) {
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                                        composer3.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(center, companion16.getTop(), composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor10 = companion17.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor10);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy3, companion17.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion17.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion17.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                            composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                        }
                                        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        Modifier modifierM8127paddingqDBjuR0$default5 = PaddingKt.m8127paddingqDBjuR0$default(companion10, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._140wdp, composer3, 6), 0.0f, 11, null);
                                        Alignment.Horizontal centerHorizontally3 = companion16.getCenterHorizontally();
                                        composer3.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap11 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor11 = companion17.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default5);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor11);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl11 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl11, measurePolicyColumnMeasurePolicy5, companion17.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl11, currentCompositionLocalMap11, companion17.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = companion17.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                            composerM10870constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                            composerM10870constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                        }
                                        function3ModifierMaterializerOf11.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        i15 = 6;
                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_profile_best_product, composer3, 6), PaddingKt.m8125paddingVpY3zN4$default(AlphaKt.alpha(companion10, 0.4f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer3, 6), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65532);
                                        c5798x9e44c2e6 = this;
                                        composer4 = composer3;
                                        MarketplaceLastPurchaseCardKt.MarketplaceLastPurchaseCard(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._316wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._62wdp, composer3, 6)), R.dimen._62wdp, 0, 0, 0, 0, 0, marketplaceProfileInfo.getBestMarketplaceProduct(), composer3, 16777264, 124);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer4 = composer3;
                                        i15 = 6;
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    Unit unit4 = Unit.INSTANCE;
                                }
                                Modifier.Companion companion18 = Modifier.INSTANCE;
                                composer4.startReplaceableGroup(673721605);
                                final ConstrainedLayoutReference constrainedLayoutReference11 = constrainedLayoutReference6;
                                boolean zChanged8 = composer4.changed(constrainedLayoutReference11) | composer4.changed(fDimensionResource2);
                                Object objRememberedValue17 = composer3.rememberedValue();
                                if (zChanged8 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                    final float f11 = fDimensionResource2;
                                    objRememberedValue17 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$10$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference11.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f11, 0.0f, 4, null);
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue17);
                                }
                                composer3.endReplaceableGroup();
                                ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                Modifier modifierConstrainAs3 = constraintLayoutScope5.constrainAs(companion18, constrainedLayoutReference7, (Function1) objRememberedValue17);
                                Alignment.Companion companion19 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion19.getCenterVertically();
                                composer4.startReplaceableGroup(693286680);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically, composer4, 48);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap12 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion20 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor12 = companion20.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierConstrainAs3);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor12);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl12 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl12, measurePolicyRowMeasurePolicy4, companion20.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl12, currentCompositionLocalMap12, companion20.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = companion20.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                    composerM10870constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                                    composerM10870constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                }
                                function3ModifierMaterializerOf12.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(marketplaceTab.getTitleIcon(), composer4, 0);
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion18, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, i15)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, i15), 0.0f, 11, null), new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.mo11531setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m11431getOffscreenNrFUSI());
                                    }
                                });
                                composer4.startReplaceableGroup(1468815768);
                                boolean zChanged9 = composer4.changed(brush);
                                Object objRememberedValue18 = composer3.rememberedValue();
                                if (zChanged9 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                    final Brush brush6 = brush;
                                    objRememberedValue18 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$2$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                            final Brush brush7 = brush6;
                                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$2$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                                    invoke2(contentDrawScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                                                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                                    onDrawWithContent.drawContent();
                                                    DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush7, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                                }
                                            });
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue18);
                                }
                                composer3.endReplaceableGroup();
                                ImageKt.Image(painterPainterResource, (String) null, DrawModifierKt.drawWithCache(modifierGraphicsLayer, (Function1) objRememberedValue18), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                String tabName = marketplaceTab.getTabName();
                                TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._15wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126);
                                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion18, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.mo11531setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m11431getOffscreenNrFUSI());
                                    }
                                });
                                composer4.startReplaceableGroup(1468816348);
                                boolean zChanged10 = composer4.changed(brush);
                                Object objRememberedValue19 = composer3.rememberedValue();
                                if (zChanged10 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                    final Brush brush7 = brush;
                                    objRememberedValue19 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$4$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                            final Brush brush8 = brush7;
                                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$11$4$1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                                    invoke2(contentDrawScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                                                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                                    onDrawWithContent.drawContent();
                                                    DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush8, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                                }
                                            });
                                        }
                                    };
                                    composer4.updateRememberedValue(objRememberedValue19);
                                }
                                composer3.endReplaceableGroup();
                                TextKt.m10024Text4IGK_g(tabName, DrawModifierKt.drawWithCache(modifierGraphicsLayer2, (Function1) objRememberedValue19), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer3, 0, 0, 65532);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                int tabValue2 = marketplaceTab.getTabValue();
                                composer3.startReplaceableGroup(673723222);
                                if (tabValue2 == 1) {
                                    composer3.startReplaceableGroup(673723433);
                                    final ConstrainedLayoutReference constrainedLayoutReference12 = constrainedLayoutReference;
                                    boolean zChanged11 = composer3.changed(constrainedLayoutReference12) | composer3.changed(fDimensionResource3);
                                    Object objRememberedValue20 = composer3.rememberedValue();
                                    if (zChanged11 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                        final float f12 = fDimensionResource3;
                                        objRememberedValue20 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$12$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                invoke2(constrainScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference12.getTop(), f12, 0.0f, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue20);
                                    }
                                    composer3.endReplaceableGroup();
                                    Modifier modifierConstrainAs4 = constraintLayoutScope5.constrainAs(companion18, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue20);
                                    Alignment.Horizontal centerHorizontally4 = companion19.getCenterHorizontally();
                                    composer3.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally4, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap13 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor13 = companion20.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierConstrainAs4);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor13);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl13 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl13, measurePolicyColumnMeasurePolicy6, companion20.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl13, currentCompositionLocalMap13, companion20.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = companion20.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                                        composerM10870constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                                        composerM10870constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                                    }
                                    function3ModifierMaterializerOf13.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                    Boolean boolValueOf5 = Boolean.valueOf(z13);
                                    final Brush brush8 = brush;
                                    ComposeExtensionKt.IfTrue(boolValueOf5, ComposableLambdaKt.composableLambda(composer3, -1508868996, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$13$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                            invoke(composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer6, int i20) {
                                            if ((i20 & 11) != 2 || !composer6.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1508868996, i20, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:620)");
                                                }
                                                String strStringResource3 = StringResources_androidKt.stringResource(R.string.marketplace_vip_user, composer6, 6);
                                                TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer6, 12582918, 126);
                                                Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(Modifier.INSTANCE, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$13$1.1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                        invoke2(graphicsLayerScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                                                        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                                        graphicsLayer.mo11531setCompositingStrategyaDBOjCE(CompositingStrategy.INSTANCE.m11431getOffscreenNrFUSI());
                                                    }
                                                });
                                                composer6.startReplaceableGroup(-1922948779);
                                                boolean zChanged12 = composer6.changed(brush8);
                                                final Brush brush9 = brush8;
                                                Object objRememberedValue21 = composer6.rememberedValue();
                                                if (zChanged12 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue21 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$13$1$2$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        @NotNull
                                                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                                            final Brush brush10 = brush9;
                                                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$13$1$2$1.1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                                                    invoke2(contentDrawScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@NotNull ContentDrawScope onDrawWithContent) {
                                                                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                                                                    onDrawWithContent.drawContent();
                                                                    DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush10, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                                                }
                                                            });
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(objRememberedValue21);
                                                }
                                                composer6.endReplaceableGroup();
                                                TextKt.m10024Text4IGK_g(strStringResource3, DrawModifierKt.drawWithCache(modifierGraphicsLayer3, (Function1) objRememberedValue21), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo2, composer6, 0, 0, 65532);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    companion9 = companion18;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    constrainedLayoutReference8 = constrainedLayoutReference12;
                                    composer5 = composer3;
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_user_nickname_and_rating_template, new Object[]{marketplaceProfileInfo.getNickname(), Integer.valueOf(marketplaceProfileInfo.getPlayerId())}, composer3, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer5 = composer3;
                                    constrainedLayoutReference8 = constrainedLayoutReference;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    companion9 = companion18;
                                }
                                composer3.endReplaceableGroup();
                                String str3 = (String) mutableState5.getValue();
                                Modifier.Companion companion21 = companion9;
                                Modifier modifierAlpha = AlphaKt.alpha(companion21, marketplaceTab.getElementsAlpha());
                                composer5.startReplaceableGroup(673725609);
                                boolean zChanged12 = composer5.changed(fDimensionResource2);
                                Object objRememberedValue21 = composer3.rememberedValue();
                                if (zChanged12 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    final float f13 = fDimensionResource2;
                                    objRememberedValue21 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$14$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f13, 0.0f, 4, null);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue21);
                                }
                                composer3.endReplaceableGroup();
                                final ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(constraintLayoutScope6.constrainAs(modifierAlpha, constrainedLayoutReferenceComponent9, (Function1) objRememberedValue21), PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._28wdp, composer5, 6));
                                composer5.startReplaceableGroup(673726012);
                                Object objRememberedValue22 = composer3.rememberedValue();
                                Composer.Companion companion22 = Composer.INSTANCE;
                                if (objRememberedValue22 == companion22.getEmpty()) {
                                    final MutableState mutableState9 = mutableState6;
                                    objRememberedValue22 = new Function1<FocusState, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$15$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                            invoke2(focusState);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull FocusState focusState) {
                                            Intrinsics.checkNotNullParameter(focusState, "focusState");
                                            MarketplaceMainUiKt.MarketplaceMainUi$lambda$5(mutableState9, focusState.isFocused());
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue22);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierM8174sizeVpY3zN4, (Function1) objRememberedValue22);
                                TextStyle textStyleM14848montserratRegularCustomSpbl3sdaw = typographyStyle2.m14848montserratRegularCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer3, 196614, 30);
                                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13396getTextPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null);
                                final Function1 function117 = function15;
                                final MutableState mutableState10 = mutableState5;
                                final FocusManager focusManager3 = focusManager2;
                                KeyboardActions keyboardActions = new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$16
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                        invoke2(keyboardActionScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull KeyboardActionScope $receiver) {
                                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                                        function117.invoke(mutableState10.getValue());
                                        FocusManager.clearFocus$default(focusManager3, false, 1, null);
                                    }
                                }, null, null, null, null, null, 62, null);
                                SolidColor solidColor = new SolidColor(Color.INSTANCE.m11377getWhite0d7_KjU(), null);
                                boolean z18 = !marketplaceTab.isProfileTab();
                                composer5.startReplaceableGroup(673725386);
                                boolean zChanged13 = composer5.changed(mutableState5);
                                Object objRememberedValue23 = composer3.rememberedValue();
                                if (zChanged13 || objRememberedValue23 == companion22.getEmpty()) {
                                    final MutableState mutableState11 = mutableState5;
                                    objRememberedValue23 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$17$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                            invoke2(str4);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull String enteredText) {
                                            Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                                            mutableState11.setValue(enteredText);
                                        }
                                    };
                                    composer5.updateRememberedValue(objRememberedValue23);
                                }
                                composer3.endReplaceableGroup();
                                final MutableState mutableState12 = mutableState5;
                                final String str4 = str;
                                BasicTextFieldKt.BasicTextField(str3, (Function1<? super String, Unit>) objRememberedValue23, modifierOnFocusChanged, z18, false, textStyleM14848montserratRegularCustomSpbl3sdaw, keyboardOptions, keyboardActions, false, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer5, -838555255, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$18
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer6, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @Composable
                                    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                                    public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer6, int i20) {
                                        int i21;
                                        Composer composer7;
                                        int i22;
                                        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                        if ((i20 & 14) == 0) {
                                            i21 = i20 | (composer6.changedInstance(innerTextField) ? 4 : 2);
                                        } else {
                                            i21 = i20;
                                        }
                                        if ((i21 & 91) != 18 || !composer6.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-838555255, i21, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:684)");
                                            }
                                            Modifier.Companion companion23 = Modifier.INSTANCE;
                                            Modifier modifierM8127paddingqDBjuR0$default6 = PaddingKt.m8127paddingqDBjuR0$default(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(companion23, ColorResources_androidKt.colorResource(R.color.dark_gray_30, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer6, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer6, 6), ColorResources_androidKt.colorResource(R.color.white, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer6, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer6, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                            Alignment.Companion companion24 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically2 = companion24.getCenterVertically();
                                            MutableState<String> mutableState13 = mutableState12;
                                            String str5 = str4;
                                            composer6.startReplaceableGroup(693286680);
                                            Arrangement arrangement3 = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement3.getStart(), centerVertically2, composer6, 48);
                                            composer6.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap14 = composer6.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion25 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor14 = companion25.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default6);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor14);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM10870constructorimpl14 = Updater.m10870constructorimpl(composer6);
                                            Updater.m10877setimpl(composerM10870constructorimpl14, measurePolicyRowMeasurePolicy5, companion25.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl14, currentCompositionLocalMap14, companion25.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = companion25.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                                composerM10870constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                                                composerM10870constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                                            }
                                            function3ModifierMaterializerOf14.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                            composer6.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion24.getTopStart(), false, composer6, 0);
                                            composer6.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap15 = composer6.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor15 = companion25.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(companion23);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor15);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composer6);
                                            Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyRememberBoxMeasurePolicy4, companion25.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap15, companion25.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion25.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                                composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                                composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                            }
                                            function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                            composer6.startReplaceableGroup(-1350843194);
                                            if (mutableState13.getValue().length() == 0) {
                                                composer6.startReplaceableGroup(693286680);
                                                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement3.getStart(), companion24.getTop(), composer6, 0);
                                                composer6.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap16 = composer6.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor16 = companion25.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(companion23);
                                                if (!(composer6.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor16);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer composerM10870constructorimpl16 = Updater.m10870constructorimpl(composer6);
                                                Updater.m10877setimpl(composerM10870constructorimpl16, measurePolicyRowMeasurePolicy6, companion25.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl16, currentCompositionLocalMap16, companion25.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = companion25.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                                                    composerM10870constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                                                    composerM10870constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                                                }
                                                function3ModifierMaterializerOf16.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                                composer6.startReplaceableGroup(2058660585);
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_search_1, composer6, 6), (String) null, AlphaKt.alpha(SizeKt.m8172size3ABfNKs(companion23, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer6, 6)), 0.5f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, 56, 120);
                                                i22 = i21;
                                                composer7 = composer6;
                                                TextKt.m10024Text4IGK_g(str5, AlphaKt.alpha(PaddingKt.m8125paddingVpY3zN4$default(companion23, PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer6, 6), 0.0f, 2, null), 0.5f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14848montserratRegularCustomSpbl3sdaw(R.dimen._12wsp, 0L, 0, 0L, 0.0f, composer6, 196614, 30), composer6, 0, 0, 65532);
                                                composer6.endReplaceableGroup();
                                                composer6.endNode();
                                                composer6.endReplaceableGroup();
                                                composer6.endReplaceableGroup();
                                            } else {
                                                composer7 = composer6;
                                                i22 = i21;
                                            }
                                            composer6.endReplaceableGroup();
                                            innerTextField.invoke(composer7, Integer.valueOf(i22 & 14));
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer3, 806879232, 221184, 15632);
                                composer3.startReplaceableGroup(673728791);
                                boolean zChanged14 = composer3.changed(constrainedLayoutReference11) | composer3.changed(fDimensionResource2);
                                Object objRememberedValue24 = composer3.rememberedValue();
                                if (zChanged14 || objRememberedValue24 == companion22.getEmpty()) {
                                    final float f14 = fDimensionResource2;
                                    objRememberedValue24 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$19$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference11.getEnd(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f14, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue24);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs5 = constraintLayoutScope6.constrainAs(companion21, constrainedLayoutReferenceComponent6, (Function1) objRememberedValue24);
                                composer3.startReplaceableGroup(673729020);
                                boolean zChanged15 = composer3.changed(function0);
                                Object objRememberedValue25 = composer3.rememberedValue();
                                if (zChanged15 || objRememberedValue25 == companion22.getEmpty()) {
                                    final Function0 function016 = function0;
                                    objRememberedValue25 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$20$1
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
                                            function016.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue25);
                                }
                                composer3.endReplaceableGroup();
                                ComposableSingletons$MarketplaceMainUiKt composableSingletons$MarketplaceMainUiKt = ComposableSingletons$MarketplaceMainUiKt.INSTANCE;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs5, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue25, composableSingletons$MarketplaceMainUiKt.m14990getLambda1$app_siteRelease(), composer3, 0, 3072, 4094);
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion21, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6));
                                composer3.startReplaceableGroup(673729525);
                                boolean zChanged16 = composer3.changed(constrainedLayoutReferenceComponent9) | composer3.changed(constrainedLayoutReferenceComponent6) | composer3.changed(fDimensionResource3);
                                Object objRememberedValue26 = composer3.rememberedValue();
                                if (zChanged16 || objRememberedValue26 == companion22.getEmpty()) {
                                    final float f15 = fDimensionResource3;
                                    objRememberedValue26 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$21$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent9.getEnd(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent6.getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f15, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue26);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs6 = constraintLayoutScope6.constrainAs(modifierM8158height3ABfNKs, constrainedLayoutReference5, (Function1) objRememberedValue26);
                                Alignment.Vertical centerVertically2 = companion19.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap14 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor14 = companion20.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierConstrainAs6);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor14);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl14 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl14, measurePolicyRowMeasurePolicy5, companion20.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl14, currentCompositionLocalMap14, companion20.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = companion20.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
                                    composerM10870constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
                                    composerM10870constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
                                }
                                function3ModifierMaterializerOf14.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_ruble, composer3, 6);
                                Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(ComposeExtensionKt.m14410shadowo6VuwKU(companion21, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.total_black, composer3, 6), (242 & 2) != 0 ? 1.0f : 0.5f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer3, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer3, 6));
                                ContentScale.Companion companion23 = ContentScale.INSTANCE;
                                ImageKt.Image(painterPainterResource2, (String) null, modifierM8158height3ABfNKs2, (Alignment) null, companion23.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 24632, 104);
                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion21, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6)), composer3, 0);
                                TextKt.m10024Text4IGK_g(str2, ComposeExtensionKt.m14410shadowo6VuwKU(companion21, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : ColorResources_androidKt.colorResource(R.color.total_black, composer3, 6), (242 & 2) != 0 ? 1.0f : 0.3f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._18wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65532);
                                SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion21, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer3, 6)), composer3, 0);
                                composer3.startReplaceableGroup(1468824622);
                                boolean zChanged17 = composer3.changed(function06);
                                Object objRememberedValue27 = composer3.rememberedValue();
                                if (zChanged17 || objRememberedValue27 == companion22.getEmpty()) {
                                    final Function0 function017 = function06;
                                    objRememberedValue27 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$22$1$1
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
                                            function017.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue27);
                                }
                                composer3.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue27, composableSingletons$MarketplaceMainUiKt.m14991getLambda2$app_siteRelease(), composer3, 0, 3072, UnixStat.PERM_MASK);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(673732455);
                                boolean zChanged18 = composer3.changed(constrainedLayoutReferenceComponent6) | composer3.changed(constrainedLayoutReferenceComponent7);
                                Object objRememberedValue28 = composer3.rememberedValue();
                                if (zChanged18 || objRememberedValue28 == companion22.getEmpty()) {
                                    objRememberedValue28 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$23$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent6.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent7.getBottom(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue28);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs7 = constraintLayoutScope6.constrainAs(companion21, constrainedLayoutReferenceComponent8, (Function1) objRememberedValue28);
                                composer3.startReplaceableGroup(673732631);
                                boolean zChanged19 = composer3.changed(function02);
                                Object objRememberedValue29 = composer3.rememberedValue();
                                if (zChanged19 || objRememberedValue29 == companion22.getEmpty()) {
                                    final Function0 function018 = function02;
                                    objRememberedValue29 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$24$1
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
                                            function018.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue29);
                                }
                                Function0 function019 = (Function0) objRememberedValue29;
                                composer3.endReplaceableGroup();
                                final Brush brush9 = brush2;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs7, null, false, null, false, false, false, false, null, 0, 0L, null, function019, ComposableLambdaKt.composableLambda(composer3, -1156584507, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$25
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i20) {
                                        if ((i20 & 11) != 2 || !composer6.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1156584507, i20, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:816)");
                                            }
                                            Modifier.Companion companion24 = Modifier.INSTANCE;
                                            Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6)), brush9, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6)), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer6, 6), ColorResources_androidKt.colorResource(R.color.white, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6)));
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            composer6.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer6, 6);
                                            composer6.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap15 = composer6.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion25 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor15 = companion25.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor15);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composer6);
                                            Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyRememberBoxMeasurePolicy4, companion25.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap15, companion25.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion25.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                                composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                                composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                            }
                                            function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_info, composer6, 6), (String) null, SizeKt.m8158height3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer6, 24632, 104);
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer3, 0, 3072, 4094);
                                Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(AlphaKt.alpha(companion21, marketplaceTab.getElementsAlpha()), PrimitiveResources_androidKt.dimensionResource(R.dimen._210wdp, composer3, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer3, 6));
                                composer3.startReplaceableGroup(673734113);
                                final ConstrainedLayoutReference constrainedLayoutReference13 = constrainedLayoutReference8;
                                boolean zChanged20 = composer3.changed(constrainedLayoutReference13) | composer3.changed(fDimensionResource2) | composer3.changed(constrainedLayoutReference11);
                                Object objRememberedValue30 = composer3.rememberedValue();
                                if (zChanged20 || objRememberedValue30 == companion22.getEmpty()) {
                                    final float f16 = fDimensionResource2;
                                    objRememberedValue30 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$26$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference13.getTop(), f16, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference11.getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue30);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs8 = constraintLayoutScope6.constrainAs(modifierM8158height3ABfNKs3, constrainedLayoutReferenceComponent7, (Function1) objRememberedValue30);
                                int i20 = i10;
                                List list8 = list3;
                                composer3.startReplaceableGroup(673734396);
                                boolean zChanged21 = composer3.changed(function1);
                                Object objRememberedValue31 = composer3.rememberedValue();
                                if (zChanged21 || objRememberedValue31 == companion22.getEmpty()) {
                                    final Function1 function118 = function1;
                                    objRememberedValue31 = new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$27$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                            invoke(num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int i21) {
                                            function118.invoke(Integer.valueOf(i21));
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue31);
                                }
                                composer3.endReplaceableGroup();
                                MarketplacePaginatorKt.MarketplacePaginator(modifierConstrainAs8, i20, list8, (Function1) objRememberedValue31, composer3, 512, 0);
                                Boolean boolValueOf6 = Boolean.valueOf(z11);
                                final boolean z19 = z11;
                                final Function0 function020 = function07;
                                final MarketplaceTab marketplaceTab2 = marketplaceTab;
                                final float f17 = fDimensionResource;
                                final Brush brush10 = brush3;
                                final ConstrainedLayoutReference constrainedLayoutReference14 = constrainedLayoutReference4;
                                ComposeExtensionKt.IfTrue(boolValueOf6, ComposableLambdaKt.composableLambda(composer3, -1904222121, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i21) {
                                        Modifier.Companion companion24;
                                        int i22;
                                        if ((i21 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1904222121, i21, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:855)");
                                        }
                                        Modifier.Companion companion25 = Modifier.INSTANCE;
                                        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion25, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_90, composer6, 6), null, 2, null);
                                        boolean z20 = z19;
                                        composer6.startReplaceableGroup(1468828159);
                                        boolean zChanged22 = composer6.changed(function020);
                                        final Function0<Unit> function021 = function020;
                                        Object objRememberedValue32 = composer6.rememberedValue();
                                        if (zChanged22 || objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue32 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28$1$1
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
                                                    function021.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue32);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierNoRippleClickable = ComposeExtensionKt.noRippleClickable(modifierM7771backgroundbw27NRU$default, z20, (Function0) objRememberedValue32);
                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                        final Function0<Unit> function022 = function020;
                                        composer6.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                        composer6.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap15 = composer6.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion26 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor15 = companion26.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable);
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor15);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composer6);
                                        Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyRememberBoxMeasurePolicy4, companion26.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap15, companion26.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion26.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                            composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                            composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                        }
                                        function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(OffsetKt.m8084offsetVpY3zN4$default(companion25, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer6, 6)), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer6, 6));
                                        String strStringResource3 = StringResources_androidKt.stringResource(R.string.common_close, composer6, 6);
                                        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._13wsp, 0L, 0, 0L, 0.0f, null, composer6, 1572870, 62);
                                        composer6.startReplaceableGroup(-1922937648);
                                        boolean zChanged23 = composer6.changed(function022);
                                        Object objRememberedValue33 = composer6.rememberedValue();
                                        if (zChanged23 || objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue33 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28$2$1$1
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
                                                    function022.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue33);
                                        }
                                        composer6.endReplaceableGroup();
                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8177width3ABfNKs, null, strStringResource3, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, 0.0f, 0, null, null, null, 0.0f, 0L, 180.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue33, composer6, 0, 48, 0, 16775154);
                                        composer6.endReplaceableGroup();
                                        composer6.endNode();
                                        composer6.endReplaceableGroup();
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468828979);
                                        if (marketplaceTab2.isProfileTab()) {
                                            companion24 = companion25;
                                            i22 = 6;
                                        } else {
                                            ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                            i22 = 6;
                                            companion24 = companion25;
                                            Modifier modifierM8158height3ABfNKs4 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6));
                                            ConstrainedLayoutReference constrainedLayoutReference15 = constrainedLayoutReferenceComponent16;
                                            composer6.startReplaceableGroup(1468829309);
                                            boolean zChanged24 = composer6.changed(constrainedLayoutReferenceComponent3) | composer6.changed(f17);
                                            final ConstrainedLayoutReference constrainedLayoutReference16 = constrainedLayoutReferenceComponent3;
                                            final float f18 = f17;
                                            Object objRememberedValue34 = composer6.rememberedValue();
                                            if (zChanged24 || objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue34 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28$3$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                        invoke2(constrainScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference16.getTop(), 0.0f, 0.0f, 6, null);
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference16.getBottom(), 0.0f, 0.0f, 6, null);
                                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference16.getEnd(), f18, 0.0f, 4, null);
                                                    }
                                                };
                                                composer6.updateRememberedValue(objRememberedValue34);
                                            }
                                            composer6.endReplaceableGroup();
                                            ComposableSingletons$MarketplaceMainUiKt composableSingletons$MarketplaceMainUiKt2 = ComposableSingletons$MarketplaceMainUiKt.INSTANCE;
                                            CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope7.constrainAs(modifierM8158height3ABfNKs4, constrainedLayoutReference15, (Function1) objRememberedValue34), brush10, null, null, null, new float[]{0.05f, 0.2f}, null, composableSingletons$MarketplaceMainUiKt2.m14992getLambda3$app_siteRelease(), composer6, 12845056, 92);
                                            if (!marketplaceTab2.isInventoryTab()) {
                                                ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope6;
                                                Modifier modifierM8158height3ABfNKs5 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6));
                                                ConstrainedLayoutReference constrainedLayoutReference17 = constrainedLayoutReferenceComponent17;
                                                composer6.startReplaceableGroup(1468830774);
                                                boolean zChanged25 = composer6.changed(constrainedLayoutReference14) | composer6.changed(f17);
                                                final ConstrainedLayoutReference constrainedLayoutReference18 = constrainedLayoutReference14;
                                                final float f19 = f17;
                                                Object objRememberedValue35 = composer6.rememberedValue();
                                                if (zChanged25 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue35 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28$4$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                            invoke2(constrainScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference18.getTop(), 0.0f, 0.0f, 6, null);
                                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference18.getBottom(), 0.0f, 0.0f, 6, null);
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference18.getEnd(), f19, 0.0f, 4, null);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(objRememberedValue35);
                                                }
                                                composer6.endReplaceableGroup();
                                                CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope8.constrainAs(modifierM8158height3ABfNKs5, constrainedLayoutReference17, (Function1) objRememberedValue35), brush10, null, null, null, new float[]{0.05f, 0.2f}, null, composableSingletons$MarketplaceMainUiKt2.m14993getLambda4$app_siteRelease(), composer6, 12845056, 92);
                                            }
                                        }
                                        composer6.endReplaceableGroup();
                                        ConstraintLayoutScope constraintLayoutScope9 = constraintLayoutScope6;
                                        Modifier modifierM8158height3ABfNKs6 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer6, i22)), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, i22));
                                        ConstrainedLayoutReference constrainedLayoutReference19 = constrainedLayoutReferenceComponent22;
                                        composer6.startReplaceableGroup(1468832335);
                                        boolean zChanged26 = composer6.changed(constrainedLayoutReferenceComponent5) | composer6.changed(f17);
                                        final ConstrainedLayoutReference constrainedLayoutReference20 = constrainedLayoutReferenceComponent5;
                                        final float f20 = f17;
                                        Object objRememberedValue36 = composer6.rememberedValue();
                                        if (zChanged26 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue36 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$28$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference20.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference20.getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference20.getEnd(), f20, 0.0f, 4, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue36);
                                        }
                                        composer6.endReplaceableGroup();
                                        CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope9.constrainAs(modifierM8158height3ABfNKs6, constrainedLayoutReference19, (Function1) objRememberedValue36), brush10, null, null, null, new float[]{0.05f, 0.2f}, null, ComposableSingletons$MarketplaceMainUiKt.INSTANCE.m14994getLambda5$app_siteRelease(), composer6, 12845056, 92);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                Modifier modifierAlpha2 = AlphaKt.alpha(companion21, marketplaceTab.getFilterAlpha());
                                composer3.startReplaceableGroup(673740149);
                                boolean zChanged22 = composer3.changed(constrainedLayoutReference11) | composer3.changed(constrainedLayoutReference13) | composer3.changed(fDimensionResource4);
                                Object objRememberedValue32 = composer3.rememberedValue();
                                if (zChanged22 || objRememberedValue32 == companion22.getEmpty()) {
                                    final float f18 = fDimensionResource4;
                                    objRememberedValue32 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$29$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference11.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference13.getTop(), f18, 0.0f, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue32);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs9 = constraintLayoutScope6.constrainAs(modifierAlpha2, constrainedLayoutReference4, (Function1) objRememberedValue32);
                                boolean z20 = !z11;
                                composer3.startReplaceableGroup(673740372);
                                boolean zChanged23 = composer3.changed(function03);
                                Object objRememberedValue33 = composer3.rememberedValue();
                                if (zChanged23 || objRememberedValue33 == companion22.getEmpty()) {
                                    final Function0 function021 = function03;
                                    objRememberedValue33 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$30$1
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
                                            function021.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue33);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierNoRippleClickable = ComposeExtensionKt.noRippleClickable(modifierConstrainAs9, z20, (Function0) objRememberedValue33);
                                Alignment.Vertical centerVertically3 = companion19.getCenterVertically();
                                composer3.startReplaceableGroup(693286680);
                                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically3, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap15 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor15 = companion20.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor15);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyRowMeasurePolicy6, companion20.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap15, companion20.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion20.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                                    composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                                    composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                                }
                                function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                ImageKt.Image(PainterResources_androidKt.painterResource(marketplaceSortFilter.getIcon(), composer3, 0), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8177width3ABfNKs(companion21, PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composer3, 6)), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), 0.0f, 11, null), (Alignment) null, companion23.getFillWidth(), 0.0f, (ColorFilter) null, composer3, 24632, 104);
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(marketplaceSortFilter.getText(), composer3, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126), composer3, 0, 0, 65534);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierAlpha3 = AlphaKt.alpha(companion21, marketplaceTab.getElementsAlpha());
                                composer3.startReplaceableGroup(673741357);
                                boolean zChanged24 = composer3.changed(fDimensionResource2) | composer3.changed(constrainedLayoutReference11);
                                Object objRememberedValue34 = composer3.rememberedValue();
                                if (zChanged24 || objRememberedValue34 == companion22.getEmpty()) {
                                    final float f19 = fDimensionResource2;
                                    objRememberedValue34 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$32$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f19, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference11.getStart(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue34);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs10 = constraintLayoutScope6.constrainAs(modifierAlpha3, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue34);
                                boolean z21 = (z11 || marketplaceTab.isProfileTab()) ? false : true;
                                composer3.startReplaceableGroup(673741663);
                                boolean zChanged25 = composer3.changed(function04);
                                Object objRememberedValue35 = composer3.rememberedValue();
                                if (zChanged25 || objRememberedValue35 == companion22.getEmpty()) {
                                    final Function0 function022 = function04;
                                    objRememberedValue35 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$33$1
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
                                            function022.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue35);
                                }
                                Function0 function023 = (Function0) objRememberedValue35;
                                composer3.endReplaceableGroup();
                                final Brush brush11 = brush4;
                                final int i21 = i11;
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs10, null, z21, null, false, false, false, false, null, 0, 0L, null, function023, ComposableLambdaKt.composableLambda(composer3, -45500026, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$34
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i22) {
                                        if ((i22 & 11) != 2 || !composer6.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-45500026, i22, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:1003)");
                                            }
                                            Modifier.Companion companion24 = Modifier.INSTANCE;
                                            Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6)), brush11, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6)), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer6, 6), ColorResources_androidKt.colorResource(R.color.white, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composer6, 6)));
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            int i23 = i21;
                                            composer6.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer6, 6);
                                            composer6.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap16 = composer6.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion25 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor16 = companion25.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                                            if (!(composer6.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor16);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer composerM10870constructorimpl16 = Updater.m10870constructorimpl(composer6);
                                            Updater.m10877setimpl(composerM10870constructorimpl16, measurePolicyRememberBoxMeasurePolicy4, companion25.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl16, currentCompositionLocalMap16, companion25.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = companion25.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                                                composerM10870constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                                                composerM10870constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                                            }
                                            function3ModifierMaterializerOf16.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                            composer6.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_key, composer6, 6), (String) null, SizeKt.m8158height3ABfNKs(companion24, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer6, 6)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(i23, composer6, 0), 0, 2, null), composer6, 24632, 40);
                                            composer6.endReplaceableGroup();
                                            composer6.endNode();
                                            composer6.endReplaceableGroup();
                                            composer6.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), composer3, 0, 3072, 4090);
                                Boolean boolValueOf7 = Boolean.valueOf(z12);
                                final MarketplaceTab marketplaceTab3 = marketplaceTab;
                                ComposeExtensionKt.IfTrue(boolValueOf7, ComposableLambdaKt.composableLambda(composer3, -539972082, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$35
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i22) {
                                        if ((i22 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-539972082, i22, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:1029)");
                                        }
                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                        Modifier modifierAlpha4 = AlphaKt.alpha(Modifier.INSTANCE, marketplaceTab3.getElementsAlpha());
                                        ConstrainedLayoutReference constrainedLayoutReference15 = constrainedLayoutReferenceComponent4;
                                        composer6.startReplaceableGroup(1468836568);
                                        boolean zChanged26 = composer6.changed(constrainedLayoutReferenceComponent3);
                                        final ConstrainedLayoutReference constrainedLayoutReference16 = constrainedLayoutReferenceComponent3;
                                        Object objRememberedValue36 = composer6.rememberedValue();
                                        if (zChanged26 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue36 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$35$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference16.getTop(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference16.getTop(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference16.getEnd(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference16.getEnd(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue36);
                                        }
                                        composer6.endReplaceableGroup();
                                        BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(constraintLayoutScope7.constrainAs(modifierAlpha4, constrainedLayoutReference15, (Function1) objRememberedValue36), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer6, 6)), ColorResources_androidKt.colorResource(R.color.red, composer6, 6), RoundedCornerShapeKt.getCircleShape()), composer6, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer3, 48);
                                composer3.startReplaceableGroup(673743750);
                                boolean zChanged26 = composer3.changed(fDimensionResource9) | composer3.changed(constrainedLayoutReference11) | composer3.changed(constrainedLayoutReferenceComponent3) | composer3.changed(constrainedLayoutReferenceComponent5);
                                Object objRememberedValue36 = composer3.rememberedValue();
                                if (zChanged26 || objRememberedValue36 == companion22.getEmpty()) {
                                    final float f20 = fDimensionResource9;
                                    objRememberedValue36 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$36$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f20, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference11.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent3.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent5.getTop(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue36);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs11 = constraintLayoutScope6.constrainAs(companion21, constrainedLayoutReference2, (Function1) objRememberedValue36);
                                List list9 = list4;
                                boolean z22 = z11;
                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                final Function1 function119 = function16;
                                final CarouselScrollState carouselScrollState3 = carouselScrollState;
                                MarketplaceTabBlockKt.MarketplaceTabsBlock(modifierConstrainAs11, list9, !z22, z22, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$37
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                        invoke(num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* compiled from: MarketplaceMainUi.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$37$1", m7120f = "MarketplaceMainUi.kt", m7121i = {}, m7122l = {1058}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$37$1 */
                                    /* loaded from: classes7.dex */
                                    public static final class C58041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ CarouselScrollState $scrollState;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C58041(CarouselScrollState carouselScrollState, Continuation<? super C58041> continuation) {
                                            super(2, continuation);
                                            this.$scrollState = carouselScrollState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C58041(this.$scrollState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C58041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                CarouselScrollState carouselScrollState = this.$scrollState;
                                                this.label = 1;
                                                if (carouselScrollState.scrollTo(0, this) == coroutine_suspended) {
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

                                    public final void invoke(int i22) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C58041(carouselScrollState3, null), 3, null);
                                        function119.invoke(Integer.valueOf(i22));
                                    }
                                }, composer3, 64, 0);
                                composer3.startReplaceableGroup(673744576);
                                boolean zChanged27 = composer3.changed(fDimensionResource2) | composer3.changed(constrainedLayoutReference11);
                                Object objRememberedValue37 = composer3.rememberedValue();
                                if (zChanged27 || objRememberedValue37 == companion22.getEmpty()) {
                                    final float f21 = fDimensionResource2;
                                    objRememberedValue37 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$38$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                            invoke2(constrainScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f21, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference11.getStart(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue37);
                                }
                                composer3.endReplaceableGroup();
                                Modifier modifierConstrainAs12 = constraintLayoutScope6.constrainAs(companion21, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue37);
                                boolean z23 = !z11;
                                composer3.startReplaceableGroup(673744859);
                                boolean zChanged28 = composer3.changed(function05);
                                Object objRememberedValue38 = composer3.rememberedValue();
                                if (zChanged28 || objRememberedValue38 == companion22.getEmpty()) {
                                    final Function0 function024 = function05;
                                    objRememberedValue38 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$39$1
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
                                            function024.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue38);
                                }
                                composer3.endReplaceableGroup();
                                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierConstrainAs12, null, z23, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue38, composableSingletons$MarketplaceMainUiKt.m14995getLambda6$app_siteRelease(), composer3, 0, 3072, 4090);
                                Modifier modifierConstrainAs13 = constraintLayoutScope6.constrainAs(companion21, constrainedLayoutReference3, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$40
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                        invoke2(constrainScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                });
                                Alignment centerEnd = companion19.getCenterEnd();
                                composer3.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap16 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor16 = companion20.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierConstrainAs13);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor16);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl16 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl16, measurePolicyRememberBoxMeasurePolicy4, companion20.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl16, currentCompositionLocalMap16, companion20.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = companion20.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
                                    composerM10870constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
                                    composerM10870constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
                                }
                                function3ModifierMaterializerOf16.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                List list10 = list6;
                                boolean z24 = z14;
                                composer3.startReplaceableGroup(1468839590);
                                boolean zChanged29 = composer3.changed(function08);
                                Object objRememberedValue39 = composer3.rememberedValue();
                                if (zChanged29 || objRememberedValue39 == companion22.getEmpty()) {
                                    final Function0 function025 = function08;
                                    objRememberedValue39 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$41$1$1
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
                                            function025.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue39);
                                }
                                Function0 function026 = (Function0) objRememberedValue39;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(1468839663);
                                boolean zChanged30 = composer3.changed(function09);
                                Object objRememberedValue40 = composer3.rememberedValue();
                                if (zChanged30 || objRememberedValue40 == companion22.getEmpty()) {
                                    final Function0 function027 = function09;
                                    objRememberedValue40 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$41$2$1
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
                                            function027.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue40);
                                }
                                Function0 function028 = (Function0) objRememberedValue40;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(1468839813);
                                boolean zChanged31 = composer3.changed(function04);
                                Object objRememberedValue41 = composer3.rememberedValue();
                                if (zChanged31 || objRememberedValue41 == companion22.getEmpty()) {
                                    final Function0 function029 = function04;
                                    objRememberedValue41 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$41$3$1
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
                                            function029.invoke();
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue41);
                                }
                                Function0 function030 = (Function0) objRememberedValue41;
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(1468839730);
                                boolean zChanged32 = composer3.changed(function17);
                                Object objRememberedValue42 = composer3.rememberedValue();
                                if (zChanged32 || objRememberedValue42 == companion22.getEmpty()) {
                                    final Function1 function120 = function17;
                                    objRememberedValue42 = new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$41$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                                            invoke2(craftItemCategoryFilter);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull CraftItemCategoryFilter checkBox) {
                                            Intrinsics.checkNotNullParameter(checkBox, "checkBox");
                                            function120.invoke(checkBox);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue42);
                                }
                                composer3.endReplaceableGroup();
                                CraftFilterBlockKt.CraftFilterBlock(list10, z24, function026, function028, function030, (Function1) objRememberedValue42, composer3, 8, 0);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Boolean boolValueOf8 = Boolean.valueOf(MarketplaceMainUiKt.MarketplaceMainUi$lambda$1(mutableState7));
                                final boolean z25 = z15;
                                final State state8 = state4;
                                final State state9 = state5;
                                final State state10 = state6;
                                final MarketplaceProduct marketplaceProduct5 = marketplaceProduct;
                                final MarketplaceBottomSheetInfo marketplaceBottomSheetInfo2 = marketplaceBottomSheetInfo;
                                final boolean z26 = z13;
                                final Brush brush12 = brush5;
                                final FocusManager focusManager4 = focusManager2;
                                final Function1 function121 = function18;
                                final Function1 function122 = function19;
                                final Function1 function123 = function110;
                                final Function1 function124 = function111;
                                final Function0 function031 = function010;
                                final Function0 function032 = function011;
                                final Function0 function033 = function012;
                                final Function0 function034 = function013;
                                final Function0 function035 = function014;
                                final Function0 function036 = function015;
                                final State state11 = state7;
                                final MutableState mutableState13 = mutableState8;
                                ComposeExtensionKt.IfTrue(boolValueOf8, ComposableLambdaKt.composableLambda(composer3, 571112399, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer6, int i22) {
                                        if ((i22 & 11) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(571112399, i22, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:1113)");
                                        }
                                        Boolean boolValueOf9 = Boolean.valueOf(z25);
                                        final State<Float> state12 = state11;
                                        final Function0<Unit> function037 = function036;
                                        final FocusManager focusManager5 = focusManager4;
                                        ComposeExtensionKt.IfTrue(boolValueOf9, ComposableLambdaKt.composableLambda(composer6, 373611175, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                invoke(composer7, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@Nullable Composer composer7, int i23) {
                                                if ((i23 & 11) != 2 || !composer7.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(373611175, i23, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceMainUi.kt:1114)");
                                                    }
                                                    Modifier.Companion companion24 = Modifier.INSTANCE;
                                                    composer7.startReplaceableGroup(-1922926417);
                                                    boolean zChanged33 = composer7.changed(state12);
                                                    final State<Float> state13 = state12;
                                                    Object objRememberedValue43 = composer7.rememberedValue();
                                                    if (zChanged33 || objRememberedValue43 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue43 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                invoke2(graphicsLayerScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                                                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                                                graphicsLayer.setAlpha(MarketplaceMainUiKt.MarketplaceMainUi$lambda$11(state13));
                                                            }
                                                        };
                                                        composer7.updateRememberedValue(objRememberedValue43);
                                                    }
                                                    composer7.endReplaceableGroup();
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(GraphicsLayerModifierKt.graphicsLayer(companion24, (Function1) objRememberedValue43), 0.0f, 1, null);
                                                    final Function0<Unit> function038 = function037;
                                                    final FocusManager focusManager6 = focusManager5;
                                                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(ComposeExtensionKt.noRippleClickable$default(modifierFillMaxSize$default, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUi.3.1.42.1.2
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
                                                            function038.invoke();
                                                            FocusManager.clearFocus$default(focusManager6, false, 1, null);
                                                        }
                                                    }, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_50, composer7, 6), null, 2, null), composer7, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer7.skipToGroupEnd();
                                            }
                                        }), composer6, 48);
                                        ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                        Modifier.Companion companion24 = Modifier.INSTANCE;
                                        composer6.startReplaceableGroup(1468840654);
                                        boolean zChanged33 = composer6.changed(state8) | composer6.changed(state9) | composer6.changed(state10);
                                        final State<Float> state13 = state8;
                                        final State<Float> state14 = state9;
                                        final State<Float> state15 = state10;
                                        Object objRememberedValue43 = composer6.rememberedValue();
                                        if (zChanged33 || objRememberedValue43 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue43 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                    invoke2(graphicsLayerScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                                                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                                    graphicsLayer.setTranslationY(MarketplaceMainUiKt.MarketplaceMainUi$lambda$12(state13) + MarketplaceMainUiKt.MarketplaceMainUi$lambda$19(state14));
                                                    graphicsLayer.setAlpha(MarketplaceMainUiKt.MarketplaceMainUi$lambda$15(state15));
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue43);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierM8158height3ABfNKs4 = SizeKt.m8158height3ABfNKs(SuspendingPointerInputFilterKt.pointerInput(GraphicsLayerModifierKt.graphicsLayer(companion24, (Function1) objRememberedValue43), Unit.INSTANCE, new C58063(function036, focusManager4, mutableState13, null)), PrimitiveResources_androidKt.dimensionResource(R.dimen._292wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference15 = constrainedLayoutReferenceComponent15;
                                        composer6.startReplaceableGroup(1468841699);
                                        boolean zChanged34 = composer6.changed(constrainedLayoutReference11);
                                        final ConstrainedLayoutReference constrainedLayoutReference16 = constrainedLayoutReference11;
                                        Object objRememberedValue44 = composer6.rememberedValue();
                                        if (zChanged34 || objRememberedValue44 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue44 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$4$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                    invoke2(constrainScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                    Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference16.getStart(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference16.getEnd(), 0.0f, 0.0f, 6, null);
                                                    constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue44);
                                        }
                                        composer6.endReplaceableGroup();
                                        Modifier modifierConstrainAs14 = constraintLayoutScope7.constrainAs(modifierM8158height3ABfNKs4, constrainedLayoutReference15, (Function1) objRememberedValue44);
                                        MarketplaceProduct marketplaceProduct6 = marketplaceProduct5;
                                        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo3 = marketplaceBottomSheetInfo2;
                                        boolean z27 = z26;
                                        Brush brush13 = brush12;
                                        FocusManager focusManager6 = focusManager4;
                                        composer6.startReplaceableGroup(1468842265);
                                        boolean zChanged35 = composer6.changed(function121);
                                        final Function1<String, Unit> function125 = function121;
                                        Object objRememberedValue45 = composer6.rememberedValue();
                                        if (zChanged35 || objRememberedValue45 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue45 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                                    invoke2(str5);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull String text) {
                                                    Intrinsics.checkNotNullParameter(text, "text");
                                                    function125.invoke(text);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue45);
                                        }
                                        Function1 function126 = (Function1) objRememberedValue45;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842406);
                                        boolean zChanged36 = composer6.changed(function122);
                                        final Function1<String, Unit> function127 = function122;
                                        Object objRememberedValue46 = composer6.rememberedValue();
                                        if (zChanged36 || objRememberedValue46 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue46 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$6$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                                    invoke2(str5);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull String text) {
                                                    Intrinsics.checkNotNullParameter(text, "text");
                                                    function127.invoke(text);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue46);
                                        }
                                        Function1 function128 = (Function1) objRememberedValue46;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842535);
                                        boolean zChanged37 = composer6.changed(function123);
                                        final Function1<String, Unit> function129 = function123;
                                        Object objRememberedValue47 = composer6.rememberedValue();
                                        if (zChanged37 || objRememberedValue47 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue47 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$7$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                                    invoke2(str5);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull String text) {
                                                    Intrinsics.checkNotNullParameter(text, "text");
                                                    function129.invoke(text);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue47);
                                        }
                                        Function1 function130 = (Function1) objRememberedValue47;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842657);
                                        boolean zChanged38 = composer6.changed(function124);
                                        final Function1<String, Unit> function131 = function124;
                                        Object objRememberedValue48 = composer6.rememberedValue();
                                        if (zChanged38 || objRememberedValue48 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue48 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$8$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(String str5) {
                                                    invoke2(str5);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(@NotNull String text) {
                                                    Intrinsics.checkNotNullParameter(text, "text");
                                                    function131.invoke(text);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue48);
                                        }
                                        Function1 function132 = (Function1) objRememberedValue48;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842847);
                                        boolean zChanged39 = composer6.changed(function031);
                                        final Function0<Unit> function038 = function031;
                                        Object objRememberedValue49 = composer6.rememberedValue();
                                        if (zChanged39 || objRememberedValue49 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue49 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$9$1
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
                                                    function038.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue49);
                                        }
                                        Function0 function039 = (Function0) objRememberedValue49;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842781);
                                        boolean zChanged40 = composer6.changed(function032);
                                        final Function0<Unit> function040 = function032;
                                        Object objRememberedValue50 = composer6.rememberedValue();
                                        if (zChanged40 || objRememberedValue50 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue50 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$10$1
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
                                                    function040.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue50);
                                        }
                                        Function0 function041 = (Function0) objRememberedValue50;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842912);
                                        boolean zChanged41 = composer6.changed(function033);
                                        final Function0<Unit> function042 = function033;
                                        Object objRememberedValue51 = composer6.rememberedValue();
                                        if (zChanged41 || objRememberedValue51 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue51 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$11$1
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
                                                    function042.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue51);
                                        }
                                        Function0 function043 = (Function0) objRememberedValue51;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468842977);
                                        boolean zChanged42 = composer6.changed(function034);
                                        final Function0<Unit> function044 = function034;
                                        Object objRememberedValue52 = composer6.rememberedValue();
                                        if (zChanged42 || objRememberedValue52 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue52 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$12$1
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
                                                    function044.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue52);
                                        }
                                        Function0 function045 = (Function0) objRememberedValue52;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468843041);
                                        boolean zChanged43 = composer6.changed(function035);
                                        final Function0<Unit> function046 = function035;
                                        Object objRememberedValue53 = composer6.rememberedValue();
                                        if (zChanged43 || objRememberedValue53 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue53 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$13$1
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
                                                    function046.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue53);
                                        }
                                        Function0 function047 = (Function0) objRememberedValue53;
                                        composer6.endReplaceableGroup();
                                        composer6.startReplaceableGroup(1468843143);
                                        boolean zChanged44 = composer6.changed(function036);
                                        final Function0<Unit> function048 = function036;
                                        Object objRememberedValue54 = composer6.rememberedValue();
                                        if (zChanged44 || objRememberedValue54 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue54 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$14$1
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
                                                    function048.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue54);
                                        }
                                        composer6.endReplaceableGroup();
                                        MarketplaceBottomSheetKt.MarketplaceBottomSheet(modifierConstrainAs14, marketplaceProduct6, marketplaceBottomSheetInfo3, z27, brush13, focusManager6, function126, function128, function130, function132, function039, function041, function043, function045, function047, (Function0) objRememberedValue54, composer6, 262208, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: MarketplaceMainUi.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$3", m7120f = "MarketplaceMainUi.kt", m7121i = {}, m7122l = {1136}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt$MarketplaceMainUi$3$1$42$3 */
                                    /* loaded from: classes7.dex */
                                    public static final class C58063 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ FocusManager $focusManager;
                                        public final /* synthetic */ MutableState<Float> $offsetY$delegate;
                                        public final /* synthetic */ Function0<Unit> $onClickCloseBottomSheet;
                                        public /* synthetic */ Object L$0;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C58063(Function0<Unit> function0, FocusManager focusManager, MutableState<Float> mutableState, Continuation<? super C58063> continuation) {
                                            super(2, continuation);
                                            this.$onClickCloseBottomSheet = function0;
                                            this.$focusManager = focusManager;
                                            this.$offsetY$delegate = mutableState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            C58063 c58063 = new C58063(this.$onClickCloseBottomSheet, this.$focusManager, this.$offsetY$delegate, continuation);
                                            c58063.L$0 = obj;
                                            return c58063;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C58063) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                                                final Function0<Unit> function0 = this.$onClickCloseBottomSheet;
                                                final FocusManager focusManager = this.$focusManager;
                                                final MutableState<Float> mutableState = this.$offsetY$delegate;
                                                Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUi.3.1.42.3.1
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
                                                        if (MarketplaceMainUiKt.MarketplaceMainUi$lambda$17(mutableState) > IntSize.m13835getHeightimpl(pointerInputScope.getBoundsSize()) / 4) {
                                                            function0.invoke();
                                                            FocusManager.clearFocus$default(focusManager, false, 1, null);
                                                        } else if (MarketplaceMainUiKt.MarketplaceMainUi$lambda$17(mutableState) >= 0.0f) {
                                                            MarketplaceMainUiKt.MarketplaceMainUi$lambda$18(mutableState, 0.0f);
                                                        }
                                                    }
                                                };
                                                final MutableState<Float> mutableState2 = this.$offsetY$delegate;
                                                Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUi.3.1.42.3.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Float f) {
                                                        invoke(pointerInputChange, f.floatValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(@NotNull PointerInputChange pointerInputChange, float f) {
                                                        Intrinsics.checkNotNullParameter(pointerInputChange, "<anonymous parameter 0>");
                                                        MutableState<Float> mutableState3 = mutableState2;
                                                        MarketplaceMainUiKt.MarketplaceMainUi$lambda$18(mutableState3, MarketplaceMainUiKt.MarketplaceMainUi$lambda$17(mutableState3) + f);
                                                    }
                                                };
                                                this.label = 1;
                                                if (DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, null, function02, null, function2, this, 5, null) == coroutine_suspended) {
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
                                }), composer3, 48);
                                if (constraintLayoutScope.getHelpersHashCode() != i14) {
                                    function0Component2.invoke();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), measurePolicyComponent1, composer2, 48, 0);
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582918, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUi.4
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
                    MarketplaceMainUiKt.MarketplaceMainUi(profileInfo, bottomSheetInfo, moneyText, currentSortFilter, bitmap, products, selectedProduct, filterList, i, pagesToShow, z, z2, z3, z4, z5, z6, z7, filterColorList, priceColorList, i2, i3, selectedTab, tabs, onClickDoneInPriceTextField, onClickDoneInCountTextField, onClickConfirmSearch, onClickSetPrice, onPaginatorPageSelected, onClickSetForceCount, onClickLike, onClickMinusButton, onClickPlusButton, onClickRedButton, onClickGreenButton, onClickCheckBox, onClickCardMainButton, onClickHistoryProduct, onClickSort, onInfoClick, onClickCloseInfo, onClickFilterButton, onResetFilterButtonClick, onClickConfirmFilters, onFilterCheckboxClick, onPlusButtonClick, onTabClick, onClickCloseBottomSheet, onClickToDonat, onClickClose, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), RecomposeScopeImplKt.updateChangedFlags(i7), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    public static final void MarketplaceMainUi$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void MarketplaceMainUi$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void MarketplaceMainUi$lambda$18(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceMainUiPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(636236129);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(636236129, i, -1, "com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiPreview (MarketplaceMainUi.kt:1192)");
            }
            MarketplaceProfileInfo marketplaceProfileInfo = new MarketplaceProfileInfo("Tyomnayark", 0, new MarketplaceProduct(false, "Маска из мешковины", null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, 16777213, null), null, null, 26, null);
            MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = new MarketplaceBottomSheetInfo(5, false, 0, 0L, 0L, 0, 0, 126, null);
            String number = FormatUtilsKt.formatNumber(10099999);
            MarketplaceSortFilter marketplaceSortFilter = MarketplaceSortFilter.DESCENDING;
            MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum = MarketplaceHistoryStatusEnum.SOLD;
            MarketplaceProduct marketplaceProduct = new MarketplaceProduct(false, "Маска из мешковины", null, MarketplaceRarityEnum.LEGENDARY, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null);
            MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum2 = MarketplaceHistoryStatusEnum.PURCHASED;
            MarketplaceProduct marketplaceProduct2 = new MarketplaceProduct(false, "Маска «Ведро»", null, MarketplaceRarityEnum.EPIC, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null);
            MarketplaceRarityEnum marketplaceRarityEnum = MarketplaceRarityEnum.COMMON;
            composer2 = composerStartRestartGroup;
            MarketplaceMainUi(marketplaceProfileInfo, marketplaceBottomSheetInfo, number, marketplaceSortFilter, null, CollectionsKt__CollectionsKt.listOf((Object[]) new MarketplaceProduct[]{marketplaceProduct, marketplaceProduct2, new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска из мешковины", null, MarketplaceRarityEnum.UNCOMMON, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, true, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15990773, null), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, marketplaceHistoryStatusEnum, false, false, false, false, null, 15990773, null)}), new MarketplaceProduct(false, "Маска «Ленин»", null, marketplaceRarityEnum, null, 0, null, 0, 0, 0, 0, 100L, 0, "Tyomnayark", "description description description", "06.07.2024 22.00", 99.0d, 0, marketplaceHistoryStatusEnum2, false, false, false, false, null, 15865845, null), CollectionsKt__CollectionsKt.listOf((Object[]) new CraftCategoryFilter[]{new CraftCategoryFilter(2, "Редкость", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(1, "Обычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(2, "Необычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(3, "Редкие", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(4, "Эпические", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(5, "Легендарные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._1wdp, false, null, 128, null)})), new CraftCategoryFilter(1, "Категория", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(6, "Все", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(7, "Ресурсы", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(8, "Аксессуары", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(9, "Одежда", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._50wdp, false, null, 128, null)}))}), 1, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 2, 3, 4, 5}), false, false, false, false, true, false, true, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.gray_blue), Integer.valueOf(R.color.black_gray_blue_2)}), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.gray_blue), Integer.valueOf(R.color.black_gray_blue_2)}), R.color.white, R.dimen._0wdp, new MarketplaceTab(false, 2, null, R.drawable.ic_user, 0, false, false, null, 245, null), CollectionsKt__CollectionsKt.listOf((Object[]) new MarketplaceTab[]{new MarketplaceTab(false, 0, null, R.drawable.ic_user, 0, false, false, null, 247, null), new MarketplaceTab(false, 0, null, R.drawable.ic_home, 0, true, false, null, MatroskaExtractor.ID_TRACK_NUMBER, null), new MarketplaceTab(false, 0, null, R.drawable.ic_history, 0, false, true, null, MatroskaExtractor.ID_CUE_TRACK_POSITIONS, null), new MarketplaceTab(false, 0, null, R.drawable.ic_heart, 0, false, false, null, 247, null), new MarketplaceTab(false, 0, null, R.drawable.ic_list, 0, false, false, null, 247, null)}), new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.5
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<MarketplaceProduct, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MarketplaceProduct it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MarketplaceProduct marketplaceProduct3) {
                    invoke2(marketplaceProduct3);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.13
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.14
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.16
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.17
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.18
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.19
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.20
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.22
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.23
                public final void invoke(int i2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.24
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.25
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.26
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 925133832, 920350134, 920350278, 920350134, 115043766);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.MarketplaceMainUiKt.MarketplaceMainUiPreview.27
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
                    MarketplaceMainUiKt.MarketplaceMainUiPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean MarketplaceMainUi$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float MarketplaceMainUi$lambda$7(State<C2046Dp> state) {
        return state.getValue().m13680unboximpl();
    }

    public static final float MarketplaceMainUi$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float MarketplaceMainUi$lambda$12(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final boolean MarketplaceMainUi$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float MarketplaceMainUi$lambda$15(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float MarketplaceMainUi$lambda$17(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    public static final float MarketplaceMainUi$lambda$19(State<Float> state) {
        return state.getValue().floatValue();
    }
}
