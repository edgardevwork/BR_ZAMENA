package com.blackhub.bronline.game.gui.inventory;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.inventory.data.InvItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: MigrateItemsFromAny.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class MigrateItemsFromAny {
    public static final int $stable = 0;

    @NotNull
    public final List<InvItems> newMigrateDataFromAnyToObject(@Nullable JSONArray itemsAny, int numberOfSlots, boolean ifSlot, @NotNull List<InvItems> allItemsFromJSON) throws JSONException {
        int iIntValue;
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (itemsAny != null) {
            int i = 1;
            if (itemsAny.length() > 1) {
                int i2 = 3;
                int i3 = 2;
                int i4 = 1;
                int i5 = 0;
                while (itemsAny.length() > i5) {
                    Object obj = itemsAny.get(i5);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    arrayList2.add((Integer) obj);
                    if (itemsAny.get(i4) instanceof String) {
                        arrayList3.add(Integer.valueOf(i));
                        arrayList4.add(itemsAny.get(i4).toString());
                    } else {
                        Object obj2 = itemsAny.get(i4);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        arrayList3.add((Integer) obj2);
                        arrayList4.add("");
                    }
                    if (ifSlot) {
                        Object obj3 = itemsAny.get(i3);
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        if (((Integer) obj3).intValue() + 2 == 8) {
                            iIntValue = 1;
                        } else {
                            Object obj4 = itemsAny.get(i3);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            iIntValue = ((Integer) obj4).intValue() + 2;
                        }
                    } else {
                        Object obj5 = itemsAny.get(i3);
                        Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
                        iIntValue = ((Integer) obj5).intValue();
                    }
                    arrayList5.add(Integer.valueOf(iIntValue));
                    arrayList6.add(Integer.valueOf(itemsAny.optInt(i2)));
                    i5 += 4;
                    i4 += 4;
                    i3 += 4;
                    i2 += 4;
                    i = 1;
                }
            }
        }
        for (int i6 = 0; i6 < numberOfSlots; i6++) {
            InvItems newItemObj = null;
            if (arrayList5.size() > 0) {
                int size = arrayList5.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    if (i6 == ((Number) arrayList5.get(i7)).intValue()) {
                        for (InvItems invItems : allItemsFromJSON) {
                            if (((Number) arrayList2.get(i7)).intValue() == invItems.getId()) {
                                newItemObj = getNewItemObj(invItems, ((Number) arrayList3.get(i7)).intValue(), (String) arrayList4.get(i7), ((Number) arrayList6.get(i7)).intValue());
                                break;
                            }
                        }
                    } else {
                        i7++;
                    }
                }
            }
            if (newItemObj != null) {
                arrayList.add(newItemObj);
            } else {
                arrayList.add(InventoryUtilsKt.emptyItem());
            }
        }
        return arrayList;
    }

    public final InvItems getNewItemObj(InvItems itemFromJson, int otherParam, String plateNumber, int timeLeftUntilItemDestroy) {
        String strValueOf;
        int modelid;
        int id = itemFromJson.getId();
        int i = 1;
        if (id != 58) {
            if (id != 134) {
                modelid = itemFromJson.getModelid();
                i = otherParam;
            } else {
                modelid = otherParam;
            }
            strValueOf = plateNumber;
        } else {
            strValueOf = String.valueOf(otherParam);
            modelid = itemFromJson.getModelid();
        }
        return new InvItems(Integer.valueOf(itemFromJson.getId()), itemFromJson.get_name(), itemFromJson.get_nameStore(), itemFromJson.getDesc(), itemFromJson.getImageName(), Integer.valueOf(modelid), Double.valueOf(itemFromJson.getWeight()), Double.valueOf(itemFromJson.getAddw()), Integer.valueOf(itemFromJson.getFold()), Float.valueOf(itemFromJson.getShiftX()), Float.valueOf(itemFromJson.getShiftY()), Float.valueOf(itemFromJson.getShiftZ()), Float.valueOf(itemFromJson.getX()), Float.valueOf(itemFromJson.getY()), Float.valueOf(itemFromJson.getZ()), Float.valueOf(itemFromJson.getZoom()), null, null, null, Integer.valueOf(i), strValueOf, 0, null, Integer.valueOf(timeLeftUntilItemDestroy), 4653056, null);
    }

    @Nullable
    public final InvItems initSimCard(int simCardNumber, @NotNull List<InvItems> allItemsFromJSON) {
        Object next;
        Intrinsics.checkNotNullParameter(allItemsFromJSON, "allItemsFromJSON");
        Iterator<T> it = allItemsFromJSON.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InvItems) next).getId() == 58) {
                break;
            }
        }
        InvItems invItems = (InvItems) next;
        if (invItems != null) {
            invItems.setItemsValue(1);
            invItems.setTextIfException(String.valueOf(simCardNumber));
        }
        return invItems;
    }
}

