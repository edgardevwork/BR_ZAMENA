package com.blackhub.bronline.game.gui.inventory;

import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.gui.inventory.data.InvActionButtonsData;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import com.blackhub.bronline.game.gui.inventory.data.InvMainButtonsData;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InventoryUtils.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\n\n\u0002\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"arrayWithMainActions", "", "", "[Ljava/lang/String;", "arrayWithMainButtons", "getArrayWithMainButtons", "()[Ljava/lang/String;", "listActionButtons", "", "Lcom/blackhub/bronline/game/gui/inventory/data/InvActionButtonsData;", "getListActionButtons", "()Ljava/util/List;", "listButtons", "Lcom/blackhub/bronline/game/gui/inventory/data/InvMainButtonsData;", "getListButtons", "emptyItem", "Lcom/blackhub/bronline/game/gui/inventory/data/InvItems;", "getFinalItem", "migrateItem", "migrateValueOrInit", "", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class InventoryUtilsKt {

    @NotNull
    public static final String[] arrayWithMainActions;

    @NotNull
    public static final String[] arrayWithMainButtons;

    @NotNull
    public static final List<InvActionButtonsData> listActionButtons;

    @NotNull
    public static final List<InvMainButtonsData> listButtons;

    static {
        String[] stringArray = JNIActivity.getContext().getResources().getStringArray(R.array.inv_main_actions);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        arrayWithMainActions = stringArray;
        String[] stringArray2 = JNIActivity.getContext().getResources().getStringArray(R.array.inv_main_buttons);
        Intrinsics.checkNotNullExpressionValue(stringArray2, "getStringArray(...)");
        arrayWithMainButtons = stringArray2;
        listButtons = CollectionsKt__CollectionsKt.listOf((Object[]) new InvMainButtonsData[]{new InvMainButtonsData(0, stringArray2[0], R.drawable.ic_menu), new InvMainButtonsData(1, stringArray2[1], R.drawable.ic_states), new InvMainButtonsData(2, stringArray2[2], R.drawable.ic_donate), new InvMainButtonsData(3, stringArray2[3], R.drawable.ic_radial_menu), new InvMainButtonsData(4, stringArray2[4], R.drawable.ic_calendar), new InvMainButtonsData(14, stringArray2[6], R.drawable.ic_bp_rewards_inventory)});
        listActionButtons = CollectionsKt__CollectionsKt.listOf((Object[]) new InvActionButtonsData[]{new InvActionButtonsData(19, stringArray[0], R.drawable.ic_bug_white), new InvActionButtonsData(7, stringArray[1], R.drawable.ic_exchange), new InvActionButtonsData(9, stringArray[2], R.drawable.ic_delete)});
    }

    @NotNull
    public static final String[] getArrayWithMainButtons() {
        return arrayWithMainButtons;
    }

    @NotNull
    public static final List<InvMainButtonsData> getListButtons() {
        return listButtons;
    }

    @NotNull
    public static final List<InvActionButtonsData> getListActionButtons() {
        return listActionButtons;
    }

    @NotNull
    public static final InvItems emptyItem() {
        Double dValueOf = Double.valueOf(0.0d);
        Float fValueOf = Float.valueOf(0.0f);
        return new InvItems(0, "", "", "", "", 0, dValueOf, dValueOf, 0, fValueOf, fValueOf, fValueOf, fValueOf, fValueOf, fValueOf, fValueOf, null, null, null, 0, "", null, null, null, 15138816, null);
    }

    @NotNull
    public static final InvItems getFinalItem(@NotNull InvItems migrateItem, int i) {
        Intrinsics.checkNotNullParameter(migrateItem, "migrateItem");
        return new InvItems(Integer.valueOf(migrateItem.getId()), migrateItem.get_name(), migrateItem.get_nameStore(), migrateItem.getDesc(), migrateItem.getImageName(), Integer.valueOf(migrateItem.getModelid()), Double.valueOf(migrateItem.getWeight()), Double.valueOf(migrateItem.getAddw()), Integer.valueOf(migrateItem.getFold()), Float.valueOf(migrateItem.getShiftX()), Float.valueOf(migrateItem.getShiftY()), Float.valueOf(migrateItem.getShiftZ()), Float.valueOf(migrateItem.getX()), Float.valueOf(migrateItem.getY()), Float.valueOf(migrateItem.getZ()), Float.valueOf(migrateItem.getZoom()), null, null, null, Integer.valueOf(i), migrateItem.getTextIfException(), null, null, migrateItem.getTimeLeftUntilItemDestroy(), 6750208, null);
    }
}
