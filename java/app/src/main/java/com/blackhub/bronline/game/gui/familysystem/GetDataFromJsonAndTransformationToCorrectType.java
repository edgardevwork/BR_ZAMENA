package com.blackhub.bronline.game.gui.familysystem;

import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyNotificationData;
import com.blackhub.bronline.game.gui.familysystem.data.FamilyPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: GetDataFromJsonAndTransformationToCorrectType.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class GetDataFromJsonAndTransformationToCorrectType {
    public static final int $stable = 0;

    @NotNull
    public final List<Integer> getJsonArrayReturnIntList(@Nullable JSONArray thisJsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (thisJsonArray != null) {
            int length = thisJsonArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = thisJsonArray.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                arrayList.add((Integer) obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<String> getJsonArrayReturnStringList(@Nullable JSONArray thisJsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (thisJsonArray != null) {
            int length = thisJsonArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = thisJsonArray.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Spanned> getJsonArrayReturnSpannedList(@Nullable JSONArray thisJsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (thisJsonArray != null) {
            int length = thisJsonArray.length();
            for (int i = 0; i < length; i++) {
                ActionWithString actionWithString = new ActionWithString();
                Object obj = thisJsonArray.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(actionWithString.convertStringToHtmlType((String) obj));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<FamilyNotificationData> getJsonArrayAndIntCollectionReturnFamilyNotificationList(@Nullable JSONArray thisJsonArray, @NotNull List<Integer> thisIntCollection) throws JSONException {
        Intrinsics.checkNotNullParameter(thisIntCollection, "thisIntCollection");
        ArrayList arrayList = new ArrayList();
        if (thisJsonArray != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 1;
            while (i < thisJsonArray.length()) {
                Object obj = thisJsonArray.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = thisJsonArray.get(i3);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add(new FamilyNotificationData((String) obj, (String) obj2, thisIntCollection.get(i2).intValue()));
                i += 2;
                i3 += 2;
                i2++;
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<FamilyPlayer> getJsonArrayReturnFamilyPlayer(@Nullable JSONArray jsonArrayWithNick, @Nullable JSONArray jsonArrayWithRankAndStatus) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jsonArrayWithNick != null && jsonArrayWithRankAndStatus != null && jsonArrayWithNick.length() == jsonArrayWithRankAndStatus.length() / 2) {
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < jsonArrayWithNick.length()) {
                Object obj = jsonArrayWithNick.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = jsonArrayWithRankAndStatus.get(i3);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = jsonArrayWithRankAndStatus.get(i2);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                arrayList.add(new FamilyPlayer(str, iIntValue, ((Integer) obj3).intValue(), false, 8, null));
                i++;
                i3 += 2;
                i2 += 2;
            }
        }
        return arrayList;
    }
}

