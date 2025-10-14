package com.blackhub.bronline.game.gui.menu;

import androidx.annotation.ColorRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.menu.model.MenuListModel;
import com.bless.client.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MenuUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J[\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u000fHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0014\"\u0004\b\u0019\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00063"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menu/MenuUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "isNeedClose", "", "isCommunication", "isHeightCalculated", "isButtonsEnabled", "listOfMainItems", "", "Lcom/blackhub/bronline/game/gui/menu/model/MenuListModel;", "setOfCommunicationItems", "", "isDebugEnabled", "(ZZZZLjava/util/List;Ljava/util/Set;Z)V", "bgNativeButton", "", "getBgNativeButton", "()I", "countOfColumns", "getCountOfColumns", "()Z", "setButtonsEnabled", "(Z)V", "setCommunication", "setHeightCalculated", "setNeedClose", "getListOfMainItems", "()Ljava/util/List;", "setListOfMainItems", "(Ljava/util/List;)V", "listWithItems", "", "getListWithItems", "getSetOfCommunicationItems", "()Ljava/util/Set;", "setSetOfCommunicationItems", "(Ljava/util/Set;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMenuUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuUiState.kt\ncom/blackhub/bronline/game/gui/menu/MenuUiState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1045#2:32\n*S KotlinDebug\n*F\n+ 1 MenuUiState.kt\ncom/blackhub/bronline/game/gui/menu/MenuUiState\n*L\n23#1:32\n*E\n"})
/* loaded from: classes2.dex */
public final /* data */ class MenuUiState implements UiState {
    public static final int $stable = 8;
    public boolean isButtonsEnabled;
    public boolean isCommunication;
    public final boolean isDebugEnabled;
    public boolean isHeightCalculated;
    public boolean isNeedClose;

    @NotNull
    public List<MenuListModel> listOfMainItems;

    @NotNull
    public Set<MenuListModel> setOfCommunicationItems;

    public MenuUiState() {
        this(false, false, false, false, null, null, false, 127, null);
    }

    public static /* synthetic */ MenuUiState copy$default(MenuUiState menuUiState, boolean z, boolean z2, boolean z3, boolean z4, List list, Set set, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = menuUiState.isNeedClose;
        }
        if ((i & 2) != 0) {
            z2 = menuUiState.isCommunication;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = menuUiState.isHeightCalculated;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = menuUiState.isButtonsEnabled;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            list = menuUiState.listOfMainItems;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            set = menuUiState.setOfCommunicationItems;
        }
        Set set2 = set;
        if ((i & 64) != 0) {
            z5 = menuUiState.isDebugEnabled;
        }
        return menuUiState.copy(z, z6, z7, z8, list2, set2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCommunication() {
        return this.isCommunication;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsHeightCalculated() {
        return this.isHeightCalculated;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsButtonsEnabled() {
        return this.isButtonsEnabled;
    }

    @NotNull
    public final List<MenuListModel> component5() {
        return this.listOfMainItems;
    }

    @NotNull
    public final Set<MenuListModel> component6() {
        return this.setOfCommunicationItems;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsDebugEnabled() {
        return this.isDebugEnabled;
    }

    @NotNull
    public final MenuUiState copy(boolean isNeedClose, boolean isCommunication, boolean isHeightCalculated, boolean isButtonsEnabled, @NotNull List<MenuListModel> listOfMainItems, @NotNull Set<MenuListModel> setOfCommunicationItems, boolean isDebugEnabled) {
        Intrinsics.checkNotNullParameter(listOfMainItems, "listOfMainItems");
        Intrinsics.checkNotNullParameter(setOfCommunicationItems, "setOfCommunicationItems");
        return new MenuUiState(isNeedClose, isCommunication, isHeightCalculated, isButtonsEnabled, listOfMainItems, setOfCommunicationItems, isDebugEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuUiState)) {
            return false;
        }
        MenuUiState menuUiState = (MenuUiState) other;
        return this.isNeedClose == menuUiState.isNeedClose && this.isCommunication == menuUiState.isCommunication && this.isHeightCalculated == menuUiState.isHeightCalculated && this.isButtonsEnabled == menuUiState.isButtonsEnabled && Intrinsics.areEqual(this.listOfMainItems, menuUiState.listOfMainItems) && Intrinsics.areEqual(this.setOfCommunicationItems, menuUiState.setOfCommunicationItems) && this.isDebugEnabled == menuUiState.isDebugEnabled;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isNeedClose) * 31) + Boolean.hashCode(this.isCommunication)) * 31) + Boolean.hashCode(this.isHeightCalculated)) * 31) + Boolean.hashCode(this.isButtonsEnabled)) * 31) + this.listOfMainItems.hashCode()) * 31) + this.setOfCommunicationItems.hashCode()) * 31) + Boolean.hashCode(this.isDebugEnabled);
    }

    @NotNull
    public String toString() {
        return "MenuUiState(isNeedClose=" + this.isNeedClose + ", isCommunication=" + this.isCommunication + ", isHeightCalculated=" + this.isHeightCalculated + ", isButtonsEnabled=" + this.isButtonsEnabled + ", listOfMainItems=" + this.listOfMainItems + ", setOfCommunicationItems=" + this.setOfCommunicationItems + ", isDebugEnabled=" + this.isDebugEnabled + ")";
    }

    public MenuUiState(boolean z, boolean z2, boolean z3, boolean z4, @NotNull List<MenuListModel> listOfMainItems, @NotNull Set<MenuListModel> setOfCommunicationItems, boolean z5) {
        Intrinsics.checkNotNullParameter(listOfMainItems, "listOfMainItems");
        Intrinsics.checkNotNullParameter(setOfCommunicationItems, "setOfCommunicationItems");
        this.isNeedClose = z;
        this.isCommunication = z2;
        this.isHeightCalculated = z3;
        this.isButtonsEnabled = z4;
        this.listOfMainItems = listOfMainItems;
        this.setOfCommunicationItems = setOfCommunicationItems;
        this.isDebugEnabled = z5;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final void setNeedClose(boolean z) {
        this.isNeedClose = z;
    }

    public final boolean isCommunication() {
        return this.isCommunication;
    }

    public final void setCommunication(boolean z) {
        this.isCommunication = z;
    }

    public final boolean isHeightCalculated() {
        return this.isHeightCalculated;
    }

    public final void setHeightCalculated(boolean z) {
        this.isHeightCalculated = z;
    }

    public final boolean isButtonsEnabled() {
        return this.isButtonsEnabled;
    }

    public final void setButtonsEnabled(boolean z) {
        this.isButtonsEnabled = z;
    }

    public /* synthetic */ MenuUiState(boolean z, boolean z2, boolean z3, boolean z4, List list, Set set, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? SetsKt__SetsKt.emptySet() : set, (i & 64) != 0 ? false : z5);
    }

    @NotNull
    public final List<MenuListModel> getListOfMainItems() {
        return this.listOfMainItems;
    }

    public final void setListOfMainItems(@NotNull List<MenuListModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listOfMainItems = list;
    }

    @NotNull
    public final Set<MenuListModel> getSetOfCommunicationItems() {
        return this.setOfCommunicationItems;
    }

    public final void setSetOfCommunicationItems(@NotNull Set<MenuListModel> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.setOfCommunicationItems = set;
    }

    public final boolean isDebugEnabled() {
        return this.isDebugEnabled;
    }

    @NotNull
    public final List<MenuListModel> getListWithItems() {
        if (this.isCommunication) {
            return CollectionsKt___CollectionsKt.toList(this.setOfCommunicationItems);
        }
        return CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.sortedWith(this.listOfMainItems, new Comparator() { // from class: com.blackhub.bronline.game.gui.menu.MenuUiState$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((MenuListModel) t).getId()), Integer.valueOf(((MenuListModel) t2).getId()));
            }
        }));
    }

    public final int getCountOfColumns() {
        return this.isCommunication ? 3 : 4;
    }

    @ColorRes
    public final int getBgNativeButton() {
        return this.isDebugEnabled ? R.color.dark_green : R.color.red;
    }
}
