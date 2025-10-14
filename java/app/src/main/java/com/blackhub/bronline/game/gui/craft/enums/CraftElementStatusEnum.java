package com.blackhub.bronline.game.gui.craft.enums;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.util.VersionInfo;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CraftElementStatusEnum.kt */

public final class CraftElementStatusEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CraftElementStatusEnum[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CraftElementStatusEnum NONE = new CraftElementStatusEnum(IvyCleanCache.NONE, 0, -1);
    public static final CraftElementStatusEnum DEFAULT = new CraftElementStatusEnum("DEFAULT", 1, 0);
    public static final CraftElementStatusEnum AVAILABLE_FOR_CRAFTING = new CraftElementStatusEnum("AVAILABLE_FOR_CRAFTING", 2, 1);
    public static final CraftElementStatusEnum UNAVAILABLE = new CraftElementStatusEnum(VersionInfo.UNAVAILABLE, 3, 2);
    public static final CraftElementStatusEnum NEW_ELEMENT = new CraftElementStatusEnum("NEW_ELEMENT", 4, 3);
    public static final CraftElementStatusEnum IN_THE_PIPELINE = new CraftElementStatusEnum("IN_THE_PIPELINE", 5, 4);
    public static final CraftElementStatusEnum IN_THE_QUEUE = new CraftElementStatusEnum("IN_THE_QUEUE", 6, 6);

    public static final /* synthetic */ CraftElementStatusEnum[] $values() {
        return new CraftElementStatusEnum[]{NONE, DEFAULT, AVAILABLE_FOR_CRAFTING, UNAVAILABLE, NEW_ELEMENT, IN_THE_PIPELINE, IN_THE_QUEUE};
    }

    @NotNull
    public static EnumEntries<CraftElementStatusEnum> getEntries() {
        return $ENTRIES;
    }

    public static CraftElementStatusEnum valueOf(String str) {
        return (CraftElementStatusEnum) Enum.valueOf(CraftElementStatusEnum.class, str);
    }

    public static CraftElementStatusEnum[] values() {
        return (CraftElementStatusEnum[]) $VALUES.clone();
    }

    public CraftElementStatusEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ CraftElementStatusEnum(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CraftElementStatusEnum[] craftElementStatusEnumArr$values = $values();
        $VALUES = craftElementStatusEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(craftElementStatusEnumArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CraftElementStatusEnum.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCraftElementStatusEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftElementStatusEnum.kt\ncom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n288#2,2:13\n*S KotlinDebug\n*F\n+ 1 CraftElementStatusEnum.kt\ncom/blackhub/bronline/game/gui/craft/enums/CraftElementStatusEnum$Companion\n*L\n10#1:13,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CraftElementStatusEnum fromInt(int value) {
            CraftElementStatusEnum next;
            Iterator<CraftElementStatusEnum> it = CraftElementStatusEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            CraftElementStatusEnum craftElementStatusEnum = next;
            return craftElementStatusEnum == null ? CraftElementStatusEnum.NONE : craftElementStatusEnum;
        }
    }
}

