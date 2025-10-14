package com.blackhub.bronline.game.gui.craft.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CraftScreenTypeEnum.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/enums/CraftScreenTypeEnum;", "", "(Ljava/lang/String;I)V", "CRAFT", "STASH", "PROGRESS", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class CraftScreenTypeEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CraftScreenTypeEnum[] $VALUES;
    public static final CraftScreenTypeEnum CRAFT = new CraftScreenTypeEnum("CRAFT", 0);
    public static final CraftScreenTypeEnum STASH = new CraftScreenTypeEnum("STASH", 1);
    public static final CraftScreenTypeEnum PROGRESS = new CraftScreenTypeEnum("PROGRESS", 2);

    public static final /* synthetic */ CraftScreenTypeEnum[] $values() {
        return new CraftScreenTypeEnum[]{CRAFT, STASH, PROGRESS};
    }

    @NotNull
    public static EnumEntries<CraftScreenTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static CraftScreenTypeEnum valueOf(String str) {
        return (CraftScreenTypeEnum) Enum.valueOf(CraftScreenTypeEnum.class, str);
    }

    public static CraftScreenTypeEnum[] values() {
        return (CraftScreenTypeEnum[]) $VALUES.clone();
    }

    public CraftScreenTypeEnum(String str, int i) {
    }

    static {
        CraftScreenTypeEnum[] craftScreenTypeEnumArr$values = $values();
        $VALUES = craftScreenTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(craftScreenTypeEnumArr$values);
    }
}
