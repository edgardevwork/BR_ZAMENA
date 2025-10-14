package com.blackhub.bronline.game.gui.rating;

import android.graphics.Bitmap;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RatingUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003Jm\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/rating/RatingUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "playerItem", "Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;", "titleText", "Landroidx/compose/ui/text/AnnotatedString;", "playersRatingList", "", "bgImageBitmap", "Landroid/graphics/Bitmap;", "listOfTitles", "", "listOfItems", "isNeedClose", "", "(Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroid/graphics/Bitmap;Ljava/util/List;Ljava/util/List;Z)V", "getBgImageBitmap", "()Landroid/graphics/Bitmap;", "()Z", "getListOfItems", "()Ljava/util/List;", "getListOfTitles", "getPlayerItem", "()Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;", "getPlayersRatingList", "getTitleText", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RatingUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImageBitmap;
    public final boolean isNeedClose;

    @Nullable
    public final List<List<AnnotatedString>> listOfItems;

    @Nullable
    public final List<String> listOfTitles;

    @NotNull
    public final CommonEventTopListModel playerItem;

    @NotNull
    public final List<CommonEventTopListModel> playersRatingList;

    @NotNull
    public final AnnotatedString titleText;

    public RatingUiState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ RatingUiState copy$default(RatingUiState ratingUiState, CommonEventTopListModel commonEventTopListModel, AnnotatedString annotatedString, List list, Bitmap bitmap, List list2, List list3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            commonEventTopListModel = ratingUiState.playerItem;
        }
        if ((i & 2) != 0) {
            annotatedString = ratingUiState.titleText;
        }
        AnnotatedString annotatedString2 = annotatedString;
        if ((i & 4) != 0) {
            list = ratingUiState.playersRatingList;
        }
        List list4 = list;
        if ((i & 8) != 0) {
            bitmap = ratingUiState.bgImageBitmap;
        }
        Bitmap bitmap2 = bitmap;
        if ((i & 16) != 0) {
            list2 = ratingUiState.listOfTitles;
        }
        List list5 = list2;
        if ((i & 32) != 0) {
            list3 = ratingUiState.listOfItems;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            z = ratingUiState.isNeedClose;
        }
        return ratingUiState.copy(commonEventTopListModel, annotatedString2, list4, bitmap2, list5, list6, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CommonEventTopListModel getPlayerItem() {
        return this.playerItem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final List<CommonEventTopListModel> component3() {
        return this.playersRatingList;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    @Nullable
    public final List<String> component5() {
        return this.listOfTitles;
    }

    @Nullable
    public final List<List<AnnotatedString>> component6() {
        return this.listOfItems;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final RatingUiState copy(@NotNull CommonEventTopListModel playerItem, @NotNull AnnotatedString titleText, @NotNull List<CommonEventTopListModel> playersRatingList, @Nullable Bitmap bgImageBitmap, @Nullable List<String> listOfTitles, @Nullable List<? extends List<AnnotatedString>> listOfItems, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(playerItem, "playerItem");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(playersRatingList, "playersRatingList");
        return new RatingUiState(playerItem, titleText, playersRatingList, bgImageBitmap, listOfTitles, listOfItems, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingUiState)) {
            return false;
        }
        RatingUiState ratingUiState = (RatingUiState) other;
        return Intrinsics.areEqual(this.playerItem, ratingUiState.playerItem) && Intrinsics.areEqual(this.titleText, ratingUiState.titleText) && Intrinsics.areEqual(this.playersRatingList, ratingUiState.playersRatingList) && Intrinsics.areEqual(this.bgImageBitmap, ratingUiState.bgImageBitmap) && Intrinsics.areEqual(this.listOfTitles, ratingUiState.listOfTitles) && Intrinsics.areEqual(this.listOfItems, ratingUiState.listOfItems) && this.isNeedClose == ratingUiState.isNeedClose;
    }

    public int hashCode() {
        int iHashCode = ((((this.playerItem.hashCode() * 31) + this.titleText.hashCode()) * 31) + this.playersRatingList.hashCode()) * 31;
        Bitmap bitmap = this.bgImageBitmap;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        List<String> list = this.listOfTitles;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<List<AnnotatedString>> list2 = this.listOfItems;
        return ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        CommonEventTopListModel commonEventTopListModel = this.playerItem;
        AnnotatedString annotatedString = this.titleText;
        return "RatingUiState(playerItem=" + commonEventTopListModel + ", titleText=" + ((Object) annotatedString) + ", playersRatingList=" + this.playersRatingList + ", bgImageBitmap=" + this.bgImageBitmap + ", listOfTitles=" + this.listOfTitles + ", listOfItems=" + this.listOfItems + ", isNeedClose=" + this.isNeedClose + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingUiState(@NotNull CommonEventTopListModel playerItem, @NotNull AnnotatedString titleText, @NotNull List<CommonEventTopListModel> playersRatingList, @Nullable Bitmap bitmap, @Nullable List<String> list, @Nullable List<? extends List<AnnotatedString>> list2, boolean z) {
        Intrinsics.checkNotNullParameter(playerItem, "playerItem");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(playersRatingList, "playersRatingList");
        this.playerItem = playerItem;
        this.titleText = titleText;
        this.playersRatingList = playersRatingList;
        this.bgImageBitmap = bitmap;
        this.listOfTitles = list;
        this.listOfItems = list2;
        this.isNeedClose = z;
    }

    public /* synthetic */ RatingUiState(CommonEventTopListModel commonEventTopListModel, AnnotatedString annotatedString, List list, Bitmap bitmap, List list2, List list3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CommonEventTopListModel(null, null, null, null, null, 31, null) : commonEventTopListModel, (i & 2) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : bitmap, (i & 16) != 0 ? null : list2, (i & 32) == 0 ? list3 : null, (i & 64) != 0 ? false : z);
    }

    @NotNull
    public final CommonEventTopListModel getPlayerItem() {
        return this.playerItem;
    }

    @NotNull
    public final AnnotatedString getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final List<CommonEventTopListModel> getPlayersRatingList() {
        return this.playersRatingList;
    }

    @Nullable
    public final Bitmap getBgImageBitmap() {
        return this.bgImageBitmap;
    }

    @Nullable
    public final List<String> getListOfTitles() {
        return this.listOfTitles;
    }

    @Nullable
    public final List<List<AnnotatedString>> getListOfItems() {
        return this.listOfItems;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}
