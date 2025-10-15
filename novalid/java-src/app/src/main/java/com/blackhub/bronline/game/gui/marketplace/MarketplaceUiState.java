package com.blackhub.bronline.game.gui.marketplace;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoryFilter;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceModalWindowStateEnum;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceBottomSheetInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceLimits;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProduct;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceProfileInfo;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceSortFilter;
import com.blackhub.bronline.game.gui.marketplace.model.MarketplaceTab;
import com.bless.client.R;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MarketplaceUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\b\u0002\u0010*\u001a\u00020\u000b\u0012\b\b\u0002\u0010+\u001a\u00020\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\b\b\u0002\u0010-\u001a\u00020\u000b\u0012\b\b\u0002\u0010.\u001a\u00020\u000b\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00102\u001a\u00020\u000b¢\u0006\u0002\u00103J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00150\rHÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\t0\u0017HÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J\t\u0010j\u001a\u00020\u0013HÆ\u0003J\t\u0010k\u001a\u00020\u0010HÆ\u0003J\t\u0010l\u001a\u00020\tHÆ\u0003J\t\u0010m\u001a\u00020\tHÆ\u0003J\t\u0010n\u001a\u00020\tHÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\t\u0010p\u001a\u00020\tHÆ\u0003J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J\t\u0010s\u001a\u00020\"HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010u\u001a\u00020%HÆ\u0003J\t\u0010v\u001a\u00020'HÆ\u0003J\t\u0010w\u001a\u00020\u000bHÆ\u0003J\t\u0010x\u001a\u00020\u000bHÆ\u0003J\t\u0010y\u001a\u00020\u000bHÆ\u0003J\t\u0010z\u001a\u00020\u000bHÆ\u0003J\t\u0010{\u001a\u00020\u000bHÆ\u0003J\t\u0010|\u001a\u00020\u0007HÆ\u0003J\t\u0010}\u001a\u00020\u000bHÆ\u0003J\t\u0010~\u001a\u00020\u000bHÆ\u0003J\t\u0010\u007f\u001a\u00020\u000bHÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u000101HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u000bHÆ\u0003J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0010\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003J\u0010\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\rHÆ\u0003J\u0092\u0003\u0010\u0088\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\r2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\b\b\u0002\u00102\u001a\u00020\u000bHÆ\u0001J\u0016\u0010\u0089\u0001\u001a\u00020\u000b2\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u0001HÖ\u0003J\n\u0010\u008c\u0001\u001a\u00020\tHÖ\u0001J\n\u0010\u008d\u0001\u001a\u00020UHÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010#\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u00100\u001a\u0004\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bA\u0010=R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\bC\u00105R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r¢\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0011\u0010E\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bF\u0010=R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0011\u0010*\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010HR\u0011\u0010/\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010HR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010HR\u0011\u0010,\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010HR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010HR\u0011\u00102\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010HR\u0011\u0010I\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0011\u0010+\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010HR\u0011\u0010)\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010HR\u0011\u0010.\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010HR\u0011\u0010-\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010HR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u0011\u0010T\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\bZ\u00105R\u0011\u0010\u001d\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b[\u0010=R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r¢\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u001a\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b_\u00107R\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r¢\u0006\b\n\u0000\u001a\u0004\bb\u00105R\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bc\u0010=R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bd\u0010=R\u0011\u0010\u001e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\be\u0010=¨\u0006\u008e\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/marketplace/MarketplaceUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "profileInfo", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;", "bottomSheetInfo", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;", "marketplaceLimits", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceLimits;", "money", "", "isHasPlatinumVip", "", "allInventoryItems", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "products", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "inventoryProducts", "tabs", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;", "filterList", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoryFilter;", "listOfChosenFilterIds", "", "likedList", "selectedTab", "selectedProduct", "currentPage", "totalPages", "priceVip", "typeVip", "timeVipCard", "pagesToShow", "currentSortFilter", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;", "bestMarketplaceProduct", "modalBottomWindowText", "Landroidx/compose/ui/text/AnnotatedString;", "modalWindowState", "Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceModalWindowStateEnum;", "isModalWindowVisible", "isScrollBarVisible", "isBottomSheetBlockVisible", "isNeedToShowFilter", "isHintsOpened", "isWithIndicationFilter", "isWaitingServerResponseForPublishing", "isCanPublishProductCards", "bgMarketplace", "Landroid/graphics/Bitmap;", "isNeedClose", "(Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceLimits;IZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/util/List;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;IIIIILjava/util/List;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;Landroidx/compose/ui/text/AnnotatedString;Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceModalWindowStateEnum;ZZZZZZZZLandroid/graphics/Bitmap;Z)V", "getAllInventoryItems", "()Ljava/util/List;", "getBestMarketplaceProduct", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "getBgMarketplace", "()Landroid/graphics/Bitmap;", "getBottomSheetInfo", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceBottomSheetInfo;", "getCurrentPage", "()I", "getCurrentSortFilter", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceSortFilter;", "filterColor", "getFilterColor", "filterColorList", "getFilterColorList", "getFilterList", "hintsMargin", "getHintsMargin", "getInventoryProducts", "()Z", "isNeedToShowEmptyListLabel", "getLikedList", "getListOfChosenFilterIds", "()Ljava/util/Set;", "getMarketplaceLimits", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceLimits;", "getModalBottomWindowText", "()Landroidx/compose/ui/text/AnnotatedString;", "getModalWindowState", "()Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceModalWindowStateEnum;", "getMoney", "moneyText", "", "getMoneyText", "()Ljava/lang/String;", "getPagesToShow", "priceColorList", "getPriceColorList", "getPriceVip", "getProducts", "getProfileInfo", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProfileInfo;", "getSelectedProduct", "getSelectedTab", "()Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceTab;", "getTabs", "getTimeVipCard", "getTotalPages", "getTypeVip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MarketplaceUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final List<InvItems> allInventoryItems;

    @Nullable
    public final MarketplaceProduct bestMarketplaceProduct;

    @Nullable
    public final Bitmap bgMarketplace;

    @NotNull
    public final MarketplaceBottomSheetInfo bottomSheetInfo;
    public final int currentPage;

    @NotNull
    public final MarketplaceSortFilter currentSortFilter;

    @NotNull
    public final List<CraftCategoryFilter> filterList;

    @NotNull
    public final List<MarketplaceProduct> inventoryProducts;
    public final boolean isBottomSheetBlockVisible;
    public final boolean isCanPublishProductCards;
    public final boolean isHasPlatinumVip;
    public final boolean isHintsOpened;
    public final boolean isModalWindowVisible;
    public final boolean isNeedClose;
    public final boolean isNeedToShowFilter;
    public final boolean isScrollBarVisible;
    public final boolean isWaitingServerResponseForPublishing;
    public final boolean isWithIndicationFilter;

    @NotNull
    public final List<Integer> likedList;

    @NotNull
    public final Set<Integer> listOfChosenFilterIds;

    @NotNull
    public final MarketplaceLimits marketplaceLimits;

    @NotNull
    public final AnnotatedString modalBottomWindowText;

    @NotNull
    public final MarketplaceModalWindowStateEnum modalWindowState;
    public final int money;

    @NotNull
    public final List<Integer> pagesToShow;
    public final int priceVip;

    @NotNull
    public final List<MarketplaceProduct> products;

    @NotNull
    public final MarketplaceProfileInfo profileInfo;

    @NotNull
    public final MarketplaceProduct selectedProduct;

    @NotNull
    public final MarketplaceTab selectedTab;

    @NotNull
    public final List<MarketplaceTab> tabs;
    public final int timeVipCard;
    public final int totalPages;
    public final int typeVip;

    public MarketplaceUiState() {
        this(null, null, null, 0, false, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, -1, 3, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MarketplaceProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    @NotNull
    public final List<CraftCategoryFilter> component10() {
        return this.filterList;
    }

    @NotNull
    public final Set<Integer> component11() {
        return this.listOfChosenFilterIds;
    }

    @NotNull
    public final List<Integer> component12() {
        return this.likedList;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final MarketplaceTab getSelectedTab() {
        return this.selectedTab;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final MarketplaceProduct getSelectedProduct() {
        return this.selectedProduct;
    }

    /* renamed from: component15, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component16, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: component17, reason: from getter */
    public final int getPriceVip() {
        return this.priceVip;
    }

    /* renamed from: component18, reason: from getter */
    public final int getTypeVip() {
        return this.typeVip;
    }

    /* renamed from: component19, reason: from getter */
    public final int getTimeVipCard() {
        return this.timeVipCard;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MarketplaceBottomSheetInfo getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    @NotNull
    public final List<Integer> component20() {
        return this.pagesToShow;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final MarketplaceSortFilter getCurrentSortFilter() {
        return this.currentSortFilter;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final MarketplaceProduct getBestMarketplaceProduct() {
        return this.bestMarketplaceProduct;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final AnnotatedString getModalBottomWindowText() {
        return this.modalBottomWindowText;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final MarketplaceModalWindowStateEnum getModalWindowState() {
        return this.modalWindowState;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsModalWindowVisible() {
        return this.isModalWindowVisible;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsScrollBarVisible() {
        return this.isScrollBarVisible;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsBottomSheetBlockVisible() {
        return this.isBottomSheetBlockVisible;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsNeedToShowFilter() {
        return this.isNeedToShowFilter;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsHintsOpened() {
        return this.isHintsOpened;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MarketplaceLimits getMarketplaceLimits() {
        return this.marketplaceLimits;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsWithIndicationFilter() {
        return this.isWithIndicationFilter;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsWaitingServerResponseForPublishing() {
        return this.isWaitingServerResponseForPublishing;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsCanPublishProductCards() {
        return this.isCanPublishProductCards;
    }

    @Nullable
    /* renamed from: component33, reason: from getter */
    public final Bitmap getBgMarketplace() {
        return this.bgMarketplace;
    }

    /* renamed from: component34, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMoney() {
        return this.money;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsHasPlatinumVip() {
        return this.isHasPlatinumVip;
    }

    @NotNull
    public final List<InvItems> component6() {
        return this.allInventoryItems;
    }

    @NotNull
    public final List<MarketplaceProduct> component7() {
        return this.products;
    }

    @NotNull
    public final List<MarketplaceProduct> component8() {
        return this.inventoryProducts;
    }

    @NotNull
    public final List<MarketplaceTab> component9() {
        return this.tabs;
    }

    @NotNull
    public final MarketplaceUiState copy(@NotNull MarketplaceProfileInfo profileInfo, @NotNull MarketplaceBottomSheetInfo bottomSheetInfo, @NotNull MarketplaceLimits marketplaceLimits, int money, boolean isHasPlatinumVip, @NotNull List<InvItems> allInventoryItems, @NotNull List<MarketplaceProduct> products, @NotNull List<MarketplaceProduct> inventoryProducts, @NotNull List<MarketplaceTab> tabs, @NotNull List<CraftCategoryFilter> filterList, @NotNull Set<Integer> listOfChosenFilterIds, @NotNull List<Integer> likedList, @NotNull MarketplaceTab selectedTab, @NotNull MarketplaceProduct selectedProduct, int currentPage, int totalPages, int priceVip, int typeVip, int timeVipCard, @NotNull List<Integer> pagesToShow, @NotNull MarketplaceSortFilter currentSortFilter, @Nullable MarketplaceProduct bestMarketplaceProduct, @NotNull AnnotatedString modalBottomWindowText, @NotNull MarketplaceModalWindowStateEnum modalWindowState, boolean isModalWindowVisible, boolean isScrollBarVisible, boolean isBottomSheetBlockVisible, boolean isNeedToShowFilter, boolean isHintsOpened, boolean isWithIndicationFilter, boolean isWaitingServerResponseForPublishing, boolean isCanPublishProductCards, @Nullable Bitmap bgMarketplace, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        Intrinsics.checkNotNullParameter(bottomSheetInfo, "bottomSheetInfo");
        Intrinsics.checkNotNullParameter(marketplaceLimits, "marketplaceLimits");
        Intrinsics.checkNotNullParameter(allInventoryItems, "allInventoryItems");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(inventoryProducts, "inventoryProducts");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(listOfChosenFilterIds, "listOfChosenFilterIds");
        Intrinsics.checkNotNullParameter(likedList, "likedList");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(selectedProduct, "selectedProduct");
        Intrinsics.checkNotNullParameter(pagesToShow, "pagesToShow");
        Intrinsics.checkNotNullParameter(currentSortFilter, "currentSortFilter");
        Intrinsics.checkNotNullParameter(modalBottomWindowText, "modalBottomWindowText");
        Intrinsics.checkNotNullParameter(modalWindowState, "modalWindowState");
        return new MarketplaceUiState(profileInfo, bottomSheetInfo, marketplaceLimits, money, isHasPlatinumVip, allInventoryItems, products, inventoryProducts, tabs, filterList, listOfChosenFilterIds, likedList, selectedTab, selectedProduct, currentPage, totalPages, priceVip, typeVip, timeVipCard, pagesToShow, currentSortFilter, bestMarketplaceProduct, modalBottomWindowText, modalWindowState, isModalWindowVisible, isScrollBarVisible, isBottomSheetBlockVisible, isNeedToShowFilter, isHintsOpened, isWithIndicationFilter, isWaitingServerResponseForPublishing, isCanPublishProductCards, bgMarketplace, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketplaceUiState)) {
            return false;
        }
        MarketplaceUiState marketplaceUiState = (MarketplaceUiState) other;
        return Intrinsics.areEqual(this.profileInfo, marketplaceUiState.profileInfo) && Intrinsics.areEqual(this.bottomSheetInfo, marketplaceUiState.bottomSheetInfo) && Intrinsics.areEqual(this.marketplaceLimits, marketplaceUiState.marketplaceLimits) && this.money == marketplaceUiState.money && this.isHasPlatinumVip == marketplaceUiState.isHasPlatinumVip && Intrinsics.areEqual(this.allInventoryItems, marketplaceUiState.allInventoryItems) && Intrinsics.areEqual(this.products, marketplaceUiState.products) && Intrinsics.areEqual(this.inventoryProducts, marketplaceUiState.inventoryProducts) && Intrinsics.areEqual(this.tabs, marketplaceUiState.tabs) && Intrinsics.areEqual(this.filterList, marketplaceUiState.filterList) && Intrinsics.areEqual(this.listOfChosenFilterIds, marketplaceUiState.listOfChosenFilterIds) && Intrinsics.areEqual(this.likedList, marketplaceUiState.likedList) && Intrinsics.areEqual(this.selectedTab, marketplaceUiState.selectedTab) && Intrinsics.areEqual(this.selectedProduct, marketplaceUiState.selectedProduct) && this.currentPage == marketplaceUiState.currentPage && this.totalPages == marketplaceUiState.totalPages && this.priceVip == marketplaceUiState.priceVip && this.typeVip == marketplaceUiState.typeVip && this.timeVipCard == marketplaceUiState.timeVipCard && Intrinsics.areEqual(this.pagesToShow, marketplaceUiState.pagesToShow) && this.currentSortFilter == marketplaceUiState.currentSortFilter && Intrinsics.areEqual(this.bestMarketplaceProduct, marketplaceUiState.bestMarketplaceProduct) && Intrinsics.areEqual(this.modalBottomWindowText, marketplaceUiState.modalBottomWindowText) && this.modalWindowState == marketplaceUiState.modalWindowState && this.isModalWindowVisible == marketplaceUiState.isModalWindowVisible && this.isScrollBarVisible == marketplaceUiState.isScrollBarVisible && this.isBottomSheetBlockVisible == marketplaceUiState.isBottomSheetBlockVisible && this.isNeedToShowFilter == marketplaceUiState.isNeedToShowFilter && this.isHintsOpened == marketplaceUiState.isHintsOpened && this.isWithIndicationFilter == marketplaceUiState.isWithIndicationFilter && this.isWaitingServerResponseForPublishing == marketplaceUiState.isWaitingServerResponseForPublishing && this.isCanPublishProductCards == marketplaceUiState.isCanPublishProductCards && Intrinsics.areEqual(this.bgMarketplace, marketplaceUiState.bgMarketplace) && this.isNeedClose == marketplaceUiState.isNeedClose;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((this.profileInfo.hashCode() * 31) + this.bottomSheetInfo.hashCode()) * 31) + this.marketplaceLimits.hashCode()) * 31) + Integer.hashCode(this.money)) * 31) + Boolean.hashCode(this.isHasPlatinumVip)) * 31) + this.allInventoryItems.hashCode()) * 31) + this.products.hashCode()) * 31) + this.inventoryProducts.hashCode()) * 31) + this.tabs.hashCode()) * 31) + this.filterList.hashCode()) * 31) + this.listOfChosenFilterIds.hashCode()) * 31) + this.likedList.hashCode()) * 31) + this.selectedTab.hashCode()) * 31) + this.selectedProduct.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.priceVip)) * 31) + Integer.hashCode(this.typeVip)) * 31) + Integer.hashCode(this.timeVipCard)) * 31) + this.pagesToShow.hashCode()) * 31) + this.currentSortFilter.hashCode()) * 31;
        MarketplaceProduct marketplaceProduct = this.bestMarketplaceProduct;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (marketplaceProduct == null ? 0 : marketplaceProduct.hashCode())) * 31) + this.modalBottomWindowText.hashCode()) * 31) + this.modalWindowState.hashCode()) * 31) + Boolean.hashCode(this.isModalWindowVisible)) * 31) + Boolean.hashCode(this.isScrollBarVisible)) * 31) + Boolean.hashCode(this.isBottomSheetBlockVisible)) * 31) + Boolean.hashCode(this.isNeedToShowFilter)) * 31) + Boolean.hashCode(this.isHintsOpened)) * 31) + Boolean.hashCode(this.isWithIndicationFilter)) * 31) + Boolean.hashCode(this.isWaitingServerResponseForPublishing)) * 31) + Boolean.hashCode(this.isCanPublishProductCards)) * 31;
        Bitmap bitmap = this.bgMarketplace;
        return ((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        MarketplaceProfileInfo marketplaceProfileInfo = this.profileInfo;
        MarketplaceBottomSheetInfo marketplaceBottomSheetInfo = this.bottomSheetInfo;
        MarketplaceLimits marketplaceLimits = this.marketplaceLimits;
        int i = this.money;
        boolean z = this.isHasPlatinumVip;
        List<InvItems> list = this.allInventoryItems;
        List<MarketplaceProduct> list2 = this.products;
        List<MarketplaceProduct> list3 = this.inventoryProducts;
        List<MarketplaceTab> list4 = this.tabs;
        List<CraftCategoryFilter> list5 = this.filterList;
        Set<Integer> set = this.listOfChosenFilterIds;
        List<Integer> list6 = this.likedList;
        MarketplaceTab marketplaceTab = this.selectedTab;
        MarketplaceProduct marketplaceProduct = this.selectedProduct;
        int i2 = this.currentPage;
        int i3 = this.totalPages;
        int i4 = this.priceVip;
        int i5 = this.typeVip;
        int i6 = this.timeVipCard;
        List<Integer> list7 = this.pagesToShow;
        MarketplaceSortFilter marketplaceSortFilter = this.currentSortFilter;
        MarketplaceProduct marketplaceProduct2 = this.bestMarketplaceProduct;
        AnnotatedString annotatedString = this.modalBottomWindowText;
        return "MarketplaceUiState(profileInfo=" + marketplaceProfileInfo + ", bottomSheetInfo=" + marketplaceBottomSheetInfo + ", marketplaceLimits=" + marketplaceLimits + ", money=" + i + ", isHasPlatinumVip=" + z + ", allInventoryItems=" + list + ", products=" + list2 + ", inventoryProducts=" + list3 + ", tabs=" + list4 + ", filterList=" + list5 + ", listOfChosenFilterIds=" + set + ", likedList=" + list6 + ", selectedTab=" + marketplaceTab + ", selectedProduct=" + marketplaceProduct + ", currentPage=" + i2 + ", totalPages=" + i3 + ", priceVip=" + i4 + ", typeVip=" + i5 + ", timeVipCard=" + i6 + ", pagesToShow=" + list7 + ", currentSortFilter=" + marketplaceSortFilter + ", bestMarketplaceProduct=" + marketplaceProduct2 + ", modalBottomWindowText=" + ((Object) annotatedString) + ", modalWindowState=" + this.modalWindowState + ", isModalWindowVisible=" + this.isModalWindowVisible + ", isScrollBarVisible=" + this.isScrollBarVisible + ", isBottomSheetBlockVisible=" + this.isBottomSheetBlockVisible + ", isNeedToShowFilter=" + this.isNeedToShowFilter + ", isHintsOpened=" + this.isHintsOpened + ", isWithIndicationFilter=" + this.isWithIndicationFilter + ", isWaitingServerResponseForPublishing=" + this.isWaitingServerResponseForPublishing + ", isCanPublishProductCards=" + this.isCanPublishProductCards + ", bgMarketplace=" + this.bgMarketplace + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public MarketplaceUiState(@NotNull MarketplaceProfileInfo profileInfo, @NotNull MarketplaceBottomSheetInfo bottomSheetInfo, @NotNull MarketplaceLimits marketplaceLimits, int i, boolean z, @NotNull List<InvItems> allInventoryItems, @NotNull List<MarketplaceProduct> products, @NotNull List<MarketplaceProduct> inventoryProducts, @NotNull List<MarketplaceTab> tabs, @NotNull List<CraftCategoryFilter> filterList, @NotNull Set<Integer> listOfChosenFilterIds, @NotNull List<Integer> likedList, @NotNull MarketplaceTab selectedTab, @NotNull MarketplaceProduct selectedProduct, int i2, int i3, int i4, int i5, int i6, @NotNull List<Integer> pagesToShow, @NotNull MarketplaceSortFilter currentSortFilter, @Nullable MarketplaceProduct marketplaceProduct, @NotNull AnnotatedString modalBottomWindowText, @NotNull MarketplaceModalWindowStateEnum modalWindowState, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, @Nullable Bitmap bitmap, boolean z10) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        Intrinsics.checkNotNullParameter(bottomSheetInfo, "bottomSheetInfo");
        Intrinsics.checkNotNullParameter(marketplaceLimits, "marketplaceLimits");
        Intrinsics.checkNotNullParameter(allInventoryItems, "allInventoryItems");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(inventoryProducts, "inventoryProducts");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(listOfChosenFilterIds, "listOfChosenFilterIds");
        Intrinsics.checkNotNullParameter(likedList, "likedList");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(selectedProduct, "selectedProduct");
        Intrinsics.checkNotNullParameter(pagesToShow, "pagesToShow");
        Intrinsics.checkNotNullParameter(currentSortFilter, "currentSortFilter");
        Intrinsics.checkNotNullParameter(modalBottomWindowText, "modalBottomWindowText");
        Intrinsics.checkNotNullParameter(modalWindowState, "modalWindowState");
        this.profileInfo = profileInfo;
        this.bottomSheetInfo = bottomSheetInfo;
        this.marketplaceLimits = marketplaceLimits;
        this.money = i;
        this.isHasPlatinumVip = z;
        this.allInventoryItems = allInventoryItems;
        this.products = products;
        this.inventoryProducts = inventoryProducts;
        this.tabs = tabs;
        this.filterList = filterList;
        this.listOfChosenFilterIds = listOfChosenFilterIds;
        this.likedList = likedList;
        this.selectedTab = selectedTab;
        this.selectedProduct = selectedProduct;
        this.currentPage = i2;
        this.totalPages = i3;
        this.priceVip = i4;
        this.typeVip = i5;
        this.timeVipCard = i6;
        this.pagesToShow = pagesToShow;
        this.currentSortFilter = currentSortFilter;
        this.bestMarketplaceProduct = marketplaceProduct;
        this.modalBottomWindowText = modalBottomWindowText;
        this.modalWindowState = modalWindowState;
        this.isModalWindowVisible = z2;
        this.isScrollBarVisible = z3;
        this.isBottomSheetBlockVisible = z4;
        this.isNeedToShowFilter = z5;
        this.isHintsOpened = z6;
        this.isWithIndicationFilter = z7;
        this.isWaitingServerResponseForPublishing = z8;
        this.isCanPublishProductCards = z9;
        this.bgMarketplace = bitmap;
        this.isNeedClose = z10;
    }

    public /* synthetic */ MarketplaceUiState(MarketplaceProfileInfo marketplaceProfileInfo, MarketplaceBottomSheetInfo marketplaceBottomSheetInfo, MarketplaceLimits marketplaceLimits, int i, boolean z, List list, List list2, List list3, List list4, List list5, Set set, List list6, MarketplaceTab marketplaceTab, MarketplaceProduct marketplaceProduct, int i2, int i3, int i4, int i5, int i6, List list7, MarketplaceSortFilter marketplaceSortFilter, MarketplaceProduct marketplaceProduct2, AnnotatedString annotatedString, MarketplaceModalWindowStateEnum marketplaceModalWindowStateEnum, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Bitmap bitmap, boolean z10, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new MarketplaceProfileInfo(null, 0, null, null, null, 31, null) : marketplaceProfileInfo, (i7 & 2) != 0 ? new MarketplaceBottomSheetInfo(0, false, 0, 0L, 0L, 0, 0, 127, null) : marketplaceBottomSheetInfo, (i7 & 4) != 0 ? new MarketplaceLimits(0, 0, 0, 0, false, 0, 0, 127, null) : marketplaceLimits, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? false : z, (i7 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i7 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i7 & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i7 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i7 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i7 & 1024) != 0 ? SetsKt__SetsKt.emptySet() : set, (i7 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i7 & 4096) != 0 ? new MarketplaceTab(false, 0, null, 0, 0, false, false, null, 255, null) : marketplaceTab, (i7 & 8192) != 0 ? new MarketplaceProduct(false, null, null, null, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, null, ViewCompat.MEASURED_SIZE_MASK, null) : marketplaceProduct, (i7 & 16384) != 0 ? 1 : i2, (i7 & 32768) != 0 ? 1 : i3, (i7 & 65536) != 0 ? 0 : i4, (i7 & 131072) != 0 ? 0 : i5, (i7 & 262144) != 0 ? 0 : i6, (i7 & 524288) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i7 & 1048576) != 0 ? MarketplaceSortFilter.DESCENDING : marketplaceSortFilter, (i7 & 2097152) != 0 ? null : marketplaceProduct2, (i7 & 4194304) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i7 & 8388608) != 0 ? MarketplaceModalWindowStateEnum.CONFIRM_BUY : marketplaceModalWindowStateEnum, (i7 & 16777216) != 0 ? false : z2, (i7 & NTLMEngineImpl.FLAG_REQUEST_VERSION) == 0 ? z3 : true, (i7 & 67108864) != 0 ? false : z4, (i7 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? false : z5, (i7 & 268435456) != 0 ? false : z6, (i7 & 536870912) != 0 ? false : z7, (i7 & 1073741824) != 0 ? false : z8, (i7 & Integer.MIN_VALUE) != 0 ? false : z9, (i8 & 1) == 0 ? bitmap : null, (i8 & 2) != 0 ? false : z10);
    }

    @NotNull
    public final MarketplaceProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    @NotNull
    public final MarketplaceBottomSheetInfo getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    @NotNull
    public final MarketplaceLimits getMarketplaceLimits() {
        return this.marketplaceLimits;
    }

    public final int getMoney() {
        return this.money;
    }

    public final boolean isHasPlatinumVip() {
        return this.isHasPlatinumVip;
    }

    @NotNull
    public final List<InvItems> getAllInventoryItems() {
        return this.allInventoryItems;
    }

    @NotNull
    public final List<MarketplaceProduct> getProducts() {
        return this.products;
    }

    @NotNull
    public final List<MarketplaceProduct> getInventoryProducts() {
        return this.inventoryProducts;
    }

    @NotNull
    public final List<MarketplaceTab> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final List<CraftCategoryFilter> getFilterList() {
        return this.filterList;
    }

    @NotNull
    public final Set<Integer> getListOfChosenFilterIds() {
        return this.listOfChosenFilterIds;
    }

    @NotNull
    public final List<Integer> getLikedList() {
        return this.likedList;
    }

    @NotNull
    public final MarketplaceTab getSelectedTab() {
        return this.selectedTab;
    }

    @NotNull
    public final MarketplaceProduct getSelectedProduct() {
        return this.selectedProduct;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getPriceVip() {
        return this.priceVip;
    }

    public final int getTypeVip() {
        return this.typeVip;
    }

    public final int getTimeVipCard() {
        return this.timeVipCard;
    }

    @NotNull
    public final List<Integer> getPagesToShow() {
        return this.pagesToShow;
    }

    @NotNull
    public final MarketplaceSortFilter getCurrentSortFilter() {
        return this.currentSortFilter;
    }

    @Nullable
    public final MarketplaceProduct getBestMarketplaceProduct() {
        return this.bestMarketplaceProduct;
    }

    @NotNull
    public final AnnotatedString getModalBottomWindowText() {
        return this.modalBottomWindowText;
    }

    @NotNull
    public final MarketplaceModalWindowStateEnum getModalWindowState() {
        return this.modalWindowState;
    }

    public final boolean isModalWindowVisible() {
        return this.isModalWindowVisible;
    }

    public final boolean isScrollBarVisible() {
        return this.isScrollBarVisible;
    }

    public final boolean isBottomSheetBlockVisible() {
        return this.isBottomSheetBlockVisible;
    }

    public final boolean isNeedToShowFilter() {
        return this.isNeedToShowFilter;
    }

    public final boolean isHintsOpened() {
        return this.isHintsOpened;
    }

    public final boolean isWithIndicationFilter() {
        return this.isWithIndicationFilter;
    }

    public final boolean isWaitingServerResponseForPublishing() {
        return this.isWaitingServerResponseForPublishing;
    }

    public final boolean isCanPublishProductCards() {
        return this.isCanPublishProductCards;
    }

    @Nullable
    public final Bitmap getBgMarketplace() {
        return this.bgMarketplace;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final String getMoneyText() {
        return FormatUtilsKt.formatNumber(this.money);
    }

    public final boolean isNeedToShowEmptyListLabel() {
        return this.products.isEmpty() && this.selectedTab.getTabValue() == 6;
    }

    @NotNull
    public final List<Integer> getFilterColorList() {
        if (this.isNeedToShowFilter) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.gray_blue), Integer.valueOf(R.color.black_gray_blue_2)});
    }

    @NotNull
    public final List<Integer> getPriceColorList() {
        int tabValue = this.selectedTab.getTabValue();
        Integer numValueOf = Integer.valueOf(R.color.yellow_orange);
        Integer numValueOf2 = Integer.valueOf(R.color.yellow);
        if (tabValue == 5 && this.isHasPlatinumVip) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{numValueOf2, numValueOf});
        }
        if (this.selectedTab.getTabValue() == 6 && this.isHasPlatinumVip) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{numValueOf2, numValueOf});
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.color.white), Integer.valueOf(R.color.white)});
    }

    @ColorRes
    public final int getFilterColor() {
        return this.isNeedToShowFilter ? R.color.blue_black : R.color.white;
    }

    @DimenRes
    public final int getHintsMargin() {
        return this.isHintsOpened ? R.dimen._196wdp : R.dimen._0wdp;
    }
}
