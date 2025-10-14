package com.blackhub.bronline.game.gui.marketplace.model;

import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.FloatExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.FormatUtilsKt;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.cases.model.CaseRenderAttachment;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.marketplace.MarketplaceKeys;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceNotificationEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceRarityEnum;
import com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceTypeProductCardEnum;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MarketplaceProduct.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a[\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a$\u0010\u0013\u001a\u00020\b*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017¨\u0006\u0018"}, m7105d2 = {"getMarketplaceRenderInfo", "Lcom/blackhub/bronline/game/gui/cases/model/CaseRenderAttachment;", "invItem", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", CatchStreamerKeys.COUNT_KEY, "", "mapToMarketplaceProducts", "", "Lcom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProduct;", "Lorg/json/JSONArray;", "inventoryItems", "isPublished", "", "isUser", "isHaveLike", "timePlacement", "cardTypeInventory", "Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceTypeProductCardEnum;", "(Lorg/json/JSONArray;Ljava/util/List;ZZLjava/lang/Boolean;Ljava/lang/Integer;Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceTypeProductCardEnum;)Ljava/util/List;", "toMarketplaceProduct", "rarity", "Lcom/blackhub/bronline/game/gui/marketplace/enums/MarketplaceRarityEnum;", "name", "", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMarketplaceProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketplaceProduct.kt\ncom/blackhub/bronline/game/gui/marketplace/model/MarketplaceProductKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
/* loaded from: classes3.dex */
public final class MarketplaceProductKt {
    /* JADX WARN: Removed duplicated region for block: B:125:0x006f A[PHI: r9
  0x006f: PHI (r9v10 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum) = 
  (r9v5 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum)
  (r9v6 com.blackhub.bronline.game.gui.marketplace.enums.MarketplaceHistoryStatusEnum)
 binds: [B:124:0x006d, B:127:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x01d4  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<MarketplaceProduct> mapToMarketplaceProducts(@NotNull JSONArray jSONArray, @NotNull List<InvItems> list, boolean z, boolean z2, @Nullable Boolean bool, @Nullable Integer num, @Nullable MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum) {
        Pair pairM7112to;
        MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum;
        Object next;
        int i;
        MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum2;
        boolean z3;
        Pair<Integer, Integer> pairConvertSecondsToDHM;
        int i2;
        int iOptInt;
        MarketplaceRarityEnum marketplaceRarityEnum;
        Integer type;
        int i3;
        JSONArray jSONArray2 = jSONArray;
        List<InvItems> inventoryItems = list;
        Intrinsics.checkNotNullParameter(jSONArray2, "<this>");
        Intrinsics.checkNotNullParameter(inventoryItems, "inventoryItems");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i4 = 0;
        while (i4 < length) {
            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i4);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            int iOptInt2 = jSONObjectOptJSONObject.optInt("id");
            int iOptInt3 = jSONObjectOptJSONObject.optInt("tp");
            MarketplaceNotificationEnum marketplaceNotificationEnum = MarketplaceNotificationEnum.HOT;
            if (iOptInt3 == marketplaceNotificationEnum.getValue()) {
                pairM7112to = TuplesKt.m7112to(marketplaceNotificationEnum, MarketplaceTypeProductCardEnum.HOT);
            } else {
                MarketplaceNotificationEnum marketplaceNotificationEnum2 = MarketplaceNotificationEnum.THE_BEST;
                pairM7112to = iOptInt3 == marketplaceNotificationEnum2.getValue() ? TuplesKt.m7112to(marketplaceNotificationEnum2, MarketplaceTypeProductCardEnum.BEST) : TuplesKt.m7112to(MarketplaceNotificationEnum.NOTHING, MarketplaceTypeProductCardEnum.IN_STOCK);
            }
            MarketplaceNotificationEnum marketplaceNotificationEnum3 = (MarketplaceNotificationEnum) pairM7112to.component1();
            MarketplaceTypeProductCardEnum marketplaceTypeProductCardEnum3 = (MarketplaceTypeProductCardEnum) pairM7112to.component2();
            MarketplaceHistoryStatusEnum marketplaceHistoryStatusEnum2 = MarketplaceHistoryStatusEnum.PURCHASED;
            if (iOptInt3 == marketplaceHistoryStatusEnum2.getValue()) {
                marketplaceHistoryStatusEnum = marketplaceHistoryStatusEnum2;
            } else {
                marketplaceHistoryStatusEnum2 = MarketplaceHistoryStatusEnum.SOLD;
                if (iOptInt3 != marketplaceHistoryStatusEnum2.getValue()) {
                    marketplaceHistoryStatusEnum = MarketplaceHistoryStatusEnum.NOTHING;
                }
            }
            int iOptInt4 = jSONObjectOptJSONObject.optInt("tm");
            long jOptInt = jSONObjectOptJSONObject.optInt("ti");
            int iOptInt5 = jSONObjectOptJSONObject.optInt("md");
            long jOptInt2 = jSONObjectOptJSONObject.optInt("cs");
            int iOptInt6 = jSONObjectOptJSONObject.optInt("ct", 1);
            Iterator<T> it = inventoryItems.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InvItems) next).getId() == iOptInt5) {
                    break;
                }
            }
            InvItems invItems = (InvItems) next;
            if (invItems != null) {
                String strEmpty = (String) UtilsKt.buildTypeMerge(invItems.get_name(), invItems.get_nameStore());
                if (strEmpty == null) {
                    strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                }
                String strOptString = jSONObjectOptJSONObject.optString(MarketplaceKeys.MARKETPLACE_PRODUCTS_NAME_KEY, strEmpty);
                String imageName = invItems.getImageName();
                if (imageName == null) {
                    imageName = "";
                }
                CaseRenderAttachment marketplaceRenderInfo = getMarketplaceRenderInfo(invItems, iOptInt6);
                if (num != null) {
                    i = length;
                    marketplaceTypeProductCardEnum2 = marketplaceTypeProductCardEnum3;
                    z3 = false;
                    pairConvertSecondsToDHM = TuplesKt.m7112to(Integer.valueOf(FormatUtilsKt.convertHoursOrDays(num.intValue())), 0);
                    if (pairConvertSecondsToDHM == null) {
                    }
                    int iIntValue = pairConvertSecondsToDHM.component1().intValue();
                    int iIntValue2 = pairConvertSecondsToDHM.component2().intValue();
                    if (num == null) {
                        i2 = num.intValue() < 24 ? R.string.common_hours_short : R.string.common_days_short;
                    } else {
                        i2 = iIntValue2 != 1 ? iIntValue2 != 2 ? R.string.common_days_short : R.string.common_hours_short : R.string.common_min_short;
                    }
                    int i5 = iOptInt5 != 134 ? 1 : iOptInt6;
                    iOptInt = jSONObjectOptJSONObject.optInt("rt", jSONObjectOptJSONObject.optInt("r"));
                    if (iOptInt != 1) {
                        marketplaceRarityEnum = MarketplaceRarityEnum.COMMON;
                    } else if (iOptInt == 2) {
                        marketplaceRarityEnum = MarketplaceRarityEnum.UNCOMMON;
                    } else if (iOptInt == 3) {
                        marketplaceRarityEnum = MarketplaceRarityEnum.RARE;
                    } else if (iOptInt == 4) {
                        marketplaceRarityEnum = MarketplaceRarityEnum.EPIC;
                    } else if (iOptInt == 5) {
                        marketplaceRarityEnum = MarketplaceRarityEnum.LEGENDARY;
                    } else {
                        marketplaceRarityEnum = MarketplaceRarityEnum.COMMON;
                    }
                    type = invItems.getType();
                    if (type != null && type.intValue() == 1) {
                        i3 = R.string.common_material;
                    } else if (type != null && type.intValue() == 2) {
                        i3 = R.string.common_accessory;
                    } else {
                        i3 = (type != null && type.intValue() == 3) ? R.string.common_skin : R.string.common_empty;
                    }
                    int i6 = i3;
                    String desc = invItems.getDesc();
                    double weight = invItems.getWeight();
                    boolean zBooleanValue = bool == null ? bool.booleanValue() : z3;
                    if (marketplaceTypeProductCardEnum != null) {
                        marketplaceTypeProductCardEnum2 = marketplaceTypeProductCardEnum;
                    }
                    Intrinsics.checkNotNull(strOptString);
                    arrayList.add(new MarketplaceProduct(false, strOptString, imageName, marketplaceRarityEnum, marketplaceTypeProductCardEnum2, iOptInt2, marketplaceNotificationEnum3, iOptInt4, iIntValue, i2, iOptInt5, jOptInt2, i5, null, desc, null, weight, i6, marketplaceHistoryStatusEnum, false, z2, z, zBooleanValue, marketplaceRenderInfo, 565249, null));
                } else {
                    i = length;
                    marketplaceTypeProductCardEnum2 = marketplaceTypeProductCardEnum3;
                    z3 = false;
                }
                pairConvertSecondsToDHM = FormatUtilsKt.convertSecondsToDHM(jOptInt);
                int iIntValue3 = pairConvertSecondsToDHM.component1().intValue();
                int iIntValue22 = pairConvertSecondsToDHM.component2().intValue();
                if (num == null) {
                }
                if (iOptInt5 != 134) {
                }
                iOptInt = jSONObjectOptJSONObject.optInt("rt", jSONObjectOptJSONObject.optInt("r"));
                if (iOptInt != 1) {
                }
                type = invItems.getType();
                if (type != null) {
                    i3 = R.string.common_material;
                    int i62 = i3;
                    String desc2 = invItems.getDesc();
                    double weight2 = invItems.getWeight();
                    if (bool == null) {
                    }
                    if (marketplaceTypeProductCardEnum != null) {
                    }
                    Intrinsics.checkNotNull(strOptString);
                    arrayList.add(new MarketplaceProduct(false, strOptString, imageName, marketplaceRarityEnum, marketplaceTypeProductCardEnum2, iOptInt2, marketplaceNotificationEnum3, iOptInt4, iIntValue3, i2, iOptInt5, jOptInt2, i5, null, desc2, null, weight2, i62, marketplaceHistoryStatusEnum, false, z2, z, zBooleanValue, marketplaceRenderInfo, 565249, null));
                }
            } else {
                i = length;
            }
            i4++;
            jSONArray2 = jSONArray;
            inventoryItems = list;
            length = i;
        }
        return arrayList;
    }

    public static /* synthetic */ MarketplaceProduct toMarketplaceProduct$default(InvItems invItems, int i, MarketplaceRarityEnum marketplaceRarityEnum, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return toMarketplaceProduct(invItems, i, marketplaceRarityEnum, str);
    }

    @NotNull
    public static final MarketplaceProduct toMarketplaceProduct(@NotNull InvItems invItems, int i, @NotNull MarketplaceRarityEnum rarity, @NotNull String name) {
        String str;
        Intrinsics.checkNotNullParameter(invItems, "<this>");
        Intrinsics.checkNotNullParameter(rarity, "rarity");
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() == 0) {
            String strEmpty = (String) UtilsKt.buildTypeMerge(invItems.get_name(), invItems.get_nameStore());
            if (strEmpty == null) {
                strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            }
            str = strEmpty;
        } else {
            str = name;
        }
        return new MarketplaceProduct(false, str, null, rarity, null, 0, null, 0, 0, 0, 0, 0L, 0, null, null, null, 0.0d, 0, null, false, false, false, false, getMarketplaceRenderInfo(invItems, i), 8388597, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CaseRenderAttachment getMarketplaceRenderInfo(@NotNull InvItems invItem, int i) {
        int orZero;
        int i2;
        float orOne;
        float orOne2;
        float f;
        float f2;
        int i3;
        float f3;
        Intrinsics.checkNotNullParameter(invItem, "invItem");
        int i4 = 0;
        int i5 = invItem.getId() == 134 ? 2 : 0;
        if (i5 == 0) {
            orZero = IntExtensionKt.getOrZero(Integer.valueOf(invItem.getModelid()));
        } else if (i5 != 2) {
            orZero = invItem.getId();
        } else {
            i2 = i;
            if (i5 == 0) {
                f2 = 0.0f;
                if (i5 != 2) {
                    f3 = 0.78f;
                } else {
                    i4 = 1;
                    f3 = 1.0f;
                }
                orOne2 = 0.0f;
                f = f3;
                i3 = i4;
                orOne = 0.0f;
            } else {
                float orOne3 = FloatExtensionKt.getOrOne(Float.valueOf(invItem.getZoom()));
                float orOne4 = FloatExtensionKt.getOrOne(invItem.get_shiftX());
                orOne = FloatExtensionKt.getOrOne(invItem.get_shiftY());
                orOne2 = FloatExtensionKt.getOrOne(invItem.get_shiftZ());
                f = orOne3;
                f2 = orOne4;
                i3 = 3;
            }
            return new CaseRenderAttachment(i5, i2, i3, f, invItem.get_x(), invItem.get_y(), invItem.get_z(), Float.valueOf(f2), Float.valueOf(orOne), Float.valueOf(orOne2));
        }
        i2 = orZero;
        if (i5 == 0) {
        }
        return new CaseRenderAttachment(i5, i2, i3, f, invItem.get_x(), invItem.get_y(), invItem.get_z(), Float.valueOf(f2), Float.valueOf(orOne), Float.valueOf(orOne2));
    }
}
