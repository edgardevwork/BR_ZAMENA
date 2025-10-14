package com.blackhub.bronline.game.gui.craft.model;

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
/* compiled from: CraftElementRarityState.kt */
/* loaded from: classes2.dex */
public final class CraftElementStatusState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CraftElementStatusState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CraftElementStatusState NONE = new CraftElementStatusState(IvyCleanCache.NONE, 0, -1);
    public static final CraftElementStatusState DEFAULT = new CraftElementStatusState("DEFAULT", 1, 0);
    public static final CraftElementStatusState SELECTED = new CraftElementStatusState("SELECTED", 2, 1);
    public static final CraftElementStatusState AVAILABLE_FOR_CRAFTING = new CraftElementStatusState("AVAILABLE_FOR_CRAFTING", 3, 2);
    public static final CraftElementStatusState UNAVAILABLE = new CraftElementStatusState(VersionInfo.UNAVAILABLE, 4, 3);
    public static final CraftElementStatusState NEW_ELEMENT = new CraftElementStatusState("NEW_ELEMENT", 5, 4);
    public static final CraftElementStatusState IN_THE_PIPELINE = new CraftElementStatusState("IN_THE_PIPELINE", 6, 5);
    public static final CraftElementStatusState READY = new CraftElementStatusState("READY", 7, 6);
    public static final CraftElementStatusState IN_THE_QUEUE = new CraftElementStatusState("IN_THE_QUEUE", 8, 7);

    public static final /* synthetic */ CraftElementStatusState[] $values() {
        return new CraftElementStatusState[]{NONE, DEFAULT, SELECTED, AVAILABLE_FOR_CRAFTING, UNAVAILABLE, NEW_ELEMENT, IN_THE_PIPELINE, READY, IN_THE_QUEUE};
    }

    @NotNull
    public static EnumEntries<CraftElementStatusState> getEntries() {
        return $ENTRIES;
    }

    public static CraftElementStatusState valueOf(String str) {
        return (CraftElementStatusState) Enum.valueOf(CraftElementStatusState.class, str);
    }

    public static CraftElementStatusState[] values() {
        return (CraftElementStatusState[]) $VALUES.clone();
    }

    public CraftElementStatusState(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ CraftElementStatusState(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CraftElementStatusState[] craftElementStatusStateArr$values = $values();
        $VALUES = craftElementStatusStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(craftElementStatusStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CraftElementRarityState.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftElementStatusState$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/gui/craft/model/CraftElementStatusState;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCraftElementRarityState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CraftElementRarityState.kt\ncom/blackhub/bronline/game/gui/craft/model/CraftElementStatusState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n288#2,2:22\n*S KotlinDebug\n*F\n+ 1 CraftElementRarityState.kt\ncom/blackhub/bronline/game/gui/craft/model/CraftElementStatusState$Companion\n*L\n19#1:22,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CraftElementStatusState fromInt(int value) {
            CraftElementStatusState next;
            Iterator<CraftElementStatusState> it = CraftElementStatusState.getEntries().iterator();
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
            CraftElementStatusState craftElementStatusState = next;
            return craftElementStatusState == null ? CraftElementStatusState.NONE : craftElementStatusState;
        }
    }
}

