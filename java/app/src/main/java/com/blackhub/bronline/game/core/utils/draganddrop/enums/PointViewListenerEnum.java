package com.blackhub.bronline.game.core.utils.draganddrop.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PointViewListenerEnum.kt */
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

