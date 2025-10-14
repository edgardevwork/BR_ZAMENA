package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PointViewListenerEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/draganddrop/enums/PointViewListenerEnum;", "", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_CENTER", "TOP_RIGHT", "CENTER", "BOTTOM_LEFT", "BOTTOM_CENTER", "BOTTOM_RIGHT", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class PointViewListenerEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ PointViewListenerEnum[] $VALUES;
    public static final PointViewListenerEnum TOP_LEFT = new PointViewListenerEnum("TOP_LEFT", 0);
    public static final PointViewListenerEnum TOP_CENTER = new PointViewListenerEnum("TOP_CENTER", 1);
    public static final PointViewListenerEnum TOP_RIGHT = new PointViewListenerEnum("TOP_RIGHT", 2);
    public static final PointViewListenerEnum CENTER = new PointViewListenerEnum("CENTER", 3);
    public static final PointViewListenerEnum BOTTOM_LEFT = new PointViewListenerEnum("BOTTOM_LEFT", 4);
    public static final PointViewListenerEnum BOTTOM_CENTER = new PointViewListenerEnum("BOTTOM_CENTER", 5);
    public static final PointViewListenerEnum BOTTOM_RIGHT = new PointViewListenerEnum("BOTTOM_RIGHT", 6);

    public static final /* synthetic */ PointViewListenerEnum[] $values() {
        return new PointViewListenerEnum[]{TOP_LEFT, TOP_CENTER, TOP_RIGHT, CENTER, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    @NotNull
    public static EnumEntries<PointViewListenerEnum> getEntries() {
        return $ENTRIES;
    }

    public static PointViewListenerEnum valueOf(String str) {
        return (PointViewListenerEnum) Enum.valueOf(PointViewListenerEnum.class, str);
    }

    public static PointViewListenerEnum[] values() {
        return (PointViewListenerEnum[]) $VALUES.clone();
    }

    public PointViewListenerEnum(String str, int i) {
    }

    static {
        PointViewListenerEnum[] pointViewListenerEnumArr$values = $values();
        $VALUES = pointViewListenerEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pointViewListenerEnumArr$values);
    }
}
