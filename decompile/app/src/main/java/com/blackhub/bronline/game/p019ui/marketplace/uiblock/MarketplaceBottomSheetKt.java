package com.blackhub.bronline.game.p019ui.marketplace.uiblock;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.GameRender;
import com.blackhub.bronline.game.core.enums.ImageTypePathInCDNEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonGrayGradientKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWhiteStripKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.android.datatransport.cct.CctTransportBackend;
import java.io.IOException;
import kotlin.Metadata;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceBottomSheet.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001aã\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010 \u001a\r\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010 \u001a\r\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010%\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\fX\u008a\u0084\u0002"}, m7105d2 = {"DESC_BLOCK_HEIGHT", "", "DESC_BLOCK_WIDTH", "MarketplaceBottomSheet", "", "modifier", "Landroidx/compose/ui/Modifier;", CctTransportBackend.KEY_PRODUCT, "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "bottomSheetInfo", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;", "isHaveVip", "", "brushForPrice", "Landroidx/compose/ui/graphics/Brush;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "onClickDoneInPriceTextField", "Lkotlin/Function1;", "", "onClickDoneInCountTextField", "onClickSetPrice", "onClickSetForceCount", "onClickMinusButton", "Lkotlin/Function0;", "onClickPlusButton", "onClickRedButton", "onClickGreenButton", "onClickCheckBox", "onClickClose", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;ZLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "MarketplaceBottomSheetInventoryTabPreview", "(Landroidx/compose/runtime/Composer;I)V", "MarketplaceBottomSheetMainTabPreview", "MarketplaceBottomSheetMyStorePreview", "MarketplaceBottomSheetVipProductPreview", "app_siteRelease", "isFirstTimeOpen", "isPriceFocused", "isCountFocused", "priceForAllString", "priceForProductString", "productImage", "Landroid/graphics/Bitmap;", "colorButton", "", "isGreenButtonEnabled"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceBottomSheet.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceBottomSheetKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1229:1\n1116#2,6:1230\n1116#2,6:1236\n1116#2,6:1242\n1116#2,6:1249\n1116#2,6:1255\n1116#2,6:1261\n1116#2,6:1267\n1116#2,6:1273\n1116#2,6:1279\n1116#2,6:1285\n1116#2,6:1396\n1116#2,6:1402\n1116#2,6:1808\n1116#2,6:1814\n1116#2,6:1820\n1116#2,6:2143\n1116#2,6:2190\n1116#2,6:2231\n74#3:1248\n74#3:2257\n74#3:2298\n74#3:2339\n74#3:2415\n74#4,6:1291\n80#4:1325\n73#4,7:1453\n80#4:1488\n84#4:1572\n74#4,6:1573\n80#4:1607\n84#4:1652\n74#4,6:1653\n80#4:1687\n74#4,6:1723\n80#4:1757\n84#4:1762\n74#4,6:1763\n80#4:1797\n84#4:1802\n75#4,5:1893\n80#4:1926\n84#4:1972\n84#4:2067\n74#4,6:2108\n80#4:2142\n84#4:2153\n84#4:2256\n79#5,11:1297\n79#5,11:1332\n79#5,11:1367\n92#5:1411\n92#5:1416\n79#5,11:1424\n79#5,11:1460\n79#5,11:1494\n79#5,11:1529\n92#5:1561\n92#5:1566\n92#5:1571\n79#5,11:1579\n79#5,11:1614\n92#5:1646\n92#5:1651\n79#5,11:1659\n79#5,11:1694\n79#5,11:1729\n92#5:1761\n79#5,11:1769\n92#5:1801\n92#5:1806\n79#5,11:1828\n79#5,11:1864\n79#5,11:1898\n79#5,11:1934\n92#5:1966\n92#5:1971\n92#5:1976\n79#5,11:1984\n92#5:2016\n92#5:2021\n79#5,11:2029\n92#5:2061\n92#5:2066\n92#5:2071\n79#5,11:2079\n79#5,11:2114\n92#5:2152\n79#5,11:2161\n79#5,11:2202\n92#5:2240\n92#5:2245\n92#5:2250\n92#5:2255\n79#5,11:2264\n92#5:2296\n79#5,11:2305\n92#5:2337\n79#5,11:2346\n92#5:2378\n79#5,11:2386\n92#5:2419\n456#6,8:1308\n464#6,3:1322\n456#6,8:1343\n464#6,3:1357\n456#6,8:1378\n464#6,3:1392\n467#6,3:1408\n467#6,3:1413\n456#6,8:1435\n464#6,3:1449\n456#6,8:1471\n464#6,3:1485\n456#6,8:1505\n464#6,3:1519\n456#6,8:1540\n464#6,3:1554\n467#6,3:1558\n467#6,3:1563\n467#6,3:1568\n456#6,8:1590\n464#6,3:1604\n456#6,8:1625\n464#6,3:1639\n467#6,3:1643\n467#6,3:1648\n456#6,8:1670\n464#6,3:1684\n456#6,8:1705\n464#6,3:1719\n456#6,8:1740\n464#6,3:1754\n467#6,3:1758\n456#6,8:1780\n464#6,3:1794\n467#6,3:1798\n467#6,3:1803\n456#6,8:1839\n464#6,3:1853\n456#6,8:1875\n464#6,3:1889\n456#6,8:1909\n464#6,3:1923\n456#6,8:1945\n464#6,3:1959\n467#6,3:1963\n467#6,3:1968\n467#6,3:1973\n456#6,8:1995\n464#6,3:2009\n467#6,3:2013\n467#6,3:2018\n456#6,8:2040\n464#6,3:2054\n467#6,3:2058\n467#6,3:2063\n467#6,3:2068\n456#6,8:2090\n464#6,3:2104\n456#6,8:2125\n464#6,3:2139\n467#6,3:2149\n456#6,8:2172\n464#6,3:2186\n456#6,8:2213\n464#6,3:2227\n467#6,3:2237\n467#6,3:2242\n467#6,3:2247\n467#6,3:2252\n456#6,8:2275\n464#6,3:2289\n467#6,3:2293\n456#6,8:2316\n464#6,3:2330\n467#6,3:2334\n456#6,8:2357\n464#6,3:2371\n467#6,3:2375\n456#6,8:2397\n464#6,3:2411\n467#6,3:2416\n3737#7,6:1316\n3737#7,6:1351\n3737#7,6:1386\n3737#7,6:1443\n3737#7,6:1479\n3737#7,6:1513\n3737#7,6:1548\n3737#7,6:1598\n3737#7,6:1633\n3737#7,6:1678\n3737#7,6:1713\n3737#7,6:1748\n3737#7,6:1788\n3737#7,6:1847\n3737#7,6:1883\n3737#7,6:1917\n3737#7,6:1953\n3737#7,6:2003\n3737#7,6:2048\n3737#7,6:2098\n3737#7,6:2133\n3737#7,6:2180\n3737#7,6:2221\n3737#7,6:2283\n3737#7,6:2324\n3737#7,6:2365\n3737#7,6:2405\n68#8,6:1326\n74#8:1360\n78#8:1417\n69#8,5:1489\n74#8:1522\n68#8,6:1523\n74#8:1557\n78#8:1562\n78#8:1567\n68#8,6:1978\n74#8:2012\n78#8:2017\n68#8,6:2196\n74#8:2230\n78#8:2241\n68#8,6:2258\n74#8:2292\n78#8:2297\n68#8,6:2299\n74#8:2333\n78#8:2338\n68#8,6:2340\n74#8:2374\n78#8:2379\n68#8,6:2380\n74#8:2414\n78#8:2420\n87#9,6:1361\n93#9:1395\n97#9:1412\n87#9,6:1418\n93#9:1452\n87#9,6:1608\n93#9:1642\n97#9:1647\n87#9,6:1688\n93#9:1722\n97#9:1807\n91#9,2:1826\n93#9:1856\n86#9,7:1857\n93#9:1892\n86#9,7:1927\n93#9:1962\n97#9:1967\n97#9:1977\n97#9:2022\n87#9,6:2023\n93#9:2057\n97#9:2062\n97#9:2072\n88#9,5:2074\n93#9:2107\n86#9,7:2154\n93#9:2189\n97#9:2246\n97#9:2251\n64#10:2073\n81#11:2421\n107#11,2:2422\n81#11:2424\n107#11,2:2425\n81#11:2427\n107#11,2:2428\n81#11:2430\n81#11:2431\n81#11:2432\n107#11,2:2433\n81#11:2435\n81#11:2436\n*S KotlinDebug\n*F\n+ 1 MarketplaceBottomSheet.kt\ncom/blackhub/bronline/game/ui/marketplace/uiblock/MarketplaceBottomSheetKt\n*L\n125#1:1230,6\n126#1:1236,6\n127#1:1242,6\n130#1:1249,6\n135#1:1255,6\n143#1:1261,6\n144#1:1267,6\n148#1:1273,6\n159#1:1279,6\n181#1:1285,6\n308#1:1396,6\n328#1:1402,6\n616#1:1808,6\n660#1:1814,6\n686#1:1820,6\n846#1:2143,6\n864#1:2190,6\n1006#1:2231,6\n128#1:1248\n1042#1:2257\n1089#1:2298\n1136#1:2339\n1185#1:2415\n236#1:1291,6\n236#1:1325\n366#1:1453,7\n366#1:1488\n366#1:1572\n444#1:1573,6\n444#1:1607\n444#1:1652\n519#1:1653,6\n519#1:1687\n530#1:1723,6\n530#1:1757\n530#1:1762\n550#1:1763,6\n550#1:1797\n550#1:1802\n712#1:1893,5\n712#1:1926\n712#1:1972\n519#1:2067\n822#1:2108,6\n822#1:2142\n822#1:2153\n236#1:2256\n236#1:1297,11\n246#1:1332,11\n285#1:1367,11\n285#1:1411\n246#1:1416\n358#1:1424,11\n366#1:1460,11\n367#1:1494,11\n383#1:1529,11\n383#1:1561\n367#1:1566\n366#1:1571\n444#1:1579,11\n483#1:1614,11\n483#1:1646\n444#1:1651\n519#1:1659,11\n525#1:1694,11\n530#1:1729,11\n530#1:1761\n550#1:1769,11\n550#1:1801\n525#1:1806\n697#1:1828,11\n705#1:1864,11\n712#1:1898,11\n722#1:1934,11\n722#1:1966\n712#1:1971\n705#1:1976\n747#1:1984,11\n747#1:2016\n697#1:2021\n795#1:2029,11\n795#1:2061\n519#1:2066\n358#1:2071\n811#1:2079,11\n822#1:2114,11\n822#1:2152\n858#1:2161,11\n999#1:2202,11\n999#1:2240\n858#1:2245\n811#1:2250\n236#1:2255\n1044#1:2264,11\n1044#1:2296\n1091#1:2305,11\n1091#1:2337\n1138#1:2346,11\n1138#1:2378\n1184#1:2386,11\n1184#1:2419\n236#1:1308,8\n236#1:1322,3\n246#1:1343,8\n246#1:1357,3\n285#1:1378,8\n285#1:1392,3\n285#1:1408,3\n246#1:1413,3\n358#1:1435,8\n358#1:1449,3\n366#1:1471,8\n366#1:1485,3\n367#1:1505,8\n367#1:1519,3\n383#1:1540,8\n383#1:1554,3\n383#1:1558,3\n367#1:1563,3\n366#1:1568,3\n444#1:1590,8\n444#1:1604,3\n483#1:1625,8\n483#1:1639,3\n483#1:1643,3\n444#1:1648,3\n519#1:1670,8\n519#1:1684,3\n525#1:1705,8\n525#1:1719,3\n530#1:1740,8\n530#1:1754,3\n530#1:1758,3\n550#1:1780,8\n550#1:1794,3\n550#1:1798,3\n525#1:1803,3\n697#1:1839,8\n697#1:1853,3\n705#1:1875,8\n705#1:1889,3\n712#1:1909,8\n712#1:1923,3\n722#1:1945,8\n722#1:1959,3\n722#1:1963,3\n712#1:1968,3\n705#1:1973,3\n747#1:1995,8\n747#1:2009,3\n747#1:2013,3\n697#1:2018,3\n795#1:2040,8\n795#1:2054,3\n795#1:2058,3\n519#1:2063,3\n358#1:2068,3\n811#1:2090,8\n811#1:2104,3\n822#1:2125,8\n822#1:2139,3\n822#1:2149,3\n858#1:2172,8\n858#1:2186,3\n999#1:2213,8\n999#1:2227,3\n999#1:2237,3\n858#1:2242,3\n811#1:2247,3\n236#1:2252,3\n1044#1:2275,8\n1044#1:2289,3\n1044#1:2293,3\n1091#1:2316,8\n1091#1:2330,3\n1091#1:2334,3\n1138#1:2357,8\n1138#1:2371,3\n1138#1:2375,3\n1184#1:2397,8\n1184#1:2411,3\n1184#1:2416,3\n236#1:1316,6\n246#1:1351,6\n285#1:1386,6\n358#1:1443,6\n366#1:1479,6\n367#1:1513,6\n383#1:1548,6\n444#1:1598,6\n483#1:1633,6\n519#1:1678,6\n525#1:1713,6\n530#1:1748,6\n550#1:1788,6\n697#1:1847,6\n705#1:1883,6\n712#1:1917,6\n722#1:1953,6\n747#1:2003,6\n795#1:2048,6\n811#1:2098,6\n822#1:2133,6\n858#1:2180,6\n999#1:2221,6\n1044#1:2283,6\n1091#1:2324,6\n1138#1:2365,6\n1184#1:2405,6\n246#1:1326,6\n246#1:1360\n246#1:1417\n367#1:1489,5\n367#1:1522\n383#1:1523,6\n383#1:1557\n383#1:1562\n367#1:1567\n747#1:1978,6\n747#1:2012\n747#1:2017\n999#1:2196,6\n999#1:2230\n999#1:2241\n1044#1:2258,6\n1044#1:2292\n1044#1:2297\n1091#1:2299,6\n1091#1:2333\n1091#1:2338\n1138#1:2340,6\n1138#1:2374\n1138#1:2379\n1184#1:2380,6\n1184#1:2414\n1184#1:2420\n285#1:1361,6\n285#1:1395\n285#1:1412\n358#1:1418,6\n358#1:1452\n483#1:1608,6\n483#1:1642\n483#1:1647\n525#1:1688,6\n525#1:1722\n525#1:1807\n697#1:1826,2\n697#1:1856\n705#1:1857,7\n705#1:1892\n722#1:1927,7\n722#1:1962\n722#1:1967\n705#1:1977\n697#1:2022\n795#1:2023,6\n795#1:2057\n795#1:2062\n358#1:2072\n811#1:2074,5\n811#1:2107\n858#1:2154,7\n858#1:2189\n858#1:2246\n811#1:2251\n813#1:2073\n125#1:2421\n125#1:2422,2\n126#1:2424\n126#1:2425,2\n127#1:2427\n127#1:2428,2\n130#1:2430\n135#1:2431\n144#1:2432\n144#1:2433,2\n148#1:2435\n159#1:2436\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceBottomSheetKt {
    public static final float DESC_BLOCK_HEIGHT = 0.72f;
    public static final float DESC_BLOCK_WIDTH = 0.67f;

    public static final /* synthetic */ void access$MarketplaceBottomSheet$lambda$16(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x137d A[PHI: r13
  0x137d: PHI (r13v43 kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) = 
  (r13v38 kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>)
  (r13v44 kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>)
 binds: [B:274:0x137b, B:270:0x1371] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x1395  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x142d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x14e5  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1624  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1630  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1634  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1661  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x16b2  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x16be  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x16c2  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x16ef  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x1789  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1795  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x1799  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x17c6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1864  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x1870  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1874  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x18a1  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x19d2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x19de  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x19e2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1a0f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1fb9 A[PHI: r2
  0x1fb9: PHI (r2v149 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r2v147 kotlin.jvm.functions.Function0<kotlin.Unit>), (r2v150 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:442:0x1fb7, B:438:0x1faf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1fc8  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketplaceBottomSheet(@Nullable Modifier modifier, @NotNull final MarketplaceProduct product, @NotNull final MarketplaceBottomSheetInfo bottomSheetInfo, final boolean z, @NotNull final Brush brushForPrice, @NotNull final FocusManager focusManager, @NotNull final Function1<? super String, Unit> onClickDoneInPriceTextField, @NotNull final Function1<? super String, Unit> onClickDoneInCountTextField, @NotNull final Function1<? super String, Unit> onClickSetPrice, @NotNull final Function1<? super String, Unit> onClickSetForceCount, @NotNull final Function0<Unit> onClickMinusButton, @NotNull final Function0<Unit> onClickPlusButton, @NotNull final Function0<Unit> onClickRedButton, @NotNull final Function0<Unit> onClickGreenButton, @NotNull final Function0<Unit> onClickCheckBox, @NotNull final Function0<Unit> onClickClose, @Nullable Composer composer, final int i, final int i2, final int i3) {
        MutableState mutableState;
        Brush brush;
        final Brush brush2;
        int i4;
        MutableState mutableState2;
        int i5;
        Modifier.Companion companion;
        Composer composer2;
        State state;
        int i6;
        Modifier modifier2;
        boolean z2;
        int i7;
        int i8;
        final Function0<Unit> function0;
        boolean z3;
        Object objRememberedValue;
        final Function1<? super String, Unit> function1;
        boolean z4;
        boolean zChanged;
        Object objRememberedValue2;
        final MutableState mutableState3;
        int i9;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM10870constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM10870constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(bottomSheetInfo, "bottomSheetInfo");
        Intrinsics.checkNotNullParameter(brushForPrice, "brushForPrice");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        Intrinsics.checkNotNullParameter(onClickDoneInPriceTextField, "onClickDoneInPriceTextField");
        Intrinsics.checkNotNullParameter(onClickDoneInCountTextField, "onClickDoneInCountTextField");
        Intrinsics.checkNotNullParameter(onClickSetPrice, "onClickSetPrice");
        Intrinsics.checkNotNullParameter(onClickSetForceCount, "onClickSetForceCount");
        Intrinsics.checkNotNullParameter(onClickMinusButton, "onClickMinusButton");
        Intrinsics.checkNotNullParameter(onClickPlusButton, "onClickPlusButton");
        Intrinsics.checkNotNullParameter(onClickRedButton, "onClickRedButton");
        Intrinsics.checkNotNullParameter(onClickGreenButton, "onClickGreenButton");
        Intrinsics.checkNotNullParameter(onClickCheckBox, "onClickCheckBox");
        Intrinsics.checkNotNullParameter(onClickClose, "onClickClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1613305681);
        Modifier modifier3 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613305681, i, i2, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet (MarketplaceBottomSheet.kt:116)");
        }
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6));
        Brush.Companion companion2 = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(-776950915);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-776950855);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            mutableState = mutableState4;
            objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        } else {
            mutableState = mutableState4;
        }
        final MutableState mutableState5 = (MutableState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-776950794);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            brush = brushM11297verticalGradient8A3gB4$default;
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        } else {
            brush = brushM11297verticalGradient8A3gB4$default;
        }
        final MutableState mutableState6 = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        long priceForAll = bottomSheetInfo.getPriceForAll();
        composerStartRestartGroup.startReplaceableGroup(-776950690);
        boolean zChanged2 = composerStartRestartGroup.changed(priceForAll);
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$priceForAllString$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return UsefulKt.getPriceWithSpaces(Long.valueOf(bottomSheetInfo.getPriceForAll()));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        State state2 = (State) objRememberedValue6;
        composerStartRestartGroup.endReplaceableGroup();
        long price = product.getPrice();
        composerStartRestartGroup.startReplaceableGroup(-776950516);
        boolean zChanged3 = composerStartRestartGroup.changed(price);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = SnapshotStateKt.derivedStateOf(new Function0<String>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$priceForProductString$2$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return UsefulKt.getPriceWithSpaces(Long.valueOf(product.getPrice()));
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        State state3 = (State) objRememberedValue7;
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState7 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$textFieldPrice$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MutableState<String> invoke() {
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        Object[] objArr = new Object[0];
        composerStartRestartGroup.startReplaceableGroup(-776950268);
        int i10 = (i & 896) ^ 384;
        boolean z5 = (i10 > 256 && composerStartRestartGroup.changed(bottomSheetInfo)) || (i & 384) == 256;
        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
        if (z5 || objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$textFieldCount$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(bottomSheetInfo.getProductCount()), null, 2, null);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState8 = (MutableState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue8, composerStartRestartGroup, 8, 6);
        composerStartRestartGroup.startReplaceableGroup(-776950184);
        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue9 == companion3.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue9 = mutableStateMutableStateOf$default;
        }
        MutableState mutableState9 = (MutableState) objRememberedValue9;
        composerStartRestartGroup.endReplaceableGroup();
        final boolean z6 = ((CharSequence) mutableState7.getValue()).length() == 0;
        boolean zIsNeedToShowTextFieldAndVipStatus = bottomSheetInfo.isNeedToShowTextFieldAndVipStatus();
        composerStartRestartGroup.startReplaceableGroup(-776950053);
        boolean zChanged4 = composerStartRestartGroup.changed(zIsNeedToShowTextFieldAndVipStatus) | composerStartRestartGroup.changed(z6);
        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue10 == companion3.getEmpty()) {
            objRememberedValue10 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$colorButton$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Integer invoke() {
                    return Integer.valueOf((z6 && bottomSheetInfo.isNeedToShowTextFieldAndVipStatus()) ? R.color.gray_50 : R.color.dark_medium_green);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
        }
        State state4 = (State) objRememberedValue10;
        composerStartRestartGroup.endReplaceableGroup();
        boolean zIsNeedToShowTextFieldAndVipStatus2 = bottomSheetInfo.isNeedToShowTextFieldAndVipStatus();
        boolean zMarketplaceBottomSheet$lambda$4 = MarketplaceBottomSheet$lambda$4(mutableState5);
        boolean zMarketplaceBottomSheet$lambda$7 = MarketplaceBottomSheet$lambda$7(mutableState6);
        composerStartRestartGroup.startReplaceableGroup(-776949705);
        boolean zChanged5 = composerStartRestartGroup.changed(zIsNeedToShowTextFieldAndVipStatus2) | composerStartRestartGroup.changed(zMarketplaceBottomSheet$lambda$4) | composerStartRestartGroup.changed(zMarketplaceBottomSheet$lambda$7) | composerStartRestartGroup.changed(z6);
        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
        if (zChanged5 || objRememberedValue11 == companion3.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$isGreenButtonEnabled$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    boolean z7 = true;
                    if (bottomSheetInfo.isNeedToShowTextFieldAndVipStatus() && (MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$4(mutableState5) || MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$7(mutableState6) || z6)) {
                        z7 = false;
                    }
                    return Boolean.valueOf(z7);
                }
            });
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
        }
        State state5 = (State) objRememberedValue11;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(Long.valueOf(bottomSheetInfo.getPrice()), new C58381(bottomSheetInfo, mutableState7, context, null), composerStartRestartGroup, 64);
        Integer numValueOf = Integer.valueOf(bottomSheetInfo.getProductCount());
        composerStartRestartGroup.startReplaceableGroup(-776948953);
        boolean zChanged6 = ((i10 > 256 && composerStartRestartGroup.changed(bottomSheetInfo)) || (i & 384) == 256) | composerStartRestartGroup.changed(mutableState8);
        Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
        if (zChanged6 || objRememberedValue12 == companion3.getEmpty()) {
            objRememberedValue12 = new MarketplaceBottomSheetKt$MarketplaceBottomSheet$2$1(bottomSheetInfo, mutableState8, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
        }
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 64);
        MutableState mutableState10 = mutableState;
        Brush brush3 = brush;
        EffectsKt.LaunchedEffect(product, new C58393(bottomSheetInfo, mutableState7, context, product, state3, mutableState9, mutableState10, null), composerStartRestartGroup, 72);
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(modifier3, ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion4 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion6 = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BoxKt.Box(boxScopeInstance.align(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._165wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6))), companion4.getTopCenter()), composerStartRestartGroup, 0);
        String strStringResource = StringResources_androidKt.stringResource(bottomSheetInfo.getTitle(), composerStartRestartGroup, 0);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(strStringResource, boxScopeInstance.align(companion6, companion4.getBottomCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composerStartRestartGroup, 0, 0, 65532);
        Modifier modifierAlign = boxScopeInstance.align(companion6, companion4.getCenterEnd());
        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$1
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
                onClickClose.invoke();
                FocusManager.clearFocus$default(focusManager, false, 1, null);
            }
        };
        ComposableSingletons$MarketplaceBottomSheetKt composableSingletons$MarketplaceBottomSheetKt = ComposableSingletons$MarketplaceBottomSheetKt.INSTANCE;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierAlign, null, false, null, false, false, false, false, null, 0, 0L, null, function02, composableSingletons$MarketplaceBottomSheetKt.m14997getLambda1$app_siteRelease(), composerStartRestartGroup, 0, 3072, 4094);
        Modifier modifierAlign2 = boxScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), companion4.getBottomStart());
        Alignment.Vertical centerVertically = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierAlign2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        if (bottomSheetInfo.isCheckBoxChecked() && z && bottomSheetInfo.isNeedToShowTextFieldAndVipStatus()) {
            composerStartRestartGroup.startReplaceableGroup(15319425);
            i4 = 693286680;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_flame, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), 0, 2, null), composerStartRestartGroup, 56, 56);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.marketplace_card_hot_title, composerStartRestartGroup, 6);
            TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion6, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$1
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
            composerStartRestartGroup.startReplaceableGroup(15320379);
            brush2 = brush3;
            boolean zChanged7 = composerStartRestartGroup.changed(brush2);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue13 == companion3.getEmpty()) {
                objRememberedValue13 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        final Brush brush4 = brush2;
                        return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$2$1.1
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
                                DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush4, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                            }
                        });
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m10024Text4IGK_g(strStringResource2, DrawModifierKt.drawWithCache(modifierGraphicsLayer, (Function1) objRememberedValue13), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            brush2 = brush3;
            i4 = 693286680;
            if (z && bottomSheetInfo.isNeedToShowTextFieldAndVipStatus()) {
                composerStartRestartGroup.startReplaceableGroup(15320941);
                String strStringResource3 = StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_active_vip, composerStartRestartGroup, 6);
                TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg2 = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(companion6, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$3
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
                composerStartRestartGroup.startReplaceableGroup(15321406);
                boolean zChanged8 = composerStartRestartGroup.changed(brush2);
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged8 || objRememberedValue14 == companion3.getEmpty()) {
                    objRememberedValue14 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$4$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                            final Brush brush4 = brush2;
                            return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$1$2$4$1.1
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
                                    DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush4, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                }
                            });
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m10024Text4IGK_g(strStringResource3, DrawModifierKt.drawWithCache(modifierGraphicsLayer2, (Function1) objRememberedValue14), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg2, composerStartRestartGroup, 0, 0, 65532);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (product.isHot()) {
                composerStartRestartGroup.startReplaceableGroup(15321919);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_flame, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._18wdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6), 0, 2, null), composerStartRestartGroup, 56, 56);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_card_hot_title, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(15322671);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 8, null);
        composerStartRestartGroup.startReplaceableGroup(i4);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion6);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
            composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
            composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        final Brush brush4 = brush2;
        Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 7, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._116wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.dark_gray_30, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(product.getBgBorderColor(), composerStartRestartGroup, 0), roundedCornerShapeM8392RoundedCornerShape0680j_4);
        Alignment center = companion4.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl11 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl11, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl11, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
            composerM10870constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
            composerM10870constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (product.isPlatinumVipProduct()) {
            composerStartRestartGroup.startReplaceableGroup(603520729);
            Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), Brush.Companion.m11297verticalGradient8A3gB4$default(companion2, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(product.getBgColor(), composerStartRestartGroup, 0))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl12 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl12, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl12, currentCompositionLocalMap7, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                composerM10870constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                composerM10870constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
            }
            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vip_platinum, composerStartRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(603521656);
            ImageBitmapKt.m15118ImageBitmapAy9G7rc(MarketplaceBottomSheet$lambda$15(mutableState9), null, null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composerStartRestartGroup, 3080, 118);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ComposeExtensionKt.IfFalse(Boolean.valueOf(product.isPlatinumVipProduct()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1707458716, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        ComposerKt.traceEventStart(-1707458716, i11, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceBottomSheet.kt:410)");
                    }
                    String strStringResource4 = StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_time_left, composer3, 6);
                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer3, 6), 0, 0L, 0.0f, null, null, composer3, 12582918, 124);
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource4, PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer3, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer3, 0, 0, 65532);
                    String strStringResource5 = StringResources_androidKt.stringResource(product.getTimeTemplate(), new Object[]{Integer.valueOf(product.getTime())}, composer3, 64);
                    TextStyle textStyleM14811montserratBoldCustomSpIzzofJo2 = typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer3, 12582918, 126);
                    Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(companion7, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$1$2.1
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
                    composer3.startReplaceableGroup(603522942);
                    boolean zChanged9 = composer3.changed(brushForPrice);
                    final Brush brush5 = brushForPrice;
                    Object objRememberedValue15 = composer3.rememberedValue();
                    if (zChanged9 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$1$2$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                final Brush brush6 = brush5;
                                return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$1$2$2$1.1
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
                                        DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush6, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                    }
                                });
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue15);
                    }
                    composer3.endReplaceableGroup();
                    TextKt.m10024Text4IGK_g(strStringResource5, DrawModifierKt.drawWithCache(modifierGraphicsLayer3, (Function1) objRememberedValue15), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo2, composer3, 0, 0, 65532);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(companion6, 0.67f), 0.72f), PrimitiveResources_androidKt.dimensionResource(R.dimen._45wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor8);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl13 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl13, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl13, currentCompositionLocalMap8, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
            composerM10870constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
            composerM10870constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_naming, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65534);
        TextKt.m10024Text4IGK_g(product.getName(), PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_description, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65534);
        TextKt.m10024Text4IGK_g(product.getDescription(), PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6));
        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor9 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor9);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl14 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl14, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl14, currentCompositionLocalMap9, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
            composerM10870constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
            composerM10870constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ComposeExtensionKt.IfTrue(Boolean.valueOf(bottomSheetInfo.isNeedToShowSeller()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 762506892, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$2$1$1
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
                        ComposerKt.traceEventStart(762506892, i11, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceBottomSheet.kt:488)");
                    }
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_user, composer3, 6);
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    ImageKt.Image(painterPainterResource, (String) null, SizeKt.m8172size3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                    Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion7, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer3, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    MarketplaceProduct marketplaceProduct = product;
                    composer3.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor10);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composer3);
                    Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyColumnMeasurePolicy4, companion8.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap10, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion8.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
                        composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
                        composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
                    }
                    function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String strStringResource4 = StringResources_androidKt.stringResource(R.string.marketplace_seller, composer3, 6);
                    TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(strStringResource4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer3, 6), 0, 0L, 0.0f, null, composer3, 1572870, 60), composer3, 0, 0, 65534);
                    TextKt.m10024Text4IGK_g(marketplaceProduct.getSeller(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composer3, 6), 0, 0L, 0.0f, null, composer3, 1572870, 60), composer3, 0, 0, 65534);
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 48);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(PaddingKt.m8127paddingqDBjuR0$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), 0.72f);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor10 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor10);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap10, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
            composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
            composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
        }
        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composerStartRestartGroup, 6), 7, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor11 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor11);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl16 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl16, measurePolicyRowMeasurePolicy4, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl16, currentCompositionLocalMap11, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
            composerM10870constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
            composerM10870constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
        }
        function3ModifierMaterializerOf11.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor12 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(companion6);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor12);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl17 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl17, measurePolicyColumnMeasurePolicy5, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl17, currentCompositionLocalMap12, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash17 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl17.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl17.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
            composerM10870constructorimpl17.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash17));
            composerM10870constructorimpl17.apply(Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
        }
        function3ModifierMaterializerOf12.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_rarity, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(product.getRarity().getNameRes(), composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, ColorResources_androidKt.colorResource(product.getRarityTextColor(), composerStartRestartGroup, 0), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash18 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor13 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor13);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl18 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl18, measurePolicyColumnMeasurePolicy6, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl18, currentCompositionLocalMap13, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash18 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl18.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl18.rememberedValue(), Integer.valueOf(currentCompositeKeyHash18))) {
            composerM10870constructorimpl18.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash18));
            composerM10870constructorimpl18.apply(Integer.valueOf(currentCompositeKeyHash18), setCompositeKeyHash18);
        }
        function3ModifierMaterializerOf13.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_weight, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        if (product.isPlatinumVipProduct()) {
            composerStartRestartGroup.startReplaceableGroup(1820991911);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_dash, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1820992324);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.inv_items_weight, new Object[]{Double.valueOf(product.getWeight())}, composerStartRestartGroup, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_price_for_one, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composerStartRestartGroup, 6), 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 60), composerStartRestartGroup, 0, 0, 65532);
        if (bottomSheetInfo.isNeedToShowTextFieldAndVipStatus()) {
            composerStartRestartGroup.startReplaceableGroup(15333484);
            String str = (String) mutableState7.getValue();
            Function1<String, Unit> function12 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str2) throws IOException {
                    invoke2(str2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String enteredText) throws IOException {
                    Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                    String rubText = FormatUtilsKt.formatRubText(enteredText);
                    MutableState<String> mutableState11 = mutableState7;
                    String string = context.getString(R.string.common_string_with_ruble, rubText);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    mutableState11.setValue(string);
                    onClickSetPrice.invoke(rubText);
                }
            };
            Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(BorderKt.m7782borderxT4_qwU(PaddingKt.m8125paddingVpY3zN4$default(companion6, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6), 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composerStartRestartGroup, 6), ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6))), PrimitiveResources_androidKt.dimensionResource(R.dimen._157wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._32wdp, composerStartRestartGroup, 6));
            composerStartRestartGroup.startReplaceableGroup(15334699);
            i5 = i;
            if (((3670016 & i5) ^ 1572864) > 1048576) {
                function1 = onClickDoneInPriceTextField;
                if (composerStartRestartGroup.changed(function1)) {
                    z4 = true;
                    zChanged = z4 | composerStartRestartGroup.changed(mutableState7);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion3.getEmpty()) {
                        mutableState3 = mutableState10;
                        objRememberedValue2 = new Function1<FocusState, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                if (focusState.isFocused() || MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$1(mutableState3)) {
                                    MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$2(mutableState3, false);
                                } else {
                                    function1.invoke(mutableState7.getValue());
                                }
                                MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$5(mutableState5, focusState.isFocused());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        mutableState3 = mutableState10;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function12, FocusChangedModifierKt.onFocusChanged(modifierM8156defaultMinSizeVpY3zN4, (Function1) objRememberedValue2), false, false, typographyStyle.m14848montserratRegularCustomSpbl3sdaw(R.dimen._10wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13392getNumberPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$4
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
                            FocusManager.clearFocus$default(focusManager, false, 1, null);
                        }
                    }, null, null, null, null, null, 62, null), false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$MarketplaceBottomSheetKt.m14998getLambda2$app_siteRelease(), composerStartRestartGroup, 1572864, ProfileVerifier.CompilationStatus.f342xf2722a21, 16152);
                    if (!z) {
                        composerStartRestartGroup.startReplaceableGroup(15336448);
                        String strStringResource4 = StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_price_for_publication, new Object[]{Integer.valueOf(bottomSheetInfo.getPriceForPublish())}, composerStartRestartGroup, 70);
                        state = state4;
                        mutableState2 = mutableState3;
                        composer2 = composerStartRestartGroup;
                        TextStyle textStyleM14865montserratSemiBoldItalicCustomSpqcSRpps = typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._8wsp, 0L, 0, composerStartRestartGroup, 3078, 6);
                        Modifier modifierGraphicsLayer3 = GraphicsLayerModifierKt.graphicsLayer(companion6, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$5
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
                        composer2.startReplaceableGroup(15337056);
                        boolean z7 = (((57344 & i5) ^ CpioConstants.C_ISBLK) > 16384 && composer2.changed(brushForPrice)) || (i5 & CpioConstants.C_ISBLK) == 16384;
                        Object objRememberedValue15 = composer2.rememberedValue();
                        if (z7 || objRememberedValue15 == companion3.getEmpty()) {
                            objRememberedValue15 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$6$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                    Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                    final Brush brush5 = brushForPrice;
                                    return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$6$1.1
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
                                            DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush5, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                        }
                                    });
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue15);
                        }
                        composer2.endReplaceableGroup();
                        TextKt.m10024Text4IGK_g(strStringResource4, DrawModifierKt.drawWithCache(modifierGraphicsLayer3, (Function1) objRememberedValue15), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14865montserratSemiBoldItalicCustomSpqcSRpps, composer2, 0, 0, 65532);
                        composer2.endReplaceableGroup();
                        companion = companion6;
                        i6 = R.dimen._15wdp;
                        i9 = 6;
                    } else {
                        mutableState2 = mutableState3;
                        composer2 = composerStartRestartGroup;
                        state = state4;
                        composer2.startReplaceableGroup(15337544);
                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_price_for_publication, new Object[]{Integer.valueOf(bottomSheetInfo.getPriceForPublish())}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65534);
                        String strStringResource5 = StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_price_vip_sale, composer2, 6);
                        companion = companion6;
                        TextStyle textStyleM14865montserratSemiBoldItalicCustomSpqcSRpps2 = typographyStyle.m14865montserratSemiBoldItalicCustomSpqcSRpps(R.dimen._8wsp, 0L, 0, composer2, 3078, 6);
                        Modifier modifierGraphicsLayer4 = GraphicsLayerModifierKt.graphicsLayer(companion, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$7
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
                        composer2.startReplaceableGroup(15338404);
                        boolean zChanged9 = composer2.changed(brush4);
                        Object objRememberedValue16 = composer2.rememberedValue();
                        if (zChanged9 || objRememberedValue16 == companion3.getEmpty()) {
                            objRememberedValue16 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$8$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                                    Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                                    final Brush brush5 = brush4;
                                    return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$8$1.1
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
                                            DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush5, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                                        }
                                    });
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue16);
                        }
                        composer2.endReplaceableGroup();
                        i9 = 6;
                        TextKt.m10024Text4IGK_g(strStringResource5, DrawModifierKt.drawWithCache(modifierGraphicsLayer4, (Function1) objRememberedValue16), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14865montserratSemiBoldItalicCustomSpqcSRpps2, composer2, 0, 0, 65532);
                        composer2.endReplaceableGroup();
                        i6 = R.dimen._15wdp;
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(i6, composer2, i9), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, i9)), 0.0f, 1, null);
                    Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically3, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor14 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor14);
                    } else {
                        composer2.useNode();
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy5, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap14, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf14.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor15 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor15);
                    } else {
                        composer2.useNode();
                    }
                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy6, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap15, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_flame, composer2, i9), (String) null, SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, i9)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.red, composer2, i9), 0, 2, null), composer2, 56, 56);
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(PaddingKt.m8125paddingVpY3zN4$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, i9), 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(spaceBetween2, companion4.getStart(), composer2, i9);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor16 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor16);
                    } else {
                        composer2.useNode();
                    }
                    composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy7, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap16, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    function3ModifierMaterializerOf16.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_ad, composer2, i9), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65534);
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor17 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor17);
                    } else {
                        composer2.useNode();
                    }
                    composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy7, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap17, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf17.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Composer composer3 = composer2;
                    Composer composer4 = composer2;
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_ad_left, composer2, i9), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, i9), 0, 0L, 0.0f, null, null, composer3, 12582918, 124), composer4, 0, 0, 65534);
                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_just_string, new Object[]{Integer.valueOf(bottomSheetInfo.getAddsValue())}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composer2, i9), 0, 0L, 0.0f, null, null, composer3, 12582918, 124), composer4, 0, 0, 65534);
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
                    RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, i9));
                    Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, i9)), ColorResources_androidKt.colorResource(bottomSheetInfo.getCheckBoxColor(), composer2, 0), roundedCornerShapeM8392RoundedCornerShape0680j_42), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), ColorResources_androidKt.colorResource(bottomSheetInfo.getCheckBoxBorderColor(), composer2, 0), roundedCornerShapeM8392RoundedCornerShape0680j_42), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$9$2
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
                            FocusManager.clearFocus$default(focusManager, false, 1, null);
                            onClickCheckBox.invoke();
                        }
                    }, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor18 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor18);
                    } else {
                        composer2.useNode();
                    }
                    composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap18, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf18.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposeExtensionKt.IfTrue(Boolean.valueOf(bottomSheetInfo.isCheckBoxChecked()), composableSingletons$MarketplaceBottomSheetKt.m14999getLambda3$app_siteRelease(), composer2, 48);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            } else {
                function1 = onClickDoneInPriceTextField;
            }
            if ((1572864 & i5) != 1048576) {
                z4 = false;
            }
            zChanged = z4 | composerStartRestartGroup.changed(mutableState7);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                mutableState3 = mutableState10;
                objRememberedValue2 = new Function1<FocusState, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        if (focusState.isFocused() || MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$1(mutableState3)) {
                            MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$2(mutableState3, false);
                        } else {
                            function1.invoke(mutableState7.getValue());
                        }
                        MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$5(mutableState5, focusState.isFocused());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function12, FocusChangedModifierKt.onFocusChanged(modifierM8156defaultMinSizeVpY3zN4, (Function1) objRememberedValue2), false, false, typographyStyle.m14848montserratRegularCustomSpbl3sdaw(R.dimen._10wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13392getNumberPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$4
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
                        FocusManager.clearFocus$default(focusManager, false, 1, null);
                    }
                }, null, null, null, null, null, 62, null), false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$MarketplaceBottomSheetKt.m14998getLambda2$app_siteRelease(), composerStartRestartGroup, 1572864, ProfileVerifier.CompilationStatus.f342xf2722a21, 16152);
                if (!z) {
                }
                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(i6, composer2, i9), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, i9)), 0.0f, 1, null);
                Alignment.Vertical centerVertically32 = companion4.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween3 = arrangement.getSpaceBetween();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy52 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically32, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap142 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor142 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf142 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default22);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy52, companion5.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap142, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM10870constructorimpl.getInserting()) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    function3ModifierMaterializerOf142.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy62 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap152 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor152 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf152 = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy62, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap152, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl2.getInserting()) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        function3ModifierMaterializerOf152.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_flame, composer2, i9), (String) null, SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, i9)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R.color.red, composer2, i9), 0, 2, null), composer2, 56, 56);
                        Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(PaddingKt.m8125paddingVpY3zN4$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer2, i9), 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween22 = arrangement.getSpaceBetween();
                        composer2.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy72 = ColumnKt.columnMeasurePolicy(spaceBetween22, companion4.getStart(), composer2, i9);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap162 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor162 = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf162 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy72, companion5.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap162, companion5.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl3.getInserting()) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            function3ModifierMaterializerOf162.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_ad, composer2, i9), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65534);
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy72 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap172 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor172 = companion5.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf172 = LayoutKt.modifierMaterializerOf(companion);
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                            }
                            composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy72, companion5.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap172, companion5.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl4.getInserting()) {
                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                function3ModifierMaterializerOf172.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                Composer composer32 = composer2;
                                Composer composer42 = composer2;
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_bottom_sheet_ad_left, composer2, i9), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._11wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, i9), 0, 0L, 0.0f, null, null, composer32, 12582918, 124), composer42, 0, 0, 65534);
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_just_string, new Object[]{Integer.valueOf(bottomSheetInfo.getAddsValue())}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, ColorResources_androidKt.colorResource(R.color.white, composer2, i9), 0, 0L, 0.0f, null, null, composer32, 12582918, 124), composer42, 0, 0, 65534);
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
                                RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer2, i9));
                                Modifier modifierNoRippleClickable$default2 = ComposeExtensionKt.noRippleClickable$default(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8172size3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, i9)), ColorResources_androidKt.colorResource(bottomSheetInfo.getCheckBoxColor(), composer2, 0), roundedCornerShapeM8392RoundedCornerShape0680j_422), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer2, 6), ColorResources_androidKt.colorResource(bottomSheetInfo.getCheckBoxBorderColor(), composer2, 0), roundedCornerShapeM8392RoundedCornerShape0680j_422), false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$2$3$9$2
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
                                        FocusManager.clearFocus$default(focusManager, false, 1, null);
                                        onClickCheckBox.invoke();
                                    }
                                }, 1, null);
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy42 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap182 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor182 = companion5.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf182 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default2);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy42, companion5.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap182, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl5.getInserting()) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    function3ModifierMaterializerOf182.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(bottomSheetInfo.isCheckBoxChecked()), composableSingletons$MarketplaceBottomSheetKt.m14999getLambda3$app_siteRelease(), composer2, 48);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                }
                            }
                        }
                    }
                }
            }
        } else {
            mutableState2 = mutableState10;
            i5 = i;
            companion = companion6;
            composer2 = composerStartRestartGroup;
            state = state4;
            i6 = R.dimen._15wdp;
            composer2.startReplaceableGroup(15343178);
            if (product.isPlatinumVipProduct()) {
                composer2.startReplaceableGroup(15343238);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_price_per_mounth, new Object[]{MarketplaceBottomSheet$lambda$12(state3)}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65534);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(15343682);
                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_string_with_ruble, new Object[]{MarketplaceBottomSheet$lambda$12(state3)}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65534);
                composer2.endReplaceableGroup();
            }
            Modifier modifierM8127paddingqDBjuR0$default4 = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._25wdp, composer2, 6), 0.0f, 0.0f, 13, null);
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash19 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap19 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor19 = companion5.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default4);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor19);
            } else {
                composer2.useNode();
            }
            Composer composerM10870constructorimpl19 = Updater.m10870constructorimpl(composer2);
            Updater.m10877setimpl(composerM10870constructorimpl19, measurePolicyRowMeasurePolicy8, companion5.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl19, currentCompositionLocalMap19, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash19 = companion5.getSetCompositeKeyHash();
            if (composerM10870constructorimpl19.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl19.rememberedValue(), Integer.valueOf(currentCompositeKeyHash19))) {
                composerM10870constructorimpl19.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash19));
                composerM10870constructorimpl19.apply(Integer.valueOf(currentCompositeKeyHash19), setCompositeKeyHash19);
            }
            function3ModifierMaterializerOf19.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.marketplace_card_in_stock_title_with_dots, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, composer2, 1572870, 62), composer2, 0, 0, 65534);
            TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_count, new Object[]{Integer.valueOf(product.getCount())}, composer2, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, 0L, 0.0f, null, null, composer2, 12582918, 126), composer2, 0, 0, 65534);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default5 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxSize$default(OffsetKt.m8084offsetVpY3zN4$default(companion, 0.0f, C2046Dp.m13666constructorimpl(-PrimitiveResources_androidKt.dimensionResource(i6, composer2, 6)), 1, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer2, 6), 0.0f, 8, null);
        Arrangement.HorizontalOrVertical spaceBetween4 = arrangement.getSpaceBetween();
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(spaceBetween4, companion4.getTop(), composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash20 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap20 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor20 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf20 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default5);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor20);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl20 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl20, measurePolicyRowMeasurePolicy9, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl20, currentCompositionLocalMap20, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash20 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl20.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl20.rememberedValue(), Integer.valueOf(currentCompositeKeyHash20))) {
            composerM10870constructorimpl20.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash20));
            composerM10870constructorimpl20.apply(Integer.valueOf(currentCompositeKeyHash20), setCompositeKeyHash20);
        }
        function3ModifierMaterializerOf20.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        composer2.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash21 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap21 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor21 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf21 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor21);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl21 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl21, measurePolicyColumnMeasurePolicy8, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl21, currentCompositionLocalMap21, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash21 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl21.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl21.rememberedValue(), Integer.valueOf(currentCompositeKeyHash21))) {
            composerM10870constructorimpl21.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash21));
            composerM10870constructorimpl21.apply(Integer.valueOf(currentCompositeKeyHash21), setCompositeKeyHash21);
        }
        function3ModifierMaterializerOf21.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        Composer composer5 = composer2;
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(bottomSheetInfo.getBottomText(), composer2, 0), PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer2, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer2, 6), 0, 0L, 0.0f, null, null, composer5, 12582918, 124), composer2, 0, 0, 65532);
        String strStringResource6 = StringResources_androidKt.stringResource(product.getPriceTemplate(), new Object[]{MarketplaceBottomSheet$lambda$10(state2)}, composer2, 64);
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo = typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._23wsp, 0L, 0, 0L, 0.0f, null, null, composer5, 12582918, 126);
        Modifier modifierGraphicsLayer5 = GraphicsLayerModifierKt.graphicsLayer(companion, new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$1$1
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
        composer2.startReplaceableGroup(15346211);
        boolean z8 = (((57344 & i5) ^ CpioConstants.C_ISBLK) > 16384 && composer2.changed(brushForPrice)) || (i5 & CpioConstants.C_ISBLK) == 16384;
        Object objRememberedValue17 = composer2.rememberedValue();
        if (z8 || objRememberedValue17 == companion3.getEmpty()) {
            objRememberedValue17 = new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$1$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                    Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                    final Brush brush5 = brushForPrice;
                    return drawWithCache.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$1$2$1.1
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
                            DrawScope.m11883drawRectAsUm42w$default(onDrawWithContent, brush5, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m11279getSrcAtop0nO6VwU(), 62, null);
                        }
                    });
                }
            };
            composer2.updateRememberedValue(objRememberedValue17);
        }
        composer2.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(strStringResource6, DrawModifierKt.drawWithCache(modifierGraphicsLayer5, (Function1) objRememberedValue17), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14811montserratBoldCustomSpIzzofJo, composer2, 0, 0, 65532);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash22 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor22);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl22 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl22, measurePolicyRowMeasurePolicy10, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl22, currentCompositionLocalMap22, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl22.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl22.rememberedValue(), Integer.valueOf(currentCompositeKeyHash22))) {
            composerM10870constructorimpl22.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash22));
            composerM10870constructorimpl22.apply(Integer.valueOf(currentCompositeKeyHash22), setCompositeKeyHash22);
        }
        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        if (bottomSheetInfo.getIsNeedToShowRedButton()) {
            composer2.startReplaceableGroup(15346689);
            Modifier modifierM8127paddingqDBjuR0$default6 = PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composer2, 6), 0.0f, 0.0f, 13, null);
            composer2.startReplaceableGroup(15346876);
            if (((i2 & 896) ^ 384) > 256) {
                i8 = 256;
                function0 = onClickRedButton;
                if (composer2.changed(function0)) {
                    z3 = true;
                    objRememberedValue = composer2.rememberedValue();
                    if (!z3 || objRememberedValue == companion3.getEmpty()) {
                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$1$1
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
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default6, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, composableSingletons$MarketplaceBottomSheetKt.m15000getLambda4$app_siteRelease(), composer2, 0, 3072, 4094);
                    composer2.endReplaceableGroup();
                    modifier2 = modifier3;
                    i7 = 48;
                    z2 = true;
                }
            } else {
                i8 = 256;
                function0 = onClickRedButton;
            }
            if ((i2 & 384) != i8) {
                z3 = false;
            }
            objRememberedValue = composer2.rememberedValue();
            if (!z3) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$1$1
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
                composer2.endReplaceableGroup();
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifierM8127paddingqDBjuR0$default6, null, false, null, false, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue, composableSingletons$MarketplaceBottomSheetKt.m15000getLambda4$app_siteRelease(), composer2, 0, 3072, 4094);
                composer2.endReplaceableGroup();
                modifier2 = modifier3;
                i7 = 48;
                z2 = true;
            }
        } else {
            composer2.startReplaceableGroup(15347701);
            modifier2 = modifier3;
            z2 = true;
            final MutableState mutableState11 = mutableState2;
            i7 = 48;
            ComposeExtensionKt.IfFalse(Boolean.valueOf(product.isPlatinumVipProduct()), ComposableLambdaKt.composableLambda(composer2, -809918021, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2
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
                public final void invoke(@Nullable Composer composer6, int i11) {
                    if ((i11 & 11) != 2 || !composer6.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-809918021, i11, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceBottomSheet.kt:881)");
                        }
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        Modifier modifierM8127paddingqDBjuR0$default7 = PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composer6, 6), 0.0f, 11, null);
                        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = bottomSheetInfo;
                        final Function0<Unit> function03 = onClickMinusButton;
                        final MutableState<String> mutableState12 = mutableState8;
                        final Function1<String, Unit> function13 = onClickDoneInCountTextField;
                        final MarketplaceProduct marketplaceProduct = product;
                        final Function0<Unit> function04 = onClickPlusButton;
                        final Function1<String, Unit> function14 = onClickSetForceCount;
                        final MutableState<Boolean> mutableState13 = mutableState6;
                        final MutableState<Boolean> mutableState14 = mutableState11;
                        final FocusManager focusManager2 = focusManager;
                        composer6.startReplaceableGroup(-483455358);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion8 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(top2, companion8.getStart(), composer6, 0);
                        composer6.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash23 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                        CompositionLocalMap currentCompositionLocalMap23 = composer6.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor23 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf23 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default7);
                        if (!(composer6.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer6.startReusableNode();
                        if (composer6.getInserting()) {
                            composer6.createNode(constructor23);
                        } else {
                            composer6.useNode();
                        }
                        Composer composerM10870constructorimpl23 = Updater.m10870constructorimpl(composer6);
                        Updater.m10877setimpl(composerM10870constructorimpl23, measurePolicyColumnMeasurePolicy9, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl23, currentCompositionLocalMap23, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash23 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl23.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl23.rememberedValue(), Integer.valueOf(currentCompositeKeyHash23))) {
                            composerM10870constructorimpl23.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash23));
                            composerM10870constructorimpl23.apply(Integer.valueOf(currentCompositeKeyHash23), setCompositeKeyHash23);
                        }
                        function3ModifierMaterializerOf23.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                        composer6.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        String strStringResource7 = StringResources_androidKt.stringResource(R.string.marketplace_count, composer6, 6);
                        TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                        TextKt.m10024Text4IGK_g(strStringResource7, PaddingKt.m8127paddingqDBjuR0$default(companion7, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composer6, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, ColorResources_androidKt.colorResource(R.color.white_40, composer6, 6), 0, 0L, 0.0f, null, null, composer6, 12582918, 124), composer6, 0, 0, 65532);
                        composer6.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion8.getTop(), composer6, 0);
                        composer6.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash24 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                        CompositionLocalMap currentCompositionLocalMap24 = composer6.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor24 = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf24 = LayoutKt.modifierMaterializerOf(companion7);
                        if (!(composer6.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer6.startReusableNode();
                        if (composer6.getInserting()) {
                            composer6.createNode(constructor24);
                        } else {
                            composer6.useNode();
                        }
                        Composer composerM10870constructorimpl24 = Updater.m10870constructorimpl(composer6);
                        Updater.m10877setimpl(composerM10870constructorimpl24, measurePolicyRowMeasurePolicy11, companion9.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl24, currentCompositionLocalMap24, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash24 = companion9.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl24.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl24.rememberedValue(), Integer.valueOf(currentCompositeKeyHash24))) {
                            composerM10870constructorimpl24.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash24));
                            composerM10870constructorimpl24.apply(Integer.valueOf(currentCompositeKeyHash24), setCompositeKeyHash24);
                        }
                        function3ModifierMaterializerOf24.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer6)), composer6, 0);
                        composer6.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6));
                        boolean zIsMinusBtnEnabled = marketplaceBottomSheetInfo.isMinusBtnEnabled();
                        boolean z9 = !marketplaceBottomSheetInfo.isMinusBtnEnabled();
                        composer6.startReplaceableGroup(1779399819);
                        boolean zChanged10 = composer6.changed(function03);
                        Object objRememberedValue18 = composer6.rememberedValue();
                        if (zChanged10 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue18 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2$1$1$1$1
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
                            composer6.updateRememberedValue(objRememberedValue18);
                        }
                        composer6.endReplaceableGroup();
                        ComposableSingletons$MarketplaceBottomSheetKt composableSingletons$MarketplaceBottomSheetKt2 = ComposableSingletons$MarketplaceBottomSheetKt.INSTANCE;
                        ButtonGrayGradientKt.ButtonGrayGradient(modifierM8172size3ABfNKs, null, null, null, zIsMinusBtnEnabled, null, false, z9, (Function0) objRememberedValue18, composableSingletons$MarketplaceBottomSheetKt2.m15001getLambda5$app_siteRelease(), composer6, 805306368, 110);
                        String value = mutableState12.getValue();
                        Function1<String, Unit> function15 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2$1$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str2) throws IOException {
                                invoke2(str2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String enteredText) throws IOException {
                                Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                                String countText = FormatUtilsKt.formatCountText(enteredText, marketplaceProduct.getCount());
                                mutableState12.setValue(countText);
                                function14.invoke(countText);
                            }
                        };
                        Modifier modifierM7782borderxT4_qwU2 = BorderKt.m7782borderxT4_qwU(PaddingKt.m8125paddingVpY3zN4$default(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._15wdp, composer6, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._05wdp, composer6, 6), ColorResources_androidKt.colorResource(R.color.white, composer6, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer6, 6)));
                        composer6.startReplaceableGroup(1779401558);
                        boolean zChanged11 = composer6.changed(function13) | composer6.changed(mutableState12);
                        Object objRememberedValue19 = composer6.rememberedValue();
                        if (zChanged11 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue19 = new Function1<FocusState, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2$1$1$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$8(mutableState13, focusState.isFocused());
                                    if (focusState.isFocused() || MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$1(mutableState14)) {
                                        MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$2(mutableState14, false);
                                    } else {
                                        function13.invoke(mutableState12.getValue());
                                    }
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue19);
                        }
                        composer6.endReplaceableGroup();
                        BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) function15, SizeKt.m8174sizeVpY3zN4(FocusChangedModifierKt.onFocusChanged(modifierM7782borderxT4_qwU2, (Function1) objRememberedValue19), PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composer6, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._32wdp, composer6, 6)), false, false, typographyStyle2.m14848montserratRegularCustomSpbl3sdaw(R.dimen._16wsp, 0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer6, 196614, 26), new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13392getNumberPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null), new KeyboardActions(new Function1<KeyboardActionScope, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2$1$1$4
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
                                FocusManager.clearFocus$default(focusManager2, false, 1, null);
                            }
                        }, null, null, null, null, null, 62, null), false, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(ColorResources_androidKt.colorResource(R.color.white, composer6, 6), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$MarketplaceBottomSheetKt2.m15002getLambda6$app_siteRelease(), composer6, 806879232, ProfileVerifier.CompilationStatus.f342xf2722a21, 15640);
                        Modifier modifierM8172size3ABfNKs2 = SizeKt.m8172size3ABfNKs(companion7, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6));
                        boolean z10 = marketplaceProduct.getCount() > marketplaceBottomSheetInfo.getProductCount();
                        boolean z11 = marketplaceProduct.getCount() <= marketplaceBottomSheetInfo.getProductCount();
                        composer6.startReplaceableGroup(1779404536);
                        boolean zChanged12 = composer6.changed(function04);
                        Object objRememberedValue20 = composer6.rememberedValue();
                        if (zChanged12 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue20 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$2$1$1$5$1
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
                                    function04.invoke();
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue20);
                        }
                        composer6.endReplaceableGroup();
                        ButtonGrayGradientKt.ButtonGrayGradient(modifierM8172size3ABfNKs2, null, null, null, z10, null, false, z11, (Function0) objRememberedValue20, composableSingletons$MarketplaceBottomSheetKt2.m15003getLambda7$app_siteRelease(), composer6, 805306368, 110);
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
            }), composer2, 48);
            composer2.endReplaceableGroup();
        }
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._19wdp, composer2, 6), 0.0f, 0.0f, 13, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._156wdp, composer2, 6));
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
        composer2.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash23 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap23 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor23 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf23 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
        if (!(composer2.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor23);
        } else {
            composer2.useNode();
        }
        Composer composerM10870constructorimpl23 = Updater.m10870constructorimpl(composer2);
        Updater.m10877setimpl(composerM10870constructorimpl23, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl23, currentCompositionLocalMap23, companion5.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash23 = companion5.getSetCompositeKeyHash();
        if (composerM10870constructorimpl23.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl23.rememberedValue(), Integer.valueOf(currentCompositeKeyHash23))) {
            composerM10870constructorimpl23.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash23));
            composerM10870constructorimpl23.apply(Integer.valueOf(currentCompositeKeyHash23), setCompositeKeyHash23);
        }
        function3ModifierMaterializerOf23.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        boolean zMarketplaceBottomSheet$lambda$20 = MarketplaceBottomSheet$lambda$20(state5);
        composer2.startReplaceableGroup(603551816);
        boolean z9 = ((((i2 & 7168) ^ 3072) <= 2048 || !composer2.changed(onClickGreenButton)) && (i2 & 3072) != 2048) ? false : z2;
        Object objRememberedValue18 = composer2.rememberedValue();
        if (z9 || objRememberedValue18 == companion3.getEmpty()) {
            objRememberedValue18 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$3$1$1
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
                    onClickGreenButton.invoke();
                }
            };
            composer2.updateRememberedValue(objRememberedValue18);
        }
        composer2.endReplaceableGroup();
        final State state6 = state;
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(null, null, zMarketplaceBottomSheet$lambda$20, null, true, false, false, false, null, 0, 0L, null, (Function0) objRememberedValue18, ComposableLambdaKt.composableLambda(composer2, 1662131365, z2, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$3$2
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
            public final void invoke(@Nullable Composer composer6, int i11) {
                if ((i11 & 11) != 2 || !composer6.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1662131365, i11, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceBottomSheet.kt:1012)");
                    }
                    ButtonWhiteStripKt.ButtonWhiteStrip(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composer6, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._156wdp, composer6, 6)), StringResources_androidKt.stringResource(bottomSheetInfo.getGreenButtonText(), composer6, 0), R.dimen._4wdp, R.dimen._10wsp, MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$18(state6), composer6, 3456, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer6.skipToGroupEnd();
            }
        }), composer2, CpioConstants.C_ISBLK, 3072, 4075);
        ComposeExtensionKt.IfFalse(Boolean.valueOf(MarketplaceBottomSheet$lambda$20(state5)), ComposableLambdaKt.composableLambda(composer2, 1765650521, z2, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$3$3
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
            public final void invoke(@Nullable Composer composer6, int i11) {
                if ((i11 & 11) != 2 || !composer6.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1765650521, i11, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarketplaceBottomSheet.kt:1023)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    final FocusManager focusManager2 = focusManager;
                    final Function0<Unit> function03 = onClickGreenButton;
                    BoxKt.Box(ComposeExtensionKt.noRippleClickable$default(modifierFillMaxSize$default, false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$4$3$2$3$3.1
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
                            FocusManager.clearFocus$default(focusManager2, false, 1, null);
                            function03.invoke();
                        }
                    }, 1, null), composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer6.skipToGroupEnd();
            }
        }), composer2, i7);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt.MarketplaceBottomSheet.5
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

                public final void invoke(@Nullable Composer composer6, int i11) {
                    MarketplaceBottomSheetKt.MarketplaceBottomSheet(modifier4, product, bottomSheetInfo, z, brushForPrice, focusManager, onClickDoneInPriceTextField, onClickDoneInCountTextField, onClickSetPrice, onClickSetForceCount, onClickMinusButton, onClickPlusButton, onClickRedButton, onClickGreenButton, onClickCheckBox, onClickClose, composer6, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    public static final void MarketplaceBottomSheet$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void MarketplaceBottomSheet$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void MarketplaceBottomSheet$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: MarketplaceBottomSheet.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$1", m7120f = "MarketplaceBottomSheet.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$1 */
    /* loaded from: classes7.dex */
    public static final class C58381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MarketplaceBottomSheetInfo $bottomSheetInfo;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<String> $textFieldPrice;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C58381(MarketplaceBottomSheetInfo marketplaceBottomSheetInfo, MutableState<String> mutableState, Context context, Continuation<? super C58381> continuation) {
            super(2, continuation);
            this.$bottomSheetInfo = marketplaceBottomSheetInfo;
            this.$textFieldPrice = mutableState;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C58381(this.$bottomSheetInfo, this.$textFieldPrice, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C58381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$bottomSheetInfo.getPrice() == 0) {
                this.$textFieldPrice.setValue(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
            } else {
                String strValueOf = String.valueOf(this.$bottomSheetInfo.getPrice());
                MutableState<String> mutableState = this.$textFieldPrice;
                String string = this.$context.getString(R.string.common_string_with_ruble, strValueOf);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                mutableState.setValue(string);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarketplaceBottomSheet.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$3", m7120f = "MarketplaceBottomSheet.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$3 */
    /* loaded from: classes7.dex */
    public static final class C58393 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ MarketplaceBottomSheetInfo $bottomSheetInfo;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Boolean> $isFirstTimeOpen$delegate;
        public final /* synthetic */ State<String> $priceForProductString$delegate;
        public final /* synthetic */ MarketplaceProduct $product;
        public final /* synthetic */ MutableState<Bitmap> $productImage$delegate;
        public final /* synthetic */ MutableState<String> $textFieldPrice;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C58393(MarketplaceBottomSheetInfo marketplaceBottomSheetInfo, MutableState<String> mutableState, Context context, MarketplaceProduct marketplaceProduct, State<String> state, MutableState<Bitmap> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C58393> continuation) {
            super(2, continuation);
            this.$bottomSheetInfo = marketplaceBottomSheetInfo;
            this.$textFieldPrice = mutableState;
            this.$context = context;
            this.$product = marketplaceProduct;
            this.$priceForProductString$delegate = state;
            this.$productImage$delegate = mutableState2;
            this.$isFirstTimeOpen$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C58393(this.$bottomSheetInfo, this.$textFieldPrice, this.$context, this.$product, this.$priceForProductString$delegate, this.$productImage$delegate, this.$isFirstTimeOpen$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C58393) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            ImageTypePathInCDNEnum imageTypePathInCDNEnum;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$bottomSheetInfo.getTabValue() == 5) {
                MutableState<String> mutableState = this.$textFieldPrice;
                String string = this.$context.getString(R.string.common_string_with_ruble, MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$12(this.$priceForProductString$delegate));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                mutableState.setValue(string);
            } else {
                this.$textFieldPrice.setValue(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
            }
            if (AnyExtensionKt.isNotNull(MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$15(this.$productImage$delegate))) {
                MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$16(this.$productImage$delegate, null);
            }
            MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$2(this.$isFirstTimeOpen$delegate, true);
            if (this.$product.getImageName().length() > 0) {
                int type = this.$product.getRenderInfo().getType();
                if (type == 0) {
                    imageTypePathInCDNEnum = ImageTypePathInCDNEnum.ACCESSORY;
                } else if (type == 2) {
                    imageTypePathInCDNEnum = ImageTypePathInCDNEnum.SKIN;
                } else if (type == 7) {
                    imageTypePathInCDNEnum = ImageTypePathInCDNEnum.VEHICLE;
                } else {
                    imageTypePathInCDNEnum = ImageTypePathInCDNEnum.IMAGE;
                }
                MarketplaceBottomSheetKt.MarketplaceBottomSheet$lambda$16(this.$productImage$delegate, BitmapUtilsKt.getBitmapFromZip$default(this.$context, this.$product.getImageName(), imageTypePathInCDNEnum, 0.0f, 0.0f, 24, null));
            } else {
                GameRender gameRender = GameRender.getInstance();
                int type2 = this.$product.getRenderInfo().getType();
                int modelId = this.$product.getRenderInfo().getModelId();
                int modelId2 = this.$product.getRenderInfo().getModelId();
                int color = this.$product.getRenderInfo().getColor();
                int color2 = this.$product.getRenderInfo().getColor();
                Float rotationX = this.$product.getRenderInfo().getRotationX();
                float fFloatValue = rotationX != null ? rotationX.floatValue() : 20.0f;
                Float rotationY = this.$product.getRenderInfo().getRotationY();
                float fFloatValue2 = rotationY != null ? rotationY.floatValue() : 180.0f;
                Float rotationZ = this.$product.getRenderInfo().getRotationZ();
                float fFloatValue3 = rotationZ != null ? rotationZ.floatValue() : 45.0f;
                float zoom = this.$product.getRenderInfo().getZoom();
                final MutableState<Bitmap> mutableState2 = this.$productImage$delegate;
                gameRender.RequestRender(type2, modelId, modelId2, color, color2, fFloatValue, fFloatValue2, fFloatValue3, zoom, new GameRender.GameRenderListener() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheet$3$$ExternalSyntheticLambda0
                    @Override // com.blackhub.bronline.game.GameRender.GameRenderListener
                    public final void OnRenderComplete(int i, Bitmap bitmap) {
                        MarketplaceBottomSheetKt.access$MarketplaceBottomSheet$lambda$16(mutableState2, bitmap);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceBottomSheetMyStorePreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(470423765);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470423765, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetMyStorePreview (MarketplaceBottomSheet.kt:1040)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            MarketplaceBottomSheet(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._292wdp, composerStartRestartGroup, 6)), 0.8f), companion2.getBottomCenter()), new MarketplaceProduct(false, "Маска «Ленин»", null, MarketplaceRarityEnum.COMMON, MarketplaceTypeProductCardEnum.BEST, 0, null, 0, 10, R.string.common_hours_short, 0, 0L, 332, " Tyomanayark", "desc desc desc desc", null, 0.0d, 0, null, false, false, false, false, null, 12029157, null), new MarketplaceBottomSheetInfo(5, false, 0, 0L, 0L, 0, 0, 126, null), true, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.yellow_orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), focusManager, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMyStorePreview$1$10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920390720, 224694, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt.MarketplaceBottomSheetMyStorePreview.2
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
                    MarketplaceBottomSheetKt.MarketplaceBottomSheetMyStorePreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceBottomSheetMainTabPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1362563996);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362563996, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetMainTabPreview (MarketplaceBottomSheet.kt:1087)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            MarketplaceBottomSheet(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._292wdp, composerStartRestartGroup, 6)), 0.8f), companion2.getBottomCenter()), new MarketplaceProduct(false, "Маска «Ленин»", null, MarketplaceRarityEnum.EPIC, MarketplaceTypeProductCardEnum.HOT, 0, null, 0, 10, R.string.common_hours_short, 0, 0L, 332, " Tyomanayark", "desc desc desc desc", null, 0.0d, 0, null, false, false, false, false, null, 12029157, null), new MarketplaceBottomSheetInfo(2, false, 0, 0L, 0L, 0, 0, 126, null), false, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), focusManager, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetMainTabPreview$1$10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920390720, 224694, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt.MarketplaceBottomSheetMainTabPreview.2
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
                    MarketplaceBottomSheetKt.MarketplaceBottomSheetMainTabPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceBottomSheetInventoryTabPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326522969);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326522969, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetInventoryTabPreview (MarketplaceBottomSheet.kt:1134)");
            }
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            MarketplaceBottomSheet(BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._292wdp, composerStartRestartGroup, 6)), 0.8f), companion2.getBottomCenter()), new MarketplaceProduct(false, "Маска «Ленин»", null, MarketplaceRarityEnum.LEGENDARY, MarketplaceTypeProductCardEnum.BEST, 0, null, 0, 10, R.string.common_hours_short, 0, 0L, 332, " Tyomanayark", "desc desc desc desc", null, 0.0d, 0, null, false, false, false, false, null, 12029157, null), new MarketplaceBottomSheetInfo(6, true, 0, 0L, 0L, 0, 0, 124, null), false, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), focusManager, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetInventoryTabPreview$1$10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920390720, 224694, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt.MarketplaceBottomSheetInventoryTabPreview.2
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
                    MarketplaceBottomSheetKt.MarketplaceBottomSheetInventoryTabPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void MarketplaceBottomSheetVipProductPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2007337632);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007337632, i, -1, "com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetVipProductPreview (MarketplaceBottomSheet.kt:1182)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
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
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Modifier modifierAlign = boxScopeInstance.align(SizeKt.fillMaxWidth(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._292wdp, composerStartRestartGroup, 6)), 0.8f), companion2.getBottomCenter());
            MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum = MarketplaceTypeProductCardEnum.BEST;
            composer2 = composerStartRestartGroup;
            MarketplaceBottomSheet(modifierAlign, new MarketplaceProduct(true, StringResources_androidKt.stringResource(R.string.craft_is_with_vip_platinum, composerStartRestartGroup, 6), null, MarketplaceRarityEnum.SPECIAL, marketplaceTypeProductCardEnum, 0, MarketplaceNotificationEnum.THE_BEST, 0, 10, R.string.common_hours_short, 0, 1000L, 0, StringResources_androidKt.stringResource(R.string.common_black_russia, composerStartRestartGroup, 6), StringResources_androidKt.stringResource(R.string.marketplace_vip_description, composerStartRestartGroup, 6), null, 0.0d, 0, null, false, false, false, false, null, 16749604, null), new MarketplaceBottomSheetInfo(2, false, 0, 0L, 0L, 0, 0, 126, null), false, Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), focusManager, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt$MarketplaceBottomSheetVipProductPreview$1$10
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 920390720, 224694, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.marketplace.uiblock.MarketplaceBottomSheetKt.MarketplaceBottomSheetVipProductPreview.2
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
                    MarketplaceBottomSheetKt.MarketplaceBottomSheetVipProductPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean MarketplaceBottomSheet$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean MarketplaceBottomSheet$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean MarketplaceBottomSheet$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final String MarketplaceBottomSheet$lambda$10(State<String> state) {
        return state.getValue();
    }

    public static final String MarketplaceBottomSheet$lambda$12(State<String> state) {
        return state.getValue();
    }

    public static final Bitmap MarketplaceBottomSheet$lambda$15(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final void MarketplaceBottomSheet$lambda$16(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    public static final int MarketplaceBottomSheet$lambda$18(State<Integer> state) {
        return state.getValue().intValue();
    }

    public static final boolean MarketplaceBottomSheet$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
