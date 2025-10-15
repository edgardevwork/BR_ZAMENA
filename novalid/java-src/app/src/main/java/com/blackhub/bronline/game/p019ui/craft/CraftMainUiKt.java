package com.blackhub.bronline.game.p019ui.craft;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.draw.ClipKt;
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
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.text.ttml.TtmlParser;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.attachment.main.CommonButtonCategory;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.blackhub.bronline.game.gui.craft.model.CraftElement;
import com.blackhub.bronline.game.gui.craft.model.CraftIngredient;
import com.blackhub.bronline.game.gui.craft.model.CraftItemTextBlock;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemCategoryFilter;
import com.blackhub.bronline.game.p019ui.craft.CraftMainUiKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftAnimButtonsBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftCategoriesBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftCraftingControlBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftFilterBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftPreviewBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftProgressBarLvlBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftProgressBarProdBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftProgressBarStashBlockKt;
import com.blackhub.bronline.game.p019ui.craft.uiblock.CraftVerticalListWithElementsBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowBottomBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowLeftBlockKt;
import com.blackhub.bronline.game.p019ui.widget.block.cloud.CloudArrowTopBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonContentBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonGrayGradientKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftMainUi.kt */
@Metadata(m7104d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u001a´\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00162\b\b\u0001\u0010(\u001a\u00020\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020&0#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0#2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\b\b\u0001\u00105\u001a\u00020\u001f2\b\b\u0001\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f2\b\b\u0001\u0010?\u001a\u00020\u001f2\b\b\u0001\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u00112\b\b\u0001\u0010D\u001a\u00020\u001f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0F2\u0018\u0010I\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0F2!\u0010Q\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\n0R2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0F2!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110Y¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020\n0R2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\n0F2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\n0F2!\u0010a\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\bS\u0012\b\bT\u0012\u0004\b\b(U\u0012\u0004\u0012\u00020\n0RH\u0007¢\u0006\u0002\u0010b\u001a\r\u0010c\u001a\u00020\nH\u0007¢\u0006\u0002\u0010d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006e²\u0006\n\u0010f\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010g\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\u0010\u0010h\u001a\b\u0012\u0004\u0012\u00020i0#X\u008a\u008e\u0002²\u0006\n\u0010j\u001a\u00020\u001fX\u008a\u008e\u0002"}, m7105d2 = {"CONST_ONE_POINT_ONE", "", "CONST_ZERO_POINT_EIGHT", "CONST_ZERO_POINT_SIX", "RADIUS_GRADIENT_BTN", "RADIUS_VAL_FIRST", "RADIUS_VAL_SECOND", "WAITING_MILLIS", "", "CraftMainUi", "", "currentScreen", "Lcom/blackhub/bronline/game/gui/craft/enums/CraftScreenTypeEnum;", TtmlParser.ATTR_IMAGE, "Landroid/graphics/Bitmap;", "titleIcon", "titleText", "", "craftIconAlarmText", "stashIconAlarmText", "progressIconAlarmText", "isButtonsExpanded", "", "isWithIndicationCraft", "isWithIndicationStash", "isWithIndicationFilter", "isNeedToShowFilter", "isNeedToShowHints", "isNeedToShowFilterButton", "isNeedToShowSplit", "topColorFilterButton", "", "bottomColorFilterButton", "iconColorFilterButton", "categories", "", "Lcom/blackhub/bronline/game/core/utils/attachment/main/CommonButtonCategory;", "selectedElement", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;", "isWithVIP", "dividerColor", "allElements", "filterList", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "typeOfControlBlock", "selectedValueOfItem", "maxValueOfItems", "selectedWeight", "craftingPrice", "craftingTimer", "isEnabledMinus", "isEnabledPlus", "isLowLevel", "textMoneyColor", "textSelectedValueOfItemColor", "buttonAlpha", "textCurrentValueOfItems", "levelOfSkill", "percentOfSkill", "quantityInStorage", "storageMax", "quantityInQueue", "queueMax", "prodProgressBarThumbColor", "stashProgressBarThumbColor", "isQueueFilled", "isStorageFilled", "buttonWithLineText", "textForEmptyList", "onCloseHintsClick", "Lkotlin/Function0;", "onArrowBottomClick", "onArrowTopClick", "onCategoryClick", "Lkotlin/Function2;", "onButtonCraftClick", "onButtonStashClick", "onButtonProgressClick", "onInfoButtonClick", "onFilterButtonShowOrApplyClick", "onCloseClick", "selectCraftElement", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "getOrAddElementForStorage", "onRefreshFilterButtonClick", "onFilterCheckboxClick", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemCategoryFilter;", "filterCheckBox", "onMinusClick", "onPlusClick", "onMainButtonClick", "onVipClick", "onCloseSplitClick", "onBuyVipClick", "isNeedToDeleteElement", "(Lcom/blackhub/bronline/game/gui/craft/enums/CraftScreenTypeEnum;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZIIILjava/util/List;Lcom/blackhub/bronline/game/gui/craft/model/CraftElement;ZILjava/util/List;Ljava/util/List;IIILjava/lang/String;Ljava/lang/String;IZZZIIFFIIIIIIIIZZLjava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIIII)V", "CraftMainUiPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "isStashScreen", "isNeedShowTooltip", "currentIngredients", "Lcom/blackhub/bronline/game/gui/craft/model/CraftIngredient;", "selectedItemPosition"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCraftMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftMainUi.kt\ncom/blackhub/bronline/game/ui/craft/CraftMainUiKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1280:1\n1116#2,6:1281\n1116#2,6:1287\n81#3:1293\n*S KotlinDebug\n*F\n+ 1 CraftMainUi.kt\ncom/blackhub/bronline/game/ui/craft/CraftMainUiKt\n*L\n177#1:1281,6\n181#1:1287,6\n177#1:1293\n*E\n"})
/* loaded from: classes2.dex */
public final class CraftMainUiKt {
    public static final float CONST_ONE_POINT_ONE = 1.1f;
    public static final float CONST_ZERO_POINT_EIGHT = 0.8f;
    public static final float CONST_ZERO_POINT_SIX = 0.6f;
    public static final float RADIUS_GRADIENT_BTN = 180.0f;
    public static final float RADIUS_VAL_FIRST = 0.05f;
    public static final float RADIUS_VAL_SECOND = 0.2f;
    public static final long WAITING_MILLIS = 5000;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CraftMainUi(@NotNull final CraftScreenTypeEnum currentScreen, @Nullable final Bitmap bitmap, @Nullable final Bitmap bitmap2, @NotNull final String titleText, @Nullable final String str, @Nullable final String str2, @Nullable final String str3, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, @ColorRes final int i, @ColorRes final int i2, @ColorRes final int i3, @NotNull final List<CommonButtonCategory> categories, @NotNull final CraftElement selectedElement, final boolean z9, @ColorRes final int i4, @NotNull final List<CraftElement> allElements, @NotNull final List<CraftCategoryFilter> filterList, final int i5, final int i6, final int i7, @NotNull final String selectedWeight, @NotNull final String craftingPrice, final int i8, final boolean z10, final boolean z11, final boolean z12, @ColorRes final int i9, @ColorRes final int i10, final float f, final float f2, final int i11, final int i12, final int i13, final int i14, final int i15, final int i16, @ColorRes final int i17, @ColorRes final int i18, final boolean z13, final boolean z14, @NotNull final String buttonWithLineText, @StringRes final int i19, @NotNull final Function0<Unit> onCloseHintsClick, @NotNull final Function0<Unit> onArrowBottomClick, @NotNull final Function0<Unit> onArrowTopClick, @NotNull final Function2<? super CommonButtonCategory, ? super Integer, Unit> onCategoryClick, @NotNull final Function0<Unit> onButtonCraftClick, @NotNull final Function0<Unit> onButtonStashClick, @NotNull final Function0<Unit> onButtonProgressClick, @NotNull final Function0<Unit> onInfoButtonClick, @NotNull final Function0<Unit> onFilterButtonShowOrApplyClick, @NotNull final Function0<Unit> onCloseClick, @NotNull final Function1<? super CraftElement, Unit> selectCraftElement, @NotNull final Function0<Unit> getOrAddElementForStorage, @NotNull final Function0<Unit> onRefreshFilterButtonClick, @NotNull final Function1<? super CraftItemCategoryFilter, Unit> onFilterCheckboxClick, @NotNull final Function0<Unit> onMinusClick, @NotNull final Function0<Unit> onPlusClick, @NotNull final Function0<Unit> onMainButtonClick, @NotNull final Function0<Unit> onVipClick, @NotNull final Function0<Unit> onCloseSplitClick, @NotNull final Function0<Unit> onBuyVipClick, @NotNull final Function1<? super CraftElement, Unit> isNeedToDeleteElement, @Nullable Composer composer, final int i20, final int i21, final int i22, final int i23, final int i24, final int i25, final int i26) {
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedElement, "selectedElement");
        Intrinsics.checkNotNullParameter(allElements, "allElements");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(selectedWeight, "selectedWeight");
        Intrinsics.checkNotNullParameter(craftingPrice, "craftingPrice");
        Intrinsics.checkNotNullParameter(buttonWithLineText, "buttonWithLineText");
        Intrinsics.checkNotNullParameter(onCloseHintsClick, "onCloseHintsClick");
        Intrinsics.checkNotNullParameter(onArrowBottomClick, "onArrowBottomClick");
        Intrinsics.checkNotNullParameter(onArrowTopClick, "onArrowTopClick");
        Intrinsics.checkNotNullParameter(onCategoryClick, "onCategoryClick");
        Intrinsics.checkNotNullParameter(onButtonCraftClick, "onButtonCraftClick");
        Intrinsics.checkNotNullParameter(onButtonStashClick, "onButtonStashClick");
        Intrinsics.checkNotNullParameter(onButtonProgressClick, "onButtonProgressClick");
        Intrinsics.checkNotNullParameter(onInfoButtonClick, "onInfoButtonClick");
        Intrinsics.checkNotNullParameter(onFilterButtonShowOrApplyClick, "onFilterButtonShowOrApplyClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(selectCraftElement, "selectCraftElement");
        Intrinsics.checkNotNullParameter(getOrAddElementForStorage, "getOrAddElementForStorage");
        Intrinsics.checkNotNullParameter(onRefreshFilterButtonClick, "onRefreshFilterButtonClick");
        Intrinsics.checkNotNullParameter(onFilterCheckboxClick, "onFilterCheckboxClick");
        Intrinsics.checkNotNullParameter(onMinusClick, "onMinusClick");
        Intrinsics.checkNotNullParameter(onPlusClick, "onPlusClick");
        Intrinsics.checkNotNullParameter(onMainButtonClick, "onMainButtonClick");
        Intrinsics.checkNotNullParameter(onVipClick, "onVipClick");
        Intrinsics.checkNotNullParameter(onCloseSplitClick, "onCloseSplitClick");
        Intrinsics.checkNotNullParameter(onBuyVipClick, "onBuyVipClick");
        Intrinsics.checkNotNullParameter(isNeedToDeleteElement, "isNeedToDeleteElement");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1101303516);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1101303516, i20, i21, "com.blackhub.bronline.game.ui.craft.CraftMainUi (CraftMainUi.kt:175)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1434885758);
        boolean z15 = (((i20 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(currentScreen)) || (i20 & 6) == 4;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z15 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(currentScreen == CraftScreenTypeEnum.STASH), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1434885630);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1505786431, true, new C54281(i, i2, bitmap, bitmap2, allElements, i19, selectedElement, z9, onVipClick, titleText, onCloseClick, onInfoButtonClick, z6, categories, onArrowBottomClick, onArrowTopClick, onCategoryClick, i11, i12, z7, onFilterButtonShowOrApplyClick, z4, currentScreen, str, str2, str3, z, z2, z3, onButtonCraftClick, onButtonStashClick, onButtonProgressClick, mutableState, i5, i6, i7, selectedWeight, craftingPrice, i8, z10, z11, z12, i9, i10, f, f2, onMinusClick, onPlusClick, onMainButtonClick, selectCraftElement, buttonWithLineText, getOrAddElementForStorage, isNeedToDeleteElement, i4, (MutableInteractionSource) objRememberedValue2, i15, i16, i17, z13, i13, i14, i18, z14, i3, filterList, z5, onRefreshFilterButtonClick, onFilterCheckboxClick, onCloseHintsClick)), composerStartRestartGroup, 12582918, 122);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(z8), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 620045820, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUi.2
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
            public final void invoke(@Nullable Composer composer2, int i27) {
                if ((i27 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620045820, i27, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous> (CraftMainUi.kt:919)");
                    }
                    Bitmap bitmap3 = bitmap;
                    composer2.startReplaceableGroup(-1568525432);
                    boolean zChanged = composer2.changed(onCloseSplitClick);
                    final Function0<Unit> function0 = onCloseSplitClick;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$2$1$1
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
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(-1568525379);
                    boolean zChanged2 = composer2.changed(onBuyVipClick);
                    final Function0<Unit> function03 = onBuyVipClick;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$2$2$1
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
                                function03.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    CraftSplitDialogKt.CraftSplitDialog(bitmap3, function02, (Function0) objRememberedValue4, composer2, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, ((i21 >> 12) & 14) | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUi.3
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

                public final void invoke(@Nullable Composer composer2, int i27) {
                    CraftMainUiKt.CraftMainUi(currentScreen, bitmap, bitmap2, titleText, str, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, i, i2, i3, categories, selectedElement, z9, i4, allElements, filterList, i5, i6, i7, selectedWeight, craftingPrice, i8, z10, z11, z12, i9, i10, f, f2, i11, i12, i13, i14, i15, i16, i17, i18, z13, z14, buttonWithLineText, i19, onCloseHintsClick, onArrowBottomClick, onArrowTopClick, onCategoryClick, onButtonCraftClick, onButtonStashClick, onButtonProgressClick, onInfoButtonClick, onFilterButtonShowOrApplyClick, onCloseClick, selectCraftElement, getOrAddElementForStorage, onRefreshFilterButtonClick, onFilterCheckboxClick, onMinusClick, onPlusClick, onMainButtonClick, onVipClick, onCloseSplitClick, onBuyVipClick, isNeedToDeleteElement, composer2, RecomposeScopeImplKt.updateChangedFlags(i20 | 1), RecomposeScopeImplKt.updateChangedFlags(i21), RecomposeScopeImplKt.updateChangedFlags(i22), RecomposeScopeImplKt.updateChangedFlags(i23), RecomposeScopeImplKt.updateChangedFlags(i24), RecomposeScopeImplKt.updateChangedFlags(i25), RecomposeScopeImplKt.updateChangedFlags(i26));
                }
            });
        }
    }

    /* compiled from: CraftMainUi.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCraftMainUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftMainUi.kt\ncom/blackhub/bronline/game/ui/craft/CraftMainUiKt$CraftMainUi$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,1280:1\n1116#2,6:1281\n955#2,6:1292\n73#3,4:1287\n77#3,20:1298\n25#4:1291\n81#5:1318\n107#5,2:1319\n81#5:1321\n107#5,2:1322\n75#6:1324\n108#6,2:1325\n*S KotlinDebug\n*F\n+ 1 CraftMainUi.kt\ncom/blackhub/bronline/game/ui/craft/CraftMainUiKt$CraftMainUi$1\n*L\n237#1:1281,6\n245#1:1292,6\n245#1:1287,4\n245#1:1298,20\n245#1:1291\n237#1:1318\n237#1:1319,2\n683#1:1321\n683#1:1322,2\n684#1:1324\n684#1:1325,2\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1 */
    /* loaded from: classes3.dex */
    public static final class C54281 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ List<CraftElement> $allElements;
        public final /* synthetic */ Bitmap $backgroundImage;
        public final /* synthetic */ int $bottomColorFilterButton;
        public final /* synthetic */ float $buttonAlpha;
        public final /* synthetic */ String $buttonWithLineText;
        public final /* synthetic */ List<CommonButtonCategory> $categories;
        public final /* synthetic */ String $craftIconAlarmText;
        public final /* synthetic */ String $craftingPrice;
        public final /* synthetic */ int $craftingTimer;
        public final /* synthetic */ CraftScreenTypeEnum $currentScreen;
        public final /* synthetic */ int $dividerColor;
        public final /* synthetic */ List<CraftCategoryFilter> $filterList;
        public final /* synthetic */ Function0<Unit> $getOrAddElementForStorage;
        public final /* synthetic */ int $iconColorFilterButton;
        public final /* synthetic */ MutableInteractionSource $interactionSource;
        public final /* synthetic */ boolean $isButtonsExpanded;
        public final /* synthetic */ boolean $isEnabledMinus;
        public final /* synthetic */ boolean $isEnabledPlus;
        public final /* synthetic */ boolean $isLowLevel;
        public final /* synthetic */ Function1<CraftElement, Unit> $isNeedToDeleteElement;
        public final /* synthetic */ boolean $isNeedToShowFilter;
        public final /* synthetic */ boolean $isNeedToShowFilterButton;
        public final /* synthetic */ boolean $isNeedToShowHints;
        public final /* synthetic */ boolean $isQueueFilled;
        public final /* synthetic */ MutableState<Boolean> $isStashScreen$delegate;
        public final /* synthetic */ boolean $isStorageFilled;
        public final /* synthetic */ boolean $isWithIndicationCraft;
        public final /* synthetic */ boolean $isWithIndicationFilter;
        public final /* synthetic */ boolean $isWithIndicationStash;
        public final /* synthetic */ boolean $isWithVIP;
        public final /* synthetic */ int $levelOfSkill;
        public final /* synthetic */ int $maxValueOfItems;
        public final /* synthetic */ Function0<Unit> $onArrowBottomClick;
        public final /* synthetic */ Function0<Unit> $onArrowTopClick;
        public final /* synthetic */ Function0<Unit> $onButtonCraftClick;
        public final /* synthetic */ Function0<Unit> $onButtonProgressClick;
        public final /* synthetic */ Function0<Unit> $onButtonStashClick;
        public final /* synthetic */ Function2<CommonButtonCategory, Integer, Unit> $onCategoryClick;
        public final /* synthetic */ Function0<Unit> $onCloseClick;
        public final /* synthetic */ Function0<Unit> $onCloseHintsClick;
        public final /* synthetic */ Function0<Unit> $onFilterButtonShowOrApplyClick;
        public final /* synthetic */ Function1<CraftItemCategoryFilter, Unit> $onFilterCheckboxClick;
        public final /* synthetic */ Function0<Unit> $onInfoButtonClick;
        public final /* synthetic */ Function0<Unit> $onMainButtonClick;
        public final /* synthetic */ Function0<Unit> $onMinusClick;
        public final /* synthetic */ Function0<Unit> $onPlusClick;
        public final /* synthetic */ Function0<Unit> $onRefreshFilterButtonClick;
        public final /* synthetic */ Function0<Unit> $onVipClick;
        public final /* synthetic */ int $percentOfSkill;
        public final /* synthetic */ int $prodProgressBarThumbColor;
        public final /* synthetic */ String $progressIconAlarmText;
        public final /* synthetic */ int $quantityInQueue;
        public final /* synthetic */ int $quantityInStorage;
        public final /* synthetic */ int $queueMax;
        public final /* synthetic */ Function1<CraftElement, Unit> $selectCraftElement;
        public final /* synthetic */ CraftElement $selectedElement;
        public final /* synthetic */ int $selectedValueOfItem;
        public final /* synthetic */ String $selectedWeight;
        public final /* synthetic */ String $stashIconAlarmText;
        public final /* synthetic */ int $stashProgressBarThumbColor;
        public final /* synthetic */ int $storageMax;
        public final /* synthetic */ float $textCurrentValueOfItems;
        public final /* synthetic */ int $textForEmptyList;
        public final /* synthetic */ int $textMoneyColor;
        public final /* synthetic */ int $textSelectedValueOfItemColor;
        public final /* synthetic */ Bitmap $titleIcon;
        public final /* synthetic */ String $titleText;
        public final /* synthetic */ int $topColorFilterButton;
        public final /* synthetic */ int $typeOfControlBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C54281(int i, int i2, Bitmap bitmap, Bitmap bitmap2, List<CraftElement> list, int i3, CraftElement craftElement, boolean z, Function0<Unit> function0, String str, Function0<Unit> function02, Function0<Unit> function03, boolean z2, List<CommonButtonCategory> list2, Function0<Unit> function04, Function0<Unit> function05, Function2<? super CommonButtonCategory, ? super Integer, Unit> function2, int i4, int i5, boolean z3, Function0<Unit> function06, boolean z4, CraftScreenTypeEnum craftScreenTypeEnum, String str2, String str3, String str4, boolean z5, boolean z6, boolean z7, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, MutableState<Boolean> mutableState, int i6, int i7, int i8, String str5, String str6, int i9, boolean z8, boolean z9, boolean z10, int i10, int i11, float f, float f2, Function0<Unit> function010, Function0<Unit> function011, Function0<Unit> function012, Function1<? super CraftElement, Unit> function1, String str7, Function0<Unit> function013, Function1<? super CraftElement, Unit> function12, int i12, MutableInteractionSource mutableInteractionSource, int i13, int i14, int i15, boolean z11, int i16, int i17, int i18, boolean z12, int i19, List<CraftCategoryFilter> list3, boolean z13, Function0<Unit> function014, Function1<? super CraftItemCategoryFilter, Unit> function13, Function0<Unit> function015) {
            super(2);
            this.$topColorFilterButton = i;
            this.$bottomColorFilterButton = i2;
            this.$backgroundImage = bitmap;
            this.$titleIcon = bitmap2;
            this.$allElements = list;
            this.$textForEmptyList = i3;
            this.$selectedElement = craftElement;
            this.$isWithVIP = z;
            this.$onVipClick = function0;
            this.$titleText = str;
            this.$onCloseClick = function02;
            this.$onInfoButtonClick = function03;
            this.$isNeedToShowHints = z2;
            this.$categories = list2;
            this.$onArrowBottomClick = function04;
            this.$onArrowTopClick = function05;
            this.$onCategoryClick = function2;
            this.$levelOfSkill = i4;
            this.$percentOfSkill = i5;
            this.$isNeedToShowFilterButton = z3;
            this.$onFilterButtonShowOrApplyClick = function06;
            this.$isWithIndicationFilter = z4;
            this.$currentScreen = craftScreenTypeEnum;
            this.$craftIconAlarmText = str2;
            this.$stashIconAlarmText = str3;
            this.$progressIconAlarmText = str4;
            this.$isButtonsExpanded = z5;
            this.$isWithIndicationCraft = z6;
            this.$isWithIndicationStash = z7;
            this.$onButtonCraftClick = function07;
            this.$onButtonStashClick = function08;
            this.$onButtonProgressClick = function09;
            this.$isStashScreen$delegate = mutableState;
            this.$typeOfControlBlock = i6;
            this.$selectedValueOfItem = i7;
            this.$maxValueOfItems = i8;
            this.$selectedWeight = str5;
            this.$craftingPrice = str6;
            this.$craftingTimer = i9;
            this.$isEnabledMinus = z8;
            this.$isEnabledPlus = z9;
            this.$isLowLevel = z10;
            this.$textMoneyColor = i10;
            this.$textSelectedValueOfItemColor = i11;
            this.$buttonAlpha = f;
            this.$textCurrentValueOfItems = f2;
            this.$onMinusClick = function010;
            this.$onPlusClick = function011;
            this.$onMainButtonClick = function012;
            this.$selectCraftElement = function1;
            this.$buttonWithLineText = str7;
            this.$getOrAddElementForStorage = function013;
            this.$isNeedToDeleteElement = function12;
            this.$dividerColor = i12;
            this.$interactionSource = mutableInteractionSource;
            this.$quantityInQueue = i13;
            this.$queueMax = i14;
            this.$prodProgressBarThumbColor = i15;
            this.$isQueueFilled = z11;
            this.$quantityInStorage = i16;
            this.$storageMax = i17;
            this.$stashProgressBarThumbColor = i18;
            this.$isStorageFilled = z12;
            this.$iconColorFilterButton = i19;
            this.$filterList = list3;
            this.$isNeedToShowFilter = z13;
            this.$onRefreshFilterButtonClick = function014;
            this.$onFilterCheckboxClick = function13;
            this.$onCloseHintsClick = function015;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            Function0<Unit> function0;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1505786431, i, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous> (CraftMainUi.kt:186)");
                }
                final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composer, 6);
                final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composer, 6);
                final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composer, 6);
                final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composer, 6);
                final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._17wdp, composer, 6);
                final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._22wdp, composer, 6);
                final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composer, 6);
                final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer, 6);
                final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._35wdp, composer, 6);
                final float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._47wdp, composer, 6);
                final float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._55wdp, composer, 6);
                final float fDimensionResource12 = PrimitiveResources_androidKt.dimensionResource(R.dimen._72wdp, composer, 6);
                final float fDimensionResource13 = PrimitiveResources_androidKt.dimensionResource(R.dimen._98wdp, composer, 6);
                Brush.Companion companion = Brush.INSTANCE;
                final Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                final Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                final Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composer, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                final BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer, 6), ColorResources_androidKt.colorResource(R.color.white, composer, 6));
                final Brush brushM11297verticalGradient8A3gB4$default3 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(this.$topColorFilterButton, composer, 0)), Color.m11330boximpl(ColorResources_androidKt.colorResource(this.$bottomColorFilterButton, composer, 0))}), 0.0f, 0.0f, 0, 14, (Object) null);
                composer.startReplaceableGroup(-1568557383);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final MutableState mutableState = (MutableState) objRememberedValue;
                composer.endReplaceableGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ImageBitmapKt.m15118ImageBitmapAy9G7rc(this.$backgroundImage, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, composer, 3128, 116);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                final Bitmap bitmap = this.$titleIcon;
                final List<CraftElement> list = this.$allElements;
                final int i2 = this.$textForEmptyList;
                final CraftElement craftElement = this.$selectedElement;
                final boolean z = this.$isWithVIP;
                final Function0<Unit> function02 = this.$onVipClick;
                final String str = this.$titleText;
                final Function0<Unit> function03 = this.$onCloseClick;
                Function0<Unit> function04 = this.$onInfoButtonClick;
                final boolean z2 = this.$isNeedToShowHints;
                final List<CommonButtonCategory> list2 = this.$categories;
                final Function0<Unit> function05 = this.$onArrowBottomClick;
                final Function0<Unit> function06 = this.$onArrowTopClick;
                final Function2<CommonButtonCategory, Integer, Unit> function2 = this.$onCategoryClick;
                final int i3 = this.$levelOfSkill;
                final int i4 = this.$percentOfSkill;
                final boolean z3 = this.$isNeedToShowFilterButton;
                final Function0<Unit> function07 = this.$onFilterButtonShowOrApplyClick;
                final boolean z4 = this.$isWithIndicationFilter;
                final CraftScreenTypeEnum craftScreenTypeEnum = this.$currentScreen;
                final String str2 = this.$craftIconAlarmText;
                final String str3 = this.$stashIconAlarmText;
                final String str4 = this.$progressIconAlarmText;
                final boolean z5 = this.$isButtonsExpanded;
                final boolean z6 = this.$isWithIndicationCraft;
                final boolean z7 = this.$isWithIndicationStash;
                final Function0<Unit> function08 = this.$onButtonCraftClick;
                final Function0<Unit> function09 = this.$onButtonStashClick;
                final Function0<Unit> function010 = this.$onButtonProgressClick;
                final MutableState<Boolean> mutableState2 = this.$isStashScreen$delegate;
                final int i5 = this.$typeOfControlBlock;
                final int i6 = this.$selectedValueOfItem;
                final int i7 = this.$maxValueOfItems;
                final String str5 = this.$selectedWeight;
                final String str6 = this.$craftingPrice;
                final int i8 = this.$craftingTimer;
                final boolean z8 = this.$isEnabledMinus;
                final boolean z9 = this.$isEnabledPlus;
                final boolean z10 = this.$isLowLevel;
                final int i9 = this.$textMoneyColor;
                final int i10 = this.$textSelectedValueOfItemColor;
                final float f = this.$buttonAlpha;
                final float f2 = this.$textCurrentValueOfItems;
                final Function0<Unit> function011 = this.$onMinusClick;
                final Function0<Unit> function012 = this.$onPlusClick;
                final Function0<Unit> function013 = this.$onMainButtonClick;
                final Function1<CraftElement, Unit> function1 = this.$selectCraftElement;
                final String str7 = this.$buttonWithLineText;
                final Function0<Unit> function014 = this.$getOrAddElementForStorage;
                final Function1<CraftElement, Unit> function12 = this.$isNeedToDeleteElement;
                final int i11 = this.$dividerColor;
                final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                final int i12 = this.$quantityInQueue;
                final int i13 = this.$queueMax;
                final int i14 = this.$prodProgressBarThumbColor;
                final boolean z11 = this.$isQueueFilled;
                final int i15 = this.$quantityInStorage;
                final int i16 = this.$storageMax;
                final int i17 = this.$stashProgressBarThumbColor;
                final boolean z12 = this.$isStorageFilled;
                final int i18 = this.$iconColorFilterButton;
                final List<CraftCategoryFilter> list3 = this.$filterList;
                final boolean z13 = this.$isNeedToShowFilter;
                final Function0<Unit> function015 = this.$onRefreshFilterButtonClick;
                final Function1<CraftItemCategoryFilter, Unit> function13 = this.$onFilterCheckboxClick;
                final Function0<Unit> function016 = this.$onCloseHintsClick;
                composer.startReplaceableGroup(-270267587);
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Measurer();
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                final Measurer measurer = (Measurer) objRememberedValue2;
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion2.getEmpty()) {
                    objRememberedValue3 = new ConstraintLayoutScope();
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                composer.startReplaceableGroup(-3687241);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == companion2.getEmpty()) {
                    function0 = function04;
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue4);
                } else {
                    function0 = function04;
                }
                composer.endReplaceableGroup();
                final Function0<Unit> function017 = function0;
                Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue4, measurer, composer, 4544);
                MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFillMaxSize$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$invoke$$inlined$ConstraintLayout$1
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
                }, 1, null);
                final int i19 = 6;
                LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambdaKt.composableLambda(composer, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$invoke$$inlined$ConstraintLayout$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i20) {
                        ConstrainedLayoutReference constrainedLayoutReference;
                        ConstrainedLayoutReference constrainedLayoutReference2;
                        ConstrainedLayoutReference constrainedLayoutReference3;
                        int i21;
                        ConstrainedLayoutReference constrainedLayoutReference4;
                        ConstrainedLayoutReference constrainedLayoutReference5;
                        ConstrainedLayoutReference constrainedLayoutReference6;
                        ConstrainedLayoutReference constrainedLayoutReference7;
                        ConstrainedLayoutReference constrainedLayoutReference8;
                        ConstrainedLayoutReference constrainedLayoutReference9;
                        ConstrainedLayoutReference constrainedLayoutReference10;
                        Modifier.Companion companion4;
                        ConstraintLayoutScope constraintLayoutScope2;
                        Composer composer3;
                        ConstrainedLayoutReference constrainedLayoutReference11;
                        ConstrainedLayoutReference constrainedLayoutReference12;
                        ConstraintLayoutScope constraintLayoutScope3;
                        ConstrainedLayoutReference constrainedLayoutReference13;
                        ConstrainedLayoutReference constrainedLayoutReference14;
                        final ConstrainedLayoutReference constrainedLayoutReference15;
                        ConstrainedLayoutReference constrainedLayoutReference16;
                        int i22;
                        Composer composer4;
                        boolean z14;
                        Continuation continuation;
                        if (((i20 & 11) ^ 2) != 0 || !composer2.getSkipping()) {
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent5 = constrainedLayoutReferencesCreateRefs.component5();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent6 = constrainedLayoutReferencesCreateRefs.component6();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent7 = constrainedLayoutReferencesCreateRefs.component7();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent8 = constrainedLayoutReferencesCreateRefs.component8();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent9 = constrainedLayoutReferencesCreateRefs.component9();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent10 = constrainedLayoutReferencesCreateRefs.component10();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent11 = constrainedLayoutReferencesCreateRefs.component11();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent12 = constrainedLayoutReferencesCreateRefs.component12();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent13 = constrainedLayoutReferencesCreateRefs.component13();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent14 = constrainedLayoutReferencesCreateRefs.component14();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent15 = constrainedLayoutReferencesCreateRefs.component15();
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs2 = constraintLayoutScope4.createRefs();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent16 = constrainedLayoutReferencesCreateRefs2.component1();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent22 = constrainedLayoutReferencesCreateRefs2.component2();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent32 = constrainedLayoutReferencesCreateRefs2.component3();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent42 = constrainedLayoutReferencesCreateRefs2.component4();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent52 = constrainedLayoutReferencesCreateRefs2.component5();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent62 = constrainedLayoutReferencesCreateRefs2.component6();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent72 = constrainedLayoutReferencesCreateRefs2.component7();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent82 = constrainedLayoutReferencesCreateRefs2.component8();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent92 = constrainedLayoutReferencesCreateRefs2.component9();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent102 = constrainedLayoutReferencesCreateRefs2.component10();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent112 = constrainedLayoutReferencesCreateRefs2.component11();
                            ConstrainedLayoutReference constrainedLayoutReferenceComponent122 = constrainedLayoutReferencesCreateRefs2.component12();
                            final ConstrainedLayoutReference constrainedLayoutReferenceComponent132 = constrainedLayoutReferencesCreateRefs2.component13();
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            composer2.startReplaceableGroup(836279860);
                            boolean zChanged = composer2.changed(fDimensionResource2) | composer2.changed(fDimensionResource13);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                final float f3 = fDimensionResource2;
                                constrainedLayoutReference = constrainedLayoutReferenceComponent9;
                                final float f4 = fDimensionResource13;
                                objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$1$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f3, 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f4, 0.0f, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            } else {
                                constrainedLayoutReference = constrainedLayoutReferenceComponent9;
                            }
                            composer2.endReplaceableGroup();
                            final ConstrainedLayoutReference constrainedLayoutReference17 = constrainedLayoutReference;
                            ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, PaddingKt.m8123padding3ABfNKs(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6)), null, null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, 2, null), 0, composer2, 8, 92);
                            if (list.isEmpty()) {
                                composer2.startReplaceableGroup(836280427);
                                composer2.startReplaceableGroup(836280506);
                                boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent1) | composer2.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue6 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$2$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent6.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent6.getEnd(), 0.0f, 0.0f, 6, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue6);
                                }
                                composer2.endReplaceableGroup();
                                constrainedLayoutReference2 = constrainedLayoutReferenceComponent1;
                                i21 = helpersHashCode;
                                constrainedLayoutReference6 = constrainedLayoutReferenceComponent11;
                                constrainedLayoutReference3 = constrainedLayoutReferenceComponent16;
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(i2, composer2, 0), constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent112, (Function1) objRememberedValue6), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wdp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), 0, 0L, 0.0f, null, composer2, 1572870, 60), composer2, 0, 0, 65532);
                                composer2.startReplaceableGroup(836281174);
                                boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent22) | composer2.changed(constrainedLayoutReferenceComponent6);
                                Object objRememberedValue7 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$3$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent22.getBottom(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent6.getTop(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent6.getEnd(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue7);
                                }
                                composer2.endReplaceableGroup();
                                DividerKt.m9425VerticalDivider9IZ8Weo(ClipKt.clip(constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent122, (Function1) objRememberedValue7), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer2, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composer2, 6), composer2, 0, 0);
                                composer2.endReplaceableGroup();
                                companion4 = companion5;
                                composer3 = composer2;
                                constraintLayoutScope2 = constraintLayoutScope4;
                                constrainedLayoutReference11 = constrainedLayoutReferenceComponent6;
                                constrainedLayoutReference12 = constrainedLayoutReferenceComponent22;
                                constrainedLayoutReference5 = constrainedLayoutReference17;
                                constrainedLayoutReference4 = constrainedLayoutReferenceComponent10;
                                constrainedLayoutReference9 = constrainedLayoutReferenceComponent7;
                                constrainedLayoutReference8 = constrainedLayoutReferenceComponent12;
                                constrainedLayoutReference10 = constrainedLayoutReferenceComponent14;
                                constrainedLayoutReference7 = constrainedLayoutReferenceComponent102;
                            } else {
                                constrainedLayoutReference2 = constrainedLayoutReferenceComponent1;
                                constrainedLayoutReference3 = constrainedLayoutReferenceComponent16;
                                i21 = helpersHashCode;
                                composer2.startReplaceableGroup(836281758);
                                composer2.startReplaceableGroup(836281851);
                                boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent7) | composer2.changed(fDimensionResource10) | composer2.changed(constrainedLayoutReference17);
                                Object objRememberedValue8 = composer2.rememberedValue();
                                if (zChanged4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    final float f5 = fDimensionResource10;
                                    objRememberedValue8 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$4$1
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
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent7.getStart(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f5, 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference17.getStart(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue8);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent10, (Function1) objRememberedValue8);
                                CraftElement craftElement2 = craftElement;
                                boolean z15 = z;
                                boolean zCraftMainUi$lambda$1 = CraftMainUiKt.CraftMainUi$lambda$1(mutableState2);
                                composer2.startReplaceableGroup(836282299);
                                boolean zChanged5 = composer2.changed(function02);
                                Object objRememberedValue9 = composer2.rememberedValue();
                                if (zChanged5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function018 = function02;
                                    objRememberedValue9 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$5$1
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
                                    composer2.updateRememberedValue(objRememberedValue9);
                                }
                                composer2.endReplaceableGroup();
                                constrainedLayoutReference4 = constrainedLayoutReferenceComponent10;
                                constrainedLayoutReference5 = constrainedLayoutReference17;
                                CraftPreviewBlockKt.CraftPreviewBlock(modifierConstrainAs, craftElement2, z15, zCraftMainUi$lambda$1, (Function0) objRememberedValue9, composer2, 64, 0);
                                composer2.startReplaceableGroup(836282450);
                                boolean zChanged6 = composer2.changed(constrainedLayoutReferenceComponent12) | composer2.changed(fDimensionResource3) | composer2.changed(constrainedLayoutReferenceComponent11);
                                Object objRememberedValue10 = composer2.rememberedValue();
                                if (zChanged6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    final float f6 = fDimensionResource3;
                                    objRememberedValue10 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$6$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent12.getBottom(), C2046Dp.m13666constructorimpl(-f6), 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent11.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent11.getEnd(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue10);
                                }
                                composer2.endReplaceableGroup();
                                constrainedLayoutReference6 = constrainedLayoutReferenceComponent11;
                                DividerKt.m9424HorizontalDivider9IZ8Weo(constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent13, (Function1) objRememberedValue10), 0.0f, 0L, composer2, 0, 6);
                                composer2.startReplaceableGroup(836282891);
                                boolean zChanged7 = composer2.changed(constrainedLayoutReferenceComponent6) | composer2.changed(constrainedLayoutReferenceComponent13) | composer2.changed(constrainedLayoutReferenceComponent102);
                                Object objRememberedValue11 = composer2.rememberedValue();
                                if (zChanged7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue11 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$7$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent6.getBottom(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent13.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReferenceComponent13.getEnd(), 0.0f, 0.0f, 6, null);
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent102.getBottom(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue11);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(constraintLayoutScope4.constrainAs(companion5, constrainedLayoutReferenceComponent14, (Function1) objRememberedValue11), PrimitiveResources_androidKt.dimensionResource(R.dimen._86wdp, composer2, 6));
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i23 = i5;
                                int i24 = i6;
                                int i25 = i7;
                                String str8 = str5;
                                String str9 = str6;
                                int i26 = i8;
                                boolean z16 = z8;
                                boolean z17 = z9;
                                boolean z18 = z10;
                                int i27 = i9;
                                int i28 = i10;
                                float f7 = f;
                                float f8 = f2;
                                composer2.startReplaceableGroup(-623876125);
                                boolean zChanged8 = composer2.changed(function011);
                                Object objRememberedValue12 = composer2.rememberedValue();
                                if (zChanged8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function019 = function011;
                                    objRememberedValue12 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$8$1$1
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
                                            function019.invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue12);
                                }
                                Function0 function020 = (Function0) objRememberedValue12;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-623876067);
                                boolean zChanged9 = composer2.changed(function012);
                                Object objRememberedValue13 = composer2.rememberedValue();
                                if (zChanged9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function021 = function012;
                                    objRememberedValue13 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$8$2$1
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
                                    composer2.updateRememberedValue(objRememberedValue13);
                                }
                                Function0 function022 = (Function0) objRememberedValue13;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-623876004);
                                boolean zChanged10 = composer2.changed(function013);
                                Object objRememberedValue14 = composer2.rememberedValue();
                                if (zChanged10 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                    final Function0 function023 = function013;
                                    objRememberedValue14 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$8$3$1
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
                                            function023.invoke();
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue14);
                                }
                                composer2.endReplaceableGroup();
                                constrainedLayoutReference7 = constrainedLayoutReferenceComponent102;
                                constrainedLayoutReference8 = constrainedLayoutReferenceComponent12;
                                constrainedLayoutReference9 = constrainedLayoutReferenceComponent7;
                                constrainedLayoutReference10 = constrainedLayoutReferenceComponent14;
                                companion4 = companion5;
                                constraintLayoutScope2 = constraintLayoutScope4;
                                composer3 = composer2;
                                constrainedLayoutReference11 = constrainedLayoutReferenceComponent6;
                                constrainedLayoutReference12 = constrainedLayoutReferenceComponent22;
                                CraftCraftingControlBlockKt.CraftCraftingControlBlock(i23, i24, i25, str8, str9, i26, z16, z17, z18, i27, i28, f7, f8, function020, function022, (Function0) objRememberedValue14, composer2, 0, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                            }
                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                            TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126);
                            composer3.startReplaceableGroup(836284613);
                            final ConstrainedLayoutReference constrainedLayoutReference18 = constrainedLayoutReference2;
                            Composer composer5 = composer3;
                            boolean zChanged11 = composer3.changed(constrainedLayoutReference18) | composer5.changed(fDimensionResource12);
                            Object objRememberedValue15 = composer2.rememberedValue();
                            if (zChanged11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                final float f9 = fDimensionResource12;
                                objRememberedValue15 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$9$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference18.getEnd(), f9, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference18.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference18.getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer5.updateRememberedValue(objRememberedValue15);
                            }
                            composer2.endReplaceableGroup();
                            Modifier.Companion companion7 = companion4;
                            final ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                            TextKt.m10024Text4IGK_g(str, constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue15), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65532);
                            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._261wdp, composer2, 6));
                            composer2.startReplaceableGroup(836285009);
                            final ConstrainedLayoutReference constrainedLayoutReference19 = constrainedLayoutReference12;
                            boolean zChanged12 = composer2.changed(fDimensionResource10) | composer2.changed(constrainedLayoutReference19) | composer2.changed(constrainedLayoutReferenceComponent5) | composer2.changed(fDimensionResource7);
                            Object objRememberedValue16 = composer2.rememberedValue();
                            if (zChanged12 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                final float f10 = fDimensionResource10;
                                final float f11 = fDimensionResource7;
                                objRememberedValue16 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$10$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f10, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference19.getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReferenceComponent5.getEnd(), f11, 0.0f, 4, null);
                                        constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue16);
                            }
                            composer2.endReplaceableGroup();
                            final ConstrainedLayoutReference constrainedLayoutReference20 = constrainedLayoutReference11;
                            Modifier modifierConstrainAs2 = constraintLayoutScope5.constrainAs(modifierM8177width3ABfNKs, constrainedLayoutReference20, (Function1) objRememberedValue16);
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion8 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion8.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion9.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierConstrainAs2);
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
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion9.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion9.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion9.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            CraftVerticalListWithElementsBlockKt.CraftVerticalListWithElementsBlock(SizeKt.fillMaxHeight$default(companion7, 0.0f, 1, null), craftScreenTypeEnum, list, function1, str7, function014, function12, composer2, 518, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(836285946);
                            boolean zChanged13 = composer2.changed(constrainedLayoutReferenceComponent8) | composer2.changed(fDimensionResource9);
                            Object objRememberedValue17 = composer2.rememberedValue();
                            if (zChanged13 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                final float f12 = fDimensionResource9;
                                objRememberedValue17 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$12$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent8.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent8.getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), f12, 0.0f, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue17);
                            }
                            composer2.endReplaceableGroup();
                            final ConstrainedLayoutReference constrainedLayoutReference21 = constrainedLayoutReference5;
                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReference21, (Function1) objRememberedValue17), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6));
                            composer2.startReplaceableGroup(836286243);
                            boolean zChanged14 = composer2.changed(function03);
                            Object objRememberedValue18 = composer2.rememberedValue();
                            if (zChanged14 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function024 = function03;
                                objRememberedValue18 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$13$1
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
                                composer2.updateRememberedValue(objRememberedValue18);
                            }
                            composer2.endReplaceableGroup();
                            ComposableSingletons$CraftMainUiKt composableSingletons$CraftMainUiKt = ComposableSingletons$CraftMainUiKt.INSTANCE;
                            ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8172size3ABfNKs, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue18, composableSingletons$CraftMainUiKt.m14951getLambda1$app_siteRelease(), composer2, 0, 3072, 4094);
                            Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6));
                            composer2.startReplaceableGroup(836286739);
                            boolean zChanged15 = composer2.changed(constrainedLayoutReference21) | composer2.changed(fDimensionResource5);
                            Object objRememberedValue19 = composer2.rememberedValue();
                            if (zChanged15 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                final float f13 = fDimensionResource5;
                                objRememberedValue19 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$14$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference21.getBottom(), f13, 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference21.getStart(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue19);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs3 = constraintLayoutScope5.constrainAs(modifierM8172size3ABfNKs2, constrainedLayoutReferenceComponent15, (Function1) objRememberedValue19);
                            composer2.startReplaceableGroup(836286938);
                            boolean zChanged16 = composer2.changed(function017);
                            Object objRememberedValue20 = composer2.rememberedValue();
                            if (zChanged16 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function025 = function017;
                                objRememberedValue20 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$15$1
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
                                composer2.updateRememberedValue(objRememberedValue20);
                            }
                            composer2.endReplaceableGroup();
                            ButtonGrayGradientKt.ButtonGrayGradient(modifierConstrainAs3, null, null, null, false, null, false, false, (Function0) objRememberedValue20, composableSingletons$CraftMainUiKt.m14953getLambda2$app_siteRelease(), composer2, 805306368, 254);
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            final Brush brush = brushM11289horizontalGradient8A3gB4$default;
                            final float f14 = fDimensionResource8;
                            final float f15 = fDimensionResource3;
                            final Brush brush2 = brushM11297verticalGradient8A3gB4$default;
                            final float f16 = fDimensionResource10;
                            final float f17 = fDimensionResource11;
                            final List list4 = list;
                            final Brush brush3 = brushM11297verticalGradient8A3gB4$default2;
                            final ConstrainedLayoutReference constrainedLayoutReference22 = constrainedLayoutReference9;
                            final ConstrainedLayoutReference constrainedLayoutReference23 = constrainedLayoutReference6;
                            ComposeExtensionKt.IfTrue(boolValueOf, ComposableLambdaKt.composableLambda(composer2, -866727566, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16
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
                                public final void invoke(@Nullable Composer composer6, int i29) {
                                    if ((i29 & 11) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-866727566, i29, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous>.<anonymous>.<anonymous> (CraftMainUi.kt:441)");
                                    }
                                    Modifier.Companion companion10 = Modifier.INSTANCE;
                                    BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null), ColorResources_androidKt.colorResource(R.color.total_black_70, composer6, 6), null, 2, null), composer6, 0);
                                    ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference24 = constrainedLayoutReferenceComponent32;
                                    composer6.startReplaceableGroup(-623872565);
                                    boolean zChanged17 = composer6.changed(constrainedLayoutReference18);
                                    final ConstrainedLayoutReference constrainedLayoutReference25 = constrainedLayoutReference18;
                                    Object objRememberedValue21 = composer6.rememberedValue();
                                    if (zChanged17 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue21 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$1$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference25.getTop(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference25.getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference25.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue21);
                                    }
                                    composer6.endReplaceableGroup();
                                    Brush brush4 = brush;
                                    ComposableSingletons$CraftMainUiKt composableSingletons$CraftMainUiKt2 = ComposableSingletons$CraftMainUiKt.INSTANCE;
                                    CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope6.constrainAs(modifierM8177width3ABfNKs2, constrainedLayoutReference24, (Function1) objRememberedValue21), brush4, null, null, null, new float[]{0.05f, 0.2f}, null, composableSingletons$CraftMainUiKt2.m14954getLambda3$app_siteRelease(), composer6, 12845056, 92);
                                    ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._194wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference26 = constrainedLayoutReferenceComponent42;
                                    composer6.startReplaceableGroup(-623871245);
                                    boolean zChanged18 = composer6.changed(constrainedLayoutReferenceComponent5);
                                    final ConstrainedLayoutReference constrainedLayoutReference27 = constrainedLayoutReferenceComponent5;
                                    Object objRememberedValue22 = composer6.rememberedValue();
                                    if (zChanged18 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue22 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$2$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference27.getTop(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference27.getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference27.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue22);
                                    }
                                    composer6.endReplaceableGroup();
                                    CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope7.constrainAs(modifierM8177width3ABfNKs3, constrainedLayoutReference26, (Function1) objRememberedValue22), brush, null, null, null, new float[]{0.05f, 0.2f}, null, composableSingletons$CraftMainUiKt2.m14955getLambda4$app_siteRelease(), composer6, 12845056, 92);
                                    ConstraintLayoutScope constraintLayoutScope8 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs4 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._196wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference28 = constrainedLayoutReferenceComponent52;
                                    composer6.startReplaceableGroup(-623869892);
                                    boolean zChanged19 = composer6.changed(constrainedLayoutReference19) | composer6.changed(f14);
                                    final ConstrainedLayoutReference constrainedLayoutReference29 = constrainedLayoutReference19;
                                    final float f18 = f14;
                                    Object objRememberedValue23 = composer6.rememberedValue();
                                    if (zChanged19 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue23 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$3$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference29.getTop(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference29.getStart(), f18, 0.0f, 4, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue23);
                                    }
                                    composer6.endReplaceableGroup();
                                    CloudArrowLeftBlockKt.CloudArrowLeftBlock(constraintLayoutScope8.constrainAs(modifierM8177width3ABfNKs4, constrainedLayoutReference28, (Function1) objRememberedValue23), brush, null, null, null, new float[]{0.05f, 0.2f}, null, composableSingletons$CraftMainUiKt2.m14956getLambda5$app_siteRelease(), composer6, 12845056, 92);
                                    ConstraintLayoutScope constraintLayoutScope9 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs5 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._195wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference30 = constrainedLayoutReferenceComponent62;
                                    composer6.startReplaceableGroup(-623868605);
                                    boolean zChanged20 = composer6.changed(constrainedLayoutReferenceComponent72) | composer6.changed(f15) | composer6.changed(constrainedLayoutReference22);
                                    final ConstrainedLayoutReference constrainedLayoutReference31 = constrainedLayoutReferenceComponent72;
                                    final float f19 = f15;
                                    final ConstrainedLayoutReference constrainedLayoutReference32 = constrainedLayoutReference22;
                                    Object objRememberedValue24 = composer6.rememberedValue();
                                    if (zChanged20 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue24 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$4$1
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
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference31.getStart(), f19, 0.0f, 4, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference32.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue24);
                                    }
                                    composer6.endReplaceableGroup();
                                    CloudArrowTopBlockKt.CloudArrowTopBlock(constraintLayoutScope9.constrainAs(modifierM8177width3ABfNKs5, constrainedLayoutReference30, (Function1) objRememberedValue24), brush2, composableSingletons$CraftMainUiKt2.m14957getLambda6$app_siteRelease(), composer6, 384, 0);
                                    ConstraintLayoutScope constraintLayoutScope10 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs6 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._61wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._134wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference33 = constrainedLayoutReferenceComponent72;
                                    composer6.startReplaceableGroup(-623867299);
                                    boolean zChanged21 = composer6.changed(constrainedLayoutReferenceComponent8) | composer6.changed(f16);
                                    final ConstrainedLayoutReference constrainedLayoutReference34 = constrainedLayoutReferenceComponent8;
                                    final float f20 = f16;
                                    Object objRememberedValue25 = composer6.rememberedValue();
                                    if (zChanged21 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue25 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$5$1
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
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference34.getStart(), C2046Dp.m13666constructorimpl(-f20), 0.0f, 4, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference34.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue25);
                                    }
                                    composer6.endReplaceableGroup();
                                    CloudArrowTopBlockKt.CloudArrowTopBlock(constraintLayoutScope10.constrainAs(modifierM8177width3ABfNKs6, constrainedLayoutReference33, (Function1) objRememberedValue25), brush2, composableSingletons$CraftMainUiKt2.m14958getLambda7$app_siteRelease(), composer6, 384, 0);
                                    ConstraintLayoutScope constraintLayoutScope11 = constraintLayoutScope5;
                                    Modifier modifierM8177width3ABfNKs7 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._61wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._134wdp, composer6, 6));
                                    ConstrainedLayoutReference constrainedLayoutReference35 = constrainedLayoutReferenceComponent82;
                                    composer6.startReplaceableGroup(-623865988);
                                    boolean zChanged22 = composer6.changed(constrainedLayoutReferenceComponent8) | composer6.changed(f17);
                                    final ConstrainedLayoutReference constrainedLayoutReference36 = constrainedLayoutReferenceComponent8;
                                    final float f21 = f17;
                                    Object objRememberedValue26 = composer6.rememberedValue();
                                    if (zChanged22 || objRememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue26 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$6$1
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
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference36.getEnd(), C2046Dp.m13666constructorimpl(-f21), 0.0f, 4, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference36.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue26);
                                    }
                                    composer6.endReplaceableGroup();
                                    CloudArrowTopBlockKt.CloudArrowTopBlock(constraintLayoutScope11.constrainAs(modifierM8177width3ABfNKs7, constrainedLayoutReference35, (Function1) objRememberedValue26), brush2, composableSingletons$CraftMainUiKt2.m14959getLambda8$app_siteRelease(), composer6, 384, 0);
                                    if (!list4.isEmpty()) {
                                        ConstraintLayoutScope constraintLayoutScope12 = constraintLayoutScope5;
                                        Modifier modifierM8177width3ABfNKs8 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion10, PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._195wdp, composer6, 6));
                                        ConstrainedLayoutReference constrainedLayoutReference37 = constrainedLayoutReferenceComponent92;
                                        composer6.startReplaceableGroup(-623864602);
                                        boolean zChanged23 = composer6.changed(constrainedLayoutReference23);
                                        final ConstrainedLayoutReference constrainedLayoutReference38 = constrainedLayoutReference23;
                                        Object objRememberedValue27 = composer6.rememberedValue();
                                        if (zChanged23 || objRememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue27 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$16$7$1
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
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference38.getEnd(), 0.0f, 0.0f, 6, null);
                                                    VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference38.getStart(), 0.0f, 0.0f, 6, null);
                                                    HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference38.getTop(), 0.0f, 0.0f, 6, null);
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue27);
                                        }
                                        composer6.endReplaceableGroup();
                                        CloudArrowBottomBlockKt.CloudArrowBottomBlock(constraintLayoutScope12.constrainAs(modifierM8177width3ABfNKs8, constrainedLayoutReference37, (Function1) objRememberedValue27), brush3, composableSingletons$CraftMainUiKt2.m14960getLambda9$app_siteRelease(), composer6, 384, 0);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composer2, 6));
                            composer2.startReplaceableGroup(836297188);
                            boolean zChanged17 = composer2.changed(constrainedLayoutReference18) | composer2.changed(fDimensionResource4) | composer2.changed(fDimensionResource9) | composer2.changed(constrainedLayoutReference19);
                            Object objRememberedValue21 = composer2.rememberedValue();
                            if (zChanged17 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                final float f18 = fDimensionResource4;
                                final float f19 = fDimensionResource9;
                                objRememberedValue21 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$17$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference18.getBottom(), f18, 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f19, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference19.getTop(), f18, 0.0f, 4, null);
                                        constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue21);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierConstrainAs4 = constraintLayoutScope5.constrainAs(modifierM8177width3ABfNKs2, constrainedLayoutReferenceComponent5, (Function1) objRememberedValue21);
                            List list5 = list2;
                            composer2.startReplaceableGroup(836297606);
                            boolean zChanged18 = composer2.changed(function05);
                            Object objRememberedValue22 = composer2.rememberedValue();
                            if (zChanged18 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function026 = function05;
                                objRememberedValue22 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$18$1
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
                                        function026.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue22);
                            }
                            Function0 function027 = (Function0) objRememberedValue22;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(836297666);
                            boolean zChanged19 = composer2.changed(function06);
                            Object objRememberedValue23 = composer2.rememberedValue();
                            if (zChanged19 || objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function028 = function06;
                                objRememberedValue23 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$19$1
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
                                        function028.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue23);
                            }
                            Function0 function029 = (Function0) objRememberedValue23;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(836297703);
                            boolean zChanged20 = composer2.changed(function2);
                            Object objRememberedValue24 = composer2.rememberedValue();
                            if (zChanged20 || objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                final Function2 function22 = function2;
                                objRememberedValue24 = new Function2<CommonButtonCategory, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$20$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory, Integer num) {
                                        invoke(commonButtonCategory, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull CommonButtonCategory category, int i29) {
                                        Intrinsics.checkNotNullParameter(category, "category");
                                        function22.invoke(category, Integer.valueOf(i29));
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue24);
                            }
                            composer2.endReplaceableGroup();
                            CraftCategoriesBlockKt.CraftCategoriesBlock(modifierConstrainAs4, list5, function027, function029, (Function2) objRememberedValue24, composer2, 64, 0);
                            composer2.startReplaceableGroup(836297800);
                            if (!list.isEmpty()) {
                                composer2.startReplaceableGroup(836297927);
                                final ConstrainedLayoutReference constrainedLayoutReference24 = constrainedLayoutReference8;
                                final ConstrainedLayoutReference constrainedLayoutReference25 = constrainedLayoutReference4;
                                boolean zChanged21 = composer2.changed(constrainedLayoutReference24) | composer2.changed(fDimensionResource6) | composer2.changed(constrainedLayoutReference25) | composer2.changed(constrainedLayoutReference21);
                                Object objRememberedValue25 = composer2.rememberedValue();
                                if (zChanged21 || objRememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                    final float f20 = fDimensionResource6;
                                    objRememberedValue25 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$21$1
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
                                            HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference24.getTop(), C2046Dp.m13666constructorimpl(-f20), 0.0f, 4, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference25.getStart(), 0.0f, 0.0f, 6, null);
                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference21.getEnd(), 0.0f, 0.0f, 6, null);
                                            constrainAs.setWidth(Dimension.INSTANCE.getFillToConstraints());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue25);
                                }
                                composer2.endReplaceableGroup();
                                final ConstrainedLayoutReference constrainedLayoutReference26 = constrainedLayoutReference6;
                                Modifier modifierConstrainAs5 = constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReference26, (Function1) objRememberedValue25);
                                Alignment.Vertical centerVertically = companion8.getCenterVertically();
                                composer2.startReplaceableGroup(693286680);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion9.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierConstrainAs5);
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
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRowMeasurePolicy, companion9.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion9.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion9.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                constrainedLayoutReference16 = constrainedLayoutReference21;
                                constrainedLayoutReference14 = constrainedLayoutReference25;
                                DividerKt.m9424HorizontalDivider9IZ8Weo(RowScope.weight$default(rowScopeInstance, companion7, 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), ColorResources_androidKt.colorResource(i11, composer2, 0), composer2, 0, 0);
                                constrainedLayoutReference13 = constrainedLayoutReference18;
                                z14 = true;
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.craft_components, composer2, 6), RowScope.weight$default(rowScopeInstance, companion7, 1.1f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(TextAlign.INSTANCE.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wdp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65020);
                                composer4 = composer2;
                                i22 = 6;
                                DividerKt.m9424HorizontalDivider9IZ8Weo(RowScope.weight$default(rowScopeInstance, companion7, 1.0f, false, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(i11, composer4, 0), composer2, 0, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer4.startReplaceableGroup(836299238);
                                Object objRememberedValue26 = composer2.rememberedValue();
                                Composer.Companion companion10 = Composer.INSTANCE;
                                if (objRememberedValue26 == companion10.getEmpty()) {
                                    continuation = null;
                                    objRememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(craftElement.getComponentsList(), null, 2, null);
                                    composer4.updateRememberedValue(objRememberedValue26);
                                } else {
                                    continuation = null;
                                }
                                MutableState mutableState3 = (MutableState) objRememberedValue26;
                                composer2.endReplaceableGroup();
                                composer4.startReplaceableGroup(836299342);
                                Object objRememberedValue27 = composer2.rememberedValue();
                                if (objRememberedValue27 == companion10.getEmpty()) {
                                    objRememberedValue27 = SnapshotIntStateKt.mutableIntStateOf(-1);
                                    composer4.updateRememberedValue(objRememberedValue27);
                                }
                                final MutableIntState mutableIntState = (MutableIntState) objRememberedValue27;
                                composer2.endReplaceableGroup();
                                Integer numValueOf = Integer.valueOf(mutableIntState.getIntValue());
                                composer4.startReplaceableGroup(836299442);
                                Object objRememberedValue28 = composer2.rememberedValue();
                                if (objRememberedValue28 == companion10.getEmpty()) {
                                    objRememberedValue28 = new CraftMainUiKt$CraftMainUi$1$1$23$1(mutableState, continuation);
                                    composer4.updateRememberedValue(objRememberedValue28);
                                }
                                composer2.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue28, composer4, 64);
                                if (!craftElement.getComponentsList().isEmpty()) {
                                    if (!Intrinsics.areEqual(craftElement.getComponentsList(), CraftMainUiKt.C54281.invoke$lambda$49$lambda$28(mutableState3))) {
                                        mutableState3.setValue(craftElement.getComponentsList());
                                        CraftMainUiKt.C54281.invoke$lambda$2(mutableState, false);
                                    }
                                    composer4.startReplaceableGroup(836299979);
                                    constrainedLayoutReference15 = constrainedLayoutReference7;
                                    boolean zChanged22 = composer4.changed(constrainedLayoutReference15) | composer4.changed(constrainedLayoutReference26);
                                    Object objRememberedValue29 = composer2.rememberedValue();
                                    if (zChanged22 || objRememberedValue29 == companion10.getEmpty()) {
                                        objRememberedValue29 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$24$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference15.getTop(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference26.getStart(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference26.getEnd(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference15.getBottom(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue29);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(constraintLayoutScope5.constrainAs(companion7, constrainedLayoutReference24, (Function1) objRememberedValue29), PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composer4, 6));
                                    composer4.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion8.getTop(), composer4, 0);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = companion9.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer4.createNode(constructor4);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion9.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion9.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion9.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    int size = craftElement.getComponentsList().size() - 1;
                                    composer4.startReplaceableGroup(-623859852);
                                    final int i29 = 0;
                                    while (i29 < size) {
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer4, 6), 0.0f, 11, null);
                                        CraftIngredient craftIngredient = craftElement.getComponentsList().get(i29);
                                        boolean zInvoke$lambda$1 = CraftMainUiKt.C54281.invoke$lambda$1(mutableState);
                                        composer4.startReplaceableGroup(-623859461);
                                        boolean zChanged23 = composer4.changed(i29);
                                        Object objRememberedValue30 = composer2.rememberedValue();
                                        if (zChanged23 || objRememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                            final MutableState mutableState4 = mutableState;
                                            objRememberedValue30 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$25$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                    invoke(bool.booleanValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(boolean z19) {
                                                    CraftMainUiKt.C54281.invoke$lambda$2(mutableState4, z19);
                                                    mutableIntState.setIntValue(i29);
                                                }
                                            };
                                            composer4.updateRememberedValue(objRememberedValue30);
                                        }
                                        composer2.endReplaceableGroup();
                                        CraftIngredientItemKt.IngredientItem(modifierM8127paddingqDBjuR0$default, craftIngredient, zInvoke$lambda$1, (Function1) objRememberedValue30, composer2, 64, 0);
                                        i29++;
                                        size = size;
                                    }
                                    final int i30 = size;
                                    composer2.endReplaceableGroup();
                                    CraftIngredient craftIngredient2 = craftElement.getComponentsList().get(i30);
                                    boolean zInvoke$lambda$12 = CraftMainUiKt.C54281.invoke$lambda$1(mutableState);
                                    composer4.startReplaceableGroup(-623859026);
                                    boolean zChanged24 = composer4.changed(i30);
                                    Object objRememberedValue31 = composer2.rememberedValue();
                                    if (zChanged24 || objRememberedValue31 == Composer.INSTANCE.getEmpty()) {
                                        final MutableState mutableState5 = mutableState;
                                        objRememberedValue31 = new Function1<Boolean, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$25$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                invoke(bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(boolean z19) {
                                                CraftMainUiKt.C54281.invoke$lambda$2(mutableState5, z19);
                                                mutableIntState.setIntValue(i30);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue31);
                                    }
                                    composer2.endReplaceableGroup();
                                    CraftIngredientItemKt.IngredientItem(null, craftIngredient2, zInvoke$lambda$12, (Function1) objRememberedValue31, composer2, 64, 1);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    Boolean boolValueOf2 = Boolean.valueOf(CraftMainUiKt.C54281.invoke$lambda$1(mutableState));
                                    final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                                    final CraftElement craftElement3 = craftElement;
                                    final MutableState mutableState6 = mutableState;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    ComposeExtensionKt.IfTrue(boolValueOf2, ComposableLambdaKt.composableLambda(composer4, 609670117, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$26
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
                                        public final void invoke(@Nullable Composer composer6, int i31) {
                                            if ((i31 & 11) != 2 || !composer6.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(609670117, i31, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous>.<anonymous>.<anonymous> (CraftMainUi.kt:730)");
                                                }
                                                Modifier.Companion companion11 = Modifier.INSTANCE;
                                                Modifier modifierZIndex = ZIndexModifierKt.zIndex(SizeKt.fillMaxSize$default(companion11, 0.0f, 1, null), 2.0f);
                                                MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                                composer6.startReplaceableGroup(-623858390);
                                                final MutableState<Boolean> mutableState7 = mutableState6;
                                                Object objRememberedValue32 = composer6.rememberedValue();
                                                if (objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue32 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$26$1$1
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
                                                            CraftMainUiKt.C54281.invoke$lambda$2(mutableState7, false);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(objRememberedValue32);
                                                }
                                                composer6.endReplaceableGroup();
                                                BoxKt.Box(ClickableKt.m7803clickableO2vRcR0$default(modifierZIndex, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue32, 28, null), composer6, 0);
                                                ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope5;
                                                ConstrainedLayoutReference constrainedLayoutReference27 = constrainedLayoutReferenceComponent132;
                                                final ConstrainedLayoutReference constrainedLayoutReference28 = constrainedLayoutReference24;
                                                final CraftElement craftElement4 = craftElement3;
                                                final ConstrainedLayoutReference constrainedLayoutReference29 = constrainedLayoutReference15;
                                                final MutableIntState mutableIntState2 = mutableIntState;
                                                CraftIngredientInfoWindowKt.CraftIngredientInfoWindow(PaddingKt.m8123padding3ABfNKs(constraintLayoutScope6.constrainAs(companion11, constrainedLayoutReference27, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$26.2
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
                                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference28.getTop(), 0.0f, 0.0f, 6, null);
                                                        int intValue = mutableIntState2.getIntValue();
                                                        if (intValue == 0) {
                                                            if (craftElement4.getComponentsList().size() == 2) {
                                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference29.getStart(), 0.0f, 0.0f, 6, null);
                                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                                return;
                                                            } else {
                                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference29.getStart(), 0.0f, 0.0f, 6, null);
                                                                return;
                                                            }
                                                        }
                                                        if (intValue == 1 || intValue == 2 || intValue == 3) {
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference29.getStart(), 0.0f, 0.0f, 6, null);
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                        } else {
                                                            VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
                                                        }
                                                    }
                                                }), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer6, 6)), craftElement3.getComponentsList().get(mutableIntState.getIntValue()), composer6, 64, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), composer4, 48);
                                } else {
                                    constrainedLayoutReference15 = constrainedLayoutReference7;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                }
                            } else {
                                constraintLayoutScope3 = constraintLayoutScope5;
                                constrainedLayoutReference13 = constrainedLayoutReference18;
                                constrainedLayoutReference14 = constrainedLayoutReference4;
                                constrainedLayoutReference15 = constrainedLayoutReference7;
                                constrainedLayoutReference16 = constrainedLayoutReference21;
                                i22 = 6;
                                composer4 = composer2;
                                z14 = true;
                            }
                            composer2.endReplaceableGroup();
                            Modifier.Companion companion11 = Modifier.INSTANCE;
                            Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._170wdp, composer4, i22)), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer4, i22));
                            composer4.startReplaceableGroup(836303938);
                            final ConstrainedLayoutReference constrainedLayoutReference27 = constrainedLayoutReference9;
                            final ConstrainedLayoutReference constrainedLayoutReference28 = constrainedLayoutReference16;
                            boolean zChanged25 = composer4.changed(constrainedLayoutReference27) | composer4.changed(constrainedLayoutReference28);
                            Object objRememberedValue32 = composer2.rememberedValue();
                            if (zChanged25 || objRememberedValue32 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue32 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$27$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference27.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference27.getBottom(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference27.getEnd(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference28.getStart(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue32);
                            }
                            composer2.endReplaceableGroup();
                            final ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                            Modifier modifierConstrainAs6 = constraintLayoutScope6.constrainAs(modifierM8158height3ABfNKs3, constrainedLayoutReferenceComponent8, (Function1) objRememberedValue32);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = Arrangement.INSTANCE.m8032spacedBy0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, i22));
                            composer4.startReplaceableGroup(693286680);
                            Alignment.Companion companion12 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion12.getTop(), composer4, 0);
                            composer4.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor5 = companion13.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierConstrainAs6);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer4.createNode(constructor5);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy3, companion13.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion13.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion13.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer4, 0);
                            composer4.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            ConstrainedLayoutReference constrainedLayoutReference29 = constrainedLayoutReference15;
                            CraftProgressBarProdBlockKt.CraftProgressBarProdBlock(i12, i13, i14, z11, 0, composer2, 0, 16);
                            CraftProgressBarStashBlockKt.CraftProgressBarStashBlock(i15, i16, i17, z12, 0, composer2, 0, 16);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer4.startReplaceableGroup(836305013);
                            boolean zChanged26 = composer4.changed(constrainedLayoutReference20) | composer4.changed(fDimensionResource) | composer4.changed(constrainedLayoutReferenceComponent4);
                            Object objRememberedValue33 = composer2.rememberedValue();
                            if (zChanged26 || objRememberedValue33 == Composer.INSTANCE.getEmpty()) {
                                final float f21 = fDimensionResource;
                                objRememberedValue33 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$29$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference20.getEnd(), f21, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent4.getTop(), 0.0f, 0.0f, 6, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent4.getBottom(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue33);
                            }
                            composer2.endReplaceableGroup();
                            CraftProgressBarLvlBlockKt.CraftProgressBarLvlBlock(constraintLayoutScope6.constrainAs(companion11, constrainedLayoutReference27, (Function1) objRememberedValue33), i3, i4, composer4, 0);
                            Modifier modifierM8172size3ABfNKs3 = SizeKt.m8172size3ABfNKs(companion11, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer4, i22));
                            composer4.startReplaceableGroup(836305635);
                            boolean zChanged27 = composer4.changed(fDimensionResource2) | composer4.changed(fDimensionResource9);
                            Object objRememberedValue34 = composer2.rememberedValue();
                            if (zChanged27 || objRememberedValue34 == Composer.INSTANCE.getEmpty()) {
                                final float f22 = fDimensionResource2;
                                final float f23 = fDimensionResource9;
                                objRememberedValue34 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$30$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), f22, 0.0f, 4, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f23, 0.0f, 4, null);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue34);
                            }
                            composer2.endReplaceableGroup();
                            final ConstrainedLayoutReference constrainedLayoutReference30 = constrainedLayoutReference13;
                            Modifier modifierConstrainAs7 = constraintLayoutScope6.constrainAs(modifierM8172size3ABfNKs3, constrainedLayoutReference30, (Function1) objRememberedValue34);
                            Brush brush4 = brushM11297verticalGradient8A3gB4$default3;
                            boolean z19 = z3;
                            boolean z20 = !z19;
                            composer4.startReplaceableGroup(836306010);
                            boolean zChanged28 = composer4.changed(function07);
                            Object objRememberedValue35 = composer2.rememberedValue();
                            if (zChanged28 || objRememberedValue35 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function030 = function07;
                                objRememberedValue35 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$31$1
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
                                        function030.invoke();
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue35);
                            }
                            Function0 function031 = (Function0) objRememberedValue35;
                            composer2.endReplaceableGroup();
                            final int i31 = i18;
                            ButtonGrayGradientKt.ButtonGrayGradient(modifierConstrainAs7, null, brush4, null, z19, null, false, z20, function031, ComposableLambdaKt.composableLambda(composer4, -29710664, z14, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$32
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
                                public final void invoke(@Nullable Composer composer6, int i32) {
                                    if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-29710664, i32, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous>.<anonymous>.<anonymous> (CraftMainUi.kt:822)");
                                        }
                                        IconKt.m9496Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_filter_din, composer6, 6), (String) null, SizeKt.fillMaxSize(Modifier.INSTANCE, 0.8f), ColorResources_androidKt.colorResource(i31, composer6, 0), composer6, 440, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer6.skipToGroupEnd();
                                }
                            }), composer2, 805306368, 106);
                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z4), ComposableLambdaKt.composableLambda(composer2, -286193765, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$33
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
                                public final void invoke(@Nullable Composer composer6, int i32) {
                                    if ((i32 & 11) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-286193765, i32, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous>.<anonymous>.<anonymous> (CraftMainUi.kt:831)");
                                    }
                                    ConstraintLayoutScope constraintLayoutScope7 = constraintLayoutScope6;
                                    Modifier.Companion companion14 = Modifier.INSTANCE;
                                    ConstrainedLayoutReference constrainedLayoutReference31 = constrainedLayoutReferenceComponent2;
                                    composer6.startReplaceableGroup(-623853799);
                                    boolean zChanged29 = composer6.changed(constrainedLayoutReference30);
                                    final ConstrainedLayoutReference constrainedLayoutReference32 = constrainedLayoutReference30;
                                    Object objRememberedValue36 = composer6.rememberedValue();
                                    if (zChanged29 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue36 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$33$1$1
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
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference32.getTop(), 0.0f, 0.0f, 6, null);
                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference32.getTop(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference32.getEnd(), 0.0f, 0.0f, 6, null);
                                                VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getEnd(), constrainedLayoutReference32.getEnd(), 0.0f, 0.0f, 6, null);
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue36);
                                    }
                                    composer6.endReplaceableGroup();
                                    BoxKt.Box(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(constraintLayoutScope7.constrainAs(companion14, constrainedLayoutReference31, (Function1) objRememberedValue36), PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composer6, 6)), ColorResources_androidKt.colorResource(R.color.red, composer6, 6), RoundedCornerShapeKt.getCircleShape()), composer6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 48);
                            composer2.startReplaceableGroup(836307110);
                            boolean zChanged29 = composer2.changed(fDimensionResource9) | composer2.changed(fDimensionResource2);
                            Object objRememberedValue36 = composer2.rememberedValue();
                            if (zChanged29 || objRememberedValue36 == Composer.INSTANCE.getEmpty()) {
                                final float f24 = fDimensionResource9;
                                final float f25 = fDimensionResource2;
                                objRememberedValue36 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$34$1
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
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), f24, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f25, 0.0f, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue36);
                            }
                            composer2.endReplaceableGroup();
                            CraftAnimButtonsBlockKt.CraftAnimButtonsBlock(constraintLayoutScope6.constrainAs(companion11, constrainedLayoutReference19, (Function1) objRememberedValue36), craftScreenTypeEnum, str2, str3, str4, z5, z6, z7, function08, function09, function010, composer2, 0, 0);
                            composer2.startReplaceableGroup(836308031);
                            final ConstrainedLayoutReference constrainedLayoutReference31 = constrainedLayoutReference14;
                            final ConstrainedLayoutReference constrainedLayoutReference32 = constrainedLayoutReference10;
                            boolean zChanged30 = composer2.changed(constrainedLayoutReference31) | composer2.changed(fDimensionResource2) | composer2.changed(constrainedLayoutReference32);
                            Object objRememberedValue37 = composer2.rememberedValue();
                            if (zChanged30 || objRememberedValue37 == Composer.INSTANCE.getEmpty()) {
                                final float f26 = fDimensionResource2;
                                objRememberedValue37 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$35$1
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
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReference31.getBottom(), f26, 0.0f, 4, null);
                                        HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReference32.getTop(), 0.0f, 0.0f, 6, null);
                                        VerticalAnchorable.DefaultImpls.m14016linkToVpY3zN4$default(constrainAs.getStart(), constrainedLayoutReference32.getStart(), 0.0f, 0.0f, 6, null);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue37);
                            }
                            composer2.endReplaceableGroup();
                            BoxKt.Box(SizeKt.m8158height3ABfNKs(constraintLayoutScope6.constrainAs(companion11, constrainedLayoutReference29, (Function1) objRememberedValue37), PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composer2, 6)), composer2, 0);
                            Modifier modifierConstrainAs8 = constraintLayoutScope6.constrainAs(companion11, constrainedLayoutReference3, new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$36
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
                            Alignment centerEnd = companion12.getCenterEnd();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerEnd, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor6 = companion13.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierConstrainAs8);
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
                            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy3, companion13.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion13.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion13.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            List list6 = list3;
                            boolean z21 = z13;
                            composer2.startReplaceableGroup(-623851488);
                            boolean zChanged31 = composer2.changed(function015);
                            Object objRememberedValue38 = composer2.rememberedValue();
                            if (zChanged31 || objRememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function032 = function015;
                                objRememberedValue38 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$37$1$1
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
                                        function032.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue38);
                            }
                            Function0 function033 = (Function0) objRememberedValue38;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-623851413);
                            boolean zChanged32 = composer2.changed(function07);
                            Object objRememberedValue39 = composer2.rememberedValue();
                            if (zChanged32 || objRememberedValue39 == Composer.INSTANCE.getEmpty()) {
                                final Function0 function034 = function07;
                                objRememberedValue39 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$37$2$1
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
                                        function034.invoke();
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue39);
                            }
                            Function0 function035 = (Function0) objRememberedValue39;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-623851337);
                            boolean zChanged33 = composer2.changed(function13);
                            Object objRememberedValue40 = composer2.rememberedValue();
                            if (zChanged33 || objRememberedValue40 == Composer.INSTANCE.getEmpty()) {
                                final Function1 function14 = function13;
                                objRememberedValue40 = new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$37$3$1
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
                                        function14.invoke(checkBox);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue40);
                            }
                            composer2.endReplaceableGroup();
                            CraftFilterBlockKt.CraftFilterBlock(list6, z21, function033, function035, null, (Function1) objRememberedValue40, composer2, 8, 16);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            Boolean boolValueOf3 = Boolean.valueOf(z2);
                            final BorderStroke borderStroke = borderStrokeM7798BorderStrokecXLIe8U;
                            final Function0 function036 = function016;
                            ComposeExtensionKt.IfTrue(boolValueOf3, ComposableLambdaKt.composableLambda(composer2, -616594182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$38
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
                                public final void invoke(@Nullable Composer composer6, int i32) {
                                    if ((i32 & 11) != 2 || !composer6.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-616594182, i32, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUi.<anonymous>.<anonymous>.<anonymous> (CraftMainUi.kt:889)");
                                        }
                                        Modifier.Companion companion14 = Modifier.INSTANCE;
                                        Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(SizeKt.fillMaxSize$default(companion14, 0.0f, 1, null), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$38.1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }
                                        }, 1, null);
                                        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                        BorderStroke borderStroke2 = borderStroke;
                                        final Function0<Unit> function037 = function036;
                                        composer6.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer6, 6);
                                        composer6.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor7 = companion15.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor7);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer6);
                                        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion15.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion15.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion15.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                        }
                                        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                                        composer6.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                                        Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion14, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._42wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composer6, 6));
                                        composer6.startReplaceableGroup(-161768617);
                                        boolean zChanged34 = composer6.changed(function037);
                                        Object objRememberedValue41 = composer6.rememberedValue();
                                        if (zChanged34 || objRememberedValue41 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue41 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt$CraftMainUi$1$1$38$2$1$1
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
                                                    function037.invoke();
                                                }
                                            };
                                            composer6.updateRememberedValue(objRememberedValue41);
                                        }
                                        composer6.endReplaceableGroup();
                                        ButtonContentBlockKt.m15069ButtonContentBlockkmJHe8M(null, modifierM8177width3ABfNKs3, 0L, 0L, 180.0f, null, null, borderStroke2, null, false, false, null, false, false, false, false, 0, null, (Function0) objRememberedValue41, ComposableSingletons$CraftMainUiKt.INSTANCE.m14952getLambda10$app_siteRelease(), composer6, CpioConstants.C_ISBLK, 805306368, 261997);
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
                            }), composer2, 48);
                            if (constraintLayoutScope.getHelpersHashCode() != i21) {
                                function0Component2.invoke();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), measurePolicyComponent1, composer, 48, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
            mutableState.setValue(Boolean.valueOf(z));
        }

        public static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
            return mutableState.getValue().booleanValue();
        }

        public static final List<CraftIngredient> invoke$lambda$49$lambda$28(MutableState<List<CraftIngredient>> mutableState) {
            return mutableState.getValue();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CraftMainUiPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-700383284);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700383284, i, -1, "com.blackhub.bronline.game.ui.craft.CraftMainUiPreview (CraftMainUi.kt:929)");
            }
            CraftScreenTypeEnum craftScreenTypeEnum = CraftScreenTypeEnum.STASH;
            String strStringResource = StringResources_androidKt.stringResource(R.string.common_accessories, composerStartRestartGroup, 6);
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new CommonButtonCategory[]{new CommonButtonCategory(0, null, null, false, true, null, null, 111, null), new CommonButtonCategory(0, null, null, true, false, null, null, 119, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null), new CommonButtonCategory(0, null, null, false, false, null, null, 127, null)});
            CraftItemTextBlock craftItemTextBlock = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum = CraftElementStatusEnum.DEFAULT;
            CommonRarityEnum commonRarityEnum = CommonRarityEnum.EPIC;
            CommonRarityEnum commonRarityEnum2 = CommonRarityEnum.COMMON;
            CraftIngredient craftIngredient = new CraftIngredient(0, commonRarityEnum2, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 10, 10, false, false, 1649, null);
            CommonRarityEnum commonRarityEnum3 = CommonRarityEnum.UNCOMMON;
            CraftIngredient craftIngredient2 = new CraftIngredient(0, commonRarityEnum3, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 10, 10, false, false, 1649, null);
            CommonRarityEnum commonRarityEnum4 = CommonRarityEnum.LEGENDARY;
            CraftElement craftElement = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum, 0, craftItemTextBlock, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftIngredient[]{craftIngredient, craftIngredient2, new CraftIngredient(0, commonRarityEnum4, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 10, 10, true, false, 1137, null), new CraftIngredient(0, commonRarityEnum, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 10, 10, false, false, 1649, null), new CraftIngredient(0, commonRarityEnum, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 0, 0, false, false, 2033, null), new CraftIngredient(0, commonRarityEnum2, "Саморезы", "Помогут прикрутить\nнеприкрученное к чему\nугодно и когда угодно", null, 0, 0, 0, 0, false, false, 2033, null)}), 0, null, 0, 0, 62079, null);
            CraftItemTextBlock craftItemTextBlock2 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum2 = CraftElementStatusEnum.NEW_ELEMENT;
            CraftElement craftElement2 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum4, craftElementStatusEnum2, 0, craftItemTextBlock2, null, 0, 1718874198L, 0, 0, 55935, null);
            CraftItemTextBlock craftItemTextBlock3 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CommonRarityEnum commonRarityEnum5 = CommonRarityEnum.RARE;
            CraftElement craftElement3 = new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum5, craftElementStatusEnum2, 0, craftItemTextBlock3, null, 0, null, 0, 0, 64127, null);
            CraftItemTextBlock craftItemTextBlock4 = new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null);
            CraftElementStatusEnum craftElementStatusEnum3 = CraftElementStatusEnum.IN_THE_QUEUE;
            composer2 = composerStartRestartGroup;
            CraftMainUi(craftScreenTypeEnum, null, null, strStringResource, null, null, null, false, false, true, true, false, false, true, false, R.color.white, R.color.white, R.color.black, listListOf, craftElement, true, R.color.white_40, CollectionsKt__CollectionsKt.listOf((Object[]) new CraftElement[]{craftElement2, craftElement3, new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum3, 0, craftItemTextBlock4, null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum3, CraftElementStatusEnum.IN_THE_PIPELINE, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, CraftElementStatusEnum.UNAVAILABLE, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum5, craftElementStatusEnum, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum, craftElementStatusEnum3, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum3, craftElementStatusEnum3, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null), new CraftElement(0, 0, null, 0, 0, 0, null, commonRarityEnum2, craftElementStatusEnum3, 0, new CraftItemTextBlock("Крутая маска", "99 ч 39 мин 44 сек", 25, 0, 9.99f, "description", 8, null), null, 0, null, 0, 0, 64127, null)}), CollectionsKt__CollectionsKt.listOf((Object[]) new CraftCategoryFilter[]{new CraftCategoryFilter(1, "Редкость", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(1, "Обычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(2, "Необычные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(3, "Редкие", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(4, "Эпические", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(5, "Легендарные", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 1, "", R.dimen._1wdp, false, null, 128, null)})), new CraftCategoryFilter(2, "Ресурсы", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(6, "Есть ресурсы", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null), new CraftItemCategoryFilter(7, "Нет ресурсов", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 2, "", R.dimen._50wdp, false, null, 128, null)})), new CraftCategoryFilter(3, "Доступность", CollectionsKt__CollectionsKt.listOf((Object[]) new CraftItemCategoryFilter[]{new CraftItemCategoryFilter(8, "Открыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null), new CraftItemCategoryFilter(9, "Закрыто", ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 3, "", R.dimen._1wdp, false, null, 128, null)}))}), 1, 4, 10, "99", "99 999 999", 0, true, true, true, R.color.rose_red, R.color.rose_red, 1.0f, 1.0f, 1, 60, 8, 10, 2, 7, R.color.dark_medium_green, R.color.dark_medium_green, false, true, "Получить все", R.string.craft_no_items_in_storage, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function2<CommonButtonCategory, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.4
                public final void invoke(@NotNull CommonButtonCategory commonButtonCategory, int i2) {
                    Intrinsics.checkNotNullParameter(commonButtonCategory, "<anonymous parameter 0>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(CommonButtonCategory commonButtonCategory, Integer num) {
                    invoke(commonButtonCategory, num.intValue());
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.11
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement4) {
                    invoke2(craftElement4);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.12
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.13
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftItemCategoryFilter, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.14
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftItemCategoryFilter it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftItemCategoryFilter craftItemCategoryFilter) {
                    invoke2(craftItemCategoryFilter);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.15
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.16
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.17
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.18
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.19
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.20
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<CraftElement, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CraftElement it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CraftElement craftElement4) {
                    invoke2(craftElement4);
                    return Unit.INSTANCE;
                }
            }, composer2, 920347062, 1222340022, 920351286, 920350134, 920350134, 920350134, 920350134);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.craft.CraftMainUiKt.CraftMainUiPreview.22
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
                    CraftMainUiKt.CraftMainUiPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean CraftMainUi$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}
