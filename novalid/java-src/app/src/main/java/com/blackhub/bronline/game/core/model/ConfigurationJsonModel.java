package com.blackhub.bronline.game.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.gui.craft.model.response.CommonFilterCategoriesResponse;
import com.blackhub.bronline.game.gui.craft.model.response.CraftCategoriesResponse;
import com.blackhub.bronline.game.gui.craft.model.response.CraftItemsJsonResponse;
import com.blackhub.bronline.game.gui.craft.model.response.MarketDeliveryFiltersResponse;
import com.blackhub.bronline.game.gui.donate.data.CarColorItem;
import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import com.blackhub.bronline.game.gui.familysystem.data.FamilySystemList;
import com.blackhub.bronline.game.gui.fractions.data.FractionQuestsObj;
import com.blackhub.bronline.game.gui.fractions.data.FractionsDocumentsObjList;
import com.blackhub.bronline.game.gui.fractions.data.FractionsShopList;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.menu.model.ButtonsConfigResponse;
import com.blackhub.bronline.game.gui.smieditor.data.SmiEditorBodyObj;
import com.blackhub.bronline.game.gui.smieditor.data.SmiList;
import com.blackhub.bronline.game.gui.socialaction.data.SocialInteraction;
import com.blackhub.bronline.game.gui.tuning.data.TuneGuiScreenObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneObj;
import com.blackhub.bronline.game.gui.tuning.data.TuneVinylsObj;
import com.blackhub.bronline.game.model.remote.response.blackpass.BlackPassItems;
import com.blackhub.bronline.game.model.remote.response.bprewards.BpRewardsResponse;
import com.blackhub.bronline.game.model.remote.response.calendar.CalendarResponse;
import com.blackhub.bronline.game.model.remote.response.cases.CasesResponse;
import com.blackhub.bronline.game.model.remote.response.holidayevents.HolidayEventsResponse;
import com.blackhub.bronline.game.model.remote.response.marketplace.MarketplaceLimitsResponse;
import com.blackhub.bronline.game.model.remote.response.skins.SkinsDTO;
import com.blackhub.bronline.game.model.remote.response.tanpin.TanpinBannerDataResponse;
import com.blackhub.bronline.game.model.remote.response.vehicles.VehiclesDTO;
import com.blackhub.bronline.game.model.remote.response.videoplayer.PlayerResponse;
import com.blackhub.bronline.game.p019ui.donate.ProductDetailsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConfigurationJsonModel.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0003\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0003\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000205\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0003\u0012\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003\u0012\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0003\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0003¢\u0006\u0002\u0010>J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0016HÆ\u0003J\t\u0010r\u001a\u00020\u0016HÆ\u0003J\t\u0010s\u001a\u00020\u0019HÆ\u0003J\t\u0010t\u001a\u00020\u001bHÆ\u0003J\t\u0010u\u001a\u00020\u001dHÆ\u0003J\t\u0010v\u001a\u00020\u001fHÆ\u0003J\t\u0010w\u001a\u00020!HÆ\u0003J\t\u0010x\u001a\u00020#HÆ\u0003J\t\u0010y\u001a\u00020%HÆ\u0003J\t\u0010z\u001a\u00020'HÆ\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010|\u001a\u00020)HÆ\u0003J\t\u0010}\u001a\u00020+HÆ\u0003J\u000f\u0010~\u001a\b\u0012\u0004\u0012\u00020-0\u0003HÆ\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020/0\u0003HÆ\u0003J\u0010\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u000203HÆ\u0003J\n\u0010\u0082\u0001\u001a\u000205HÆ\u0003J\u0010\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u0002070\u0003HÆ\u0003J\u0010\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u0002090\u0003HÆ\u0003J\u0010\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020;0\u0003HÆ\u0003J\u0010\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u0010\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u0003HÆ\u0003J\u0010\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000eHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0014HÆ\u0003Jø\u0002\u0010\u008e\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002052\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0003HÆ\u0001J\u0016\u0010\u008f\u0001\u001a\u00030\u0090\u00012\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0092\u0001\u001a\u00030\u0093\u0001HÖ\u0001J\u000b\u0010\u0094\u0001\u001a\u00030\u0095\u0001HÖ\u0001R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010HR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010HR\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b]\u0010LR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010HR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010HR\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010HR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010HR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0017\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010HR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bn\u0010o¨\u0006\u0096\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/model/ConfigurationJsonModel;", "", "invItemsFromJson", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "skinsFromJson", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "vehiclesFromJson", "Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "socialInteractionsFromJson", "Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteraction;", "familySystemListFromJson", "Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemList;", "calendarModel", "Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "bpRewardsModel", "Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;", "craftItemsModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemsJsonResponse;", "craftCategoriesModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoriesResponse;", "craftCategoriesFilterModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;", "marketplaceCategoriesFilterModel", "marketplaceDeliveryFilterModel", "Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;", "tanpinBannerModel", "Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;", "videoPlayerModel", "Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "marketplaceConfigurationViewModel", "Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceLimitsResponse;", "holidayEvents", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "casesModel", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;", "buttonConfig", "Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "fractionDocuments", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;", "fractionShopList", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "fractionQuestsObj", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;", "productDetailsState", "Lcom/blackhub/bronline/game/ui/donate/ProductDetailsItem;", "donateItemsFromJson", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "carColorItems", "Lcom/blackhub/bronline/game/gui/donate/data/CarColorItem;", "blackPassItemsFromJson", "Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassItems;", "smiListFromJson", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "smiEditorBodyFromJson", "Lcom/blackhub/bronline/game/gui/smieditor/data/SmiEditorBodyObj;", "tuneObjItemsFromJson", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneObj;", "tuneGuiScreensFromJsonObj", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneGuiScreenObj;", "tuneVinylsObjFromJson", "Lcom/blackhub/bronline/game/gui/tuning/data/TuneVinylsObj;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemList;Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemsJsonResponse;Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoriesResponse;Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceLimitsResponse;Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassItems;Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBlackPassItemsFromJson", "()Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassItems;", "getBpRewardsModel", "()Lcom/blackhub/bronline/game/model/remote/response/bprewards/BpRewardsResponse;", "getButtonConfig", "()Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "getCalendarModel", "()Lcom/blackhub/bronline/game/model/remote/response/calendar/CalendarResponse;", "getCarColorItems", "()Ljava/util/List;", "getCasesModel", "()Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;", "getCraftCategoriesFilterModel", "()Lcom/blackhub/bronline/game/gui/craft/model/response/CommonFilterCategoriesResponse;", "getCraftCategoriesModel", "()Lcom/blackhub/bronline/game/gui/craft/model/response/CraftCategoriesResponse;", "getCraftItemsModel", "()Lcom/blackhub/bronline/game/gui/craft/model/response/CraftItemsJsonResponse;", "getDonateItemsFromJson", "getFamilySystemListFromJson", "()Lcom/blackhub/bronline/game/gui/familysystem/data/FamilySystemList;", "getFractionDocuments", "()Lcom/blackhub/bronline/game/gui/fractions/data/FractionsDocumentsObjList;", "getFractionQuestsObj", "()Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;", "getFractionShopList", "()Lcom/blackhub/bronline/game/gui/fractions/data/FractionsShopList;", "getHolidayEvents", "()Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "getInvItemsFromJson", "getMarketplaceCategoriesFilterModel", "getMarketplaceConfigurationViewModel", "()Lcom/blackhub/bronline/game/model/remote/response/marketplace/MarketplaceLimitsResponse;", "getMarketplaceDeliveryFilterModel", "()Lcom/blackhub/bronline/game/gui/craft/model/response/MarketDeliveryFiltersResponse;", "getProductDetailsState", "getSkinsFromJson", "getSmiEditorBodyFromJson", "getSmiListFromJson", "()Lcom/blackhub/bronline/game/gui/smieditor/data/SmiList;", "getSocialInteractionsFromJson", "getTanpinBannerModel", "()Lcom/blackhub/bronline/game/model/remote/response/tanpin/TanpinBannerDataResponse;", "getTuneGuiScreensFromJsonObj", "getTuneObjItemsFromJson", "getTuneVinylsObjFromJson", "getVehiclesFromJson", "getVideoPlayerModel", "()Lcom/blackhub/bronline/game/model/remote/response/videoplayer/PlayerResponse;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConfigurationJsonModel {
    public static final int $stable = 8;

    @NotNull
    public final BlackPassItems blackPassItemsFromJson;

    @NotNull
    public final BpRewardsResponse bpRewardsModel;

    @NotNull
    public final ButtonsConfigResponse buttonConfig;

    @NotNull
    public final CalendarResponse calendarModel;

    @NotNull
    public final List<CarColorItem> carColorItems;

    @NotNull
    public final CasesResponse casesModel;

    @NotNull
    public final CommonFilterCategoriesResponse craftCategoriesFilterModel;

    @NotNull
    public final CraftCategoriesResponse craftCategoriesModel;

    @NotNull
    public final CraftItemsJsonResponse craftItemsModel;

    @NotNull
    public final List<DonateItem> donateItemsFromJson;

    @NotNull
    public final FamilySystemList familySystemListFromJson;

    @NotNull
    public final FractionsDocumentsObjList fractionDocuments;

    @NotNull
    public final FractionQuestsObj fractionQuestsObj;

    @NotNull
    public final FractionsShopList fractionShopList;

    @NotNull
    public final HolidayEventsResponse holidayEvents;

    @NotNull
    public final List<InvItems> invItemsFromJson;

    @NotNull
    public final CommonFilterCategoriesResponse marketplaceCategoriesFilterModel;

    @NotNull
    public final MarketplaceLimitsResponse marketplaceConfigurationViewModel;

    @NotNull
    public final MarketDeliveryFiltersResponse marketplaceDeliveryFilterModel;

    @NotNull
    public final List<ProductDetailsItem> productDetailsState;

    @NotNull
    public final List<SkinsDTO> skinsFromJson;

    @NotNull
    public final List<SmiEditorBodyObj> smiEditorBodyFromJson;

    @NotNull
    public final SmiList smiListFromJson;

    @NotNull
    public final List<SocialInteraction> socialInteractionsFromJson;

    @NotNull
    public final TanpinBannerDataResponse tanpinBannerModel;

    @NotNull
    public final List<TuneGuiScreenObj> tuneGuiScreensFromJsonObj;

    @NotNull
    public final List<TuneObj> tuneObjItemsFromJson;

    @NotNull
    public final List<TuneVinylsObj> tuneVinylsObjFromJson;

    @NotNull
    public final List<VehiclesDTO> vehiclesFromJson;

    @NotNull
    public final PlayerResponse videoPlayerModel;

    public ConfigurationJsonModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    @NotNull
    public final List<InvItems> component1() {
        return this.invItemsFromJson;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final CommonFilterCategoriesResponse getCraftCategoriesFilterModel() {
        return this.craftCategoriesFilterModel;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final CommonFilterCategoriesResponse getMarketplaceCategoriesFilterModel() {
        return this.marketplaceCategoriesFilterModel;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final MarketDeliveryFiltersResponse getMarketplaceDeliveryFilterModel() {
        return this.marketplaceDeliveryFilterModel;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final TanpinBannerDataResponse getTanpinBannerModel() {
        return this.tanpinBannerModel;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final PlayerResponse getVideoPlayerModel() {
        return this.videoPlayerModel;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final MarketplaceLimitsResponse getMarketplaceConfigurationViewModel() {
        return this.marketplaceConfigurationViewModel;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final HolidayEventsResponse getHolidayEvents() {
        return this.holidayEvents;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final CasesResponse getCasesModel() {
        return this.casesModel;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final ButtonsConfigResponse getButtonConfig() {
        return this.buttonConfig;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final FractionsDocumentsObjList getFractionDocuments() {
        return this.fractionDocuments;
    }

    @NotNull
    public final List<SkinsDTO> component2() {
        return this.skinsFromJson;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final FractionsShopList getFractionShopList() {
        return this.fractionShopList;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final FractionQuestsObj getFractionQuestsObj() {
        return this.fractionQuestsObj;
    }

    @NotNull
    public final List<ProductDetailsItem> component22() {
        return this.productDetailsState;
    }

    @NotNull
    public final List<DonateItem> component23() {
        return this.donateItemsFromJson;
    }

    @NotNull
    public final List<CarColorItem> component24() {
        return this.carColorItems;
    }

    @NotNull
    /* renamed from: component25, reason: from getter */
    public final BlackPassItems getBlackPassItemsFromJson() {
        return this.blackPassItemsFromJson;
    }

    @NotNull
    /* renamed from: component26, reason: from getter */
    public final SmiList getSmiListFromJson() {
        return this.smiListFromJson;
    }

    @NotNull
    public final List<SmiEditorBodyObj> component27() {
        return this.smiEditorBodyFromJson;
    }

    @NotNull
    public final List<TuneObj> component28() {
        return this.tuneObjItemsFromJson;
    }

    @NotNull
    public final List<TuneGuiScreenObj> component29() {
        return this.tuneGuiScreensFromJsonObj;
    }

    @NotNull
    public final List<VehiclesDTO> component3() {
        return this.vehiclesFromJson;
    }

    @NotNull
    public final List<TuneVinylsObj> component30() {
        return this.tuneVinylsObjFromJson;
    }

    @NotNull
    public final List<SocialInteraction> component4() {
        return this.socialInteractionsFromJson;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final FamilySystemList getFamilySystemListFromJson() {
        return this.familySystemListFromJson;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CalendarResponse getCalendarModel() {
        return this.calendarModel;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BpRewardsResponse getBpRewardsModel() {
        return this.bpRewardsModel;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CraftItemsJsonResponse getCraftItemsModel() {
        return this.craftItemsModel;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final CraftCategoriesResponse getCraftCategoriesModel() {
        return this.craftCategoriesModel;
    }

    @NotNull
    public final ConfigurationJsonModel copy(@NotNull List<InvItems> invItemsFromJson, @NotNull List<SkinsDTO> skinsFromJson, @NotNull List<VehiclesDTO> vehiclesFromJson, @NotNull List<SocialInteraction> socialInteractionsFromJson, @NotNull FamilySystemList familySystemListFromJson, @NotNull CalendarResponse calendarModel, @NotNull BpRewardsResponse bpRewardsModel, @NotNull CraftItemsJsonResponse craftItemsModel, @NotNull CraftCategoriesResponse craftCategoriesModel, @NotNull CommonFilterCategoriesResponse craftCategoriesFilterModel, @NotNull CommonFilterCategoriesResponse marketplaceCategoriesFilterModel, @NotNull MarketDeliveryFiltersResponse marketplaceDeliveryFilterModel, @NotNull TanpinBannerDataResponse tanpinBannerModel, @NotNull PlayerResponse videoPlayerModel, @NotNull MarketplaceLimitsResponse marketplaceConfigurationViewModel, @NotNull HolidayEventsResponse holidayEvents, @NotNull CasesResponse casesModel, @NotNull ButtonsConfigResponse buttonConfig, @NotNull FractionsDocumentsObjList fractionDocuments, @NotNull FractionsShopList fractionShopList, @NotNull FractionQuestsObj fractionQuestsObj, @NotNull List<ProductDetailsItem> productDetailsState, @NotNull List<DonateItem> donateItemsFromJson, @NotNull List<CarColorItem> carColorItems, @NotNull BlackPassItems blackPassItemsFromJson, @NotNull SmiList smiListFromJson, @NotNull List<SmiEditorBodyObj> smiEditorBodyFromJson, @NotNull List<TuneObj> tuneObjItemsFromJson, @NotNull List<TuneGuiScreenObj> tuneGuiScreensFromJsonObj, @NotNull List<TuneVinylsObj> tuneVinylsObjFromJson) {
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(skinsFromJson, "skinsFromJson");
        Intrinsics.checkNotNullParameter(vehiclesFromJson, "vehiclesFromJson");
        Intrinsics.checkNotNullParameter(socialInteractionsFromJson, "socialInteractionsFromJson");
        Intrinsics.checkNotNullParameter(familySystemListFromJson, "familySystemListFromJson");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(bpRewardsModel, "bpRewardsModel");
        Intrinsics.checkNotNullParameter(craftItemsModel, "craftItemsModel");
        Intrinsics.checkNotNullParameter(craftCategoriesModel, "craftCategoriesModel");
        Intrinsics.checkNotNullParameter(craftCategoriesFilterModel, "craftCategoriesFilterModel");
        Intrinsics.checkNotNullParameter(marketplaceCategoriesFilterModel, "marketplaceCategoriesFilterModel");
        Intrinsics.checkNotNullParameter(marketplaceDeliveryFilterModel, "marketplaceDeliveryFilterModel");
        Intrinsics.checkNotNullParameter(tanpinBannerModel, "tanpinBannerModel");
        Intrinsics.checkNotNullParameter(videoPlayerModel, "videoPlayerModel");
        Intrinsics.checkNotNullParameter(marketplaceConfigurationViewModel, "marketplaceConfigurationViewModel");
        Intrinsics.checkNotNullParameter(holidayEvents, "holidayEvents");
        Intrinsics.checkNotNullParameter(casesModel, "casesModel");
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        Intrinsics.checkNotNullParameter(fractionDocuments, "fractionDocuments");
        Intrinsics.checkNotNullParameter(fractionShopList, "fractionShopList");
        Intrinsics.checkNotNullParameter(fractionQuestsObj, "fractionQuestsObj");
        Intrinsics.checkNotNullParameter(productDetailsState, "productDetailsState");
        Intrinsics.checkNotNullParameter(donateItemsFromJson, "donateItemsFromJson");
        Intrinsics.checkNotNullParameter(carColorItems, "carColorItems");
        Intrinsics.checkNotNullParameter(blackPassItemsFromJson, "blackPassItemsFromJson");
        Intrinsics.checkNotNullParameter(smiListFromJson, "smiListFromJson");
        Intrinsics.checkNotNullParameter(smiEditorBodyFromJson, "smiEditorBodyFromJson");
        Intrinsics.checkNotNullParameter(tuneObjItemsFromJson, "tuneObjItemsFromJson");
        Intrinsics.checkNotNullParameter(tuneGuiScreensFromJsonObj, "tuneGuiScreensFromJsonObj");
        Intrinsics.checkNotNullParameter(tuneVinylsObjFromJson, "tuneVinylsObjFromJson");
        return new ConfigurationJsonModel(invItemsFromJson, skinsFromJson, vehiclesFromJson, socialInteractionsFromJson, familySystemListFromJson, calendarModel, bpRewardsModel, craftItemsModel, craftCategoriesModel, craftCategoriesFilterModel, marketplaceCategoriesFilterModel, marketplaceDeliveryFilterModel, tanpinBannerModel, videoPlayerModel, marketplaceConfigurationViewModel, holidayEvents, casesModel, buttonConfig, fractionDocuments, fractionShopList, fractionQuestsObj, productDetailsState, donateItemsFromJson, carColorItems, blackPassItemsFromJson, smiListFromJson, smiEditorBodyFromJson, tuneObjItemsFromJson, tuneGuiScreensFromJsonObj, tuneVinylsObjFromJson);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurationJsonModel)) {
            return false;
        }
        ConfigurationJsonModel configurationJsonModel = (ConfigurationJsonModel) other;
        return Intrinsics.areEqual(this.invItemsFromJson, configurationJsonModel.invItemsFromJson) && Intrinsics.areEqual(this.skinsFromJson, configurationJsonModel.skinsFromJson) && Intrinsics.areEqual(this.vehiclesFromJson, configurationJsonModel.vehiclesFromJson) && Intrinsics.areEqual(this.socialInteractionsFromJson, configurationJsonModel.socialInteractionsFromJson) && Intrinsics.areEqual(this.familySystemListFromJson, configurationJsonModel.familySystemListFromJson) && Intrinsics.areEqual(this.calendarModel, configurationJsonModel.calendarModel) && Intrinsics.areEqual(this.bpRewardsModel, configurationJsonModel.bpRewardsModel) && Intrinsics.areEqual(this.craftItemsModel, configurationJsonModel.craftItemsModel) && Intrinsics.areEqual(this.craftCategoriesModel, configurationJsonModel.craftCategoriesModel) && Intrinsics.areEqual(this.craftCategoriesFilterModel, configurationJsonModel.craftCategoriesFilterModel) && Intrinsics.areEqual(this.marketplaceCategoriesFilterModel, configurationJsonModel.marketplaceCategoriesFilterModel) && Intrinsics.areEqual(this.marketplaceDeliveryFilterModel, configurationJsonModel.marketplaceDeliveryFilterModel) && Intrinsics.areEqual(this.tanpinBannerModel, configurationJsonModel.tanpinBannerModel) && Intrinsics.areEqual(this.videoPlayerModel, configurationJsonModel.videoPlayerModel) && Intrinsics.areEqual(this.marketplaceConfigurationViewModel, configurationJsonModel.marketplaceConfigurationViewModel) && Intrinsics.areEqual(this.holidayEvents, configurationJsonModel.holidayEvents) && Intrinsics.areEqual(this.casesModel, configurationJsonModel.casesModel) && Intrinsics.areEqual(this.buttonConfig, configurationJsonModel.buttonConfig) && Intrinsics.areEqual(this.fractionDocuments, configurationJsonModel.fractionDocuments) && Intrinsics.areEqual(this.fractionShopList, configurationJsonModel.fractionShopList) && Intrinsics.areEqual(this.fractionQuestsObj, configurationJsonModel.fractionQuestsObj) && Intrinsics.areEqual(this.productDetailsState, configurationJsonModel.productDetailsState) && Intrinsics.areEqual(this.donateItemsFromJson, configurationJsonModel.donateItemsFromJson) && Intrinsics.areEqual(this.carColorItems, configurationJsonModel.carColorItems) && Intrinsics.areEqual(this.blackPassItemsFromJson, configurationJsonModel.blackPassItemsFromJson) && Intrinsics.areEqual(this.smiListFromJson, configurationJsonModel.smiListFromJson) && Intrinsics.areEqual(this.smiEditorBodyFromJson, configurationJsonModel.smiEditorBodyFromJson) && Intrinsics.areEqual(this.tuneObjItemsFromJson, configurationJsonModel.tuneObjItemsFromJson) && Intrinsics.areEqual(this.tuneGuiScreensFromJsonObj, configurationJsonModel.tuneGuiScreensFromJsonObj) && Intrinsics.areEqual(this.tuneVinylsObjFromJson, configurationJsonModel.tuneVinylsObjFromJson);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.invItemsFromJson.hashCode() * 31) + this.skinsFromJson.hashCode()) * 31) + this.vehiclesFromJson.hashCode()) * 31) + this.socialInteractionsFromJson.hashCode()) * 31) + this.familySystemListFromJson.hashCode()) * 31) + this.calendarModel.hashCode()) * 31) + this.bpRewardsModel.hashCode()) * 31) + this.craftItemsModel.hashCode()) * 31) + this.craftCategoriesModel.hashCode()) * 31) + this.craftCategoriesFilterModel.hashCode()) * 31) + this.marketplaceCategoriesFilterModel.hashCode()) * 31) + this.marketplaceDeliveryFilterModel.hashCode()) * 31) + this.tanpinBannerModel.hashCode()) * 31) + this.videoPlayerModel.hashCode()) * 31) + this.marketplaceConfigurationViewModel.hashCode()) * 31) + this.holidayEvents.hashCode()) * 31) + this.casesModel.hashCode()) * 31) + this.buttonConfig.hashCode()) * 31) + this.fractionDocuments.hashCode()) * 31) + this.fractionShopList.hashCode()) * 31) + this.fractionQuestsObj.hashCode()) * 31) + this.productDetailsState.hashCode()) * 31) + this.donateItemsFromJson.hashCode()) * 31) + this.carColorItems.hashCode()) * 31) + this.blackPassItemsFromJson.hashCode()) * 31) + this.smiListFromJson.hashCode()) * 31) + this.smiEditorBodyFromJson.hashCode()) * 31) + this.tuneObjItemsFromJson.hashCode()) * 31) + this.tuneGuiScreensFromJsonObj.hashCode()) * 31) + this.tuneVinylsObjFromJson.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigurationJsonModel(invItemsFromJson=" + this.invItemsFromJson + ", skinsFromJson=" + this.skinsFromJson + ", vehiclesFromJson=" + this.vehiclesFromJson + ", socialInteractionsFromJson=" + this.socialInteractionsFromJson + ", familySystemListFromJson=" + this.familySystemListFromJson + ", calendarModel=" + this.calendarModel + ", bpRewardsModel=" + this.bpRewardsModel + ", craftItemsModel=" + this.craftItemsModel + ", craftCategoriesModel=" + this.craftCategoriesModel + ", craftCategoriesFilterModel=" + this.craftCategoriesFilterModel + ", marketplaceCategoriesFilterModel=" + this.marketplaceCategoriesFilterModel + ", marketplaceDeliveryFilterModel=" + this.marketplaceDeliveryFilterModel + ", tanpinBannerModel=" + this.tanpinBannerModel + ", videoPlayerModel=" + this.videoPlayerModel + ", marketplaceConfigurationViewModel=" + this.marketplaceConfigurationViewModel + ", holidayEvents=" + this.holidayEvents + ", casesModel=" + this.casesModel + ", buttonConfig=" + this.buttonConfig + ", fractionDocuments=" + this.fractionDocuments + ", fractionShopList=" + this.fractionShopList + ", fractionQuestsObj=" + this.fractionQuestsObj + ", productDetailsState=" + this.productDetailsState + ", donateItemsFromJson=" + this.donateItemsFromJson + ", carColorItems=" + this.carColorItems + ", blackPassItemsFromJson=" + this.blackPassItemsFromJson + ", smiListFromJson=" + this.smiListFromJson + ", smiEditorBodyFromJson=" + this.smiEditorBodyFromJson + ", tuneObjItemsFromJson=" + this.tuneObjItemsFromJson + ", tuneGuiScreensFromJsonObj=" + this.tuneGuiScreensFromJsonObj + ", tuneVinylsObjFromJson=" + this.tuneVinylsObjFromJson + ")";
    }

    public ConfigurationJsonModel(@NotNull List<InvItems> invItemsFromJson, @NotNull List<SkinsDTO> skinsFromJson, @NotNull List<VehiclesDTO> vehiclesFromJson, @NotNull List<SocialInteraction> socialInteractionsFromJson, @NotNull FamilySystemList familySystemListFromJson, @NotNull CalendarResponse calendarModel, @NotNull BpRewardsResponse bpRewardsModel, @NotNull CraftItemsJsonResponse craftItemsModel, @NotNull CraftCategoriesResponse craftCategoriesModel, @NotNull CommonFilterCategoriesResponse craftCategoriesFilterModel, @NotNull CommonFilterCategoriesResponse marketplaceCategoriesFilterModel, @NotNull MarketDeliveryFiltersResponse marketplaceDeliveryFilterModel, @NotNull TanpinBannerDataResponse tanpinBannerModel, @NotNull PlayerResponse videoPlayerModel, @NotNull MarketplaceLimitsResponse marketplaceConfigurationViewModel, @NotNull HolidayEventsResponse holidayEvents, @NotNull CasesResponse casesModel, @NotNull ButtonsConfigResponse buttonConfig, @NotNull FractionsDocumentsObjList fractionDocuments, @NotNull FractionsShopList fractionShopList, @NotNull FractionQuestsObj fractionQuestsObj, @NotNull List<ProductDetailsItem> productDetailsState, @NotNull List<DonateItem> donateItemsFromJson, @NotNull List<CarColorItem> carColorItems, @NotNull BlackPassItems blackPassItemsFromJson, @NotNull SmiList smiListFromJson, @NotNull List<SmiEditorBodyObj> smiEditorBodyFromJson, @NotNull List<TuneObj> tuneObjItemsFromJson, @NotNull List<TuneGuiScreenObj> tuneGuiScreensFromJsonObj, @NotNull List<TuneVinylsObj> tuneVinylsObjFromJson) {
        Intrinsics.checkNotNullParameter(invItemsFromJson, "invItemsFromJson");
        Intrinsics.checkNotNullParameter(skinsFromJson, "skinsFromJson");
        Intrinsics.checkNotNullParameter(vehiclesFromJson, "vehiclesFromJson");
        Intrinsics.checkNotNullParameter(socialInteractionsFromJson, "socialInteractionsFromJson");
        Intrinsics.checkNotNullParameter(familySystemListFromJson, "familySystemListFromJson");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(bpRewardsModel, "bpRewardsModel");
        Intrinsics.checkNotNullParameter(craftItemsModel, "craftItemsModel");
        Intrinsics.checkNotNullParameter(craftCategoriesModel, "craftCategoriesModel");
        Intrinsics.checkNotNullParameter(craftCategoriesFilterModel, "craftCategoriesFilterModel");
        Intrinsics.checkNotNullParameter(marketplaceCategoriesFilterModel, "marketplaceCategoriesFilterModel");
        Intrinsics.checkNotNullParameter(marketplaceDeliveryFilterModel, "marketplaceDeliveryFilterModel");
        Intrinsics.checkNotNullParameter(tanpinBannerModel, "tanpinBannerModel");
        Intrinsics.checkNotNullParameter(videoPlayerModel, "videoPlayerModel");
        Intrinsics.checkNotNullParameter(marketplaceConfigurationViewModel, "marketplaceConfigurationViewModel");
        Intrinsics.checkNotNullParameter(holidayEvents, "holidayEvents");
        Intrinsics.checkNotNullParameter(casesModel, "casesModel");
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        Intrinsics.checkNotNullParameter(fractionDocuments, "fractionDocuments");
        Intrinsics.checkNotNullParameter(fractionShopList, "fractionShopList");
        Intrinsics.checkNotNullParameter(fractionQuestsObj, "fractionQuestsObj");
        Intrinsics.checkNotNullParameter(productDetailsState, "productDetailsState");
        Intrinsics.checkNotNullParameter(donateItemsFromJson, "donateItemsFromJson");
        Intrinsics.checkNotNullParameter(carColorItems, "carColorItems");
        Intrinsics.checkNotNullParameter(blackPassItemsFromJson, "blackPassItemsFromJson");
        Intrinsics.checkNotNullParameter(smiListFromJson, "smiListFromJson");
        Intrinsics.checkNotNullParameter(smiEditorBodyFromJson, "smiEditorBodyFromJson");
        Intrinsics.checkNotNullParameter(tuneObjItemsFromJson, "tuneObjItemsFromJson");
        Intrinsics.checkNotNullParameter(tuneGuiScreensFromJsonObj, "tuneGuiScreensFromJsonObj");
        Intrinsics.checkNotNullParameter(tuneVinylsObjFromJson, "tuneVinylsObjFromJson");
        this.invItemsFromJson = invItemsFromJson;
        this.skinsFromJson = skinsFromJson;
        this.vehiclesFromJson = vehiclesFromJson;
        this.socialInteractionsFromJson = socialInteractionsFromJson;
        this.familySystemListFromJson = familySystemListFromJson;
        this.calendarModel = calendarModel;
        this.bpRewardsModel = bpRewardsModel;
        this.craftItemsModel = craftItemsModel;
        this.craftCategoriesModel = craftCategoriesModel;
        this.craftCategoriesFilterModel = craftCategoriesFilterModel;
        this.marketplaceCategoriesFilterModel = marketplaceCategoriesFilterModel;
        this.marketplaceDeliveryFilterModel = marketplaceDeliveryFilterModel;
        this.tanpinBannerModel = tanpinBannerModel;
        this.videoPlayerModel = videoPlayerModel;
        this.marketplaceConfigurationViewModel = marketplaceConfigurationViewModel;
        this.holidayEvents = holidayEvents;
        this.casesModel = casesModel;
        this.buttonConfig = buttonConfig;
        this.fractionDocuments = fractionDocuments;
        this.fractionShopList = fractionShopList;
        this.fractionQuestsObj = fractionQuestsObj;
        this.productDetailsState = productDetailsState;
        this.donateItemsFromJson = donateItemsFromJson;
        this.carColorItems = carColorItems;
        this.blackPassItemsFromJson = blackPassItemsFromJson;
        this.smiListFromJson = smiListFromJson;
        this.smiEditorBodyFromJson = smiEditorBodyFromJson;
        this.tuneObjItemsFromJson = tuneObjItemsFromJson;
        this.tuneGuiScreensFromJsonObj = tuneGuiScreensFromJsonObj;
        this.tuneVinylsObjFromJson = tuneVinylsObjFromJson;
    }

    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    public /* synthetic */ ConfigurationJsonModel(List list, List list2, List list3, List list4, FamilySystemList familySystemList, CalendarResponse calendarResponse, BpRewardsResponse bpRewardsResponse, CraftItemsJsonResponse craftItemsJsonResponse, CraftCategoriesResponse craftCategoriesResponse, CommonFilterCategoriesResponse commonFilterCategoriesResponse, CommonFilterCategoriesResponse commonFilterCategoriesResponse2, MarketDeliveryFiltersResponse marketDeliveryFiltersResponse, TanpinBannerDataResponse tanpinBannerDataResponse, PlayerResponse playerResponse, MarketplaceLimitsResponse marketplaceLimitsResponse, HolidayEventsResponse holidayEventsResponse, CasesResponse casesResponse, ButtonsConfigResponse buttonsConfigResponse, FractionsDocumentsObjList fractionsDocumentsObjList, FractionsShopList fractionsShopList, FractionQuestsObj fractionQuestsObj, List list5, List list6, List list7, BlackPassItems blackPassItems, SmiList smiList, List list8, List list9, List list10, List list11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TanpinBannerDataResponse tanpinBannerDataResponse2;
        PlayerResponse playerResponse2;
        MarketplaceLimitsResponse marketplaceLimitsResponse2;
        MarketplaceLimitsResponse marketplaceLimitsResponse3;
        HolidayEventsResponse holidayEventsResponse2;
        CasesResponse casesResponse2;
        ?? r9;
        ButtonsConfigResponse buttonsConfigResponse2;
        ButtonsConfigResponse buttonsConfigResponse3;
        FractionsDocumentsObjList fractionsDocumentsObjList2;
        FractionsDocumentsObjList fractionsDocumentsObjList3;
        MarketDeliveryFiltersResponse marketDeliveryFiltersResponse2;
        FractionsShopList fractionsShopList2;
        List listEmptyList = (i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2;
        List listEmptyList3 = (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3;
        List listEmptyList4 = (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4;
        FamilySystemList familySystemList2 = (i & 16) != 0 ? new FamilySystemList(null, null, null, null, null, 31, null) : familySystemList;
        CalendarResponse calendarResponse2 = (i & 32) != 0 ? new CalendarResponse(null, null, null, null, null, null, null, 127, null) : calendarResponse;
        BpRewardsResponse bpRewardsResponse2 = (i & 64) != 0 ? new BpRewardsResponse(null, 1, null) : bpRewardsResponse;
        CraftItemsJsonResponse craftItemsJsonResponse2 = (i & 128) != 0 ? new CraftItemsJsonResponse(null, null, 3, null) : craftItemsJsonResponse;
        CraftCategoriesResponse craftCategoriesResponse2 = (i & 256) != 0 ? new CraftCategoriesResponse(null, 1, null) : craftCategoriesResponse;
        CommonFilterCategoriesResponse commonFilterCategoriesResponse3 = (i & 512) != 0 ? new CommonFilterCategoriesResponse(null, 1, null) : commonFilterCategoriesResponse;
        CommonFilterCategoriesResponse commonFilterCategoriesResponse4 = (i & 1024) != 0 ? new CommonFilterCategoriesResponse(null, 1, null) : commonFilterCategoriesResponse2;
        MarketDeliveryFiltersResponse marketDeliveryFiltersResponse3 = (i & 2048) != 0 ? new MarketDeliveryFiltersResponse(null, 1, null) : marketDeliveryFiltersResponse;
        TanpinBannerDataResponse tanpinBannerDataResponse3 = (i & 4096) != 0 ? new TanpinBannerDataResponse(null, null, 3, null) : tanpinBannerDataResponse;
        PlayerResponse playerResponse3 = (i & 8192) != 0 ? new PlayerResponse(0.0f, 0.0f, null, 7, null) : playerResponse;
        if ((i & 16384) != 0) {
            tanpinBannerDataResponse2 = tanpinBannerDataResponse3;
            playerResponse2 = playerResponse3;
            marketplaceLimitsResponse2 = new MarketplaceLimitsResponse(null, 1, null);
        } else {
            tanpinBannerDataResponse2 = tanpinBannerDataResponse3;
            playerResponse2 = playerResponse3;
            marketplaceLimitsResponse2 = marketplaceLimitsResponse;
        }
        HolidayEventsResponse holidayEventsResponse3 = (32768 & i) != 0 ? new HolidayEventsResponse(null, null, null, null, null, null, null, null, 255, null) : holidayEventsResponse;
        CasesResponse casesResponse3 = (65536 & i) != 0 ? new CasesResponse(null, null, null, 7, null) : casesResponse;
        if ((i & 131072) != 0) {
            casesResponse2 = casesResponse3;
            marketplaceLimitsResponse3 = marketplaceLimitsResponse2;
            holidayEventsResponse2 = holidayEventsResponse3;
            r9 = 0;
            buttonsConfigResponse2 = new ButtonsConfigResponse(null, null, 3, null);
        } else {
            marketplaceLimitsResponse3 = marketplaceLimitsResponse2;
            holidayEventsResponse2 = holidayEventsResponse3;
            casesResponse2 = casesResponse3;
            r9 = 0;
            buttonsConfigResponse2 = buttonsConfigResponse;
        }
        if ((262144 & i) != 0) {
            buttonsConfigResponse3 = buttonsConfigResponse2;
            fractionsDocumentsObjList2 = new FractionsDocumentsObjList(r9, 1, r9);
        } else {
            buttonsConfigResponse3 = buttonsConfigResponse2;
            fractionsDocumentsObjList2 = fractionsDocumentsObjList;
        }
        if ((524288 & i) != 0) {
            fractionsDocumentsObjList3 = fractionsDocumentsObjList2;
            marketDeliveryFiltersResponse2 = marketDeliveryFiltersResponse3;
            fractionsShopList2 = new FractionsShopList(r9, 0, 3, r9);
        } else {
            fractionsDocumentsObjList3 = fractionsDocumentsObjList2;
            marketDeliveryFiltersResponse2 = marketDeliveryFiltersResponse3;
            fractionsShopList2 = fractionsShopList;
        }
        this(listEmptyList, listEmptyList2, listEmptyList3, listEmptyList4, familySystemList2, calendarResponse2, bpRewardsResponse2, craftItemsJsonResponse2, craftCategoriesResponse2, commonFilterCategoriesResponse3, commonFilterCategoriesResponse4, marketDeliveryFiltersResponse2, tanpinBannerDataResponse2, playerResponse2, marketplaceLimitsResponse3, holidayEventsResponse2, casesResponse2, buttonsConfigResponse3, fractionsDocumentsObjList3, fractionsShopList2, (1048576 & i) != 0 ? new FractionQuestsObj(r9, 1, r9) : fractionQuestsObj, (2097152 & i) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (4194304 & i) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i & 8388608) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i & 16777216) != 0 ? new BlackPassItems(null, null, null, null, null, 31, null) : blackPassItems, (i & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? new SmiList(null, null, null, null, null, null, 63, null) : smiList, (i & 67108864) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8, (i & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list9, (i & 268435456) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list10, (i & 536870912) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list11);
    }

    @NotNull
    public final List<InvItems> getInvItemsFromJson() {
        return this.invItemsFromJson;
    }

    @NotNull
    public final List<SkinsDTO> getSkinsFromJson() {
        return this.skinsFromJson;
    }

    @NotNull
    public final List<VehiclesDTO> getVehiclesFromJson() {
        return this.vehiclesFromJson;
    }

    @NotNull
    public final List<SocialInteraction> getSocialInteractionsFromJson() {
        return this.socialInteractionsFromJson;
    }

    @NotNull
    public final FamilySystemList getFamilySystemListFromJson() {
        return this.familySystemListFromJson;
    }

    @NotNull
    public final CalendarResponse getCalendarModel() {
        return this.calendarModel;
    }

    @NotNull
    public final BpRewardsResponse getBpRewardsModel() {
        return this.bpRewardsModel;
    }

    @NotNull
    public final CraftItemsJsonResponse getCraftItemsModel() {
        return this.craftItemsModel;
    }

    @NotNull
    public final CraftCategoriesResponse getCraftCategoriesModel() {
        return this.craftCategoriesModel;
    }

    @NotNull
    public final CommonFilterCategoriesResponse getCraftCategoriesFilterModel() {
        return this.craftCategoriesFilterModel;
    }

    @NotNull
    public final CommonFilterCategoriesResponse getMarketplaceCategoriesFilterModel() {
        return this.marketplaceCategoriesFilterModel;
    }

    @NotNull
    public final MarketDeliveryFiltersResponse getMarketplaceDeliveryFilterModel() {
        return this.marketplaceDeliveryFilterModel;
    }

    @NotNull
    public final TanpinBannerDataResponse getTanpinBannerModel() {
        return this.tanpinBannerModel;
    }

    @NotNull
    public final PlayerResponse getVideoPlayerModel() {
        return this.videoPlayerModel;
    }

    @NotNull
    public final MarketplaceLimitsResponse getMarketplaceConfigurationViewModel() {
        return this.marketplaceConfigurationViewModel;
    }

    @NotNull
    public final HolidayEventsResponse getHolidayEvents() {
        return this.holidayEvents;
    }

    @NotNull
    public final CasesResponse getCasesModel() {
        return this.casesModel;
    }

    @NotNull
    public final ButtonsConfigResponse getButtonConfig() {
        return this.buttonConfig;
    }

    @NotNull
    public final FractionsDocumentsObjList getFractionDocuments() {
        return this.fractionDocuments;
    }

    @NotNull
    public final FractionsShopList getFractionShopList() {
        return this.fractionShopList;
    }

    @NotNull
    public final FractionQuestsObj getFractionQuestsObj() {
        return this.fractionQuestsObj;
    }

    @NotNull
    public final List<ProductDetailsItem> getProductDetailsState() {
        return this.productDetailsState;
    }

    @NotNull
    public final List<DonateItem> getDonateItemsFromJson() {
        return this.donateItemsFromJson;
    }

    @NotNull
    public final List<CarColorItem> getCarColorItems() {
        return this.carColorItems;
    }

    @NotNull
    public final BlackPassItems getBlackPassItemsFromJson() {
        return this.blackPassItemsFromJson;
    }

    @NotNull
    public final SmiList getSmiListFromJson() {
        return this.smiListFromJson;
    }

    @NotNull
    public final List<SmiEditorBodyObj> getSmiEditorBodyFromJson() {
        return this.smiEditorBodyFromJson;
    }

    @NotNull
    public final List<TuneObj> getTuneObjItemsFromJson() {
        return this.tuneObjItemsFromJson;
    }

    @NotNull
    public final List<TuneGuiScreenObj> getTuneGuiScreensFromJsonObj() {
        return this.tuneGuiScreensFromJsonObj;
    }

    @NotNull
    public final List<TuneVinylsObj> getTuneVinylsObjFromJson() {
        return this.tuneVinylsObjFromJson;
    }
}
